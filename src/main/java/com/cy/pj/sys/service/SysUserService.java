package com.cy.pj.sys.service;

import java.util.Map;

import com.cy.pj.sys.entity.SysUser;
import com.cy.pj.sys.vo.SysUserDeptVo;

public interface SysUserService extends PageService<SysUserDeptVo>{
	
	boolean isExists(String columnName,String columnValue);
	/**
	 * 基于id查询用户以及用户对应的关系数据
	 * @param id
	 * @return
	 */
	Map<String,Object> findObjectById(Integer id);
	
	int updateObject(SysUser entity,Integer[] roleIds);
	int saveObject(SysUser entity,Integer[] roleIds);
	
	 /**
	     * 修改用户状态
	  * @param id
	  * @param valid
	  * @param modifiedUser
	  * @return
	  */
	 int validById(Integer id,
			       Integer valid,
			       String modifiedUser);
     /**
            *  分页查询当前页记录信息
      * @param username
      * @param pageCurrent
      * @return
      */
//	 PageObject<SysUserDeptVo> findPageObjects(
//			 String username,Integer pageCurrent);
}
