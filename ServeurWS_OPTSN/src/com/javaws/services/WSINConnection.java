package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Clients;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://createINSubcriber.tns")
public class WSINConnection {
	private Service service;
	public WSINConnection() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/
	@WebMethod(operationName = "creerClientIN")
	public void creerClientIN(@WebParam(name = "Clients") Clients clients)
	{
		try {
			service.creerClientin(clients);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
	}
}
/**********************************************************************************************************************************************************/
