package com.bonc.ttms.gaming.server.web.admin.system.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bonc.ttms.gaming.server.commons.constant.DubboVersionConstant;
import com.bonc.ttms.gaming.server.domain.system.entity.SysRole;
import com.bonc.ttms.gaming.server.service.admin.api.system.SysRoleService;
import com.bonc.ttms.gaming.server.web.admin.common.web.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role/")
public class SysRoleController {
    @Reference(version = DubboVersionConstant.DUBBO_GAMING_SERVICE_SERVER_ADMIN)
    private SysRoleService roleService;

    @RequestMapping("listUI")
    //@RequiresPermissions("sys:role:view")
    public String listUI() {
        return "system/role_list";
    }

    @RequestMapping("editUI")
    public String editRoleUI() {
        return "system/role_edit";
    }

    /**
     * 分页查询角色信息
     *
     * @return
     */
    @RequestMapping("doFindObjects")
    @ResponseBody
    public JsonResult doFindObjects(String name, Integer pageCurrent) {
        Map<String, Object> map =
                roleService.findObjects(name, pageCurrent);
        return new JsonResult(map);
    }

    /**
     * 加载菜单树
     */
    @RequestMapping("doFindZtreeNodes")
    @ResponseBody
    public JsonResult findZtreeNodes() {
        List<Map<String, Object>> list =
                roleService.findZtreeNodes();
        return new JsonResult(list);
    }

    /**
     * 保存角色信息
     */
    @RequestMapping("doSaveObject")
    @ResponseBody
    public JsonResult saveObject(SysRole role, String menuIdList) {
        roleService.saveObject(role, menuIdList);
        return new JsonResult();
    }

    /**
     * 根据id查询角色信息
     */
    @RequestMapping("doFindObjectById")
    @ResponseBody
    public JsonResult findObjectById(Integer roleId) {
        Map<String, Object> map = roleService.findMapById(roleId);
        return new JsonResult(map);
    }

    /**
     * 修改更新角色信息
     */
    @RequestMapping("doUpdateObject")
    @ResponseBody
    public JsonResult updateObject(SysRole role, String menuIdList) {
        roleService.updateRole(role, menuIdList);
        return new JsonResult();
    }

    /**
     * 删除角色
     */
    @RequestMapping("doDeleteObject")
    @ResponseBody
    public JsonResult deleteObject(Integer roleId) {
        roleService.deleteObject(roleId);
        return new JsonResult();
    }
}