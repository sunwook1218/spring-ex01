<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.0/css/bulma.min.css">
<title>Insert title here</title>
</head>
<body>
<h2>exUpload.jsp</h2>
<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data">

<div><input type="file" name="files" /></div>
<div><input type="file" name="files" /></div>
<div><input type="file" name="files" /></div>
<div><input type="file" name="files" /></div>
<div><input type="file" name="files" /></div>
<div><input type="submit" /></div>

</form>
</body>
</html>