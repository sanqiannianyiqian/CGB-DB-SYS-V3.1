package com.cy.pj.sys.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.cy.pj.common.config.PageProperties;
import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.dao.SysLogDao;
import com.cy.pj.sys.entity.SysLog;
import com.cy.pj.sys.service.SysLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
/**
 *  BO:(业务对象)
  *    日志业务对象(负责日志核心业务以及拓展的处理)
 * @author Administrator
 */
@Service
public class SysLogServiceImpl extends PageServiceImpl<SysLog> implements SysLogService {
	@Autowired
	private SysLogDao sysLogDao;
	@Autowired
	private PageProperties pageProperties;
	
	@Override
	public int deleteObjects(Integer... ids) {
	  //1.参数有效性校验
	  if(ids==null||ids.length==0)
	  throw new IllegalArgumentException("请先选择");
	  //2.执行删除操作
	  int rows=sysLogDao.deleteObjects(ids);
	  //3.判定结果并返回
	  if(rows==0)
	  throw new ServiceException("记录可能已经不存在");
	  return rows;
	}

	
	public PageInfo<SysLog> pageHelperFindPageObjects(String username,Integer pageNum,Integer pageSize){
		pageSize=pageProperties.getPageSize();
		PageHelper.startPage(pageNum, pageSize);
		List<SysLog> list = sysLogDao.pageHelperFind(username);
		PageInfo<SysLog> pageInfo=new PageInfo<SysLog>(list);
		return pageInfo;
	}
//	@Override
//	public PageObject<SysLog> findPageObjects(String username, Integer pageCurrent) {
//		
//		if(pageCurrent==null||pageCurrent<1)    //1.验证参数的合法性
//			throw new IllegalArgumentException("页码值不正确");
//		int rowCount=sysLogDao.getRowCount(username);//2.查询总记录数
//		if(rowCount==0)
//			throw new ServiceException("没有对应的记录");
//		int pageSize=pageProperties.getPageSize();//3.查询当前页要呈现的记录
//		System.out.println("pageSize="+pageSize);
//		int startIndex=(pageCurrent-1)*pageSize;
//		List<SysLog> records=
//		sysLogDao.findPageObjects(username, startIndex, pageSize);
//		//4.封装查询结果
//		return new PageObject<>(records, rowCount, pageCurrent, pageSize);
//	}


	
}








