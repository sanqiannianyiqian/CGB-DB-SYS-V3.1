package com.cy.pj.sys.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.sys.entity.SysRole;
import com.cy.pj.sys.vo.SysRoleMenuVo;

@Mapper
public interface SysRoleMenuDao extends BaseDao{
	 
	 /**
	    * 将角色菜单关系数据写入到数据库
	  * @param roleId
	  * @param menuIds
	  * @return
	  */
//	 int insertObjects(@Param("roleId")Integer roleId,
//			          @Param("menuIds")Integer[] menuIds);
	 /**
	    *  基于角色id删除角色和菜单关系数据
	  * @param roleId
	  * @return
	  */
	//@Delete("delete from sys_role_menus where role_id=#{roleId}")
	//int deleteObjectsByRoleId(Integer roleId);
	 
     /**
             * 基于菜单id删除角色和菜单的关系数据
      * @param menuId
      * @return
      */
	 //@Delete("delete from sys_role_menus where menu_id=#{menuId}")
	 //int deleteObjectsByMenuId(Integer menuId);
}
