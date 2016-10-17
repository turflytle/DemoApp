<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration </title>
</head>
<body>
<table>

<form:form action="Register" modelAttribute="pat" method="post">
<tr><td>Patient ID :<form:input path="pid"/><form:errors path="pid"/></td></tr>
<tr><td>Patient Name :<form:input path="pname"/><form:errors path="pname"/></td></tr>
<tr><td>Password :<form:password path="password"/><form:errors path="password"/></td></tr>
<tr><td>Disease :<form:input path="disease"/><form:errors path="disease"/></td></tr>
<tr><td>Medicine 1:<form:input path="m1"/><form:errors path="m1"/></td></tr>
<tr><td>Medicine 2:<form:input path="m2"/><form:errors path="m2"/></td></tr>
<tr><td>Medicine 3:<form:input path="m3"/><form:errors path="m3"/></td></tr>

<tr><td><input type="submit" value="SUBMIT !"/></td></tr>

</form:form>


</table>

</body>
</html>