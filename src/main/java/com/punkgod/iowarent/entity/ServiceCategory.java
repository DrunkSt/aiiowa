package com.punkgod.iowarent.entity;

import java.util.Date;

/**
 * Created by ${张笑钦} on 2018/7/13/013
 */
public class ServiceCategory {

    private Long serviceCategoryId;//服务类别ID
    private String serviceCategoryName;//服务类别名称
    private String serviceCategoryDesc;//服务类别描述
    private String serviceCategoryImg;//服务类别图像
    private Integer priority;//服务类别优先级
    private Date createTime;//创建日期
    private Date lastEditTime;//最后修改日期
    private Integer serviceType;//服务需求类别 1,发布服务 2,寻求服务
    private ServiceCategory parent;//上级服务类别ID

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public Long getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(Long serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

    public String getServiceCategoryName() {
        return serviceCategoryName;
    }

    public void setServiceCategoryName(String serviceCategoryName) {
        this.serviceCategoryName = serviceCategoryName;
    }

    public String getServiceCategoryDesc() {
        return serviceCategoryDesc;
    }

    public void setServiceCategoryDesc(String serviceCategoryDesc) {
        this.serviceCategoryDesc = serviceCategoryDesc;
    }

    public String getServiceCategoryImg() {
        return serviceCategoryImg;
    }

    public void setServiceCategoryImg(String serviceCategoryImg) {
        this.serviceCategoryImg = serviceCategoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public ServiceCategory getParent() {
        return parent;
    }

    public void setParent(ServiceCategory parent) {
        this.parent = parent;
    }
}
