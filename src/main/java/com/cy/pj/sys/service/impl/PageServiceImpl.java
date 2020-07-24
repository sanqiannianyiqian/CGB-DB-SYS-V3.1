package com.cy.pj.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cy.pj.common.config.PageProperties;
import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.dao.PageDao;
import com.cy.pj.sys.entity.SysLog;
import com.cy.pj.sys.service.PageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class PageServiceImpl<T> implements PageService<T> {

	@Autowired
	private PageDao<T> pageDao;
	@Autowired
	private PageProperties pageProperties;
	
	public PageObject<T> findPageObjects(String username, Integer pageCurrent) {
		//1.参数有效性校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("页码值不正确");
		//2.基于条件查询总记录数
		int rowCount=pageDao.getRowCount(username);
		if(rowCount==0)
			throw new ServiceException("记录不存在");
		//3.查询当前页记录
		int pageSize=pageProperties.getPageSize();
		int startIndex=(pageCurrent-1)*pageSize;
		List<T> records=pageDao.findPageObjects(username,startIndex, pageSize);
		//4.封装数据被返回
		return new PageObject<T>(records, rowCount, pageCurrent, pageSize);// TODO Auto-generated method stub
		
	}
//*	利用pagehelper进行分页
	/*public PageInfo<T> pageHelperFindPageObjects(String username,Integer pageNum,Integer pageSize){
		pageSize=pageProperties.getPageSize();
		PageHelper.startPage(pageNum, pageSize); 
		/*** 开始分页
	     *   * @param pageNum  页码
	     * @param pageSize 每页显示数量
	     *
		List<SysLog> list = pageDao.findPageObjects(username);
		PageInfo<SysLog> pageInfo=new PageInfo<SysLog>(list);
		return pageInfo;
	}
*/

}
