package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Self1
 */
@WebServlet("/Welcome")
public class Self1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Self1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		
		pwriter.println("HTTP header Information:<br>");
		pwriter.println("<br><br");
		
		Enumeration en = request.getHeaderNames();  // used to get all the header names
	     while (en.hasMoreElements()) {
	        String hName = (String) en.nextElement();
	        String hValue = request.getHeader(hName);
	        pwriter.println("<b> hName </b>"+hName );     
	        pwriter.println("<br>");
	        pwriter.println("<b> hValue </b>"+ hValue );       
	     }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
