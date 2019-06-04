package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login1.go")
public class Login extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
	PrintWriter writer=response.getWriter();	
	writer.println("hello word");
	}
}
