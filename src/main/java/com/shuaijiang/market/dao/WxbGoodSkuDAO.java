package com.shuaijiang.market.dao;

import com.shuaijiang.market.entity.WxbGoodSku;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@MapperScan
@Repository
public interface WxbGoodSkuDAO {
    WxbGoodSku findById(String skuId);
    void save(WxbGoodSku wxbGoodSku);
}
