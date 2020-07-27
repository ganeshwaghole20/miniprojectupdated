package com.buisnesslogic;

import java.util.ArrayList;

import com.connection.Constants;
import com.connection.DatabaseConnection;
import com.email.Emails;
import com.sms.MobileMessages;
import com.connection.DatabaseConnection;
import java.sql.*;

public class LogicImplementation {
	
	public static ResultSet rs=null;
	public static Statement stmt=null;
	
	public static void actualLogic()
	{
		
		try
		
		{
			
		stmt=DatabaseConnection.con.createStatement();
		rs=stmt.executeQuery(Constants.qry);	
		
		while(rs.next())
		{

			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getFloat(6));
			
			Emails.emailsend(rs.getString(2));
			System.out.println("email suceesfully sent to = "+rs.getString(2));
			MobileMessages.mobilemessagesend(rs.getString(3));
			System.out.println("Mobile text Message suceesfully sent to= "+rs.getString(3));
			
		}
		
	
		
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				DatabaseConnection.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
