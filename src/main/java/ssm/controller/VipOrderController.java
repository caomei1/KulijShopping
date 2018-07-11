package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VipOrderController {

	@RequestMapping(method = RequestMethod.GET, value = "/vipOrder")
	public String vipOrder() {
		return "vipOrder";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/vipXiaofei")
	public String vipXiaofei() {
		return "vipXiaofei";
	}
	
}
