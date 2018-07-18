package com.punkgod.iowarent.entity;

import java.util.Date;

/**
 * Created by ${张笑钦} on 2018/7/13/013
 */
public class LocalAuth {
    private Long localAuthId;//本地账号ID
    private Long userId;//用户ID
    private String userName;//用户名
    private String password;//用户密码
    private Date createTime;//创建时间
    private Date lastEditTime;//最后修改时间
    private PersonInfo personInfo;//用户信息类引用

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
