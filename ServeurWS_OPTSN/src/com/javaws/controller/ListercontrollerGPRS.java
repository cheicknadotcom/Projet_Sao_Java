package com.javaws.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import com.javaws.entities.Clients;
import com.javaws.entities.Service;
import com.javaws.ui.UIAdministrateur;
import com.javaws.ui.UIAuthentification;
import com.javaws.ui.UIListe;
import com.javaws.utils.Utilitaire;


public class ListercontrollerGPRS {

	private UIAdministrateur uiadministrateur;
	private AdministrateurController controller;
	private UIAuthentification uIauthentification;
	private UIListe uiliste;
	Service service = new Service();
	public AdministrateurController getController() {
		return controller;
	}

	public void setController(AdministrateurController controller) {
		this.controller = controller;
	}

	public UIAuthentification getuIauthentification() {
		return uIauthentification;
	}

	public void setuIauthentification(UIAuthentification uIauthentification) {
		this.uIauthentification = uIauthentification;
	}

	public ListercontrollerGPRS(UIListe uiliste,UIAuthentification uIauthentification)
	{
		this.uiliste = uiliste;
		this.uIauthentification = uIauthentification;
		
		List<Clients> client;
		
		try {
			client = service.giveListeClientGprs();
			for(int i = 0;i < client.size();i++)
			{
				System.out.println(client.get(i));
			}
			uiliste.loadUser(client);
		} catch (Exception e) {
			Utilitaire.displayErrorMessage("Error :" + e.getMessage());
		}
		addListener();
	}

	private void addListener() {
		uiliste.AddOuvrirListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				uiliste.setVisible(false);
				int id = uiliste.getUserId();
				if(id != -1) {
				try {
					//User user = Service.giveUser(id);
					UIAdministrateur uiadministrateur = new UIAdministrateur();
					AdministrateurController controller = new AdministrateurController(uiadministrateur);
					controller.run();
					//uiadministrateur.remplirchamp(user);
				} catch (Exception e1) {
					Utilitaire.displayErrorMessage("Error :" + e1.getMessage());
				}	
			}
			}
			
		});
		uiliste.AddFermerListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				uiliste.dispose();
				uiadministrateur = new UIAdministrateur();
				controller = new AdministrateurController(uiadministrateur);
				controller.run();
			}
			
		});
		
	}

	public void run() {
		uiliste.setVisible(true);
	}

}
