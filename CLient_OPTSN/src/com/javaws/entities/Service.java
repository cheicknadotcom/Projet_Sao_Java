package com.javaws.entities;

import java.util.List;

import com.javaws.utils.Utilitaire;

public class Service {

	private IDao dao;
	
	public Service() {
		dao = new Dao();
	}

	public  boolean authentifierUser(String login, String password) 
			throws Exception {		
		try {
			return dao.search(login, password) == null ?false:true;
		} catch (Exception e) {
			throw new Exception ("Exception : " + e.getMessage()); 
		}
	}
	public void creerClienthlr(Clients client) throws Exception{
		dao.createEntite(client);
	}
	public void creerClientin(Clients client) throws Exception{
		dao.createEntiteIn(client);
	}
	public void creerClientgprs(Clients client) throws Exception{
		dao.createEntiteGprs(client);
	}
	public List<Clients> giveListeClient() throws Exception
	{
			return dao.listeClientHRL();
	}
	public List<Clients> giveListeClientGprs() throws Exception
	{
			return dao.listeClientGPRS();
	}
	public List<Clients> giveListeClientIn() throws Exception
	{
			return dao.listeClientIN();
	}

	public void deleteClientGprs(String numero)
	{
		try {
			dao.deleteClientGprs(numero);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur de suppression sur GPRS :" + e.getMessage());
		}
	}
	public void deleteClientHlr(String numero)
	{
		try {
			dao.deleteClient(numero);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur de suppression sur GPRS :" + e.getMessage());
		}
	}
	public void deleteClientIn(String numero)
	{
		try {
			dao.deleteClientIn(numero);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Erreur de suppression sur GPRS :" + e.getMessage());
		}
	}
	public Clients searchByNumTel(String numero) throws Exception
	{
			Clients client = dao.searchByNumTel(numero);
			return client;
	}
}
