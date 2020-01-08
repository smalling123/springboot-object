package com.example.demo2.service;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang.StringUtils;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2020/1/8
 * @Time:15:21
 */
public class JavaList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
            list.add("1");
            list.add("2");
            list.add("3");
            System.out.println(list);
            System.out.println(list.toString());
        System.out.println(list.get(0));
        String json = JSONArray.toJSONString(list);//把list转换成json格式的String类型
        System.out.println("json格式的String类型" + json);
        System.out.println(StringUtils.strip(list.toString(),"[]"));//去掉两头的中括号
    }


}
