package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class FirstController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String method1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("FirstController.handleRequest()");
		return "<html> <body><ht> Hello Method 1 </h1></body></html>";
	}

}
