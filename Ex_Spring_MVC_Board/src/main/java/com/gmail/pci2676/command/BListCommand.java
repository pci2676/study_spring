package com.gmail.pci2676.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.gmail.pci2676.dao.BDao;
import com.gmail.pci2676.dto.BDto;

public class BListCommand implements BCommand{

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list", dtos);
	}

}
