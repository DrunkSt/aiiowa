package com.punkgod.iowarent.entity;

import java.util.Date;

/**
 * Created by ${张笑钦} on 2018/7/13/013
 */
public class WechatAuth {
    private Long wechatAuthId;//微信验证Id
    private Long userId;//本地用户Id
    private String openId;//openId
    private Date createTime;//创建时间
    private PersonInfo personInfo;//用户类引用

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
