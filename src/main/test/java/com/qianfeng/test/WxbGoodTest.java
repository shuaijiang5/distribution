package com.qianfeng.test;

import com.shuaijiang.market.service.WxbGoodService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.UUID;

public class WxbGoodTest {
    @Resource
    private WxbGoodService wxbGoodService;

    /**
     * 新增
     */
    @Test
    public void test1(){
        String[] split = UUID.randomUUID().toString().split("-");
        System.out.println(split[0]);
//        WxbGood wxbGood = new WxbGood();
//        wxbGood.setGoodId("split[0]");
//        wxbGood.setGoodName("55555");
//        wxbGood.setCustomerId("12");
//        wxbGood.setGoodPic("1234");
//        wxbGood.setGoodPic1("66666");
//        wxbGood.setGoodPic2("5555555555");
//        wxbGood.setPromoteDesc("222222222");
//        wxbGood.setSkuTitle("1111");
//        wxbGood.setSkuCost("66666");
//        wxbGood.setSkuPrice("77");
//        wxbGood.setSkuPmoney("88");
//        wxbGood.setCreateTime(new Date());
//        wxbGoodService.save(wxbGood);
    }
}
