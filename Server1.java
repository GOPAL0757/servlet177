

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Server1")
public class Server1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Server1() {
    	super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid =request.getParameter("userid");
		String name =request.getParameter("name");
		String email =request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		out.print("USER ID:"+ userid);
		out.print("NAME:"+name);
		out.print("E MAIL:"+ email);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
