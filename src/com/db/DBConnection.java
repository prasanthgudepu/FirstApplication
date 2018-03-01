/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;
import java.sql.*;
/**
 *
 * @author PG
 */
public class DBConnection {
   public static void main(String[] args) {
	// TODO Auto-generated method stub
	try{  
        	Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sakila","root","admin");  
		//here sakila is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from actor");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
	}catch(Exception e){ System.out.println(e);}  
        System.out.println("Complted fetching records");
   } 
}
