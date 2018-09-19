package com.bonc.ttms.gaming.server.service.admin.api.system.dao;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleMenuDao{
	int insertRoleMenus(@Param("roleId") Integer roleId, @Param("menuIds") String[] menuIds);
	int deleteObject(Integer id);
	List<Integer> findMenuIdsByRoleId(Integer id);
	
}
