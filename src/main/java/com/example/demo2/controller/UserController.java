package com.example.demo2.controller;
import com.alibaba.fastjson.JSONObject;
import com.example.demo2.service.UserImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/11/18
 * @Time:18:23
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserImgService userImgService;
    /* @RequestMapping(value = "/byEid", method = RequestMethod.POST)
     @ResponseBody
     public Result selectByEid(Integer Eid){
         Result result =new Result();
         try {
             result.setData(userImgService.selectByEid(Eid));
         }catch (Exception error){
             result.setCode(error.hashCode());
             result.setMsg(error.getMessage());
             return result;
         }
         return result;
     }*/
    @RequestMapping(value = "/getbyEid", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> selectByEid(Integer Eid) {
        Map<String, Object> map = new HashMap<>();
        List<String> imgs = userImgService.selectByEid(Eid);
        JSONObject object =null;
        List<Object> list = new ArrayList<>();
        for(String s : imgs) {
           // object = new JSONObject();
            //object.put("img", s);
            Map<String, Object> map1 = new HashMap<>();
            map1.put("img",s);
            //list.add(object);//重新放入集合
            list.add(map1);
        }
        System.out.println(imgs.isEmpty());
        if (imgs != null && !imgs.isEmpty()) {
            map.put("data", list);
            map.put("code", "200");
        } else {
            map.put("msg", "暂无数据");
        }
        return map;
    }
}