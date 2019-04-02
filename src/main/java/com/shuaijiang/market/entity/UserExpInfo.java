package com.shuaijiang.market.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserExpInfo{
//  用户编号
  private String userId;
//  用户性别
  private String sex;
//  用户昵称
  private String nickName;
//  邮箱地址
  private String email;
//  用户QQ号码
  private String qqNum;
//  用户手机号码
  private String telephone;
//  账号登录次数
  private Integer loginNum;
}
