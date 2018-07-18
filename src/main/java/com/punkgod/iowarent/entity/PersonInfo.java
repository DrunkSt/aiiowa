package com.punkgod.iowarent.entity;

import java.util.Date;

/**
 * Created by ${张笑钦} on 2018/7/13/013
 */
public class PersonInfo {

    private Long userId;//用户ID
    private String userName;//用户名
    private Date birthday;//用户出生日期
    private String gender;//用户性别
    private String phone;//用户电话号码
    private String email;//用户邮箱
    private String profileImg;//用户头像
    private Date createTime;//创建日期
    private Date lastEditTime;//最后修改日期
    private Integer enableStatus;//使用状态

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    private Integer userType;//用户类型

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
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

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getAllInfo(){
        String info=this.userId.toString()+" "+this.userName.toString()+" "+this.email.toString();
        return info;
    }
}
