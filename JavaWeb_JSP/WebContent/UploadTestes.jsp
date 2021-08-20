<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
 <body>
        <form method="POST" action="FileUploadServlet" enctype="multipart/form-data" >
            Arquivo:
            <input type="file" name="file" id="file" /> <br/>
            Destino:
            <input type="text" value="C:\upload_files" name="destination"/>
            <br>
            <input type="submit" value="Upload do Arquivo" name="upload" id="upload" />
        </form>
    </body>
</html>