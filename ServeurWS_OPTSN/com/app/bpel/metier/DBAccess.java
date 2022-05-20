package com.app.bpel.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Singleton pattern
public class DBAccess {
	private static Connection connection = null;

	private DBAccess () throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbbank?serverTimezone=UTC", "root", "");
	}

	public static Connection getInstance () throws SQLException {
		if (connection == null) {
			new DBAccess ();
		}

		return connection;
	}
}
