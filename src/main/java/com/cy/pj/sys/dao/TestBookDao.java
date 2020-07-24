package com.cy.pj.sys.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cy.pj.sys.entity.SysRole;
import com.cy.pj.sys.entity.SysUser;

@Repository
public class TestBookDao implements TestBaseDao<SysRole>{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("正在保存图书...");	
	}

}
