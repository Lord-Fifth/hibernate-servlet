<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head> 
	<title>Insert Data</title> 
</head> 
<body> 
	<h2>Employee Registration</h2>
	<!-- Give Servlet reference to the form as an instances 
	GET and POST services can be according to the problem statement-->
	<form action="./InsertData" method="POST"> 	
  		<fieldset>
   			<legend>Fill Up:</legend><br>
   			Employee Number:<br>
 			<input type="text" name="no" ><br>
 			<!-- Create an element with mandatory name attribute, so that data can be transfer to the servlet using getParameter() -->
  			Birth Date:<br>
  			<input type="text" name="bdate" ><br>
  			First Name:<br>
  			<input type="text" name="fname" ><br>
  			Last Name:<br>
  			<input type="text" name="lname" ><br>
  			Gender:<br>
  			<input type="text" name="gen" ><br>
  			Hire Date:<br>
  			<input type="text" name="hdate" ><br><br>
    	    <input type="submit" value="Submit">
  		</fieldset> 
	</form> 
</body> 
</html> 
