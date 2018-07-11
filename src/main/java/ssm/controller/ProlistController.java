package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProlistController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/vip-product")
	public String vipProduct() {
		return "vip-product";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/prolist")
	public String index() {
		return "prolist";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/buyinfo")
	public String buyinfo() {
		return "buyinfo";
	}

}
