package com.qianfeng.test;

import com.shuaijiang.market.service.WxbGoodService;
import org.junit.Test;

import javax.annotation.Resource;
import java.security.MessageDigest;
import java.util.Date;

public class WxbGoodTest {
    @Resource
    private WxbGoodService wxbGoodService;


    @Test
    public void test1(){
//        String[] split = UUID.randomUUID().toString().split("-");
//        System.out.println(split[0]);
//        Date date = new Date();
//        date.getTime() ;
        Date date = new Date();
        System.out.println(date);
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

    @Test
    public static void main(String[] args) {
        MessageDigest md5 = null;
        String salt="qianfeng";
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
        char[] charArray = ("123456"+salt).toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        System.out.println(hexValue.toString());
    }
}
