package com.blood.doner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DonarD {
	//to add a donar
	public static boolean insertDonertoDB(Doner d) {
		boolean flag=false;
		//jdbc code
		try {
			Connection con=CP.CreatC();
			String q="insert into donar_list(dname,dage,bgroup,bgender) values(?,?,?,?)";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameter;
			pstmt.setString(1, d.getD_name());
			pstmt.setInt(2, d.getD_age());
			pstmt.setString(3, d.getD_group());
			pstmt.setString(4, d.getD_gender());
		//execute
			pstmt.executeUpdate();
			flag=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}
//to delete a donar....
	public static boolean deleteD(int did) {
		// TODO Auto-generated method stub
		boolean flag=false;
		//jdbc code
		try {
			Connection con=CP.CreatC();
			String q="delete from donar_list where did=?";
			//preparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values parameter;
			pstmt.setInt(1, did);
		//execute
			pstmt.executeUpdate();
			flag=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
		
	}
	//to display a donar......
	public static void showDonar() {
		// TODO Auto-generated method stub

		//jdbc code
		try {
			Connection con=CP.CreatC();
			String q="select * from donar_list";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				int age=set.getInt(3);
				String blodgroup=set.getString(4);
				String gender =set.getString(5);
				
				System.out.println("D_ID="+id);
				System.out.println("D_name="+name);
				System.out.println("D_age="+age);
				System.out.println("D_dgroup="+blodgroup);
				System.out.println("D_gende="+gender);
				System.out.println("+++++++++++++++++++++++++++++++++");
			}
			System.out.println("End of donar list (^_^)\n");
			System.out.println("_+_+_+_+_+_+_+_+_+_+_+ \n");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
