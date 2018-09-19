package com.bonc.ttms.gaming.server.web.admin.common.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bonc.ttms.gaming.server.commons.constant.DubboVersionConstant;
import com.bonc.ttms.gaming.server.domain.system.entity.SysUser;
import com.bonc.ttms.gaming.server.service.admin.api.system.SysUserService;
import com.bonc.ttms.gaming.server.web.admin.common.web.JsonResult;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
	@Reference(version = DubboVersionConstant.DUBBO_GAMING_SERVICE_SERVER_ADMIN)
	private SysUserService userService;
	@RequestMapping("/indexUI")
	public String indexUI(){
		System.out.println("indexUI");
		return "index";
	}
	@RequestMapping("/403")
	public String errorUI(){
		System.out.println("indexUI");
		return "error";
	}
	@RequestMapping("/doFindUserMenus")
	@ResponseBody
	public JsonResult doFindUserMenus(Model model) {
		SysUser user = (SysUser) SecurityUtils.getSubject().getSession().getAttribute("currentUser");
//		SysUser user = userDao.findObjectByName("admin");
		Integer userId = user.getId();
		if(userId==null) {
			return new JsonResult(0,"用户ID不能为空");
		}
		Map resultMap = new HashMap();
		resultMap.put("username",user.getUsername());
		resultMap.put("menuList",userService.findUserMenus(userId));
		return new JsonResult(resultMap);
	}
}
