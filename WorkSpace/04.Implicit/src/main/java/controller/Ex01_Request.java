package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01_Request
 */
@WebServlet("/Ex01_Request")
public class Ex01_Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		if(id.equals("admin")&&pw.equals("admin1234")) {
			System.out.println("맞음");
		}else {
			System.out.println("틀림");
		}
		
		// id가 admin 그리고 pw admin1234일때 syso(출력)이용해서 아이디 비밀번호 맞음 로그인,
		// 아이디 또는 비번 틀림. 이 출력되게 해보기
		// id ! = null 조건을 추가해주면 똑같은 처리가 가능함.
		
		
		System.out.println("GET실행");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST실행");
		doGet(request, response);
	}

}
