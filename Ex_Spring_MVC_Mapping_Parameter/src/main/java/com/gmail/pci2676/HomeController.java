package com.gmail.pci2676;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value="/index")
	public String index() {
		return "/index";
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student(HttpServletRequest req) {
		
		String name = req.getParameter("name");
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/student");
		mv.addObject("name", name);
		
		return mv;
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public String student(HttpServletRequest req, Model model ) {
		
		String name = req.getParameter("name");
		
		model.addAttribute("name", name);
		
		return "/student";
	}
	
	@RequestMapping("/studentInformation")
	public String StduentInfo(@ModelAttribute("stdInfo")StudentInformation studentInformation) {
		return "stdInfoView";
	}
}
