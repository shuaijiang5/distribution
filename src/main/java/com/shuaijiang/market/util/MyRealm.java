package com.shuaijiang.market.util;


import com.shuaijiang.market.entity.WxbMemeber;
import com.shuaijiang.market.service.WxbMemeberService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

public class MyRealm extends AuthorizingRealm {
    @Resource
    private WxbMemeberService wxbMemeberService;

    @Override
    public String getName() {
        return "myRealm";
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)throws AuthenticationException{
        //使用用户密码验证方式
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        //得到用户输入的用户名
        String name = usernamePasswordToken.getUsername();
        //得到用户输入的密码
        String password = new String(usernamePasswordToken.getPassword());

        //登录
        WxbMemeber wxbMemeber = wxbMemeberService.findName(name);
        if(wxbMemeber != null){
            if(MD5Utils.md5(password,wxbMemeber.getPasswordSalt()).equals(wxbMemeber.getPassword())){
                // 创建并封装shiro需要的认证对象
                SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(name,password,getName());
                return authenticationInfo;
            }else{
                throw new AccountException("密码错误");
            }
        }else{
            throw new UnknownAccountException("未知的账号");
        }
    }
}

