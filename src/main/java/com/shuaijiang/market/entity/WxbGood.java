package com.shuaijiang.market.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;


@Getter
@Setter
//商品信息表
public class WxbGood{
//  主键ID
  private String goodId;
//  商品名称
  private String goodName;
//  商户ID
  private String customerId;
//  商品图片
  private String goodPic;
//  图片2
  private String goodPic1;
//  图片3
  private String goodPic2;
//  推广说明
  private String promoteDesc;
//  sku描述
  private String skuTitle;
//  成本
  private String skuCost;
//  价格
  private String skuPrice;
//  分成
  private String skuPmoney;
//  文案ID
  private String copyIds;
//  文案说明
  private String copyDesc;
//  跳转链接
  private String forwardLink;
//  排序编号
  private Integer orderNo;
//  商品分类
  private String typeId;
//  标签信息
  private String tags;
//   '是否有效 0 待审核 1 已上架 2 已下架
  private Integer state;
//  加入时间
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;
//   '是否置顶 0 取消置顶 1 置顶
  private Integer toped;
//  '是否推荐 0 否 1 是
  private Integer recomed;
//  置顶时间
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date topedTime;
//  推荐时间
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date recomedTime;
//  站内文案ID
  private String spcId;
//  空间文案ID
  private String zonId;
//  购买人数作弊值
  private Integer sellNum;
//  产品网址
  private String website;
  private Integer iswxpay;
  private Integer isfdfk;
  private Integer leixingId;
  private String kfqq;
  private List<WxbGoodSku> wxbGoodSkuList;
}
