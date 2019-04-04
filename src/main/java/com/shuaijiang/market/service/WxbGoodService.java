package com.shuaijiang.market.service;

import com.shuaijiang.market.dao.WxbGoodDAO;
import com.shuaijiang.market.entity.WxbGood;
import com.shuaijiang.market.util.Constants;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        String photos = Constants.photos(photo);
        if (photos.trim().equals("") && photos != null){
            wxbGood.setGoodPic(photos);
        }
        String photos1 = Constants.photos(photo1);
        if (photos1.trim().equals("") && photos1 != null){
            wxbGood.setGoodPic1(photos1);
        }
        String photos2 = Constants.photos(photo2);
        if (photos2.trim().equals("") && photos2 != null){
            wxbGood.setGoodPic2(photos2);
        }
        Date date = new Date();
        wxbGood.setCreateTime(date);
        String[] split = UUID.randomUUID().toString().split("-");
        wxbGood.setGoodId(split[0]);
        wxbGoodDAO.save(wxbGood);
        return "1";
    }

//    根据id查询
    public WxbGood findById(Integer goodId){
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
