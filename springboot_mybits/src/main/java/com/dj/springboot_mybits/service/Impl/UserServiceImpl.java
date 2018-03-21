package com.dj.springboot_mybits.service.Impl;

import com.dj.springboot_mybits.mapper.UserMapper;
import com.dj.springboot_mybits.pojo.User;
import com.dj.springboot_mybits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList() {
        return userMapper.userList();
    }
}
