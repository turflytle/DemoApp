<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.glx.app.Patient" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SuccessFully Login</title>
<style type="text/css">
div {
    width: 300px;
    border: 1px solid black;
    padding: 30px 0px 35px 100px;
    margin: auto ;
}


</style>
</head>
<body>
<div>
<table>

<tr><td>Patient ID :${pat.pid}</td></tr>
<tr><td>Patient Name :${pat.pname}</td></tr>
<tr><td>Disease :${pat.disease} </td></tr><br><br>
<tr><th>Medicine ID</th><th>Medicine Name</th>
<c:forEach items="${pat.medicines}" var="med">

    <tr><td>${med.mid}</td><td>${med.mname}</td></tr>
</c:forEach>
<form:form modelAttribute="pat" method="post" action="LoginAgain">
<tr><td>
<input type="submit" value="Go to Login Page"/></td></tr>
</form:form>
</table>

</div>

</body>
</html>