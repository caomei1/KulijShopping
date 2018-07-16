package ssm.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssm.entity.User;

@Controller
public class ProlistController {
	//@AuthenticationPrincipal(expression = "user") User user
	@RequestMapping(method = RequestMethod.GET, value = "/vip-product")
	public String vipProduct(@AuthenticationPrincipal(expression = "user") User user) {
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
