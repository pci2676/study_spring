package com.gmail.pci2676.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gmail.pci2676.DAO.BDao;
import com.gmail.pci2676.DTO.BDto;
import com.gmail.pci2676.service.BService;

@Controller
@RequestMapping(value = "/board/") // url��û�� /board/�� �����ϴ� ���� ���⼭ ó���Ѵ�. ex) board/abc , board/123, board/create
public class BController {

	@Inject
	private BService service;

	@RequestMapping(value = "/insertContent", method = RequestMethod.GET)
	public void insertContentGET(BDao dao, Model model) throws Exception {
		System.out.println(" /board/insertContent �Դϴ�. GET���");
	}

	@RequestMapping(value = "/insertContent", method = RequestMethod.POST)
	public String insertContentPOST(BDto dto, Model model) throws Exception {
		System.out.println(" /board/insertContent �Դϴ�. POST���");
		System.out.println(dto.toString());

		service.insertContent(dto);
		model.addAttribute("result", "����");

		return "/board/succes";
	}

	
}
