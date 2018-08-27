package com.gmail.pci2676;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedirectController {

	@RequestMapping("/index")
	public String index() {
		return "/index";
	}
	
	@RequestMapping(value="/verify", method=RequestMethod.POST)
	public String verify(HttpServletRequest req) {
		String id = req.getParameter("id");
		if(id.equals("admin")) {
			return "redirect:/admin";
		}else {
			return "redirect:/user";
		}
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "/admin";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "/user";
	}
	
}
