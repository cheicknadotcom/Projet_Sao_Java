package com.javaws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import tns.deletedatasubcriber.WSDeleteNetwork;
import tns.deletedatasubcriber.WSDeleteNetworkService;

public class ServeurDeleteClientGprsWS {
	private WSDeleteNetwork stub;

	public ServeurDeleteClientGprsWS() {
		WSDeleteNetworkService service = new WSDeleteNetworkService();
		stub = service.getWSDeleteNetworkPort();
	}
	@WebMethod
	public void deleteClientGPRS(@WebParam String numero)
	{
		stub.supprimerClientGprs(numero);
	}
}
