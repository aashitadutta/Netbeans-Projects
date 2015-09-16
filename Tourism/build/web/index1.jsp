<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Tourism</title> 
</head>
<body>
<s:form action="register">  
<s:textfield name="name" label="UserName"></s:textfield>  
<s:textfield name="firstname" label="FirstName"></s:textfield>  
<s:textfield name="lastname" label="LastName"></s:textfield>  

<s:textfield name="email" label="Email"></s:textfield>  
    <s:password name="password" label="Password"></s:password>  
<!--s:radio list="{'male','female'}" name="gender"--><!--/s:radio-->  

  
<s:submit value="register"></s:submit>  
  
</s:form>  
</body></html>