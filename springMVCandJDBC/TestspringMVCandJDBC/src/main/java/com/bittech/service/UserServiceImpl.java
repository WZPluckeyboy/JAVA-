package com.bittech.service;

import com.bittech.dao.UserDAO;
import com.bittech.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> queryUserService() throws Exception {
        return userDAO.queryUserDAO();
    }
}
