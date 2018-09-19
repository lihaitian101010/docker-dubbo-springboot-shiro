package com.bonc.ttms.gaming.server.web.admin.system.controller;

import com.bonc.ttms.gaming.server.web.admin.common.web.JsonResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SysLoginController {
	@RequestMapping("/loginUI")
	public String login(){
		return "login";
	}
	/**登录操作*/
	@RequestMapping("/login")
	@ResponseBody
	public JsonResult login(String username, String password){
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()){
			return new JsonResult(1,"已登录");
		}
		// 把用户名和密码封装为 UsernamePasswordToken 对象
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		try {//登录认证 - 调用userRealm
			subject.login(token);
		} catch (AuthenticationException ae) {
			ae.printStackTrace();
			return new JsonResult(0,"账号或密码错误");
		}
		return new JsonResult(1,"登陆成功");
	}
}
