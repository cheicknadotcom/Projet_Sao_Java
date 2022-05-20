package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://desactiveSubcriber.tns")
public class WSDesactivateSubcriber {
	private Service service;
	public WSDesactivateSubcriber() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/

	@WebMethod(operationName = "SupprimerClientHlr")
	public void deleteClientHLR(@WebParam(name = "numero") String numero)
	{
		try {
			if(service.searchByNumTel(numero).getNumeroTel().compareTo("") == 0)
			   Utilitaire.displayErrorMessage("Le " + numero + " n'existe pas !!!");
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur Côte serveur " + e.getMessage());
		}
		service.deleteClientHlr(numero);
	}
}
/**********************************************************************************************************************************************************/