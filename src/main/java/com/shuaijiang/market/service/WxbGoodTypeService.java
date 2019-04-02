package com.shuaijiang.market.service;

import com.shuaijiang.market.dao.WxbGoodTypeDAO;
import com.shuaijiang.market.entity.WxbGoodType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WxbGoodTypeService {
    @Resource
    private WxbGoodTypeDAO wxbGoodTypeDAO;

    public List<WxbGoodType> findAll(){
        return wxbGoodTypeDAO.findAll();
    }
}
