package com.shuaijiang.market.dao;

import com.shuaijiang.market.entity.WxbMemeber;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan
@Repository
public interface WxbMemeberDAO {
    WxbMemeber findName(@Param("name") String name);
}
