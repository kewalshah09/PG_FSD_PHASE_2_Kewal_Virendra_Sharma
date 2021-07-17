package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecUrl
 */
@WebServlet("/SecUrl")
public class SecUrl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String s = request.getParameter("empid");
		
		out.print("Welcome : "+s);
		} catch (Exception e){
			System.out.println(e);
		}
	}


}
