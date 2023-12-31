package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class UserController {

	// 로그인
	@RequestMapping(value = "/Login.do", method = RequestMethod.GET)
	public String get_login(UserVO vo, UserDAO dao) {

		System.out.println("로그인화면 이동");

		vo.setId("test");
		vo.setPassword("1234");
		
		return "./Login.jsp";
	}
	
	@RequestMapping(value = "/Login.do", method = RequestMethod.POST)
	public String post_login(UserVO vo, UserDAO dao, HttpSession session) {

		System.out.println("로그인 처리");

		UserVO user = dao.select_user(vo);

		if (user != null) {
			session.setAttribute("name", user.getName());
			return "redirect:./GetBoardList.do";
		} else {
			return "redirect:./Logout.jsp";
		}

	}

	// 로그아웃
	@RequestMapping(value = "Logout.do")
	public String logout(HttpSession sess) {

		System.out.println("로그아웃 처리");

		sess.invalidate();

		return "redirect:Login.jsp";
	}

}
