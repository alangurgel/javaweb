package threeway.projeto.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletToJsp")
public class ServletToJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletToJsp() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			request.setAttribute("servletName","servletToJsp");
			getServletConfig().getServletContext().getRequestDispatcher("/hello.jsp").
			forward(request, response);
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
