package com.app.bpel.metier;

public interface IDao {
	// Recherche un étudiant connaissant son nom et son prenom
	public User search(String nom, String prenom) throws Exception;
}
