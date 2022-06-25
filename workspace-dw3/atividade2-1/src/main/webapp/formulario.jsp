<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%
String displayErro = "";
String erro = (String) request.getAttribute("errorMessage");

if (erro != null){
	erro = "Erro! " + erro + ".";
} else {
  displayErro = "none";
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


<body class="text-center bg-light">

  <div class="d-flex justify-content-center p-2">
    <main>
      <form method="post" action="processa">

        <img class="m-4" src="file-code-fill.svg" alt="" width="72" height="72">
        <h1 class="h3 mb-3 fw-normal">Formulário de inscrição para a vaga </h1>
        
        <div class="alert alert-danger" role="alert"
          style="display: <%=displayErro%>;">
          <%=erro%>
        </div>

        <div class="form-floating mb-3">
          <input type="text" class="form-control" placeholder="Nome" name="field_nome">
          <label for="field_nome">Nome completo</label>
        </div>

        <div class="row mb-2">
          <div class="col">
            <div class="form-floating">
              <input type="date" class="form-control" placeholder="Data" name="field_data">
              <label for="field_data">Data de nascimento</label>
            </div>
          </div>
          
          <div class="col">
            <select class="form-select p-3" name="field_idioma" aria-label="Default select example">
              <option value="Português">Português</option>
              <option value="Inglês">Inglês</option>
              <option value="Espanhol">Espanhol</option>
            </select>
          </div>
        </div>
          
        <div class="form-check form-check-inline mb-2">
          <input class="form-check-input" type="checkbox" name="habilidades" value="Java">
          <label class="form-check-label" for="habilidades">Java</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="checkbox" name="habilidades" value="SQL">
          <label class="form-check-label" for="habilidades">SQL</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="checkbox" name="habilidades" value="HTML">
          <label class="form-check-label" for="habilidades">HTML</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="checkbox" name="habilidades" value="CSS">
          <label class="form-check-label" for="habilidades">CSS</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="checkbox" name="habilidades" value="JavaScript">
          <label class="form-check-label" for="habilidades">JavaScript</label>
        </div>

        <button class="w-100 btn btn-lg btn-primary" type="submit">Enviar</button>
      </form>
    </main>
  </div>
</body>


</html>