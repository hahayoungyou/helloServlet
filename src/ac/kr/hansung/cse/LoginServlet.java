package ac.kr.hansung.cse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//process: access to database, perform business logic
		//Build HTML code
		PrintWriter out=response.getWriter();
		//System.out.println()//ctrl+ space= 자동완성;
		String htmlResponse="<html> ";
		htmlResponse+="<h2> Your Username is " + username +"<br/>";
		htmlResponse+="<h2> Your Passwird is " + password +"<h2/>";
		htmlResponse+="</html>";
		out.println(htmlResponse);
	}

}
