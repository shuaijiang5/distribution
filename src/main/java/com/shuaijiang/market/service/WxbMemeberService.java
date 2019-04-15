package com.shuaijiang.market.service;

import com.shuaijiang.market.dao.WxbMemeberDAO;
import com.shuaijiang.market.entity.WxbMemeber;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WxbMemeberService {
    @Resource
    private WxbMemeberDAO wxbMemeberDAO;

    public WxbMemeber findName(String name){
        return wxbMemeberDAO.findName(name);
    }
}
