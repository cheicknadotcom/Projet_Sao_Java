package com.javaws.entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao implements IDao {
	@Override
	public User search(String login, String password) throws Exception {
		try {
			Connection connection = DBManager.getConnection();
	
		    String query = "Select * From T_User Where login = ? and password = ?";
		    
		    PreparedStatement preparedStatement = connection.prepareStatement(query);
		    preparedStatement.setString(1, login);
		    preparedStatement.setString(2, password);
		    
		    ResultSet resultSet = preparedStatement.executeQuery();
		    
		    if (resultSet.next()) {
		        return new User (resultSet.getInt("identifiant"), resultSet.getString("login"), resultSet.getString("password"));
		    }
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return null;
	}  	
	@Override
	public void createEntite(Clients client) throws Exception {
		try {
			Connection connection = DBManager.getConnection();
	
			String query = "Insert Into T_Datahlr (date,numeroTel,type,services,services2,services3,services4,services5,data) values (?,?,?,?,?,?,?,?,?)";
	
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,client.getDate());
			preparedStatement.setString(2,client.getNumeroTel());
			preparedStatement.setString(3,client.getType());
			for(int i =0;i < client.getListeService().size();i++)
			{
			preparedStatement.setString(4+i,client.getListeService().get(i).name());
			}
			preparedStatement.setBoolean(9,client.isActivedata());
			preparedStatement.execute();			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}		
	}	
	@Override
	public Clients searchByNumTel(String numeroTel) throws Exception {
			//List<ServiceActive> liste = new ArrayList<ServiceActive>();
		
			Connection connection = DBManager.getConnection();
	
		    String query = "Select * From T_Datahlr Where numeroTel = ?";
		    
		    PreparedStatement preparedStatement = connection.prepareStatement(query);
		    preparedStatement.setString(1, numeroTel);
		    ResultSet resultSet = preparedStatement.executeQuery();
		    
		    if (resultSet.next()) {		    	
		        return new Clients(resultSet.getInt("id"), resultSet.getString("date"), resultSet.getString("numeroTel"),TypeClient.valueOf(resultSet.getString("type")));
		    }
		return null;
	}
	@Override
	public void createEntiteIn(Clients client) throws Exception {		
			Connection connection = DBManager.getConnection();
			String query = "Insert Into T_Datain (date,numeroTel,type,services,services2,services3,services4,services5,data) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,client.getDate());
			preparedStatement.setString(2,client.getNumeroTel());
			preparedStatement.setString(3,client.getType());
			for(int i =0;i < client.getListeService().size();i++)
			{
				preparedStatement.setString(4+i,client.getListeService().get(i).name());
			}
			preparedStatement.setBoolean(9,client.isActivedata());
			preparedStatement.execute();
	}

	@Override
	public void createEntiteGprs(Clients client) throws Exception {
		
			Connection connection = DBManager.getConnection();
	
			String query = "Insert Into T_Datagprs (date,numeroTel,type,services,services2,services3,services4,services5,data) values (?,?,?,?,?,?,?,?,?)";
	
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,client.getDate());
			preparedStatement.setString(2,client.getNumeroTel());
			preparedStatement.setString(3,client.getType());
			for(int i =0;i < client.getListeService().size();i++)
			{
				preparedStatement.setString(4+i,client.getListeService().get(i).name());
			}
			preparedStatement.setBoolean(9,client.isActivedata());
			preparedStatement.execute();
	}

	@Override
	public void deleteClientGprs(String numeroTel) throws Exception {
		Connection connection = DBManager.getConnection();

		String query = "Delete From T_Datagprs Where id=?";
	       
		PreparedStatement preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1,numeroTel);
		preparedStatement.execute();
		
		connection.close();
	}

	@Override
	public List<Clients> listeClientHRL() throws Exception {
		Connection connection = DBManager.getConnection();
		List<Clients> users = new ArrayList<Clients>();
		String query = "Select * From T_Datahlr";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String dates = resultSet.getString("date");
			String numero = resultSet.getString("numeroTel");
			String type = resultSet.getString("type");		
			Boolean activedata = resultSet.getBoolean("data");
			TypeClient types = TypeClient.valueOf(type);
			//Clients clients = new Clients(id,dates,numero,types,activedata);
			String sms = resultSet.getString("services");
			String appel = resultSet.getString("services2");
			String hot = resultSet.getString("services3");
			String renv = resultSet.getString("services4");
			String rao = resultSet.getString("services5");
			//Clients clients = new Clients(id,dates,numero,types,activedata,liste);
			Clients clients = new Clients(id,dates,numero,types,activedata,sms,appel,hot,renv,rao);
			users.add(clients);
			System.out.println(clients);
		}
		connection.close();
		return users;	
	}
	@Override
	public void deleteClient(String numeroTel) throws Exception {
		Connection connection = DBManager.getConnection();
		String query = "Delete From T_Datahlr Where numeroTel=?";	       
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, numeroTel);
		preparedStatement.execute();
		connection.close();	
	}

	@Override
	public void deleteClientIn(String numeroTel) throws Exception {
		Connection connection = DBManager.getConnection();
		String query = "Delete From T_Datain Where numeroTel=?";	       
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, numeroTel);
		preparedStatement.execute();		
		connection.close();		
	}
	@Override
	public List<Clients> listeClientGPRS() throws Exception {
		Connection connection = DBManager.getConnection();
		List<Clients> users = new ArrayList<Clients>();
		//List<ServiceActive> liste = new ArrayList<ServiceActive>();
		String query = "Select * From T_Datagprs";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {	
			int id = resultSet.getInt("id");
			String dates = resultSet.getString("date");
			String numero = resultSet.getString("numeroTel");
			String type = resultSet.getString("type");		
			Boolean activedata = resultSet.getBoolean("data");
			TypeClient types = TypeClient.valueOf(type);
//			ServiceActive sms = ServiceActive.valueOf( resultSet.getString("services"));
//			ServiceActive appel = ServiceActive.valueOf( resultSet.getString("services2"));
//			ServiceActive hot = ServiceActive.valueOf( resultSet.getString("services3"));
//			ServiceActive renvoi = ServiceActive.valueOf( resultSet.getString("services4"));
//			ServiceActive roaming = ServiceActive.valueOf( resultSet.getString("services5"));
//			liste.add(sms);
//			liste.add(appel);
//			liste.add(hot);
//			liste.add(renvoi);
//			liste.add(roaming);
			String sms = resultSet.getString("services");
			String appel = resultSet.getString("services2");
			String hot = resultSet.getString("services3");
			String renv = resultSet.getString("services4");
			String rao = resultSet.getString("services5");
			//Clients clients = new Clients(id,dates,numero,types,activedata,liste);
			Clients clients = new Clients(id,dates,numero,types,activedata,sms,appel,hot,renv,rao);
			users.add(clients);
			System.out.println(clients);
		}
		
		connection.close();
		
		return users;
	}

	@Override
	public List<Clients> listeClientIN() throws Exception {
		Connection connection = DBManager.getConnection();

		List<Clients> users = new ArrayList<Clients>();
		String query = "Select * From T_Datain";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			
			int id = resultSet.getInt("id");
			String dates = resultSet.getString("date");
			String numero = resultSet.getString("numeroTel");
			String type = resultSet.getString("type");		
			Boolean activedata = resultSet.getBoolean("data");
			TypeClient types = TypeClient.valueOf(type);
			//Clients clients = new Clients(id,dates,numero,types,activedata);
			String sms = resultSet.getString("services");
			String appel = resultSet.getString("services2");
			String hot = resultSet.getString("services3");
			String renv = resultSet.getString("services4");
			String rao = resultSet.getString("services5");
			//Clients clients = new Clients(id,dates,numero,types,activedata,liste);
			Clients clients = new Clients(id,dates,numero,types,activedata,sms,appel,hot,renv,rao);
			users.add(clients);
			System.out.println(clients);
		}
		
		connection.close();
		
		return users;
	}
}
