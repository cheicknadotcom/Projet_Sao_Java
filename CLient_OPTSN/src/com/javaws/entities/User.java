package com.javaws.entities;

import java.io.Serializable;

public class User implements Serializable, Comparable <User>{
	private static final long serialVersionUID = 8050362799512466933L;
	
	// Identifiant unique ...
	private Integer identifiant;
	private String login;
	private String password;		
	
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public User(Integer identifiant, String login, String password) {
		this (login, password);
		
		this.setIdentifiant(identifiant);
	}

	public Integer getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Integer identifiant) {
		this.identifiant = identifiant;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int compareTo(User other) {
		if(this.identifiant < other.identifiant) return -1;
		else if(this.identifiant > other.identifiant) return 1;
		else return 0;
	}
}
