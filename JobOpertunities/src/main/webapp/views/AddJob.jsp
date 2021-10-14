<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Job Oppertunity</title>
</head>
<body>
<h1>Enter the details of the New Job</h1>

<form action="JobData" method="post" >
  
  <label >Job Description:</label>
  <input type="text" name="JobDescription"><br><br>
  
  <label >Minimum Qualification:</label>
  <input type="text" name="MinQualification"><br><br>
  
  <label >Email:</label>
  <input type="text" name="Email"><br><br>
  
  <label >Minimum Experiance:</label>
  <input type="text" name="MinExperiance"><br><br>
  
  <input type="submit" value="Submit">
</form>
</body>
</html>