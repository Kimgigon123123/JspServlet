package pack.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex02_Servlet")
public class Ex02_Servlet extends HttpServlet {

       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("사용자가 요청오면 메소드 실행됨");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
