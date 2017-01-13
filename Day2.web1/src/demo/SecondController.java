package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "/second")
public class SecondController {

	@RequestMapping(value = "/method1", method = RequestMethod.GET)
	public ModelAndView method1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("method1");
		return null;
	}

	@RequestMapping(value = "/method2", method = RequestMethod.DELETE)
	public ModelAndView method2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("method2");
		return null;
	}

	@RequestMapping(value = "/method3", method = RequestMethod.POST)
	public ModelAndView method3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("method3");
		return null;
	}
}
