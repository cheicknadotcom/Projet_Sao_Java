package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Clients;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://createDataSubcriber.tns")
public class WSCreateNetwork {	
	private Service service;
	public WSCreateNetwork() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/

	@WebMethod(operationName = "creerClientgprs")
	public void creerClientgprs(@WebParam(name = "Clients") Clients clients)
	{
		try {
			service.creerClientgprs(clients);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
	}
}
/**********************************************************************************************************************************************************/