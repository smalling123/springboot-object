package com.example.demo2.model;

import lombok.Data;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/11/18
 * @Time:17:35
 */
@Data
public class UserInfo {
    private Integer ID;
    private String UserCode;
    private String UserName;
    private String UserPwd;
    private Integer Sex;
    private String Birthday;
    private String Phone;
    private String UserLevel;
    private Integer IsDelete;
    private String OpenId;
}
