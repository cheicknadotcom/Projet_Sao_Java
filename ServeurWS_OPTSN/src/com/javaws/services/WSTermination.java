package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://deleteInSubcriber.tns")
public class WSTermination {
	private Service service;
	public WSTermination() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/

	@WebMethod(operationName = "SupprimerClientIn")
	public void deleteClientIN(@WebParam(name = "numero") String numero)
	{
		try {
			if(service.searchByNumTel(numero).getNumeroTel().compareTo("") == 0)
			   Utilitaire.displayErrorMessage("Le " + numero + " n'existe pas !!!");
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur Côte serveur " + e.getMessage());
		}
		service.deleteClientIn(numero);
	}
}
/**********************************************************************************************************************************************************/