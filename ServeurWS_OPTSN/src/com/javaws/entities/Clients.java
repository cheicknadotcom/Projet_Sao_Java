package com.javaws.entities;


import java.util.ArrayList;
import java.util.List;

public class Clients {
	//Les attributs des classes
	private int id;
	private String date;
	private String numeroTel;
	private TypeClient type;
	private boolean activedata;
	private String sms;
	private String appels;
	private String hotline;
	private String renvoiappel;
	private String roaming;

	List<ServiceActive> listeService = null;
	ArrayList<ServiceActive> liste;
	
	//Les constructeurs de la classe client
	public Clients() {
		super();
	}
	
	public Clients(int id, String date, String numeroTel) {
		this.id = id;
		this.date = date;
		this.numeroTel = numeroTel;
	}
	public Clients(int id, String date, String numeroTel,TypeClient type) {
		this(id,date,numeroTel);
		this.type = type;
	}
	public Clients(int id, String date, String numeroTel,TypeClient type,Boolean data) {
		this(id,date,numeroTel,type);
		this.activedata = data;
	}
	public Clients(int id, String date, String numeroTel,TypeClient type,Boolean data,String sms,String appel,String hot,String renv,String roa) {
		this(id,date,numeroTel,type,data);
		this.sms=sms;
		this.appels = appel;
		this.hotline = hot;
		this.renvoiappel = renv;
		this.roaming = roa;
	}
	public Clients(String date, String numeroTel, TypeClient type, List<ServiceActive> listeService) {
		this.date = date;
		this.numeroTel = numeroTel;
		this.type = type;
	 
		listeService = new ArrayList<ServiceActive>();
		listeService.add(ServiceActive.HOTLINE);
		listeService.add(ServiceActive.RENVOIAPPEL);
		listeService.add(ServiceActive.ROAMING);
		this.listeService = listeService;
	}
	public Clients(String date, String numeroTel, TypeClient type,
			List<ServiceActive> listeService, boolean activedata) {
		this(date,numeroTel,type,listeService);
		this.activedata = activedata;	
	}
	
	public Clients(int id, String date, String numeroTel, TypeClient type, boolean activedata,
			List<ServiceActive> listeService) {
		this(date,numeroTel,type,listeService,activedata);
		this.id = id;
	}
	//les getters et setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getNumeroTel() {
		return numeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}
	public String getType() {
		return type.name();
	}
	public void setType(TypeClient type) {
		this.type = type;
	}
	public boolean isActivedata() {
		 return activedata;
	}
	public void setActivedata(boolean activedata) {
		this.activedata = activedata;
	}
	public List<ServiceActive> getListeService() {
		return listeService;
	}
	public void setListeService(List<ServiceActive> listeService) {
		this.listeService = listeService;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public String getAppels() {
		return appels;
	}
	public void setAppels(String appels) {
		this.appels = appels;
	}
	public String getHotline() {
		return hotline;
	}
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}
	public String getRenvoiappel() {
		return renvoiappel;
	}
	public void setRenvoiappel(String renvoiappel) {
		this.renvoiappel = renvoiappel;
	}
	public String getRoaming() {
		return roaming;
	}
	public void setRoaming(String roaming) {
		this.roaming = roaming;
	}
	@Override
	public String toString() {
		return "Clients [date=" + date + ", numeroTel=" + numeroTel + ", type=" + type + ", activedata=" + activedata
				+ ", listeService=" + listeService + "]";
	}
}
