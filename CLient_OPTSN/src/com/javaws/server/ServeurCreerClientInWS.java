package com.javaws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.javaws.entities.Clients;
import com.javaws.utils.Utilitaire;

import tns.createinsubcriber.WSINConnection;
import tns.createinsubcriber.WSINConnectionService;

public class ServeurCreerClientInWS {
	@SuppressWarnings("unused")
	private WSINConnection stub;

	public ServeurCreerClientInWS() {
		WSINConnectionService service = new WSINConnectionService();
		stub = service.getWSINConnectionPort();
	}
	@WebMethod
	public void creerClientIN(@WebParam Clients clients)
	{
		try {
			//stub.creerClientIN(clients);
			//stub.creerClientIn(clients);
			//stub.creerClientin(clients.getDate(), clients.getNumeroTel(), clients.getType(), clients.isActivedata(), clients.getSms(), clients.getAppels(), clients.getHotline(), clients.getRenvoiappel(), clients.getRoaming());
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
	}
}
