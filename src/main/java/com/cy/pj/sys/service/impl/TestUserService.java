package com.cy.pj.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.sys.dao.TestBookDao;
import com.cy.pj.sys.dao.TestUserDao;
import com.cy.pj.sys.entity.SysUser;
@Service
public class TestUserService extends TestBaseService<SysUser>{
	@Autowired
	private TestUserDao tesyuser;
	public void show() {
	tesyuser.save();
	}
}
