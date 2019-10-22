package com.wdx.day_72_springboot_01.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.wdx.day_72_springboot_01.entity.TUser;
import com.wdx.day_72_springboot_01.entity.User;
import com.wdx.day_72_springboot_01.pojo.ResultBean;
import com.wdx.day_72_springboot_01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * Created by wdx on 2019/10/21 11:54
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Value("${resouce.emailServer}")
    private String emailServer;
    @Autowired
    private IUserService userService;
    @RequestMapping("hello")
    public String hello(){
        System.out.println(emailServer);
        return "hello,spring boot!!!,hello,dubbo!!!";
    }

    @GetMapping("{id}")
    public TUser get(@PathVariable Integer id){
        System.out.println("id="+id);
        System.out.println("get....");
        TUser tUser = userService.get(id);
        return tUser;
    }
    @DeleteMapping("{id}")
    public String del(@PathVariable Integer id){
        System.out.println("id="+id);
        System.out.println("del....");
        return "ok";
    }
    @PostMapping("update")
    public String post(User user){
        System.out.println(user.getBirthday());
        return "ok";
    }
    @PostMapping("add")
    public ResultBean add(@Valid User user){
     /*   if(result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                String message = fieldError.getDefaultMessage();
                String field = fieldError.getField();
                System.out.println(field+":"+message);

            }
            return new ResultBean("400","请求的参数有误");
        }*/
        return new ResultBean("200","ok");
    }
}
