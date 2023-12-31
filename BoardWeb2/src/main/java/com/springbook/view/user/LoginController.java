package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

//@Controller
public class LoginController {

	@RequestMapping (value = "/Login.do")
	public String login(UserVO vo, UserDAO dao) {

		System.out.println("로그인 처리");
		
//		String id = _req.getParameter("id");
//		String password = _req.getParameter("password");
//		
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
		
//		UserDAO dao = new UserDAO();
		UserVO user = dao.select_user(vo);
		
//		ModelAndView mav = new ModelAndView();
		
		String view;
		
		if (user != null) {
			view = "redirect:./GetBoardList.do";
		} else {
			view = "redirect:./Logout.jsp"; // spring viewResolver 프론트 컨트롤러를 거치지 않게 된다.
		}
		
		return view;
	}

}
