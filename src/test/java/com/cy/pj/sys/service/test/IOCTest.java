package com.cy.pj.sys.service.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cy.pj.sys.service.SysLogService;
import com.cy.pj.sys.service.impl.TestBookService;
import com.cy.pj.sys.service.impl.TestUserService;

public class IOCTest {
	@Autowired
	private TestBookService bookservice;
	@Autowired 
	private TestUserService userservice;
	@Test
	public void testFindPageObjects() {
//		PageObject<SysLog> po=
//		sysLogService.findPageObjects(null,1);
//		System.out.println("pageCount="+po.getPageCount());
		bookservice.save();
		userservice.save();
		System.out.println(bookservice.getClass().getGenericSuperclass());
	    System.out.println(userservice.getClass().getGenericSuperclass());
	
	}
}
