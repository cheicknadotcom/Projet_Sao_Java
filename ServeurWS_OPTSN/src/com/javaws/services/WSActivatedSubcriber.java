package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Clients;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://activateSubcriber.tns")
public class WSActivatedSubcriber {
	private Service service;
	public WSActivatedSubcriber() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/
	@WebMethod(operationName = "CreerClientHLR")
	public void creerClientHlr(@WebParam(name = "Clients") Clients clients)
	{
		try {
			service.creerClienthlr(clients);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
	}
/**********************************************************************************************************************************************************/	
}
/**********************************************************************************************************************************************************/