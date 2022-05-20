package com.app.bpel.metier;



public class Service {

	private IDao dao;
	
	public Service() {
		dao = new Dao();
	}

	public boolean authentifierUser(String login, String password) 
			throws Exception {		
		try {
			return dao.search(login, password) == null ? false : true;
		} catch (Exception e) {
			throw new Exception ("Exception : " + e.getMessage()); 
		}
	}
}
