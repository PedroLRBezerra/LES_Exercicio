<%@page import="entity.Curso"%>
<%@page import="java.util.List"%>
<%@page import="Servlets.BuscarCursos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
     <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Adm dashboard</title>
<style>
#cursosADD {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#cursosADD td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#cursosADD tr:nth-child(even){background-color: #f2f2f2;}

#cursosADD tr:hover {background-color: #ddd;}

#cursosADD th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>

 		<%
	    BuscarCursos bc = new BuscarCursos();
	    	List<Curso> lista = bc.buscarCursosNAprovados();
	    	
	    %>
     <div class="w3-panel w3-red w3-round-xlarge">
	     <center><h1>Cursos a validar </h1></center> 
	    </div>
	    
	    <form class="w3-container" action="/LES_Exercicio//Login"  method="post">
               <p>
                <label><h3>Nome do curso:</h3></label>
                <input class="w3-input w3-border w3-white" name="Nome_curso" type="text"></p>
              <p>      
                <label><h3>Descri��o do curso</h3></label>          
                <input class="w3-input w3-border w3-white" name="Dest_curso" type="text"></p>
              <p>      
                <label><h3>Dura��o do curso</h3></label>          
                <input class="w3-input w3-border w3-white" name="Dur_curso" type="text"></p>  
              <p>      
                <label><h3>Nome do propriet�rio</h3></label>          
                <input class="w3-input w3-border w3-white" name="Nom_dono" type="text"></p>  
             
             <button  class="w3-btn w3-blue">ADICIONAR</button>
             <button class="w3-btn w3-blue">RECUSAR </button>
          
           <p>
           <table class="w3-table-all" id ="cursosADD">
		    <thead >
						<tr>
							<th>Codigo do Curso</th>
							<th>Nome do curso</th>
							<th>Descri��o</th>
							<th>Dura��o</th>
							<th>Nome do propriet�rio</th>
						</tr>
						 <%
							for(int x=0;x<lista.size();x++){
						 %>	
						 	<tr>
						 		<td><%=lista.get(x).getCodigo() %></td>
						 		<td><%=lista.get(x).getNome() %></td>
						 		<td><%=lista.get(x).getDecricao() %></td>
						 		<td><%=lista.get(x).getDuracao() %></td>
						 		<td><%=lista.get(x).getUsuario_dono() %></td>
						 	</tr>
						 	<% } %>
					 <thead >			
				</table></p>
				
				  <p>
                <label><h3>Codigo do curso:</h3></label>
                <input class="w3-input w3-border w3-white" name="codCurso" type="text"></p>
            
             
             <button  class="w3-btn w3-blue">ADICIONAR</button>
        <!--      <button class="w3-btn w3-blue">RECUSAR </button> -->
             
             </form>
             
</body>
</html>