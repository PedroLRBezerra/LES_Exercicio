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
     <div class="w3-panel w3-red w3-round-xlarge">
	     <center><h1>Cursos a validar </h1></center> 
	    </div>
	    
	    <form class="w3-container" action="/LES_Exercicio//Login"  method="post">
               <p>
                <label><h3>Nome do curso:</h3></label>
                <input class="w3-input w3-border w3-white" name="Nome_curso" type="text"></p>
              <p>      
                <label><h3>Descrição do curso</h3></label>          
                <input class="w3-input w3-border w3-white" name="Dest_curso" type="text"></p>
              <p>      
                <label><h3>Duração do curso</h3></label>          
                <input class="w3-input w3-border w3-white" name="Dur_curso" type="text"></p>  
              <p>      
                <label><h3>Nome do proprietário</h3></label>          
                <input class="w3-input w3-border w3-white" name="Dur_curso" type="text"></p>  
             
             <button  class="w3-btn w3-blue">ADICIONAR</button>
             <button class="w3-btn w3-blue">RECUSAR </button>
          
           <p>
           <table class="w3-table-all" id ="cursosADD">
		    <thead >
						<tr>
							<th>Nome do curso</th>
							<th>Descrição</th>
							<th>Duração</th>
							<th>Nome do proprietário</th>
						</tr>
						 <tr>
                           <td>Alfreds Futterkiste</td>
                           <td>Maria Anders</td>
                           <td>Germany</td>
                           <td>Brazil</td>
                         </tr>  
					 <thead >			
				</table></p>
             
             </form>
             
</body>
</html>