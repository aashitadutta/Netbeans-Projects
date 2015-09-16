package com.tutorialspoint.struts2;
public class Registration {
    private String name,firstname,lastname,email,password;
    
public String execute(){  
    int i=RegisterSave.save(this); 
   
    if(i>0){  
    //return "success";   
    }  
    
    return "error";  
}  
public String getname(){
       return name;
   }
public void setname(String name){
       this.name = name;
   }
public String getfirstname(){
       return firstname;
   }
   public void setfirstname(String firstname) {
       this.firstname = firstname;
   }
   public String getlastname(){
       return lastname;
   }
   public void setlastname(String lastname) {
       this.lastname = lastname;
   }
   public String getemail(){
       return email;
   }
   public void setemail(String email) {
       this.email = email;
   }
   public String getpassword(){
       return password;
   }
   public void setpassword(String password) {
       this.password = password;
   }
   /*public String getgender(){
       return gender;
   }
   public void setgender(String gender) {
       this.gender = gender;
   }*/
}