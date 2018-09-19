package com.bonc.ttms.gaming.server.service.admin.api.system.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserRoleDao {
	int isUsedByUser(@Param("roleId") Integer roleId);
	int insertObject(@Param("userId") Integer userId,
                     @Param("roleIds") String[] roleIds);
	int deleteUserRoles(Integer userId);
	List<Integer> findRoleIdsByUserId(Integer userId);
}
