package com.tutorialspoint.struts2;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
  
public class LoginUser {  
  
public static boolean validate(String username,String userpass){  
 boolean status=false;  
  try{  
   Class.forName("com.mysql.jdbc.Driver");  
   Connection c=DriverManager.getConnection(  
   "jdbc:mysql:@localhost:3306/mydatabase","root","root");  
     
   PreparedStatement ps=c.prepareStatement(  
     "select * from tourism where name=? and password=?");  
   ps.setString(1,username);  
   ps.setString(2,userpass);  
   ResultSet rs=ps.executeQuery();  
   status=rs.next();  
  }catch(Exception e){e.printStackTrace();}  
 return status;  
}  
}  
