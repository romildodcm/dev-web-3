<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="cabecalho.jsp" %>

<%

  String chave = (String) request.getAttribute("attr_chave");

  // se quiser imprimir no terminal/console para uns log da vida:
  // System.out.println("Chave: " + chave);

  // se quiser mostrar ao usuário
  out.println("Chave: " + chave);
  
%>

</body>
</html>