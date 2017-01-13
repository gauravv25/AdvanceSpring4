package parms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class ModelDemo {

	private List<Emp> list = new ArrayList<>();

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Emp e) {
		list.add(e);
		System.out.println(e);
		return "success";

	}

	@RequestMapping(value = "/getemp", method = RequestMethod.GET, produces="application/json")
	public Emp getEmp() {
		System.out.println(list);
		return list.get(0);

	}
}
