package com.shuaijiang.market.dao;

import com.shuaijiang.market.entity.WxbGood;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface WxbGoodDAO {
//    查询所有
    List<WxbGood> findAll();
//    添加数据
    void save(WxbGood wxbGood);
//    根据id查询
    WxbGood findById(String goodId);
//    修改数据
    void update(WxbGood wxbGood);
//    分页
    List<WxbGood> goodByPage(@Param("index") Integer index,@Param("size") Integer size);
//    删除数据
    void delete(Integer goodId);
}
