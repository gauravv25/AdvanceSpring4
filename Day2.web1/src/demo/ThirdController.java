package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/third")
public class ThirdController {

	@RequestMapping("/method4")
	public ModelAndView method1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("ThirdController.method1()");
		String name = request.getParameter("name");
		String s = "Hello : " + name;
		return new ModelAndView("/t1.jsp", "msg", s);
		
		
	}

}
