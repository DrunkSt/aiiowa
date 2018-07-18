package com.punkgod.iowarent.entity;

import java.util.Date;

/**
 * Created by ${张笑钦} on 2018/7/13/013
 */
public class HousingService {
    private Long ownerId;//服务持有者ID
    private Long serviceCategoryId;//服务类别ID
    private Long houseId;//住房服务ID
    private String houseName;//住房服务名称
    private String houseDesc;//住房服务描述
    private String houseAddr;//住房地址
    private String houseAddrNum;//住房门牌号
    private String houseImg;//住房图片
    private Integer houseBedNum;//住房卧室数量
    private Double houseBathNum;//住房厕所数量
    private Integer housePersonNum;//住房所需人数
    private String housePrice;//住房价格
    private Integer houseFloor;//住房楼层数
    private Integer houseParking;//住房停车状况 1，免费车位（室内）2，免费车位（室外）3，付费车位
    private Date houseAvailableDate;//住房可用日期
    private Integer houseType;//住房类型：1, House 2, Apartment
    private Date createTime;//创建日期
    private Date lastEditTime;//最后编辑日期
    private Integer enableStatus;//住房状态

    private PersonInfo owner;
    private ServiceCategory serviceCategory;

    public PersonInfo getOwner() {
        return owner;
    }

    public void setOwner(PersonInfo owner) {
        this.owner = owner;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getServiceCategoryId() {
        return serviceCategoryId;
    }

    public void setServiceCategoryId(Long serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public String getHouseAddr() {
        return houseAddr;
    }

    public void setHouseAddr(String houseAddr) {
        this.houseAddr = houseAddr;
    }

    public String getHouseAddrNum() {
        return houseAddrNum;
    }

    public void setHouseAddrNum(String houseAddrNum) {
        this.houseAddrNum = houseAddrNum;
    }

    public String getHouseImg() {
        return houseImg;
    }

    public void setHouseImg(String houseImg) {
        this.houseImg = houseImg;
    }

    public Integer getHouseBedNum() {
        return houseBedNum;
    }

    public void setHouseBedNum(Integer houseBedNum) {
        this.houseBedNum = houseBedNum;
    }

    public Double getHouseBathNum() {
        return houseBathNum;
    }

    public void setHouseBathNum(Double houseBathNum) {
        this.houseBathNum = houseBathNum;
    }

    public Integer getHousePersonNum() {
        return housePersonNum;
    }

    public void setHousePersonNum(Integer housePersonNum) {
        this.housePersonNum = housePersonNum;
    }

    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice;
    }

    public Date getHouseAvailableDate() {
        return houseAvailableDate;
    }

    public void setHouseAvailableDate(Date houseAvailableDate) {
        this.houseAvailableDate = houseAvailableDate;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public Integer getHouseParking() {
        return houseParking;
    }

    public void setHouseParking(Integer houseParking) {
        this.houseParking = houseParking;
    }

    public Integer getHouseFloor() {
        return houseFloor;
    }

    public void setHouseFloor(Integer houseFloor) {
        this.houseFloor = houseFloor;
    }


}
