package com.gmail.pci2676;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class SampleController {

	@RequestMapping("/view")
	public String view() {
		return "/board/view";
	}
	
}
