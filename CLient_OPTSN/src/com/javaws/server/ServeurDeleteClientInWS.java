package com.javaws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import tns.deleteinsubcriber.WSTermination;
import tns.deleteinsubcriber.WSTerminationService;

public class ServeurDeleteClientInWS {
	private WSTermination stub;

	public ServeurDeleteClientInWS() {
		WSTerminationService service = new WSTerminationService();
		stub = service.getWSTerminationPort();
	}
	@WebMethod
	public void deleteClientIN(@WebParam String numero)
	{
		stub.supprimerClientIn(numero);
	}
}
