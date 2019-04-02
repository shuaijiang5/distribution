package com.shuaijiang.market.entity;

import lombok.Data;

@Data
public class WxbGoodType {
//    类型编号
    private String typeId;
//    类型名称
    private String typeName;
//    上级编号
    private String parentId;
//    类型标签
    private String typeTag;
//    排序编号
    private Integer orderNo;
//    分类助记码
    private String alisaCode;
}
