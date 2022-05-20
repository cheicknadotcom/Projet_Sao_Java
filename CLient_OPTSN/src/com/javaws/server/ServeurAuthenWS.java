package com.javaws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.javaws.utils.Utilitaire;

import tns.authentification.WSAuthentification;
import tns.authentification.WSAuthentificationService;

public class ServeurAuthenWS {
	private WSAuthentification stub;
	
	public ServeurAuthenWS() {
		WSAuthentificationService service = new WSAuthentificationService();
		stub = service.getWSAuthentificationPort();
	}
	
	@WebMethod(operationName = "authentification")
	public boolean validate (@WebParam(name="login") String login, 
			@WebParam(name="password") String password) {		
		boolean statut = false;
		
		try {
			statut = stub.authentification(login, password);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Error authentification Côte Serveur" + e.getMessage());
		}
		
		return statut;
	}
}
