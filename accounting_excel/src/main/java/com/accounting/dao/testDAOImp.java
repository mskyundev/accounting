package com.accounting.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.accounting.vo.testVO;

@Repository
public class testDAOImp implements testDAO{
	 @Inject
	 private SqlSession sqlSession;
	 
	 private static final String Namespace = "com.accounting.mappers.testMapper";
	 
	@Override
	public List<testVO> list() {
		return sqlSession.selectList(Namespace+".list");
	}
}
