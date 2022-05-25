package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;

import dao.MemberDao;
import dto.MemberDto;


@WebServlet("/member")
public class MemberController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
	
		String param = req.getParameter("param");
		
		if(param.equals("login")) {
			resp.sendRedirect("member/login.jsp");
		}else if(param.equals("make")) {
			resp.sendRedirect("member/make.jsp");
		}else if(param.equals("loginAf")) {
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			System.out.println("id and pwd" + id + pwd);
			MemberDao dao = MemberDao.getInstance();
			MemberDto dto = dao.login(new MemberDto(id, pwd, null, 0, null, null, 0));

			String Pass;
			
			if(dto != null && !dto.getId().equals("")) {
				req.getSession().setAttribute("login", dto);
				Pass = "OK";
			}else {
				Pass = "NO";
			}
			resp.sendRedirect("pass.jsp?pass="+ Pass);
			
		}else if(param.equals("makeAf")) {
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			String birth = req.getParameter("birth");
			String address = req.getParameter("address");
			int height = Integer.parseInt(req.getParameter("height"));
			
			MemberDao dao = MemberDao.getInstance();
			MemberDto dto = new MemberDto(id, pwd, name, age, birth, address, height);
			boolean isS = dao.addMember(dto);
			
			String msg = "OK";
			if(isS == false) {
				msg = "NG";
			}
			
			resp.sendRedirect("message.jsp?msg="+ msg);
		}else if(param.equals("delete")) {
			resp.sendRedirect("member/delete.jsp");
		}else if(param.equals("deleteAf")) {
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			
			MemberDao dao = MemberDao.getInstance();
			MemberDto dto = new MemberDto(id, pwd, null, 0, null, null, 0);
			boolean isS = dao.deleteMember(dto);
			
			String msg = "OK";
			if(isS == false) {
				msg = "NG";
			}
			
			resp.sendRedirect("delete.jsp?msg="+ msg);
			
		}

		
	}
}
