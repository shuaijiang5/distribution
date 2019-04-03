package com.shuaijiang.market.controller;

import com.shuaijiang.market.entity.WxbGood;
import com.shuaijiang.market.service.WxbGoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
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
    public void insert(WxbGood wxbGood,String smfile,String smfile1,String smfile2){
         wxbGoodService.save(wxbGood);
    }

//    预修改
    @RequestMapping("/preUpdate")
    public String preUpdate(Integer goodId){
        wxbGoodService.findById(goodId);
        return "/update";
    }

//    修改数据
    @RequestMapping("/update")
    public void update(WxbGood wxbGood,MultipartFile uploadGood) throws IOException {
        String filename = uploadGood.getOriginalFilename();
        uploadGood.transferTo(new File("c:/photofile/" + filename));
        wxbGood.setGoodPic(filename);
        wxbGood.setGoodPic1(filename);
        wxbGood.setGoodPic2(filename);
        wxbGoodService.update(wxbGood);
    }

//    上传图片
    @RequestMapping("/upload")
    public String upload(String username, MultipartFile uploadGood) throws IOException {
        System.out.println(username);
        String filename = uploadGood.getOriginalFilename();
        uploadGood.transferTo(new File("c:/photofile/" + filename));
        return "/update";
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
