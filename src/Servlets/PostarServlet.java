package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Usuario;

@WebServlet("/Postar")
public class PostarServlet  extends HttpServlet{
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
 		res.sendRedirect("/Login.jsp");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Usuario user = (Usuario)req.getParameter("user");
		System.out.println(req.getAttribute("user"));
	}
}
