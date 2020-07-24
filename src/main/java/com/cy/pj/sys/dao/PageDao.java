package com.cy.pj.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.entity.SysRole;

public interface PageDao<T> {
	
	 List<T> findPageObjects(@Param("username")String username,@Param("startIndex")Integer startIndex,@Param("pageSize")Integer pageSize);
	 
	 int getRowCount(@Param("username")String username);

//	PageObject<SysRole> findPageObjects(String name, Integer pageCurrent);     
     
}
