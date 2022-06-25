<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String nome = (String) request.getAttribute("cadastroNome");
String dataNascimento = (String) request.getAttribute("cadastroDataNascimento");
String idioma = (String) request.getAttribute("cadastroIdioma");
String habilidades = (String) request.getAttribute("cadastroHabilidades");

if (nome == null || dataNascimento == null || idioma == null || habilidades == null) {
  response.sendRedirect("formulario.jsp");
}
%>
<!DOCTYPE html>

<html lang="pt-br">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Inscrição Canadá</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

  <div class="d-flex justify-content-center p-2">

    <main>
      <div class="text-center">
        <img class="m-4" src="file-code-fill.svg" alt="" width="72" height="72">
      </div>
      <h1 class="h3 mb-3 fw-normal text-center">Formulário de inscrição para a vaga</h1>
      <div class="alert alert-success text-center" role="alert">
        Inscrito com sucesso para a vaga no Canadá!
      </div>
      <div class="card">
        <table class="table">
          <tbody>
            <tr>
              <th scope="row">Nome:</th>
              <td>
                <%= nome%>
              </td>
            </tr>
            <tr>
              <th scope="row">Data de Nascimento:</th>
              <td>
                <%= dataNascimento%>
              </td>
            </tr>
            <tr>
              <th scope="row">Idioma nativo:</th>
              <td>
                <%= idioma%>
              </td>
            </tr>
            <tr>
              <th scope="row">Habilidades:</th>
              <td>
                <%= habilidades%>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </main>
  </div>
</body>

</html>