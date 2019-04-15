package com.shuaijiang.market.service;

import com.shuaijiang.market.dao.WxbGoodDAO;
import com.shuaijiang.market.entity.WxbGood;
import com.shuaijiang.market.util.Constants;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class WxbGoodService {
    @Resource
    private WxbGoodDAO wxbGoodDAO;

//    查询所有
    public List<WxbGood> findAll(){
        return wxbGoodDAO.findAll();
    }

//    添加数据
    public String save(WxbGood wxbGood, MultipartFile photo, MultipartFile photo1, MultipartFile photo2){
        String s = Constants.photos(photo);
        if (s.trim().equals("") && s != null){
            wxbGood.setGoodPic(s);
        }
        String s1 = Constants.photos(photo1);
        if (s1.trim().equals("") && s1 != null){
            wxbGood.setGoodPic1(s1);
        }
        String s2 = Constants.photos(photo2);
        if (s2.trim().equals("") && s2 != null){
            wxbGood.setGoodPic2(s2);
        }
        //添加时间
        wxbGood.setCreateTime(new Date());
        //生成一个唯一的id
        String[] split = UUID.randomUUID().toString().split("-");
        wxbGood.setGoodId(split[0]);
        wxbGoodDAO.save(wxbGood);
        return "1";
    }

//    根据id查询
    public WxbGood findById(String goodId){
        return wxbGoodDAO.findById(goodId);
    }

//    修改数据
    public void update(WxbGood wxbGood){
        wxbGoodDAO.update(wxbGood);
    }

//    删除数据
    public void delete(Integer goodId){
        wxbGoodDAO.delete(goodId);
    }

//    分页
    public List<WxbGood> goodByPage(Integer index){
        Integer a = (index-1) * Constants.Page.PAGE_SIZE;
        return wxbGoodDAO.goodByPage(a,Constants.Page.PAGE_SIZE);
    }

//    查询总页数
    public Integer number(){
        int size = findAll().size();
        Integer pages = null;
        if (size % Constants.Page.PAGE_SIZE==0){
            pages = size/Constants.Page.PAGE_SIZE;
        }else {
            pages = size/Constants.Page.PAGE_SIZE+1;
        }
        return pages;
    }
}
