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
 * Servlet implementation class HeaderDetails
 */
@WebServlet("/HeaderDetails")
public class HeaderDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HeaderDetails() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
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
	         
	     String hlocale = request.getLocalName();
	     String hcontentType = request.getContentType();
	     int hcontentlength = request.getContentLength();
	     String hencode = request.getCharacterEncoding();
	     int hlocalport = request.getLocalPort();
	     String hprotocol = request.getProtocol();
	     
	     pwriter.println("<b> hlocale </b>"+ hlocale );  pwriter.println("<br>");
	     pwriter.println("<b> hcontentType </b>"+ hcontentType );   pwriter.println("<br>");
	     pwriter.println("<b> hcontentlength </b>"+ hcontentlength );   pwriter.println("<br>");
	     pwriter.println("<b> hencode </b>"+ hencode );   pwriter.println("<br>");
	     pwriter.println("<b> hlocalport </b>"+ hlocalport ); pwriter.println("<br>");
	     pwriter.println("<b> hprotocol </b>"+ hprotocol );
	  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
