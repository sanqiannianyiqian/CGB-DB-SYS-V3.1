package com.cy.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.entity.SysRole;
import com.cy.pj.sys.entity.SysUser;
import com.cy.pj.sys.service.SysUserService;
import com.cy.pj.sys.service.impl.PageServiceImpl;
import com.cy.pj.sys.vo.SysUserDeptVo;

@RestController
@RequestMapping("/user/")
public class SysUserController {
	  @Autowired
      private SysUserService sysUserService;
	
	  
	  @RequestMapping("isExists")
	  public JsonResult isExists(String columnName,String columnValue) {
		  boolean flag=sysUserService.isExists(columnName,columnValue);
		  return new JsonResult(flag);
	  }
	  @RequestMapping("doFindObjectById")
	  public JsonResult doFindObjectById(Integer id) {
		 return  new JsonResult(sysUserService.findObjectById(id));
	  }
	  
	  @RequestMapping("doSaveObject")
	  public JsonResult doSaveObject(SysUser entity,Integer[] roleIds) {
		  sysUserService.saveObject(entity, roleIds);
		  return new JsonResult("save ok");
	  }
	  @RequestMapping("doUpdateObject")
	  public JsonResult doUpdateObject(SysUser entity,Integer[] roleIds) {
		  sysUserService.updateObject(entity, roleIds);
		  return new JsonResult("update ok");
	  }
	  @RequestMapping("doValidById")
	  public JsonResult doValidById(
			  Integer id,Integer valid) {
		  sysUserService.validById(id, valid,"admin");
		  return new JsonResult("update ok");
	  }
	  @RequestMapping("doFindPageObjects")
	  public JsonResult doFindPageObjects(
			  String username,
			  Integer pageCurrent) {
		  PageObject<SysUserDeptVo> pageObject= sysUserService.findPageObjects(username, pageCurrent);
		  return new JsonResult(pageObject);
	  }
}
