package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssm.entity.User;
import ssm.service.UserService;

@Controller
public class VipOrderController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/logins")
	public String login(@ModelAttribute User user, String username) {
		User user1 = userService.findOneByUsername(username);
		if(user1 != null) {
//TODO		userService.updateUser(username);
			return "prolist";
		} else {
			userService.creatUser(user, username);
		}
		return "prolist";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/vipOrder")
	public String vipOrder() {
		return "vipOrder";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/vipXiaofei")
	public String vipXiaofei() {
		return "vipXiaofei";
	}
	
}
