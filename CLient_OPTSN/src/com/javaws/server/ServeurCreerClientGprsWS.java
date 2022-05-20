package com.javaws.server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.javaws.entities.Clients;
import com.javaws.entities.ServiceActive;
import com.javaws.entities.TypeClient;
import com.javaws.utils.Utilitaire;

import tns.createdatasubcriber.WSCreateNetwork;
import tns.createdatasubcriber.WSCreateNetworkService;

public class ServeurCreerClientGprsWS {
	@SuppressWarnings("unused")
	private WSCreateNetwork stub;

	public ServeurCreerClientGprsWS() {
		WSCreateNetworkService service = new WSCreateNetworkService();
		stub = service.getWSCreateNetworkPort();
	}
	@SuppressWarnings("unused")
	@WebMethod(operationName = "CreerClientgprs")
	public void creerClientgprs(@WebParam(name = "date") String date,@WebParam(name = "numero")String numero,@WebParam(name = "type")String type,@WebParam(name = "data") Boolean activeData,@WebParam(name = "sms") String sms,@WebParam(name = "appel") String appel,@WebParam(name = "hot") String hot,@WebParam(name = "renv")String renv,@WebParam(name = "roaming")String roa )
	{
		List<ServiceActive> liste = new ArrayList<ServiceActive>();
		liste.add(ServiceActive.valueOf(sms));
		liste.add(ServiceActive.valueOf(appel));
		liste.add(ServiceActive.valueOf(hot));
		liste.add(ServiceActive.valueOf(renv));
		liste.add(ServiceActive.valueOf(roa));
		TypeClient types = TypeClient.valueOf(type);
		Clients clients = new Clients(date,numero,types,liste,activeData);
		try {
			//stub.creerClientgprs(clients);
			//stub.creerClientsgprs(clients.getDate(), clients.getNumeroTel(), clients.getType(), clients.isActivedata(),clients.getSms(),clients.getAppels(),clients.getHotline(),clients.getRenvoiappel(),clients.getRenvoiappel());
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur :" + e.getMessage());
		}
	}
}
