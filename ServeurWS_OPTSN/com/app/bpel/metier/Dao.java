package com.app.bpel.metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Dao implements IDao {

	public User search(String nom, String prenom) throws Exception {
		try {
			Connection connection = DBAccess.getInstance() ;
	
		    String query = "Select * From T_Users Where login = ? and password = ?";
		    
		    PreparedStatement preparedStatement = connection.prepareStatement(query);
		    preparedStatement.setString(1, nom);
		    preparedStatement.setString(2, prenom);
		    
		    ResultSet resultSet = preparedStatement.executeQuery();
		    
		    if (resultSet.next()) {
		        return new User (resultSet.getInt("identifiant"), resultSet.getString("login"), resultSet.getString("password"));
		    }
		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		
		return null;
	}
}
