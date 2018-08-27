package com.gmail.pci2676;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="/views")
	public String views() {
		return "views";
	}
	
	@RequestMapping("model/modelEx")
	public String modelEx(Model model) {
		
		model.addAttribute("data", "abcdefg");
		
		return "model/modelEx";
	}
	
	@RequestMapping("modelAndView/mav")
	public ModelAndView mav() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("data", "\"This is data\"");
		mav.setViewName("/modelAndView/mav");
		
		return mav;
		
	}
}
