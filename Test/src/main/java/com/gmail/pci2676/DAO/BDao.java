package com.gmail.pci2676.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gmail.pci2676.DTO.BDto;

@Repository  //DAO라고 명시하는 작업 ->스프링에서 DAO라고 인식하게 된다.
public class BDao implements IDao{

	@Autowired  //의존 관계를 자동으로 연결한다.
	private SqlSession sqlSession;
	
	private static final String namespace = "com.gmail.pci2676.mappers.BoardMapper"; 
    //BoardMapper.xml의 namespace값
	
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
