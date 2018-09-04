package com.gmail.pci2676.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.gmail.pci2676.dao.BDao;
import com.gmail.pci2676.dto.BDto;

public class BModifyCommand implements BCommand {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = (HttpServletRequest)map.get("request");
		String bId = req.getParameter("bId");
		String bTitle = req.getParameter("bTitle");
		String bName = req.getParameter("bName");
		String bContent = req.getParameter("bContent");
		
		BDao dao = new BDao();
		
		dao.modify(bId,bName,bTitle,bContent);
		
	}

}
