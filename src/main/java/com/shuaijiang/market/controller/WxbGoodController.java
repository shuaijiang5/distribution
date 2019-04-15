package com.shuaijiang.market.controller;

import com.shuaijiang.market.entity.WxbGood;
import com.shuaijiang.market.service.WxbGoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/good")
public class WxbGoodController {
    @Resource
    private WxbGoodService wxbGoodService;

//    查询所有
    @RequestMapping("/list")
    public Integer findAll(){
        return wxbGoodService.findAll().size();
    }

//    添加数据
    @RequestMapping("/add")
    public String insert(WxbGood wxbGood, MultipartFile photo, MultipartFile photo1, MultipartFile photo2){
         return wxbGoodService.save(wxbGood,photo,photo1,photo2);
    }

//    根据id查询有多少条数据
    @RequestMapping("/findById")
    public WxbGood findById(String id){
        return wxbGoodService.findById(id);
    }

//    预修改
    @RequestMapping("/preUpdate")
    public String preUpdate(String goodId){
        wxbGoodService.findById(goodId);
        return "/update";
    }

//    修改数据
    @RequestMapping("/update")
    public void update(WxbGood wxbGood) throws IOException {
        wxbGoodService.update(wxbGood);
    }

//    删除数据
    @RequestMapping("/delete")
    public void delete(Integer goodId){
        wxbGoodService.delete(goodId);
    }

//    分页
    @RequestMapping("/page")
    public List<WxbGood> Page(Integer index){
        return wxbGoodService.goodByPage(index);
    }

//    查询总页数
    @RequestMapping("/number")
    public Integer number(){
        return wxbGoodService.number();
    }
}
