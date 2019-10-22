package com.wdx.day_72_springboot_01.service;

import com.wdx.day_72_springboot_01.entity.TUser;
import com.wdx.day_72_springboot_01.entity.User;

/**
 * Created by wdx on 2019/10/21 19:06
 */
public interface IUserService {
    public void add(TUser user);

    public TUser get(Integer id);
}
