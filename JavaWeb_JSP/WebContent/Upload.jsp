<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Upload Testes</title>
</head>
<body>
	<h2>Upload de Arquivos</h2>
	<form action="UploadServlet" method="post" enctype="multipart/form-data">
		Selecione o arquivo: <input type="file" multiple="multiple" name="file"/>
		<br>
		<input type="submit" value="Upload" />
	</form>
	<c:if test="${msg != null}">
		<c:out value="${msg}"></c:out>
	</c:if>
</body>
</html>