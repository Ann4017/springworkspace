package polymorphism;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.Data;
@Data
public class TVUser {
	
	@Autowired
	public static void main(String[] args) {

//		BeanFactory factory = new BeanFactory();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("tv 명을 입력하세요.");
//		String tv_name = sc.nextLine();
//		Tv tv = (Tv)factory.get_bean(tv_name);

//		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		Tv tv = ac.getBean(SamsungTV.class);
		
//		Tv tv = (Tv) factory.getBean("tv");
//		Tv tv2 = (Tv) factory.getBean("tv");
//		Tv tv3 = (Tv) factory.getBean("tv");

		// 스프링은 객체 생성 방식이 싱글톤 패턴
		// 싱글톤이 아닌 방식으로 생성 하려면 scope="prototype" 을 bean 등록 시 적용해야 한다.
//		System.out.println(tv);
//		System.out.println(tv2);
//		System.out.println(tv3);

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

	}
}
