package com.gmail.pci2676;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ValidController {

	@RequestMapping("/index")
	public String index() {
		return "/index";
	}
	
//	@RequestMapping(value="/valid", method=RequestMethod.POST)
//	public String valid(@ModelAttribute("info")Student student, BindingResult result) {
//		
//		String page = "/done";
//		
//		Validation v = new Validation();
//		
//		v.validate(student, result);
//		if(result.hasErrors()) {
//			System.out.println(result);
//			page="/fail";
//		}
//		
//		
//		return page;
//	}
	
	@RequestMapping(value="/valid", method=RequestMethod.POST)
	public String valid(@ModelAttribute("info")@Valid Student student, BindingResult result) {
		
		String page = "/done";
		
//		Validation v = new Validation();
//		
//		v.validate(student, result);
//		if(result.hasErrors()) {
//			System.out.println(result);
//			page="/fail";
//		}	
		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new Validation());
	}
}
