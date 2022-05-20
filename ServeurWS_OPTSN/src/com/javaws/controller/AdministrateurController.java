package com.javaws.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



import com.javaws.entities.Clients;
import com.javaws.entities.Service;
import com.javaws.entities.ServiceActive;
import com.javaws.entities.TypeClient;

import com.javaws.ui.UIAdministrateur;
import com.javaws.ui.UIAuthentification;
import com.javaws.ui.UIListe;
import com.javaws.utils.Utilitaire;
public class AdministrateurController {
	private UIAdministrateur uiadministrateur;
	private UIListe uiliste = new UIListe();
	private UIAuthentification uiauthentiffication;
	Service service = new Service();
	public AdministrateurController(UIAdministrateur uiadministrateur)
	{
		this.uiadministrateur = uiadministrateur;
		addListener();
		Utilitaire.getCurrentTime();
	}

	private void addListener() {
		uiadministrateur.addCreerListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String date = uiadministrateur.getDateField();
				String numero = uiadministrateur.getNumeroField();
				String data = uiadministrateur.getServiceDatacomboBox();
				String sms = uiadministrateur.getServiceSmscomboBox();
				String appel =  uiadministrateur.getServiceAppelcomboBox();
				String type = uiadministrateur.getTypecomboBox();
				System.out.println("La date est:"+date+"numero" + numero + "data:"+data + "sms :" + sms+"appel :" + appel);
				TypeClient types = TypeClient.valueOf(type);
				List<ServiceActive> listeSer = new ArrayList<ServiceActive>();
				ServiceActive sm = ServiceActive.valueOf(sms);
				ServiceActive app = ServiceActive.valueOf(appel);
				listeSer.add(sm);
				listeSer.add(app);
				listeSer.add(ServiceActive.HOTLINE);
				listeSer.add(ServiceActive.RENVOIAPPEL);
				listeSer.add(ServiceActive.ROAMING);
				
				Boolean activedata = uiadministrateur.testActiveData(data);
				Clients client = new Clients(date,numero,types,listeSer,activedata);
				client.setListeService(listeSer);
				System.out.println(client);
				System.out.println(listeSer);
				
				System.out.println(client.getListeService());
				if(client.getDate().compareTo("") == 0 || client.getNumeroTel().compareTo("")==0)
				{
					Utilitaire.displayErrorMessage("Veuille reseigner les champs......" );
				}else {	
				try {
					service.creerClienthlr(client);
					if((client.getType().compareTo("PREPAID")== 0))
					{
						if(client.isActivedata())
						{
							service.creerClientgprs(client);
							service.creerClientin(client);
							Utilitaire.displayNotification("Avec data");
							Utilitaire.displayNotification("Utilisateur cree avec success...");
							uiadministrateur.nottoyer();
					}else {
							service.creerClientin(client);
							Utilitaire.displayNotification("sans data");
							Utilitaire.displayNotification("Utilisateur cree avec success...");
							uiadministrateur.nottoyer();
					}
					}else 
					{
						if(client.isActivedata())
						{
							service.creerClientgprs(client);
							Utilitaire.displayNotification("POSTPAID");
							Utilitaire.displayNotification("Avec data");
							Utilitaire.displayNotification("Utilisateur cree avec success...");
							uiadministrateur.nottoyer();
					}else {
							
							Utilitaire.displayNotification("POSTPAID");
							Utilitaire.displayNotification("sans data");
							Utilitaire.displayNotification("Utilisateur cree avec success...");
							uiadministrateur.nottoyer();
					}
					}
				} catch (Exception e1) {
					Utilitaire.displayErrorMessage("Error:" + e1.getMessage());				}
				}
			}
				
		
		});
	
		uiadministrateur.addListeListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				uiadministrateur.hide();
				Listercontroller listeControlleur = new Listercontroller(uiliste,uiauthentiffication);
				listeControlleur.run();
				
			}
			
		});
		uiadministrateur.addListeListenerGPRS(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				uiadministrateur.hide();
				ListercontrollerGPRS listeControlleur = new ListercontrollerGPRS(uiliste,uiauthentiffication);
				listeControlleur.run();	
			}
			
		});
		uiadministrateur.addListeListenerIN(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				uiadministrateur.hide();
				ListercontrollerIN listeControlleur = new ListercontrollerIN(uiliste,uiauthentiffication);
				listeControlleur.run();
				
			}
			
		});
		uiadministrateur.addCancelListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				uiliste.setVisible(false);
				uiadministrateur.disposeFenetre();
				UIAuthentification uiAuthentification = new UIAuthentification();

				AuthentificationController authentificationController = new AuthentificationController(uiAuthentification);
				
				authentificationController.run ();
			}
		});
		uiadministrateur.addSearchListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String  numeroCherche = uiadministrateur.getSaerchField();
				Clients client;
				try {
					client = service.searchByNumTel(numeroCherche);
					System.out.println(numeroCherche);
					System.out.println(client);
					
					if(numeroCherche.compareTo("") == 0)
					{
						Utilitaire.displayNotification("Veuillez reseigne le champs rechercher svp!!!!");		
					}else if(client.equals(null)) {
						Utilitaire.displayNotification("Cet Client n'existe pas!!!!");
						uiadministrateur.nottoyer();	
					}
						
					if(client.getType().compareTo("PREPAID")==0) {
						if(client.isActivedata()) {
							try {
								uiadministrateur.remplirchamp(service.searchByNumTel(numeroCherche));
								uiadministrateur.nottoyers();	
							} catch (Exception e1) {
								Utilitaire.displayErrorMessage("Cet utilisateur n'existe pas : " + e1.getMessage());
							}
						}
					try {
						uiadministrateur.remplirchamp(service.searchByNumTel(numeroCherche));
						uiadministrateur.nottoyers();	
					} catch (Exception e1) {
						Utilitaire.displayErrorMessage("Cet utilisateur n'existe pas : " + e1.getMessage());
					}
				}else if(client.getType().compareTo("POSTPAID")==0) {
					if(client.isActivedata()) {
						try {
							uiadministrateur.remplirchamp(service.searchByNumTel(numeroCherche));
							uiadministrateur.nottoyers();	
						} catch (Exception e1) {
							Utilitaire.displayErrorMessage("Cet utilisateur n'existe pas : " + e1.getMessage());
						}
					}
				try {
					uiadministrateur.remplirchamp(service.searchByNumTel(numeroCherche));
					uiadministrateur.nottoyers();	
				} catch (Exception e1) {
					Utilitaire.displayErrorMessage("Cet utilisateur n'existe pas : " + e1.getMessage());
				}
				}else if(numeroCherche.compareTo("") == 0) {
					Utilitaire.displayNotification("Veuillez remplier le champs rechercher");
				}else if(client.getNumeroTel().compareTo("")==0) {
					Utilitaire.displayNotification("Veuillez remplier le champs rechercher");
					uiadministrateur.nottoyers();	
				}else{
					Utilitaire.displayErrorMessage("Cet utilisateur n'existe pas  ");
				}
				} catch (Exception e2) {
					Utilitaire.displayErrorMessage("Erreur de rechercher du client de numero " + numeroCherche);
				}
				
				}
		});
		uiadministrateur.addClearListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				uiadministrateur.nottoyer();	
			}
		});
		
		uiadministrateur.adddeleteListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String numero = uiadministrateur.getNumeroField();
				Clients client;
				try {
					client = service.searchByNumTel(numero);
					System.out.println(client);
					if(numero.compareTo("")== 0) {
						Utilitaire.displayNotification("Veuillez donner un numero a supprimer...");
					}else {
						
						if(client.getType().compareTo("PREPAID")==0)
						{
							if(client.isActivedata())
							{
								try {
									service.deleteClientGprs(numero);
									service.deleteClientIn(numero);
									Utilitaire.displayNotification("Client de Numero:"+ numero + "a ete supprimer SUR IN avec DATA avec success");
								} catch (Exception e1) {
									Utilitaire.displayErrorMessage("Error: " + e1.getMessage());
								}
							}
							try {
								service.deleteClientIn(numero);
								Utilitaire.displayNotification("Client de Numero:"+ numero + "a ete supprimer SUR IN sans DATA avec success");
							} catch (Exception e1) {
								Utilitaire.displayErrorMessage("Error: " + e1.getMessage());
							}
						}else {
							if(client.isActivedata()) {
								try {
									service.deleteClientGprs(numero);
									service.deleteClientHlr(numero);
									Utilitaire.displayNotification("Client de Numero:"+ numero + "a ete supprimer SUR HLR avec DATA avec success");
								} catch (Exception e1) {
									Utilitaire.displayErrorMessage("Error: " + e1.getMessage());
								}
							}
							try {
								service.deleteClientHlr(numero);
								Utilitaire.displayNotification("Client de Numero:"+ numero + "a ete supprimer SUR IN sans DATA avec success");
							} catch (Exception e1) {
								Utilitaire.displayErrorMessage("Error: " + e1.getMessage());
							}
						}
					uiadministrateur.nottoyer();
				}
				} catch (Exception e2) {
					Utilitaire.displayErrorMessage("Erreur des suppression du client de numero " + numero);
				}
				
			}
			
		});
		uiadministrateur.adddeleteInListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String numero = uiadministrateur.getNumeroField();
				Clients client;
			
				try {
					client = service.searchByNumTel(numero);
					if(numero.compareTo("")== 0) {
						Utilitaire.displayNotification("Veuillez donner un numero a supprimer...");
					}else {
					if(client.getType().compareTo("PREPAID") == 0) {
						service.deleteClientIn(numero);
					
					}else if(client.isActivedata())
					{
						service.deleteClientIn(numero);
					
					}else{
						Utilitaire.displayNotification("Cet Abonne n'est pas PREPAID,car il n'est pas sur IN!!!!");
					}
					}
					uiadministrateur.nottoyer();
				} catch (Exception e1) {
					Utilitaire.displayErrorMessage("Erreur de rechercher sur cet Abonne " + numero + e1.getMessage());
				}
			}	
		});
		uiadministrateur.adddeleteDataListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String numero = uiadministrateur.getNumeroField();
				Clients client;
				
				try {
					client = service.searchByNumTel(numero);
					if(numero.compareTo("")== 0) {
						Utilitaire.displayNotification("Veuillez donner un numero a supprimer...");
					}else {
					if(!client.isActivedata())
					{
						service.deleteClientGprs(numero);
				
					}else
					{
						System.out.println("La valeur est :" + client.isActivedata());
						Utilitaire.displayNotification("Cet Abonne n'a pas de Data!!!!");
					}
					}
					uiadministrateur.nottoyer();
				} catch (Exception e1) {
					Utilitaire.displayErrorMessage("Erreur de rechercher sur cet Abonne " + numero + e1.getMessage());
				}
			}
			
		});
	}

	
	public void run() {	
		uiadministrateur.setVisible(true); 
	}
}