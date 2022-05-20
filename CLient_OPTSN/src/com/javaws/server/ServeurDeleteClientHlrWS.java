package com.javaws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import tns.desactivesubcriber.WSDesactivateSubcriber;
import tns.desactivesubcriber.WSDesactivateSubcriberService;

public class ServeurDeleteClientHlrWS {
	private WSDesactivateSubcriber stub;

	public ServeurDeleteClientHlrWS() {
		WSDesactivateSubcriberService service = new WSDesactivateSubcriberService();
		stub = service.getWSDesactivateSubcriberPort();
	}
	@WebMethod
	public void deleteClientHLR(@WebParam String numero)
	{
		stub.supprimerClientHlr(numero);
	}
}
