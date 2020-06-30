<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cursos Disponiveis</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
       <div class="container">
         <div class="w3-panel w3-blue w3-round-xlarge">
	     <center><h1>Cursos oferecidos na E-learning </h1></center> 
	    </div>
	<form action="./CursoServlet" method="post">
		<div class="form-group">
			<label><H2>Cursos disponiveis:</H2></label>
			<select name="Curso" class="form-control">
				<option value="disponivel">CSS</option>
				<option value="disponivel">Informatica básica</option>
				<option value="disponivel">Banco de dados</option>
				<option value="disponivel">HTML-Básico</option>
				<option value="disponivel">HTML-Avançado</option>
				<option value="disponivel">Java-Básico</option>
				<option value="disponivel">Java-Avançado</option>
				<option value="disponivel">Redes de computadores</option>
				<option value="disponivel">Engenharia de Software</option>
				<option value="disponivel">Node.js</option>
				<option value="disponivel">Angular</option>
				<option value="disponivel">Reactive Native </option>
				<option value="disponivel">JavaScript</option>
				<option value="disponivel">Bootsrap</option>
				<option value="disponivel">Vue.js  </option>
			</select>
		</div>
		   <div>
			 	<label><h2>Descrição do curso</h2></label>  
				
			</div>
			<br>
			<button type="submit" class="w3-button w3-purple">Adicionar Curso</button>
		  <table class="w3-table-all">
		    <thead >
						<tr>
							<th>Nome</th>
							<th>Descrição</th>
							<th>Duração</th>
						</tr>
					 <thead >			
				</table>
		</form>
	 </div>	
   </body>
</html>