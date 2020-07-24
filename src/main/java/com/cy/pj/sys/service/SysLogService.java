package com.cy.pj.sys.service;
import java.util.List;

import com.cy.pj.sys.entity.SysLog;
import com.github.pagehelper.PageInfo;

public interface SysLogService extends PageService<SysLog>{
	/**
	 * 基于日志记录id执行日志记录删除操作
	 * @param ids
	 * @return
	 */
	int deleteObjects(Integer... ids);
	
    /**
          * 分页查询用户行为日志信息
     * @param username (页面上传过来的查询条件)
     * @param pageCurrent 当前页码值
     * @return 封装了日志记录以及分页信息的对象
     */
//	 PageObject<SysLog> findPageObjects(
//			 String username,
//			 Integer pageCurrent);
	public PageInfo<SysLog> pageHelperFindPageObjects(String username,Integer pageCurrent,Integer pageSize);
}
