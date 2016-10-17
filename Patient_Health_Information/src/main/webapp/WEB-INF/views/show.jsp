<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Page</title>
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
<form:form action="home" modelAttribute="list" method="get">
<h3>List Of Users for id :${mid}</h3>
<c:forEach items="${list}" var="vs">
${vs.pname}<br>
</c:forEach>
</form:form>

</div>

</body>
</html>