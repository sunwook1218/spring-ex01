<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
ret a <br />
<h2>/d : ${myAttr } </h2>
<h2>/e : ${mem }</h2>
<h2>${mem.name }</h2> <h2>${mem.age }</h2>
<p>/f : ${member.name }</p><p>${member.age }</p>
<p>/g : </p>
<ol>
	<c:forEach var="city" items="${strs }">
		<li>${city }</li>
	</c:forEach>
</ol>
</body>
</html>