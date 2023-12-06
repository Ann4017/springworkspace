package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class UserServiceClient {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		UserService user_service = (UserService) factory.getBean("user_service");
		UserVO vo = new UserVO();
		
		vo.setId("test");
		vo.setPassword("1234");
		
		UserVO user = user_service.select_user(vo);
		if (user != null) {
			System.out.println(user);			
		} else {
			System.err.println("실패");
		}
	}

}
