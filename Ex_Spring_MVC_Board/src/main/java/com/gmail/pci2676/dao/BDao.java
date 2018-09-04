package com.gmail.pci2676.dao;

import java.util.ArrayList;

import com.gmail.pci2676.dto.BDto;

public class BDao {
	
	public BDao() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = null;
		
		//db에서 dto에 정보를 담아 dtos에 담고 리턴해준다.
		
		
		return dtos;
	}
	
	public BDto contentView(String strId) {
		BDto dto = null;
				
		//조회수 로직을  dao에서 작성 불러오자.
		//bId받아와서 해당하는 content db에서 뿌려주는 로직
		
		return dto;
	}
	
	public void write(String bName, String bTitle, String bContent) {
		
		//DB에 받은 정보를 insert하는 작업
	}
	
	public void modify(String bId, String bName, String bTitle, String bContent) {
		//DB에서 해당하는 항목 alter하는 작업
	}
	
	public void delete(String strId) {
		//DB에서 해당하는 id delete 하는 작업
	}
	
	public BDto reply_view(String strId) {
		//DB에서 reply
		BDto dto = null;
		
		return dto;
	}
}
