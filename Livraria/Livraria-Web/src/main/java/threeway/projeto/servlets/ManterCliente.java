package threeway.projeto.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManterCliente extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse  response)
		throws ServletException, IOException{
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String rg = request.getParameter("rg");
		
		System.out.println("-------------Saída de dados recebidos do Formulário---------------");
		System.out.println("Nome: "+nome);
		System.out.println("Telefone: "+telefone);
		System.out.println("Endereço: "+endereco);
		System.out.println("RG: "+rg);
		response.sendRedirect("manterCliente.jsp");
	
		
	}	
	
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException{
		doGet(request,response);
				
	}
	
}
    
