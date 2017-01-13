package parms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rp")
public class RequestParam {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(@org.springframework.web.bind.annotation.RequestParam(value = "nm") String name) {
		System.out.println("<body> Hello : " + name + "</body>");
		return "<body> Hello : " + name + "</body>";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@org.springframework.web.bind.annotation.RequestParam(value = "nm1") int num1, @org.springframework.web.bind.annotation.RequestParam(value = "nm2") int num2) {
		System.out.println(num1 + num2);
		return "<body>" + (num1 + num2) + "</body>";

	}
}
