package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://rechercheSubcriber.tns")
public class WSRechercherSubcriberData {
	private Service service;
	public WSRechercherSubcriberData() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/

	@WebMethod(operationName = "RechercherSubcriberData")
	public boolean giveSubcriberData(@WebParam(name = "numero") String numero)
	{
		
		try {
			 return service.rechercheDataSubcribers(numero);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
		return false;
	}
}
/**********************************************************************************************************************************************************/