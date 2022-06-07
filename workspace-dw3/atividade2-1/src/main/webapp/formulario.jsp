<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 2 - 1</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-light bg-light mb-4">
		<a class="navbar-brand ms-4 fs-2 fw-bolder" href="/">Atividade 2 -
			1</a>
	</nav>


	<div class="container">
		<section class="card">
			<div>
				<%
				String erro = (String) request.getAttribute("erro");
				%>

				<%
				if (erro != null) {
				%>
				<p>
					<%
					out.println(erro);
					%>
				</p>
				<%
				}
				%>



					<form method="post" action="processa">
					<div class="mb-3">
						<input type="text" name="field_nome" value=""> <br /> <input
							type="date" name="field_data"> <br /> <select name=""
							id="" name="field_idioma">
							<option value="ingles">Ingles</option>
							<option value="espanhol">Espanhol</option>
							<option value="portugues">Portugues</option>
						</select> <br /> <span> <input type="checkbox" name="habilidades"
							value="java"> Java
						</span> <span> <input type="checkbox" name="habilidades"
							value="sql"> SQL
						</span> <span> <input type="checkbox" name="habilidades"
							value="html"> HTML
						</span> <span> <input type="checkbox" name="habilidades"
							value="css"> CSS
						</span> <span> <input type="checkbox" name="habilidades"
							value="javascript"> JavaScript
						</span> <br> <input type="submit" value="Enviar">
					</div>
					</form>


			</div>

		</section>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>