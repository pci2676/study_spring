package com.gmail.pci2676.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gmail.pci2676.command.BCommand;
import com.gmail.pci2676.command.BContentCommand;
import com.gmail.pci2676.command.BDeleteCommand;
import com.gmail.pci2676.command.BListCommand;
import com.gmail.pci2676.command.BModifyCommand;
import com.gmail.pci2676.command.BReplyCommand;
import com.gmail.pci2676.command.BReplyViewCommand;
import com.gmail.pci2676.command.BWriteCommand;

@Controller
public class BController {
	BCommand command;
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		System.out.println("list()");
		
		command = new BListCommand();
		command.excute(model);
		return "list";
	}
	
	@RequestMapping(value="/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	
	@RequestMapping(value="/write")
	public String write(HttpServletRequest req,Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", req);
		command = new BWriteCommand();
		command.excute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping(value="/content_view")
	public String content_view(HttpServletRequest req, Model model) {
		System.out.println("content_view()");
		
		model.addAttribute("request", req);
		
		command = new BContentCommand();
		command.excute(model);
		
		return "content_view";
	}
	
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(HttpServletRequest req, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", req);
		command = new BModifyCommand();
		command.excute(model);
		
		return "modify";
	}
	
	@RequestMapping(value="/reply_view")
	public String reply_view(HttpServletRequest req, Model model) {
		System.out.println("reply_view()");
		
		model.addAttribute("request", req);
		command = new BReplyViewCommand();
		command.excute(model);
		
		return "reply_view";
	}
	
	@RequestMapping(value="/reply")
	public String reply(HttpServletRequest req, Model model) {
		System.out.println("reply()");
		
		model.addAttribute("request",req);
		command = new BReplyCommand();
		command.excute(model);
		return "redirect:list";
	}
	
	@RequestMapping(value="/delete")
	public String delete(HttpServletRequest req, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", req);
		command = new BDeleteCommand();
		command.excute(model);
		
		return "redirect:list";
	}
}
