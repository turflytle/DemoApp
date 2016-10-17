<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<style type="text/css">
div {
    width: 200px;
    border: 1px solid black;
    padding: 30px 0px 35px 100px;
    margin: auto ;
}


</style>

</head>
<body>
<div>
<h3>${msg}</h3>
<form action="Login" method="post">
PatientId :<input type="text" name="pid"/><br><br>
Password :<input type="text"  name="password"/><br><br>
<input type="submit" value="LOGIN !"/><br><br>
</form>


</div>

</body>
</html>