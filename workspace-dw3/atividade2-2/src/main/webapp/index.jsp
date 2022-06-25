<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%
String displayErro = "";

String user = (String) session.getAttribute("user");
Boolean login = (Boolean) session.getAttribute("loginStatus");
String erro = (String) request.getAttribute("errorMessage");

if (login != null && login == true) {
	response.sendRedirect("pagina.jsp");
}

if (erro != null) {
	erro = "Erro: " + erro + ".";
} else {
	displayErro = "none";
}
%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>
<link
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
  rel="stylesheet">
</head>

<body class="text-center bg-light">
  <div class="d-flex justify-content-center p-2">
    <main>
      <form action="login" method="post">
      
        <img class="m-4" src="diagram-3-fill.svg" alt="" width="72" height="72">
        <h1 class="h3 mb-3 fw-normal">Por favor faça login para acessar:</h1>

        <div class="form-floating mb-3">
          <input type="text" class="form-control" name="field-user" placeholder="Username">
          <label for="field-user">Usuário</label>
        </div>

        <div class="form-floating  mb-3">
          <input type="password" class="form-control" name="field-password" placeholder="Password">
          <label for="field-password">Senha</label>
        </div>

        <div class="alert alert-danger" role="alert"
          style="display: <%=displayErro%>;">
          <%=erro%>
        </div>
        
        <button class="w-100 btn btn-lg btn-primary" type="submit">Login</button>
        
      </form>
    </main>
  </div>
</body>

</html>