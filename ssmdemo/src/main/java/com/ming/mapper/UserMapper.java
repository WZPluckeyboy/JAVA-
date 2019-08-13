package com.ming.mapper;

import com.ming.po.User;
import java.util.List;

public interface UserMapper {

    public List<User> queryUserList() throws Exception;
     public boolean delect(int id) throws Exception;


    //根据ID查
    //根据名称查
    //删除
    //修改
    //插入

}
