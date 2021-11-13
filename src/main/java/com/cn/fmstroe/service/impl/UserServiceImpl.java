package com.cn.fmstroe.service.impl;

import com.cn.fmstroe.bean.User;
import com.cn.fmstroe.dao.UserDao;
import com.cn.fmstroe.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User insertUser(User user) {
        int i = userDao.insertUser(user);
        if (i > 0) {
            return user;
        } else {
            return null;
        }
    }
}
