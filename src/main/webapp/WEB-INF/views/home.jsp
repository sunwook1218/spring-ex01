<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world! EX01
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a id="my-link" href="#">/sample/ex02Bean?list[0].name=aaa&list[1].name=bbb&list[2].name=ccc</a>

<script>
var url = document.getElementById("my-link").innerHTML;
var encoded = encodeURI(url.trim());
document.getElementById("my-link").href = encoded;
</script>
</body>
</html>
