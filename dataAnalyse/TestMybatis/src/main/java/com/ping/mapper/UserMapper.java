package com.ping.mapper;

import com.ping.bz.UserBz;
import com.ping.po.User;
import com.ping.po.UserEx;
import java.util.List;
public interface  UserMapper {
    public List<UserEx> queryUserZH (UserBz userBz) throws  Exception;
    public  int queryUserCount (User user) throws Exception;
    public List<UserEx>  queryUserByMoreIds(UserBz userBZ) throws  Exception;

}
