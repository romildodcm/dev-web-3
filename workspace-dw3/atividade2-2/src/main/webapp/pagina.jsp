<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String user = (String) session.getAttribute("user");
Boolean login = (Boolean) session.getAttribute("loginStatus");

if (login == null || login == false) {
	response.sendRedirect("index.jsp");
}
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Sistema</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>


<body class="text-center bg-light">
  <div class="d-flex justify-content-center p-2">
    <main>
      <img class="m-4" src="diagram-3-fill.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 fw-normal">Página Inicial do Sistema</h1>
      
      <div class="alert alert-success" role="alert">
        Login efetuado com sucesso!
      </div>

      <div class="alert alert-success" role="alert">
        Você está logado como: <%= user %>
      </div>

      <a class="w-100 btn btn-lg btn-primary" href="/atividade2-2/logout">Desconectar</a>
    </main>
  </div>
</body>

</html>