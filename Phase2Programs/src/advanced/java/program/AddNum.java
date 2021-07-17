package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addnum")
public class AddNum extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		
		pwriter.println("HTTP header Information:<br>");
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
//		pwriter.println(num1);
		pwriter.println("<br>");
//		pwriter.println(num2);
		
		int sum = num1 + num2;
		pwriter.println("Sum : " + sum);
		pwriter.println("<br>");
		
//		response.sendRedirect("div");
		
		ServletConfig conf = getServletConfig();				// servletconfig
		String str = getServletInfo();							// servlet
		
		pwriter.println("Server Name : " + conf.getServletName());
		pwriter.println("<br>");
		pwriter.println("<br>");
		pwriter.println("Server Context : " + conf.getServletContext());
		pwriter.println("<br>");
		pwriter.println(str);
		pwriter.println("<br>");
		
		ServletContext ctx = getServletContext();				//servletcontext
		String n1 = ctx.getInitParameter("n1");
		pwriter.print("n1 :" + n1);
		pwriter.println("<br>");
		
		int port = request.getLocalPort();
		pwriter.println("Port : " + port);
		
		pwriter.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}


}
