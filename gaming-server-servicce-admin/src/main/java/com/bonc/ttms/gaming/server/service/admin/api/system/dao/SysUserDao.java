package com.bonc.ttms.gaming.server.service.admin.api.system.dao;

import com.bonc.ttms.gaming.server.domain.system.entity.SysUser;
import com.bonc.ttms.gaming.server.service.admin.api.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysUserDao extends BaseDao<SysUser> {

	List<SysUser> findPageObjects(
            @Param("username") String username,
            @Param("startIndex") Integer startIndex,
            @Param("pageSize") Integer pageSize);

	int getRowCount(@Param("username") String username);
	SysUser findObjectById(Integer id);
	int validById(@Param("id") Integer id, @Param("valid") Integer valid);
	SysUser findObjectByName(String username);
	/**
	 * 查询用户得权限
	 * @param userId
	 */
	List<String> findUserPermissions(Integer userId);
	List<Map<String,Object>> findUserMenus(Integer userId);
	
	

}
