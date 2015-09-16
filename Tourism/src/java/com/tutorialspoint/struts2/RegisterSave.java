
package com.tutorialspoint.struts2;
import java.sql.*;  
public class RegisterSave {  
  
public static int save(Registration r){
   
int status=0;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:8080/mydatabase","root","");  
PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");  
ps.setString(1,r.getname());  
ps.setString(2,r.getfirstname());
ps.setString(3,r.getlastname());
ps.setString(4,r.getemail()); 
ps.setString(5,r.getpassword());  
/*ps.setString(6,r.getgender());*/ 
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  
