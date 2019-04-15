package com.shuaijiang.market.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//商品套餐表
public class WxbGoodSku{
//  套餐主键
  private String skuId;
//  套餐名称
  private String skuName;
//  成本
  private String skuCost;
//  价格
  private String skuPrice;
//  分成
  private String skuPmoney;
//  商品ID
  private String goodId;
//  排序
  private Integer orderNo;
//  客服提成
  private String serviceMoney;
  private WxbGood wxbGood;
}
