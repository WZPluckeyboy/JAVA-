package com.ming.service;

import com.ming.po.User;

import java.util.List;

public interface UserService {

    public List<User> queryUserService() throws Exception;
     public boolean delect(int id) throws Exception;

}
