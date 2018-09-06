package com.gmail.pci2676.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gmail.pci2676.DTO.BDto;

@Repository  //DAO��� ����ϴ� �۾� ->���������� DAO��� �ν��ϰ� �ȴ�.
public class BDao implements IDao{

	@Autowired  //���� ���踦 �ڵ����� �����Ѵ�.
	private SqlSession sqlSession;
	
	private static final String namespace = "com.gmail.pci2676.mappers.BoardMapper"; 
    //BoardMapper.xml�� namespace��
	
	@Override
	public void insertContent(BDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertContent", dto);
	}

	@Override
	public ArrayList<BDto> list() throws Exception {
		// TODO Auto-generated method stub
		sqlSession.selectList(namespace+".list");
		return null;
	}

	@Override
	public BDto read(int bId) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.selectOne(namespace+".read",bId);
		return null;
	}

	@Override
	public void delete(int bId) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+".delete",bId);
	}

	@Override
	public void modify(BDto dto) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+".modift",dto);
	}

}
