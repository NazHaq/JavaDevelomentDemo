package webdevelopment.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LargeServletPage
 */
//@WebServlet("/LargeServletPage")
@WebServlet(name="LargeServletPage",urlPatterns={"/LargeServletPage"})
public class LargeServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LargeServletPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String dummyLine="Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		
		out.println("<!Doctype HTML>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Demo: Request Headers</title>");
		out.println("</head>");
		out.println("<body>");

		for(int i=0;i<1000;i++){
			out.println(dummyLine+"</br>");
			
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
