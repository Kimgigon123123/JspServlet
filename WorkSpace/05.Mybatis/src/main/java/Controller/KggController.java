package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Member.DTO;


@WebServlet("*.kgg")
public class KggController extends HttpServlet {
	RequestDispatcher rd ;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getServletPath());
		if(req.getServletPath().equals("/list.kgg")) {
			System.out.println("성공");
			

			ArrayList<DTO> list = new ArrayList<>();
//			DTO dto = new DTO(0, null);
//			dto.setNum(1);
//			dto.setStr("A");
//			list.add(dto);
			for(int i = 0 ; i < 10 ; i ++) {				
				list.add(new DTO(i,"A"));
			}
			req.setAttribute("kgglist", list);
			
			rd = req.getRequestDispatcher("kgg/list.jsp");
		}
		
		else {
			System.out.println("실패");
		}
		
		rd.forward(req, resp);//jsp페이지로 모든 정보를 넘기고 처리를 떠맡긴다.
	}
	
	
}
