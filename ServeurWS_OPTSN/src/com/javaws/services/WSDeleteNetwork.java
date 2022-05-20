package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://DeleteDataSubcriber.tns")
public class WSDeleteNetwork {
	private Service service;
	public WSDeleteNetwork() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/

	@WebMethod(operationName = "SupprimerClientGprs")
	public void deleteClientGPRS(@WebParam(name = "numero") String numero)
	{
		try {
			if(service.searchByNumTel(numero).getNumeroTel().compareTo("") == 0)
			   Utilitaire.displayErrorMessage("Le " + numero + " n'existe pas !!!");
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur Côte serveur " + e.getMessage());
		}
		service.deleteClientGprs(numero);
	}
}
/**********************************************************************************************************************************************************/