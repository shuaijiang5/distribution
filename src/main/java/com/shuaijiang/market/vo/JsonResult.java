package com.shuaijiang.market.vo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsonResult {
    private Integer code;
    private String msg;
}
