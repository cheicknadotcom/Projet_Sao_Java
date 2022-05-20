package com.javaws.services;
/**********************************************************************************************************************************************************/
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.javaws.entities.Service;
import com.javaws.utils.Utilitaire;
/**********************************************************************************************************************************************************/
@WebService(targetNamespace="http://typeOperationSubcriber.tns")
public class WSTypeOperation {
	private Service service;
	public WSTypeOperation() {		
		service = new Service ();
	}
/**********************************************************************************************************************************************************/
	@WebMethod(operationName = "TypeOperation")
	public String typeOperation(@WebParam(name = "Operation") String operation)
	{
		try {
			return service.typeOperations(operation);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
		return null;
	}	
}
/**********************************************************************************************************************************************************/