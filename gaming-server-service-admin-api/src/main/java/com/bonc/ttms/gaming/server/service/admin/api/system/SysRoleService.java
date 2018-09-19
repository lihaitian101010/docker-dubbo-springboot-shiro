package com.bonc.ttms.gaming.server.service.admin.api.system;


import com.bonc.ttms.gaming.server.domain.system.entity.SysRole;

import java.util.List;
import java.util.Map;


public interface SysRoleService {

    Map<String, Object> findObjects(String name, Integer pageCurrent);

    void saveObject(SysRole role, String menuIdList);

    Map<String, Object> findMapById(Integer roleId);

    void updateRole(SysRole role, String menuIdList);

    void deleteObject(Integer roleId);

    List<Map<String, Object>> findZtreeNodes();

}
