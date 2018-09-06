package com.gmail.pci2676.service;

import java.util.ArrayList;

import com.gmail.pci2676.DTO.BDto;

public interface IService {
	
	public void insertContent(BDto dto) throws Exception;
	
	public ArrayList<BDto> list() throws Exception;
	
	public BDto read(int bId) throws Exception;
	
	public void delete(int bId) throws Exception;
	
	public void modify(BDto dto) throws Exception;
	
}
