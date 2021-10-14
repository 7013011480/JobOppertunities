<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply for Job</title>
<!-- <!-- <script type="text/javascript">
function UserAction()
{
const userAction = async ()=> {
	const response = await fetch('/getAllJobs');
	const myJson = await response.json();
	const str = JSON.parse(myJson);
	document.getElementById("demo").innerHTML = str;
}	
}
</script> --> -->
</head>
<body>
<p id="demo" action="getAllJobs" method="get"></p>
</body>
</html>