package com.gmail.pci2676.dao;

import java.util.ArrayList;

import com.gmail.pci2676.dto.BDto;

public class BDao {
	
	public BDao() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = null;
		
		//db���� dto�� ������ ��� dtos�� ��� �������ش�.
		
		
		return dtos;
	}
	
	public BDto contentView(String strId) {
		BDto dto = null;
				
		//��ȸ�� ������  dao���� �ۼ� �ҷ�����.
		//bId�޾ƿͼ� �ش��ϴ� content db���� �ѷ��ִ� ����
		
		return dto;
	}
	
	public void write(String bName, String bTitle, String bContent) {
		
		//DB�� ���� ������ insert�ϴ� �۾�
	}
	
	public void modify(String bId, String bName, String bTitle, String bContent) {
		//DB���� �ش��ϴ� �׸� alter�ϴ� �۾�
	}
	
	public void delete(String strId) {
		//DB���� �ش��ϴ� id delete �ϴ� �۾�
	}
	
	public BDto reply_view(String strId) {
		//DB���� reply
		BDto dto = null;
		
		return dto;
	}
}
