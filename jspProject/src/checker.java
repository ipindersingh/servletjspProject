

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checker
 */
@WebServlet("/checker")
public class checker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checker() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String number= request.getParameter("phone");
		String password= request.getParameter("pass");
		if(name.isEmpty()|| email.isEmpty()|| number.isEmpty() || password.isEmpty()) {
		
		
		RequestDispatcher rd= request.getRequestDispatcher("/fail.jsp");
		rd.forward(request,response);
		}
		else {
			RequestDispatcher rx= request.getRequestDispatcher("/success.jsp");
			rx.forward(request,response);
		}
//		RequestDispatcher rp= request.getRequestDispatcher("/fail.jsp");
//		rp.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
