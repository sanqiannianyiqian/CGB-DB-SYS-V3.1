package com.cy.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.pj.sys.service.impl.TestBookService;
import com.cy.pj.sys.service.impl.TestUserService;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	private TestBookService bookservice;
	@Autowired 
	private TestUserService userservice;
	@RequestMapping("sys/do")
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
