<%@page import="app.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
Usuario usuario = (Usuario) session.getAttribute("usuario");

Boolean estaLogado = (Boolean) session.getAttribute("esta_logado");

// objeto pode ser null ou ter valor (nesse caso true or false)
if(estaLogado == null || estaLogado == false) {
	response.sendRedirect("login.jsp");
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bem-vindo!</title>
</head>
<body>

<a href="/Aula8CookiesSessionForms/logout">Desconectar</a>

<h1>Bem-vindo(a): <%= usuario %></h1>

</body>
</html>