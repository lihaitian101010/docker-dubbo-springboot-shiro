package com.bonc.ttms.gaming.server.service.admin.api.system.dao;


import com.bonc.ttms.gaming.server.domain.system.entity.SysMenu;
import com.bonc.ttms.gaming.server.service.admin.api.common.dao.BaseDao;

import java.util.List;
import java.util.Map;


public interface SysMenuDao extends BaseDao<SysMenu> {

	List<Map<String,Object>> findObjects();
	int getRowCount();
	List<Map<String, Object>> findZtreeNodes();
	int hasChild(Integer menuId);
	Map<String,Object> findMapById(Integer id);
	int deleteObject(Integer id);

}
