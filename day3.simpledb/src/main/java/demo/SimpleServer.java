package demo;

import org.springframework.security.access.annotation.Secured;

public class SimpleServer {

	@Secured(value="ROLE_MYADMIN")
	public void method1() {
		System.out.println("SimpleServer.method1()");
	}

	@Secured(value="ROLE_MYUSER")
	public void method2() {
		System.out.println("SimpleServer.method2()");
	}
}
