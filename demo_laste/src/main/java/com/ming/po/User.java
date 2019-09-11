package com.ming.po;

import java.io.Serializable;
import java.util.Date;

/**
 *  mybatis的二级缓存存储介质不一定是内存，所以需要实现序列化接口
 */
public class User implements Serializable {

    private int userId;

    private String userName;

    private Date birthday;

    private String sex;

    private String userAddr;

    public User(){

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", userAddr='" + userAddr + '\'' +
                '}';
    }
}
