package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CarController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/car")
	public String car() {
		return "car";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/order")
	public String order() {
		return "order";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/success")
	public String success() {
		return "success";
	}

}
