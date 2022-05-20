package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://typeAbonneSubcriber.tns")
public class WSTypeAbonne {
	private Service service;
	public WSTypeAbonne() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/

	@WebMethod(operationName = "TypeAbonne")
	public String typeAbonne(@WebParam(name = "numero") String numero)
	{
		try {
			return service.searchByNumTelTypes(numero);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
		return null;
	}
	
}
/**********************************************************************************************************************************************************/