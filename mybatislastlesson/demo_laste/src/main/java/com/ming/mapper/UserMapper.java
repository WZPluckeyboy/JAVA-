package com.ming.mapper;

import com.ming.po.User;

import java.util.List;

public interface UserMapper {

    public User queryUserById (int id) ;

    public void updateUserById(User user) ;
}
