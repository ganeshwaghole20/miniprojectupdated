package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.email.*;
import com.sms.*;

public class DatabaseConnection {
	
	public static Connection con=null;
	
	public static void connectionmethod()
	
	{
		
		try {
			Class.forName(Constants.url);
			con=DriverManager.getConnection(Constants.urs,Constants.usename,Constants.password);
			System.out.println("connection created sucessfully");
			}
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
						
	}

}
