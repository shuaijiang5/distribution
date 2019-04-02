package com.shuaijiang.market.util;


import com.shuaijiang.market.entity.UserInfo;
import com.shuaijiang.market.service.AuthService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class MyRealm extends AuthorizingRealm {
    @Resource
    private AuthService authService;

    @Override
    public String getName() {
        return "myRealm";
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //得到当前登录的唯一用户
        UserInfo userInfo = (UserInfo) principals.iterator().next();
        //得到所有的角色信息
//        List<String> roleCodeList = authService.findAllRoleCodeById(user.getId());
        //得到所有的权限信息
//        List<String> authCodeList = authService.findAllAuthCodeById(user.getId());

        //创建鉴权对象并将角色权限信息封装到对象中
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        authorizationInfo.setRoles(new HashSet<String>(roleCodeList));
//        authorizationInfo.setStringPermissions(new HashSet<String>(authCodeList));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)throws AuthenticationException{
        //使用用户密码验证方式
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        //得到用户输入的用户名
        String username = usernamePasswordToken.getUsername();
        //得到用户输入的密码
        String password = new String(usernamePasswordToken.getPassword());

        //登录
        UserInfo userInfo = authService.findByUsernameAndPwd(username,password);
        if(userInfo != null){
            // 创建并封装shiro需要的认证对象
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username,password,getName());
            return authenticationInfo;
        }
        return null;
    }
}
