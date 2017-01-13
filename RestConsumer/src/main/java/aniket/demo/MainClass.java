package aniket.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Calc calc = context.getBean("calcService", Calc.class);
		System.out.println(calc.add(3000, 3));
	}
}
