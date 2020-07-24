package com.cy.pj.sys.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.entity.SysLog;
import com.cy.pj.sys.entity.SysRole;
import com.cy.pj.sys.entity.SysUser;
import com.cy.pj.sys.service.impl.TestBaseService;
import com.cy.pj.sys.service.impl.TestBookService;
import com.cy.pj.sys.service.impl.TestUserService;
import com.cy.pj.sys.vo.SysUserDeptVo;
import com.fasterxml.jackson.core.JsonProcessingException;
/**
 * 基于此Controller对象处理项目中所有页面请求
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class PageController {
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "starter";
	}
	/**返回分页页面*/
	@RequestMapping("doPageUI")
	public String doPageUI() {
		return "common/page";
	}
	/**返回日志列表页面*/
//	@RequestMapping("log/log_list")
//	public String doLogUI() {
//		return "sys/log_list";
//	}
	/**返回菜单列表页面*/
//	@RequestMapping("menu/menu_list")
//	public String doMenuUI() {
//		return "sys/menu_list";
//	}
	/**rest风格(软件架构风格)的url映射:
	 * 其中:
	 * 1){}表示rest表达式,在这个表达式
	 * 中用变量的形式表示url
	 * 2)@PathVariable注解描述方法参数时
	 * 表示这个参数的值可以取自url中某个变量的值*/
	@RequestMapping("{module}/{moduleUI}")
	public String doModuleUI(
			@PathVariable String moduleUI){
		return "sys/"+moduleUI;
	}
	
//	@RequestMapping("{role}/doFindPageObjects")
//	public JsonResult doFindPageObjects(String name,Integer pageCurrent) {
//		PageObject<SysRole> pageObject=	sysRoleService.findPageObjects(name, pageCurrent);
//		return new JsonResult(pageObject);
//	}
	
	
	
	
	
//	
//	@RequestMapping("role/doFindPageObjects")
//	public JsonResult doFindPageObjects(String name,Integer pageCurrent) {
//		PageObject<SysRole> pageObject=	sysRoleService.findPageObjects(name, pageCurrent);
//		return new JsonResult(pageObject);
//	}
//	
//	@RequestMapping("user/doFindPageObjects")
//	  public JsonResult doFindPageObjects(String username,Integer pageCurrent) {
//		  PageObject<SysUserDeptVo> pageObject= sysUserService.findPageObjects(username, pageCurrent);
//		  return new JsonResult(pageObject);
//	}
//	
//	@GetMapping("log/doFindPageObjects")
//	public JsonResult doFindPageObjects(String username,Integer pageCurrent) throws JsonProcessingException {
//			PageObject<SysLog> pageObject=sysLogService.findPageObjects(username, pageCurrent);
//			return  new JsonResult(pageObject);}
}










//这个是用来测试泛型注入的,根据网上的例子
//@Autowired
//private TestBookService bookservice;
//@Autowired 
//private TestUserService userservice;
//@Autowired
//private TestBaseService<SysUser> baseservice;
///**返回首页页面*/
//@RequestMapping("doIndexUI")
//public String doIndexUI() {
//		bookservice.save();
//		userservice.save();
//		System.out.println(bookservice.getClass().getGenericSuperclass());
//	    System.out.println(userservice.getClass().getGenericSuperclass());
//	return "starter";
//}
