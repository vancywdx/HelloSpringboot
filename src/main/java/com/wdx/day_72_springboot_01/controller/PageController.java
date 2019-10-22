package com.wdx.day_72_springboot_01.controller;

import com.wdx.day_72_springboot_01.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wdx on 2019/10/21 19:49
 */
@Controller
@RequestMapping("page")
@Slf4j
public class PageController {
    //private Logger logger = LoggerFactory.getLogger(PageController.class);
    @RequestMapping("hello")
    public String get(ModelMap map){
       // int i = 1/0;

        log.debug("debug....");
        log.info("info....");
        log.warn("warn....");
        log.error("error....");
        //使用占位符拼接
        log.info("你好[{}],你是第[{}]个登录网址的用户","wdx","1");
        map.put("username","java1907");

        map.put("age",12);


        List<User> list = new ArrayList<>();
        list.add(new User(1,"wdx",new Date()));
        list.add(new User(2,"lex",new Date()));
        map.put("list",list);
        map.put("now",new Date());
        return "hello";


    }
}
