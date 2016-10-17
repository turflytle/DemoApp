<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration </title>
	<style>
div {
    width: 400px;
    height :400px;
    border: 1px solid black;
    padding: 150px 0px 35px 150px;
    margin: auto ;
}

</style>
</head>
<body>

<div>
<table>
<form:form action="Register" modelAttribute="pat" method="post">
<tr><td>Patient ID :<form:input path="pid"/><br><br><form:errors path="pid"/></td></tr>
<tr><td>Patient Name :<form:input path="pname"/><br><br><form:errors path="pname"/></td></tr>
<tr><td>Password :<form:password path="password"/><form:errors path="password"/><br><br></td></tr>
<tr><td>Disease :<form:input path="disease"/><form:errors path="disease"/><br><br></td></tr>
<%-- <c:forEach items="${pat.medicines}" varStatus="vs">

<tr><td>Medicine ID:<form:input path="medicines[${vs.index}].mid"/>
</td><td>Medicine Name:<form:input path="medicines[${vs.index}].mname"/></td></tr>
</c:forEach> --%>

<tr><td>Medicine :<form:input path="medicins"/><form:errors path="medicins"/></td></tr><br><br>
<%-- <tr><td>Medicine 2:<form:input path="m2"/><form:errors path="m2"/></td></tr>
<tr><td>Medicine 3:<form:input path="m3"/><form:errors path="m3"/></td></tr> --%>

<tr><td><input type="submit" value="SUBMIT !"/></td></tr>

</form:form>


</table>

</div>


</body>
</html>