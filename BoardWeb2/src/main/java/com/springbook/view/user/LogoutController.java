package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
public class LogoutController {

	@RequestMapping (value = "Logout.do")
	public String logout(HttpSession sess) {
		
		System.out.println("로그아웃 처리");
		
//		HttpSession session = _req.getSession();
//		session.invalidate();
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("Login.jsp");
		
		sess.invalidate();
		
		return "redirect:Login.jsp";
	}

}
