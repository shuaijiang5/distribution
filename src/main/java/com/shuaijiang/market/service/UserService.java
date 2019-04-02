package com.shuaijiang.market.service;



import com.shuaijiang.market.dao.UserInfoDAO;
import com.shuaijiang.market.entity.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserInfoDAO userInfoDAO;

    public void login(String username,String password){
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(username, password));
    }

    public List<UserInfo> findAll(){
        return userInfoDAO.findAll();
    }

    public void insert(UserInfo userInfo) {
        userInfoDAO.insert(userInfo);
    }

    public UserInfo findById(Integer id){
        return userInfoDAO.findById(id);
    }

    public void update(UserInfo userInfo){
        userInfoDAO.update(userInfo);
    }

    public void delete(Integer id){
        userInfoDAO.delete(id);
    }
}
