package com.bonc.ttms.gaming.server.web.admin.system.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bonc.ttms.gaming.server.commons.constant.DubboVersionConstant;
import com.bonc.ttms.gaming.server.domain.system.entity.SysUser;
import com.bonc.ttms.gaming.server.service.admin.api.system.SysUserService;
import com.bonc.ttms.gaming.server.web.admin.common.web.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class SysUserController {
    @Reference(version = DubboVersionConstant.DUBBO_GAMING_SERVICE_SERVER_ADMIN)
    private SysUserService userService;

    /**
     * 用户列表页面
     */
    @RequestMapping("listUI")
    //@RequiresPermissions("sys:user:view")
    public String listUI() {
        return "system/user_list";
    }

    /**
     * 查询用户列表
     */
    @RequestMapping("doFindObjects")
    @ResponseBody
    public JsonResult doFindObjects(String username, Integer pageCurrent) {
        Map<String, Object> map = userService.findPageObjects(username, pageCurrent);
        return new JsonResult(map);
    }

    /**
     * 跳转到用户编辑页面（新增/修改）
     */
    @RequestMapping("editUI")
    public String editUser() {
        return "system/user_edit";
    }

    /**
     * 查询所有角色列表
     */
    @RequestMapping("doFindRoles")
    @ResponseBody
    public JsonResult doFindRoles() {
        List<Map<String, Object>> list = userService.findSysRoles();
        return new JsonResult(list);
    }

    /**
     * 保存用户
     */
    @RequestMapping("doSaveObject")
    @ResponseBody
    public JsonResult doSaveObject(SysUser user, String roleIds) {
        userService.saveObject(user, roleIds);
        return new JsonResult();
    }

    /**
     * 根据id查询用户信息，用于回显
     */
    @RequestMapping("doFindObjectById")
    @ResponseBody
    public JsonResult doFindObjectById(Integer userId) {
        Map<String, Object> map = userService.findUserById(userId);
        //System.out.println("map="+map);
        return new JsonResult(map);
    }

    /**
     * 修改更新用户信息
     */
    @RequestMapping("doUpdateObject")
    @ResponseBody
    public JsonResult doUpdateObject(SysUser user, String roleIds) {
        userService.updateObject(user, roleIds);
        return new JsonResult();
    }

    /**
     * 启用/禁用
     */
    @RequestMapping("doValidById")
    @ResponseBody
    public JsonResult doValidById(Integer userId, Integer valid) {
        userService.validById(userId, valid);
        return new JsonResult();
    }

}
