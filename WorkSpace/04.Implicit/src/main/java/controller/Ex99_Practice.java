package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex99_Practice
 */
@WebServlet("/Ex99_Practice")
public class Ex99_Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		if(id.equals("admin")&&pw.equals("admin1234")) {
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>로그인성공!<h1>");
			writer.println("</body>");
			writer.println("</html>");
		}else {
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>로그인실패!<h1>");
			writer.println("</body>");
			writer.println("</html>");
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
