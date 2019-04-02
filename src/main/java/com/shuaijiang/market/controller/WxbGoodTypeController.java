package com.shuaijiang.market.controller;

import com.shuaijiang.market.entity.WxbGoodType;
import com.shuaijiang.market.service.WxbGoodTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/type")
public class WxbGoodTypeController {
    @Resource
    private WxbGoodTypeService wxbGoodTypeService;

//    查询所有
    @RequestMapping("/list")
    public List<WxbGoodType> findAll(){
        return wxbGoodTypeService.findAll();
    }
}
