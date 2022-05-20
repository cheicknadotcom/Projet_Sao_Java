package com.app.bpel.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.app.bpel.metier.Service;

@WebService
public class WSAuthentification {
	
	private Service service;
	public WSAuthentification() {		
		service = new Service ();
	}
	
	@WebMethod
	public boolean validate (@WebParam(name="login") String login, 
			@WebParam(name="password") String password) {		
		boolean statut = false;
		
		try {
			statut = service.authentifierUser(login, password);
			
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
		}
		
		return statut;
	}
}