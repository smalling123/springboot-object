package com.example.demo2.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2020/1/8
 * @Time:10:55
 */
public class JavaMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "ab");
        map.put("4", "ab");
        map.put("4", "ab");// 和上面相同 ， 会自己筛选
        System.out.println(map.size());
        Set<Map.Entry<String, String>> entries =map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
            //entry.getKey() ;entry.getValue(); entry.setValue();
            //map.entrySet()  返回此映射中包含的映射关系的 Set视图。
            System.out.println("key= " + entry.getKey() + " and value= "
                    + entry.getValue());
        }

    }
}