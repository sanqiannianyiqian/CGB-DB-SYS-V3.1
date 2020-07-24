package com.cy.pj.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.entity.SysRole;

public interface BaseDao {
	//@Delete("delete from sys_user_roles where user_id=#{userId}")
	//int deleteObjectsByUserId(Integer userId);
	@Delete("delete from ${table} where ${column}=#{id}")
	 int deleteById(
			 String table,
			 String column,
			 Integer id);
     //int insertObjects(@Param("userId")Integer userId,@Param("roleIds")Integer[] roleIds);

    // int insertObjects(@Param("userId")Integer userId,@Param("roleIds")Integer[] roleIds);
	@Insert("<script>insert into ${table} (${coloum1},${coloum2}) values <foreach collection='ids' separator=',' item='d'> (#{id},#{d}) </foreach></script>")
     int insertObjects(String table,
    		 String coloum1,
    		 String coloum2,
    		 @Param("id")Integer id,@Param("ids")Integer[] ids);
	   /*<insert id="insertObjects">
	      insert into ${table}
	      (${coloum1},${coloum1})
	      values <!-- (1,2),(1,3),(1,4) -->
	      <foreach collection="ids" separator="," item="d">
	               (#{id},#{d})
	      </foreach>
	   </insert>*/
     /*  <insert id="insertObjects">
     insert into sys_user_roles
     (user_id,role_id)
     values (1,2),(1,3),(1,4)
     <foreach collection="roleIds" separator="," item="roleId">
              (#{userId},#{roleId})
     </foreach>*/
	
  
     
}
