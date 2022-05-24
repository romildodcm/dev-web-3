<%@page import="Models.Aluno"%>
<%@page import="Models.Curso"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Aluno aluno = new Aluno();
aluno.setNome("Huan");
aluno.setRA("12345");

Curso curso = new Curso();
curso.setNome("Curso Java");

request.setAttribute("aluno", aluno);

String[] cidades = {"Foz", "Rio de Janeiro", "Belo Horizonte"};

%>

${aluno.nome}
${aluno.curso.nome}

</body>
</html>