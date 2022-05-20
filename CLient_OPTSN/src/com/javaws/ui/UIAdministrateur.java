package com.javaws.ui;
/**********************************************************************************************************************************************************/
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.javaws.entities.Clients;
import com.javaws.entities.ServiceActive;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;
import javax.swing.Box;
/**********************************************************************************************************************************************************/
public class UIAdministrateur extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField NumeroPhone;
	private JTextField DateCreation;
	private JTextField saerchField;
	private JButton createButton;
	private JButton deleteButton;
	private JButton clearButton;
	private JButton searchButton;
	private JButton cancelButton;
	private JButton listeButton;
	private JButton listeButtonGprs;
	private JButton btnDeletedata;
	private JButton btnDeletein;
	private JButton listeButtonIN;
	private JComboBox<String> typeAbonnecomboBox;
	private Clients client;
	private JPanel panel;
	private JLabel sms;
	private JLabel appel;
	private JLabel lblData;
	private JComboBox<String> serviceAppelcomboBox;
	private JComboBox<String> serviceSmscomboBox;
	private JComboBox<String> serviceDatacomboBox;
	
	/*---------------------------------------------------------------------------------------------------------------------------*/	
	public Clients getClients() {
		return client;
	}
	public void setClients(Clients clients) {
		this.client = clients;
	}
	/*---------------------------------------------------------------------------------------------------------------------------*/	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public UIAdministrateur() {
		setResizable(false);
		setFont(new Font("Verdana", Font.PLAIN, 12));
		getContentPane().setFont(new Font("Dialog", Font.BOLD, 14));
		getContentPane().setBackground(new Color(0, 139, 139));
		setForeground(Color.GREEN);
		setBackground(SystemColor.inactiveCaptionBorder);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Administrateur");
		this.setSize(811, 485);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 139, 139));
		panel_1.setBounds(91, 378, 740, 44);
		getContentPane().add(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		createButton = new JButton("CREATE");
		Image create = new ImageIcon(this.getClass().getResource("/valide.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		createButton.setIcon(new ImageIcon(create));
		createButton.setForeground(SystemColor.window);
		createButton.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_1.add(createButton, "2, 2");
		createButton.setBackground(Color.GREEN);
		 Image delete = new ImageIcon(this.getClass().getResource("/delete.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		 Image clear = new ImageIcon(this.getClass().getResource("/clear.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		 
		  deleteButton = new JButton("DELETE");
		  deleteButton.setIcon(new ImageIcon(delete));
		  deleteButton.setForeground(SystemColor.window);
		  deleteButton.setFont(new Font("Dialog", Font.BOLD, 14));
		  panel_1.add(deleteButton, "8, 2");
		  deleteButton.setBackground(Color.RED);
		 Image liste = new ImageIcon(this.getClass().getResource("/submit.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		Image cancel = new ImageIcon(this.getClass().getResource("/cancel.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		 
		  clearButton = new JButton("CLEAR");
		  clearButton.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  	}
		  });
		  clearButton.setIcon(new ImageIcon(clear));
		  clearButton.setForeground(SystemColor.window);
		  clearButton.setFont(new Font("Dialog", Font.BOLD, 14));
		  panel_1.add(clearButton, "14, 2");
		  clearButton.setBackground(Color.ORANGE);
		
		 listeButton = new JButton("LISTE");
		 listeButton.setIcon(new ImageIcon(liste));
		 listeButton.setForeground(SystemColor.window);
		 listeButton.setFont(new Font("Dialog", Font.BOLD, 14));
		 panel_1.add(listeButton, "20, 2");
		 listeButton.setBackground(new Color(65, 105, 225));
		
		cancelButton = new JButton("CANCEL");
		cancelButton.setIcon(new ImageIcon(cancel));
		cancelButton.setForeground(SystemColor.window);
		cancelButton.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_1.add(cancelButton, "26, 2");
		cancelButton.setBackground(new Color(255, 69, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(10, 11, 351, 267);
		getContentPane().add(panel_2);
		panel_2.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel NomLabel = new JLabel("Numero phone :");
		NomLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(NomLabel, "2, 4");
		
		NumeroPhone = new JTextField();
		NumeroPhone.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(NumeroPhone, "3, 4, 13, 1");
		NumeroPhone.setColumns(10);
		
		JLabel PrenomLabel = new JLabel("Date de Creation :");
		PrenomLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(PrenomLabel, "2, 8");
		
		DateCreation = new JTextField();
		DateCreation.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(DateCreation, "3, 8, 13, 1");
		DateCreation.setColumns(10);
		
		JLabel Typelabel = new JLabel("Type Abonne :");
		Typelabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(Typelabel, "2, 12");
		
		typeAbonnecomboBox = new JComboBox();
		typeAbonnecomboBox.setFont(new Font("Verdana", Font.PLAIN, 14));
		typeAbonnecomboBox.addItem("PREPAID");
		typeAbonnecomboBox.addItem("POSTPAID");
		panel_2.add(typeAbonnecomboBox, "3, 12, 13, 1, fill, default");
		
		sms = new JLabel("SMS");
		sms.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(sms, "6, 16");
		
		appel = new JLabel("APPEL");
		appel.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(appel, "8, 16");
		
		lblData = new JLabel("DATA");
		lblData.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel_2.add(lblData, "12, 16");
		
		JLabel choixService = new JLabel("Choissiez");
		choixService.setFont(new Font("Verdana", Font.BOLD, 14));
		panel_2.add(choixService, "2, 18");
		
		serviceSmscomboBox = new JComboBox();
		panel_2.add(serviceSmscomboBox, "3, 18, 4, 1, fill, default");
		serviceSmscomboBox.addItem("NON");
		serviceSmscomboBox.addItem("SMS");
		serviceAppelcomboBox = new JComboBox();
		panel_2.add(serviceAppelcomboBox, "8, 18, 3, 1, center, default");
		serviceAppelcomboBox.addItem("NON");
		serviceAppelcomboBox.addItem("APPEL");
		serviceDatacomboBox = new JComboBox();
		panel_2.add(serviceDatacomboBox, "12, 18, 4, 1, fill, default");
		serviceDatacomboBox.addItem("NON");
		serviceDatacomboBox.addItem("DATA");
			panel = new JPanel();
			panel.setBackground(new Color(0, 128, 128));
			panel.setBounds(343, 11, 449, 33);
			getContentPane().add(panel);
			panel.setLayout(new GridLayout(1, 0, 0, 0));
				JLabel lblNewLabel_4 = new JLabel("Chercher Numero");
				panel.add(lblNewLabel_4);
				lblNewLabel_4.setBackground(SystemColor.inactiveCaptionBorder);
				lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 14));
			saerchField = new JTextField();
			panel.add(saerchField);
			saerchField.setFont(new Font("Verdana", Font.PLAIN, 14));
			saerchField.setColumns(10);
			
			searchButton = new JButton("SEARCH");
			Image search = new ImageIcon(this.getClass().getResource("/search.png")).getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
			searchButton.setIcon(new ImageIcon(search));
			panel.add(searchButton);
			searchButton.setForeground(Color.WHITE);
			searchButton.setFont(new Font("Verdana", Font.BOLD, 14));
			searchButton.setBackground(new Color(0, 0, 128));
			
			JLabel Labelimg = new JLabel("");
			Image admi = new ImageIcon(this.getClass().getResource("/WhatsApp.jpeg")).getImage().getScaledInstance(452, 209, Image.SCALE_SMOOTH);
			Labelimg.setIcon(new ImageIcon(admi));
			Labelimg.setBounds(365, 63, 427, 225);
			getContentPane().add(Labelimg);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBounds(22, 312, 351, 37);
			getContentPane().add(panel_3);
			
			listeButtonGprs = new JButton("LISTEGPRS");
			listeButtonGprs.setIcon(new ImageIcon(liste));
			listeButtonGprs.setForeground(Color.WHITE);
			listeButtonGprs.setFont(new Font("Dialog", Font.BOLD, 14));
			listeButtonGprs.setBackground(new Color(65, 105, 225));
			panel_3.add(listeButtonGprs);
			
			Component horizontalGlue = Box.createHorizontalGlue();
			panel_3.add(horizontalGlue);
			
			Component horizontalStrut = Box.createHorizontalStrut(20);
			panel_3.add(horizontalStrut);
			
			listeButtonIN = new JButton("LISTEIN  ");
			listeButtonIN.setIcon(new ImageIcon(liste));
			listeButtonIN.setForeground(Color.WHITE);
			listeButtonIN.setFont(new Font("Dialog", Font.BOLD, 14));
			listeButtonIN.setBackground(Color.MAGENTA);
			panel_3.add(listeButtonIN);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBounds(375, 312, 410, 37);
			getContentPane().add(panel_4);
			
			btnDeletein = new JButton("DELETEIN");
			btnDeletein.setIcon(new ImageIcon(delete));
			btnDeletein.setForeground(Color.WHITE);
			btnDeletein.setFont(new Font("Dialog", Font.BOLD, 14));
			btnDeletein.setBackground(Color.CYAN);
			panel_4.add(btnDeletein);
			
			btnDeletedata = new JButton("DELETEData");
			btnDeletedata.setIcon(new ImageIcon(delete));
			btnDeletedata.setForeground(Color.WHITE);
			btnDeletedata.setFont(new Font("Dialog", Font.BOLD, 14));
			btnDeletedata.setBackground(Color.GREEN);
			panel_4.add(btnDeletedata);
	}
/**********************************************************************************************************************************************************/

public String getServiceAppelcomboBox() {
		return (String)serviceAppelcomboBox.getSelectedItem();
	}
/**********************************************************************************************************************************************************/

	public void setServiceAppelcomboBox(JComboBox<String> serviceAppelcomboBox) {
		this.serviceAppelcomboBox = serviceAppelcomboBox;
	}
/**********************************************************************************************************************************************************/

	public String getServiceSmscomboBox() {
		return (String)serviceSmscomboBox.getSelectedItem();
	}
/**********************************************************************************************************************************************************/

	public void setServiceSmscomboBox(JComboBox<String> serviceSmscomboBox) {
		this.serviceSmscomboBox = serviceSmscomboBox;
	}
/**********************************************************************************************************************************************************/

	public String getServiceDatacomboBox() {
		return (String)serviceDatacomboBox.getSelectedItem();
	}
/**********************************************************************************************************************************************************/

	public void setServiceDatacomboBox(JComboBox<String> serviceDatacomboBox) {
		this.serviceDatacomboBox = serviceDatacomboBox;
	}
/**********************************************************************************************************************************************************/

	public boolean testActiveData(String a)
	{
		if(a.compareTo(ServiceActive.DATA.name()) == 0)
			return true;
		return false;
	}
/**********************************************************************************************************************************************************/

	public void addCreerListener(ActionListener actionListener)
	{
		this.createButton.addActionListener(actionListener);
	}
/**********************************************************************************************************************************************************/
	public void addClearListener(ActionListener actionListenr)
	{
		this.clearButton.addActionListener(actionListenr);
	}
/**********************************************************************************************************************************************************/
	public void adddeleteListener(ActionListener actionLstener)
	{
		this.deleteButton.addActionListener(actionLstener);
	}
/**********************************************************************************************************************************************************/

	public void adddeleteInListener(ActionListener actionLstener)
	{
		this.btnDeletein.addActionListener(actionLstener);
	}
/**********************************************************************************************************************************************************/

	public void adddeleteDataListener(ActionListener actionLstener)
	{
		this.btnDeletedata.addActionListener(actionLstener);
	}
/**********************************************************************************************************************************************************/
	public void addListeListener(ActionListener actionListener)
	{
		this.listeButton.addActionListener(actionListener);
	}
/**********************************************************************************************************************************************************/

	public void addListeListenerGPRS(ActionListener actionListener)
	{
		this.listeButtonGprs.addActionListener(actionListener);
	}
/**********************************************************************************************************************************************************/

	public void addListeListenerIN(ActionListener actionListener)
	{
		this.listeButtonIN.addActionListener(actionListener);
	}
/**********************************************************************************************************************************************************/
	public void addCancelListener(ActionListener actionListener)
	{
		this.cancelButton.addActionListener(actionListener);
	}
/**********************************************************************************************************************************************************/
	public void addSearchListener(ActionListener actionListener)
	{
		this.searchButton.addActionListener(actionListener);
	}
/**********************************************************************************************************************************************************/
	public void addRemplirChampListener(Clients clients)
	{
		
		this.NumeroPhone.setName(clients.getNumeroTel());
		this.DateCreation.setName(clients.getDate());
		this.typeAbonnecomboBox.setName(clients.getType());
	}
/**********************************************************************************************************************************************************/
	public String getNumeroField() {
		return NumeroPhone.getText();
	}
/**********************************************************************************************************************************************************/
	public void setNumeroField(JTextField nomField) {
		NumeroPhone = nomField;
	}
/**********************************************************************************************************************************************************/
	public String getDateField() {
		return DateCreation.getText();
	}
/**********************************************************************************************************************************************************/
	public void setDateField(JTextField prenomField) {
		DateCreation = prenomField;
	}
/**********************************************************************************************************************************************************/
	public String getTypecomboBox() {
		return (String)typeAbonnecomboBox.getSelectedItem();
	}
/**********************************************************************************************************************************************************/
	public void setTypecomboBox(JComboBox<String> typecomboBox) {
		this.typeAbonnecomboBox = typecomboBox;
	}
	
/**********************************************************************************************************************************************************/

	public String  getSaerchField() {
		return saerchField.getText();
	}
/**********************************************************************************************************************************************************/

	public void setSaerchField(JTextField saerchField) {
		this.saerchField = saerchField;
	}
/**********************************************************************************************************************************************************/

	public void remplirchamp(Clients client)
	{
		NumeroPhone.setText(client.getNumeroTel());
		DateCreation.setText(client.getDate());
	}
/**********************************************************************************************************************************************************/
	public void nottoyer() {
		
		NumeroPhone.setText(null);
		DateCreation.setText(null);
		saerchField.setText(null);
	}
	public void nottoyers() {
		saerchField.setText(null);
	}
/**********************************************************************************************************************************************************/

	public void disposeFenetre()
	{
		this.setVisible(false);
	}
/**********************************************************************************************************************************************************/

	public void montrer()
	{
		this.setVisible(true);
	}
}
/**********************************************************************************************************************************************************/