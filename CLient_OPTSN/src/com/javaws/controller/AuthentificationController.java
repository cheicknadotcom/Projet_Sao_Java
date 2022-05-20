package com.javaws.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import com.javaws.server.ServeurAuthenWS;
import com.javaws.ui.UIAdministrateur;
import com.javaws.ui.UIAuthentification;
import com.javaws.utils.Utilitaire;





public class AuthentificationController {

	private UIAuthentification uiAuthentification;
	ServeurAuthenWS serveur;
	public AuthentificationController(UIAuthentification uiAuthentification) {
		this.uiAuthentification = uiAuthentification;
		addListeners();
	}
	
	private void addListeners () {
		
		uiAuthentification.addValiderListener ( new ActionListener() {			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String login = uiAuthentification.getLogin();
				String password = uiAuthentification.getPassword();
				serveur = new ServeurAuthenWS();
				if (login.equals("") || password.equals("")) {
					
				Utilitaire.displayNotification("Renseigne les champs correctement svp....");
					return;
				}
					try {
						if(serveur.validate(login, password)) {
							UIAdministrateur uiadministrateur = new UIAdministrateur();
							AdministrateurController administrateur = new AdministrateurController(uiadministrateur);
							administrateur.run();
							Utilitaire.displayNotification("********************\n <BIENVENUE SUR LE RESEAU DE L'OPTSN>"+"\n********************");
						}else{
							Utilitaire.displayErrorMessage("Veuillez saisir le bon login et password ");
							UIAuthentification uiAuthentification = new UIAuthentification();
							AuthentificationController authentificationController = new AuthentificationController(uiAuthentification);
							
							authentificationController.run ();
						}
					} catch (Exception e1) {
						Utilitaire.displayErrorMessage("Erreur d'authentification = " + e1.getMessage());
						Utilitaire.displayErrorMessage("Veuillez Probleme cote serveur");
						UIAuthentification uiAuthentification = new UIAuthentification();
						AuthentificationController authentificationController = new AuthentificationController(uiAuthentification);
						
						authentificationController.run ();
						uiAuthentification.clear();
					}	
					uiAuthentification.clear();
					uiAuthentification.cacher();
					
				}
		});
		
		uiAuthentification.addQuitterListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				uiAuthentification.dispose();				
			}
		});
	}

	public void run() {
		uiAuthentification.montrer();
	}
}
