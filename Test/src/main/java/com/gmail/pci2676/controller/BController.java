package com.gmail.pci2676.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gmail.pci2676.DTO.BDto;
import com.gmail.pci2676.service.IService;

@Controller
@RequestMapping(value = "/board/") // url요청이 /board/로 시작하는 것은 여기서 처리한다. ex) board/abc , board/123, board/create
public class BController {

	@Inject
	private IService service;

	@RequestMapping(value = "/insertContent", method = RequestMethod.POST)
	public String insertContentPOST(BDto dto, Model model) throws Exception {
		System.out.println(" /board/insertContent 입니다. POST방식");
		System.out.println(dto.toString());

		
		service.insertContent(dto);
		model.addAttribute("result", "성공");

		return "/board/success";
	}
	
	@RequestMapping(value = "/insertContent", method = RequestMethod.GET)
	public void insertContentGET(BDto dto, Model model) throws Exception {
		System.out.println(" /board/insertContent 입니다. GET방식");
	}



	
}
