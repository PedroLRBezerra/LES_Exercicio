<%@page import="entity.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aqui o professor pode colocar postar o curso para avalia��o</title>
</head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

 <%
  Usuario user = (Usuario)(request.getAttribute("user"));
%>
	
    <div class="w3-panel w3-red w3-round-xlarge">
         <center><h1>Adicione seu curso aqui</h1></center>
     </div> 
          <form class="w3-container" action="/LES_Exercicio/Postar"  method="post">
               <p>
                <label><h3>Nome do curso:</h3></label>
                <input class="w3-input w3-border w3-white" name="Nome_curso" type="text"></p>
              <p>      
                <label><h3>Descri��o do curso</h3></label>          
                <input class="w3-input w3-border w3-white" name="Desc_curso" type="text"></p>
              <p>      
                <label><h3>Dura��o do curso</h3></label>          
                <input class="w3-input w3-border w3-white" name="Dur_curso" type="text"></p>  
              <p>
              <div style="display: none;">
              	<input name="useruser" type="text" value="<%=user.getUsuario()%>">
              	<input name="username" type="text" value="<%=user.getNome()%>">
              	<input name="useremail" type="text" value="<%=user.getEmail()%>">
              	<input name="usersenha" type="text" value="<%=user.getSenha()%>">
              	<input name="usertipo" type="text" value="<%=user.getTipo()%>">
              	</div>
             <button  class="w3-btn w3-blue">Postar</button></p>
             
             </form>
        
        
        
        
        
        
        
        
        
        
        
</body>
</html>