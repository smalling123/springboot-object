package com.example.demo2.model;

import lombok.Data;

import java.sql.Date;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/30
 * @Time:14:44
 */

@Data
public class UserImg {
    private Integer id;
    private Integer userID;
    private Integer eid;
    private String img;
    private String type;
    private String status;
    private Date createTime;


}
