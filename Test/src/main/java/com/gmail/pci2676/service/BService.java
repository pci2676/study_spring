package com.gmail.pci2676.service;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.gmail.pci2676.DAO.IDao;
import com.gmail.pci2676.DTO.BDto;

@Service
public class BService implements IService {

	@Inject
	private IDao dao;
	
	@Override
	public void insertContent(BDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.insertContent(dto);
	}

	@Override
	public ArrayList<BDto> list() throws Exception {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public BDto read(int bId) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bId);
	}

	@Override
	public void delete(int bId) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bId);
	}

	@Override
	public void modify(BDto dto) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(dto);
	}

}
