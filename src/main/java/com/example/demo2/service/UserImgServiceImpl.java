package com.example.demo2.service;
import com.example.demo2.mapper.UserImgMapper;
import com.example.demo2.model.UserImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
/**
 * @Description:
 * @Company:mamaway
 * @Author:smalling
 * @Data:2019/12/30
 * @Time:15:15
 */
@Service
public class UserImgServiceImpl implements UserImgService {
    @Autowired
    private UserImgMapper userImgMapper;
    @Override
    public List<String> selectByEid(Integer Eid) {
        List<String> urls = new ArrayList<>();
        List<UserImg> imgs = userImgMapper.selectByEid(Eid);
        if (imgs != null) {
            for (UserImg userImg : imgs) {
                if (userImg != null && StringUtils.hasLength(userImg.getImg())) {
                    urls.add(userImg.getImg());
                }
            }
        }
        System.out.println("urls为"+urls);
        return urls;

    }
}
