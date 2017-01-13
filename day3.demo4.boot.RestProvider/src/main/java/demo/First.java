package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/first")
public class First {

	@RequestMapping(method = RequestMethod.GET)
	public String method1() {
		System.out.println("First.method1()");
		return "<html><body><h1> Hello World!!method1 </h1></body></html>";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String method2() {
		System.out.println("First.method2()");
		return "<html><body><h1> Hello World!! method2 </h1></body></html>";
	}
}
