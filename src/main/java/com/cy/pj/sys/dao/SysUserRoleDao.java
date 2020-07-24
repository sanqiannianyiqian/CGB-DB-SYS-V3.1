package com.cy.pj.sys.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cy.pj.sys.entity.SysUser;
import com.cy.pj.sys.vo.SysUserDeptVo;
/**
  * 基于此DAO操作用户和角色关系数据
 */
@Mapper
public interface SysUserRoleDao extends BaseDao{
	   /**
	    * 查找用户对应的角色id
	    * @param userId
	    * @return
	    */
	   @Select("select role_id from sys_user_roles where user_id=#{userId}")
	   List<Integer> findRoleIdsByUserId(Integer userId);
	   /**
	    * 保存用户和角色关系数据
	    * @param userId
	    * @param roleIds
	    * @return
	    */
	 //  int insertObjects(@Param("userId")Integer userId,@Param("roleIds")Integer[] roleIds);
//	   int insertObjects(String table,String coloum1,String coloum2,@Param("userId")Integer userId,@Param("roleIds")Integer[] roleIds);
	   /*<insert id="insertObjects">
	      insert into sys_user_roles
	      (user_id,role_id)
	      values <!-- (1,2),(1,3),(1,4) -->
	      <foreach collection="roleIds" separator="," item="roleId">
	               (#{userId},#{roleId})
	      </foreach>
	   </insert>*/
	   
	   /*<insert id="insertObjects">
	      insert into ${table}
	      (${coloum1},${coloum2})
	      values <!-- (1,2),(1,3),(1,4) -->
	      <foreach collection="roleIds" separator="," item="roleId">
	               (#{userId},#{roleId})
	      </foreach>
	   </insert>*/
	   
	   //@Delete("delete from sys_user_roles where user_id=#{userId}")
	   //int deleteObjectsByUserId(Integer userId);
	
	   //@Delete("delete from sys_user_roles where role_id=#{roleId}")
	  // int deleteObjectsByRoleId(Integer roleId);
//	 
	//   @Delete("delete from ${table} where ${column}=#{id}")
//		 int deleteById(String table, String column,Integer id);
	
	   //sysRoleMenuDao.deleteObjectsByRoleId(id);
//	 		sysRoleMenuDao.deleteById("sys_role_menus", "role_id",id);
}










