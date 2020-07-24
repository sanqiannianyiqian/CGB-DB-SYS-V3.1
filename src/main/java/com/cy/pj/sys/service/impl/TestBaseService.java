package com.cy.pj.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.sys.dao.TestBaseDao;

public class TestBaseService<T> {
	@Autowired
	TestBaseDao<T> testBaseDao;

	public void save() {
		System.out.println("自动注入的dao" + testBaseDao);
		testBaseDao.save();
	}
}
