package com.cy.pj.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.sys.dao.TestBookDao;
import com.cy.pj.sys.entity.SysRole;

@Service
public class TestBookService extends TestBaseService<SysRole> {
	@Autowired
	private TestBookDao testbook;

	public void show() {
		testbook.save();
	}
}
