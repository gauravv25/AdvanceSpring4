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
		Authentication auth2 = new UsernamePasswordAuthenticationToken("user1", "pass1");
		securityContext.setAuthentication(auth2);
		SecurityContextHolder.setContext(securityContext);
		
		
		SimpleServer server = context.getBean("server", SimpleServer.class);
		try {

			server.method1();
		} catch (Exception e) {
			System.out.println("error SimpleClient.method1()"+e);
		}

		try {

			server.method2();
		} catch (Exception e) {
			System.out.println("error SimpleClient.method2()"+e);
		}
		context.close();
	}

}
