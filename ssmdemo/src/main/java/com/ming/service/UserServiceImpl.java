package com.ming.service;

import com.ming.mapper.UserMapper;
import com.ming.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> queryUserService() throws Exception {
        return userMapper.queryUserList();
    }

    @Override
    public boolean delect(int id) {
        return false;
    }


}
