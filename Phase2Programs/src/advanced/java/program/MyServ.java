package advanced.java.program;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.*;

@WebServlet("/Self1")

public class MyServ extends GenericServlet 
{
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
{
	String sbasic = req.getParameter("mname");
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.print("<html><body>");
	out.print("Name:" + sbasic + "<Br>");
	out.print("</body></html>");
	}
}