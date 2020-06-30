<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
  <div class="w3-card-4">
    <div class="w3-panel w3-blue w3-round-xlarge">
      <h1><center>Login na escola Virtual</h1></center>
   </div>     
	  <form class="w3-container" action="/LES_Exercicio//Login"  method="post">
      <p>      
      <label class="w3-text-blue"><b>Nome de usuario</b></label>
      <input class="w3-input w3-border w3-white" name="usuario" type="text"></p>
      <p>      
     <!--  <label class="w3-text-blue"><b>Email</b></label>
      <input class="w3-input w3-border w3-white" name="email" type="text"></p> -->
      <p>      
      <label class="w3-text-blue"><b>Senha</b></label>
      <input class="w3-input w3-border w3-white" name="senha" type="text"></p>
      <p>
      <button class="w3-btn w3-blue">Login</button></p>
     </form>
   </div>
 </body>
</html>