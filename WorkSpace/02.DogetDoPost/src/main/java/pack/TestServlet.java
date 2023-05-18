package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")// RequestMapping ("Mapping")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 02프로젝트는 세팅 부분을 혼자 실습하고, request와 response를 대략적으로 살펴보는 프로젝트로,
	// 다시 공부하거나 할 필요는 많이 없음.
	// URL : 톰캣 (localhost:portNumber(192.168.0.36:8080)/web Project / Mapping)
	//  	192.168.0.36:8080/do/TestServlet ↓ GET방식 요청 시 doGetMethod가 자동으로 실행됨(TomCat)
	// 프로젝트를 새로 만들었을때에는 Tomcat이 프로젝트를 인식할수있게 add&remove를 통해서 프로젝트를 넣어준다.
	
	
	//HttpServletReqest : Reqeust 객체 톰켓에서 요청이 오면 모든 정보를 Request를 통해 담아서 Java코드로 준다.
	//                   요청에 관련된 모든 기능을 담당한다.
	//HttpServletResponse : Response 객체 Request 객체로 요청 처리를 받고 Client(크롬)에 응답을 주기 위한 객체
	//                     페이지 전환, 페이지에 내용 표시 등의 크롬창의 표시를 담당함
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TestServlet이 호출되었습니다");
		String param = req.getParameter("param");
		System.out.println("크롬을 통해 GET방식으로 param 정보가 들어옴"+param);
		
		//req , res
		//요청, 응답
		//요청을 받았을때 새로운 페이지를 요청한다.
		if(param != null && param.equals("newPage")) {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, res);
		}else {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=utf-8");
			PrintWriter writer = res.getWriter();
			writer.println("<html>");
			writer.println("<body>");
			writer.println("<h1>올바른 요청이 아닙니다<h1>");
			writer.println("</body>");
			writer.println("</html>");
		}
		
		
//		res.setCharacterEncoding("UTF-8");
//		res.setContentType("text/html; charset=utf-8");
//		PrintWriter writer = res.getWriter();
//		writer.println("<html>");
//		writer.println("<body>");
//		writer.println("<h1>응답객체로 페이지에 쓰기<h1>");
//		writer.println("</body>");
//		writer.println("</html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
