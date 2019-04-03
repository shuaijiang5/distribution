package com.shuaijiang.market.entity;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
//用户信息表
@Data
public class UserInfo{
//  用户编号
  private String userId;
//  用户名
  private String userName;
//  登录帐户
  private String account;
//  登录密码
  private String password;
//  备注
  private String remark;
//  人员类型(1:客服账号;2:管理账号;3:内置账号;4：财务账号 5：物流账号)
  private String userType;
//  启用状态
  private String enabled;
//  最后登录时间
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date loginTime;
//  角色ID
  private String roleId;
  private String self;
}
