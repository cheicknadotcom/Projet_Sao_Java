package com.javaws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.javaws.entities.Clients;
import com.javaws.utils.Utilitaire;

import tns.activatesubcriber.WSActivatedSubcriber;
import tns.activatesubcriber.WSActivatedSubcriberService;

public class ServeurCreerClientHlrWS {
	@SuppressWarnings("unused")
	private WSActivatedSubcriber stub;

	public ServeurCreerClientHlrWS() {
		WSActivatedSubcriberService service = new WSActivatedSubcriberService();
		stub = service.getWSActivatedSubcriberPort();
	}
	@WebMethod
	public void creerClientHLR(@WebParam Clients client)
	{
		try {
			//stub.creerClientHLR(client);
			//stub.creerClienthlr(clients.getDate(), clients.getNumeroTel(), clients.getType(), clients.isActivedata(), clients.getSms(), clients.getAppels(), clients.getHotline(),clients.getRenvoiappel(), clients.getRoaming());
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
	}
}
