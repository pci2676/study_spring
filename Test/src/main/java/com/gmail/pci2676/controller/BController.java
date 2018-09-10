package com.gmail.pci2676.controller;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gmail.pci2676.DTO.BDto;
import com.gmail.pci2676.service.IService;

@Controller
@RequestMapping(value = "/board/") // url요청이 /board/로 시작하는 것은 여기서 처리한다. ex) board/abc , board/123, board/create
public class BController {

	@Inject
	private IService service;

	@RequestMapping(value = "/insertContent", method = RequestMethod.POST)
	public String insertContentPOST(BDto dto, Model model, RedirectAttributes rttr) throws Exception {
		System.out.println(" /board/insertContent 입니다. POST방식");
		System.out.println(dto.toString());

		service.insertContent(dto);
		// model.addAttribute("result", "성공");
		rttr.addFlashAttribute("msg", "성공");

		// return "/board/success";
		return "redirect:/board/list";
	}

	@RequestMapping(value = "/insertContent", method = RequestMethod.GET)
	public void insertContentGET(BDto dto, Model model) throws Exception {
		System.out.println(" /board/insertContent 입니다. GET방식");
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {

		System.out.println("전체목록 페이지");

		model.addAttribute("boardList", service.list());

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bId") int bId, Model model) throws Exception {
		System.out.println(bId);
		System.out.println("글 번호" + bId + "번의 상세내용 페이지");

		model.addAttribute(service.read(bId));
	}

	@RequestMapping(value = "/modifyView", method = RequestMethod.POST)
	public void modifyViewPOST(@RequestParam("bId") int bId, Model model) throws Exception {
		System.out.println(bId);
		System.out.println("글 번호" + bId + "번의 내용수정 뷰 페이지");

		model.addAttribute(service.read(bId));
		
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(BDto dto,RedirectAttributes rttr) throws Exception {
		System.out.println("글 수정 중!");
		
		service.modify(dto);
		rttr.addFlashAttribute("bId", dto.getbId());
		
		return "redirect:list";
		
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("id")int bId) throws Exception{
		System.out.println("삭제 작업 중 !");
		
		service.delete(bId);
		
		return "redirect:list";
	}
}
