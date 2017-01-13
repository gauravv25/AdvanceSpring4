package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/dept")
public class DeptController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		System.out.println("in contr");
		return new ModelAndView("second");
	}

}
