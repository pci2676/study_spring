package com.gmail.pci2676.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class BContentCommand implements BCommand {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = (HttpServletRequest)map.get("request");
		String bId = req.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.contentView(bid);
		
		model.addAttribute("content_view",dto);
	}

}
