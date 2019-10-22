package com.wdx.day_72_springboot_01.service.impl;

import com.wdx.day_72_springboot_01.entity.TUser;
import com.wdx.day_72_springboot_01.entity.User;
import com.wdx.day_72_springboot_01.mapper.TUserMapper;
import com.wdx.day_72_springboot_01.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wdx on 2019/10/21 19:08
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapper tUserMapper;
    @Override
    public void add(TUser user) {
        tUserMapper.insertSelective(user);
    }

    @Override
    public TUser get(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }
}
