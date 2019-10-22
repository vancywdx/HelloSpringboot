package com.wdx.day_72_springboot_01.config;

import com.wdx.day_72_springboot_01.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wdx on 2019/10/21 17:59
 */
@Configuration
public class WebConfig {
    @Autowired
    private MyFilter myFilter;
    @Bean
     public FilterRegistrationBean init(){
         FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
         filterRegistrationBean.setFilter(myFilter);
         filterRegistrationBean.setName("MyFilter");
         filterRegistrationBean.addUrlPatterns("/*");
         return filterRegistrationBean;
     }
}
