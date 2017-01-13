package parms;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pp")
public class PathDemo {

	@RequestMapping(value="/hello/{nm}",method= RequestMethod.GET)
	public String sayHello(@PathVariable(value="nm")String name)
	{
		System.out.println("<body> Hello : "+name + "</body>");
		return "<body> Hello : "+name + "</body>";
	}
	
	@RequestMapping(value="/add/{nm1}/{nm2}",method= RequestMethod.GET)
	public String add(@PathVariable(value="nm1")int num1, @PathVariable(value="nm2")int num2)
	{
		System.out.println(num1 + num2);
		return "<body>" + num1 + num2 + "</body>";
		

	}
}
