package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://authentification.tns")
public class WSAuthentification {
	private Service service;
	public WSAuthentification() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/
	
	@WebMethod(operationName = "authentification")
	public boolean validate (@WebParam(name="login") String login, 
			@WebParam(name="password") String password) {		
		boolean statut = false;
		
		try {
			statut = service.authentifierUser(login, password);
			
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur de connection côte serveur " + e.getMessage());
		}
		
		return statut;
	}
}
/**********************************************************************************************************************************************************/