package com.shuaijiang.market.service;



import com.shuaijiang.market.dao.UserInfoDAO;
import com.shuaijiang.market.entity.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AuthService {
    @Resource
    private UserInfoDAO userInfoDAO;

    public UserInfo findByUsernameAndPwd(String username, String password){
        return userInfoDAO.findUsernameAndPassword(username,password);
    }

}
