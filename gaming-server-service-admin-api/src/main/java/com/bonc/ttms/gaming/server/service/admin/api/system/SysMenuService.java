package com.bonc.ttms.gaming.server.service.admin.api.system;


import com.bonc.ttms.gaming.server.domain.system.entity.SysMenu;

import java.util.List;
import java.util.Map;

public interface SysMenuService {

	List<Map<String, Object>> findObjects();
	List<Map<String, Object>> findZtreeNodes();
	void saveObject(SysMenu entity);
	Map<String, Object> findMapById(Integer menuId);
	void updateObject(SysMenu entity);
	void deleteObject(Integer menuId);

}
