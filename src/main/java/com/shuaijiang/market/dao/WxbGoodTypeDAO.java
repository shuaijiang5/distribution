package com.shuaijiang.market.dao;

import com.shuaijiang.market.entity.WxbGoodType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface WxbGoodTypeDAO {
    List<WxbGoodType> findAll();
}
