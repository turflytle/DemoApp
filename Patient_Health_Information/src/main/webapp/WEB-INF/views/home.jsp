<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<style type="text/css">
	.link{
	border: solid gray;
    padding: 1em;
     height:15px;
     background-color: green;
	}
		
.div1 {
    width: 100px;
    border: 1px solid black;
    padding: 10px 12px 13px 10px;
    margin: 12px 20px 25px 800px  ;
}

	
	</style>
	<title>Home</title>
</head>
<body>
<h3>${msg}</h3>
<div class="div1">
<a href="login">Login</a><br><br>
<a href="register">Register Here !</a>

</div>

<div class="link">List of Medicines</div>

<c:forEach items="${pat.medicines}" var="vs" >
<div class="link"><a href="medicine?med=${vs.mid}">Medicine ${vs.mid} :${vs.mname}</a></div>
</c:forEach>



</body>
</html>
