package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Clients;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://rechercheSubcriber.tns")
public class WSRechercherSubcriber {
	private Service service;
	public WSRechercherSubcriber() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/

	@WebMethod(operationName = "RechercherSubcriber")
	public Clients giveSubcriber(@WebParam(name = "numero") String numero)
	{
		
		try {
			Clients client  = service.searchByNumTel(numero);
			return client;
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
		return null;
	}
}
/**********************************************************************************************************************************************************/