package com.sun.hitech.shooping_cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class connectionDB {
	
	private connectionDB(){
		
	}
	public static Connection getconnetion() throws ClassNotFoundException, SQLException
	{
	
	ResourceBundle rb= ResourceBundle.getBundle("connection");
	Class.forName(rb.getString("drivername"));
	Connection con=DriverManager.getConnection(rb.getString("dburl"),rb.getString("userid"),rb.getString("password"));	
	return con;
	}

}
