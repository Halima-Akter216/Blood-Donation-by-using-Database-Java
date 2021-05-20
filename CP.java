package com.blood.doner;

import java.sql.Connection;
import java.sql.DriverManager;
//setting up connection with database using drivers....
public class CP {
	static Connection con;
	
	public static Connection CreatC() {
		try {
			//load the driver;
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection create;
			
			String user="root";
			String password="limon199031";
			String url="jdbc:mysql://localhost:3306/blood_doner";
			//connection execute
			
			con=DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
	}
}
