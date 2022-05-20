package com.javaws.entities;

import java.util.List;

/**
 * @author A459079
 *
 */
public interface IDao {
	// Recherche un étudiant connaissant son nom et son prenom
	/**
	 * @param login
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public User search(String login, String password) throws Exception;	
	/**
	 * @param Client
	 * @return
	 * @throws Exception
	 */
	public void createEntiteIn(Clients client) throws Exception;
	/**
	 * @param Client
	 * @return
	 * @throws Exception
	 */
	public void createEntiteGprs(Clients client) throws Exception;
	/**
	 * @param Client
	 * @return
	 * @throws Exception
	 */
	public void createEntite(Clients client) throws Exception;
	/**
	 * @param numero de telephone
	 * @return
	 * @throws Exception
	 */
	public Clients searchByNumTel(String numeroTel) throws Exception;
	/**
	 * @param Client
	 * @return
	 * @throws Exception
	 */
	public void deleteClient(String numeroTel) throws Exception;	
	/**
	 * @param 
	 * @return
	 * @throws Exception
	 */
	public List<Clients> listeClientHRL() throws Exception;
	/**
	 * @param 
	 * @return
	 * @throws Exception
	 */
	public List<Clients> listeClientGPRS() throws Exception;
	/**
	 * @param 
	 * @return
	 * @throws Exception
	 */
	public List<Clients> listeClientIN() throws Exception;
	/**
	 * @param Client
	 * @return
	 * @throws Exception
	 */
	public void deleteClientIn(String numeroTel) throws Exception;
	/**
	 * @param Client
	 * @return
	 * @throws DAOException
	 */
	public void deleteClientGprs(String numeroTel) throws Exception;
}
