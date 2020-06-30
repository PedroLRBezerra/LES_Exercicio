<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Identificação</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
         <div class="w3-panel w3-blue w3-round-xlarge">
         <center><h1>Olá seja bem-vindo a E-leaning</h1></center>
         
         <br>
         <center><h2>Quem é você?</h2></center>
         </div> 
              
         <br>
          <center> <form action="Login.jsp">
			<button type="submit" class="w3-button w3-white w3-border w3-border-red w3-round-large">Aluno</button>
		  </form>
		  
		 <br>
		  <form action="Login_professor.jsp">
			<button type="submit" class="w3-button w3-white w3-border w3-border-red w3-round-large">Professor</button>
		   </form>
		   
		 <br>
		   <form action="Login_ADM.jsp">
			<button type="submit" class="w3-button w3-white w3-border w3-border-red w3-round-large">Adiministrador</button>	
		   </form> </center>	
		   
  </body>
</html>