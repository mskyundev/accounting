package com.accounting.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.accounting.dao.testDAO;
import com.accounting.vo.testVO;

@Service
public class testServiceImp implements testService{
	@Inject
	private testDAO tDao;
	
	@Override
	public List<testVO> list() {
		return tDao.list();
	}
}
