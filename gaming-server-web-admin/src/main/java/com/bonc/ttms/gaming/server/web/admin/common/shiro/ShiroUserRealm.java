package com.bonc.ttms.gaming.server.web.admin.common.shiro;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bonc.ttms.gaming.server.commons.constant.DubboVersionConstant;
import com.bonc.ttms.gaming.server.domain.system.entity.SysUser;
import com.bonc.ttms.gaming.server.service.admin.api.system.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShiroUserRealm extends AuthorizingRealm {
    @Reference(version = DubboVersionConstant.DUBBO_GAMING_SERVICE_SERVER_ADMIN)
    private SysUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("==doGetAuthorizationInfo==");
        SysUser user = (SysUser) SecurityUtils.getSubject().getSession().getAttribute("currentUser");
        int userId = user.getId();
        List<String> permsList = new ArrayList<>();
        permsList = userService.findUserPermissions(userId);
        //用户权限列表
        Set<String> permsSet = new HashSet<String>();
        for (String perm : permsList) {
            if (perm != null && !("".equals(perm))) {
                permsSet.add(perm);
            }
        }
        System.out.println("permsSet=" + permsSet);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(permsSet);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("==doGetAuthenticationInfo==");
        //1. 把 AuthenticationToken 转换为 UsernamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        //2. 从 UsernamePasswordToken 中来获取 username
        String username = upToken.getUsername();
        //判断用户名是否存在，若存在，返回user对象
        SysUser user = userService.findObjectByName(username);
        //盐值.
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getSalt());
        //自动完成密码比对   - 密码的比对:
        //通过 AuthenticatingRealm 的 credentialsMatcher 属性来进行的密码的比对!
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, user.getPassword(), credentialsSalt, getName());
        Subject subject = SecurityUtils.getSubject();
        Session session ;
        session =  subject.getSession(true);
        session.setAttribute("currentUser",user);
//        SecurityUtils.getSubject().getSession().setAttribute("currentUser", user);
        return info;
    }
}
