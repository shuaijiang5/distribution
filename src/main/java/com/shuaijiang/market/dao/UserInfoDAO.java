package com.shuaijiang.market.dao;

import com.shuaijiang.market.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface UserInfoDAO{
    UserInfo findUsernameAndPassword(@Param("username") String username,@Param("password") String password);
    List<UserInfo> findAll();
    void insert(UserInfo userInfo);
    UserInfo findById(Integer id);
    void update(UserInfo userInfo);
    void delete(Integer id);
}
