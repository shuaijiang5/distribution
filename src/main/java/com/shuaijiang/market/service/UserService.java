package com.shuaijiang.market.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void login(String name,String password){
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(name, password));
    }

}
