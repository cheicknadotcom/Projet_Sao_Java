package com.javaws.runtime;
/**********************************************************************************************************************************************************/
import com.javaws.controller.AuthentificationController;
import com.javaws.ui.UIAuthentification;
/**********************************************************************************************************************************************************/
public class Application {

	public static void main(String[] args) {
		UIAuthentification uiAuthentification = new UIAuthentification();
		AuthentificationController authentificationController = new AuthentificationController(uiAuthentification);
		
		authentificationController.run ();
	}
}
/**********************************************************************************************************************************************************/ 