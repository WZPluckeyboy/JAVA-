package com.bittech.dao;

import com.bittech.po.User;
import com.bittech.tools.DbManager;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserDAO {

    public List<User> queryUserDAO(){
        List<User> userList = new ArrayList<User>();
        try {
            String strSql = "select * from users";
            ResultSet rs = new DbManager ().queryExecute(strSql);
            while(rs.next()){
                User user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setUserAddr(rs.getString("userAddr"));
                userList.add(user);
            }
            return userList;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return userList;
    }
}
