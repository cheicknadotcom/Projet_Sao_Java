package com.app.bpel.metier;

public interface IDao {
	// Recherche un �tudiant connaissant son nom et son prenom
	public User search(String nom, String prenom) throws Exception;
}
