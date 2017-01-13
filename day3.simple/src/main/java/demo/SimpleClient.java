package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;

public class SimpleClient {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SecurityContextImpl securityContext = new SecurityContextImpl();
		Authentication auth1 = new UsernamePasswordAuthenticationToken("user1", "pass1");
		securityContext.setAuthentication(auth1);
		Authentication auth2 = new UsernamePasswordAuthenticationToken("user2", "pass2");
		securityContext.setAuthentication(auth2);
		SecurityContextHolder.setContext(securityContext);
		
		
		SimpleServer server = context.getBean("server", SimpleServer.class);
		try {

			server.method1();
		} catch (Exception e) {
			System.out.println("error SimpleClient.method1()");
		}

		try {

			server.method2();
		} catch (Exception e) {
			System.out.println("error SimpleClient.method2()");
		}
		context.close();
	}

}
