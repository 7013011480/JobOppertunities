<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Candidate Registration</title>
</head>
<body>
<h1>Enter the details of the Applicant</h1>

<form action="ApplicantData" method="post" >
  
  <label>Applicant Name:</label>
  <input type="text"  name="applicantName"><br><br>
  
  <label >Qualification:</label>
  <input type="text"  name="qualification"><br><br>
  
  <label >Email:</label>
  <input type="text"  name="email"><br><br>
  
  <label >Experiance:</label>
  <input type="text"  name="experiance"><br><br>
  
  <input type="submit" value="Submit">
</form>
</body>
</html>