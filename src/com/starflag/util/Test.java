package com.starflag.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = SingleTonConnection.connection();
			Statement stmt=conn.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from battles");
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2));  
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(conn);

	}

}
