package com.punkgod.iowarent.dto;

import com.punkgod.iowarent.entity.HousingService;
import com.punkgod.iowarent.enums.HousingServiceStateEnum;

import java.util.List;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
public class HousingServiceExecution {
    //结果状态
    private int state;

    //状态标识
    private String stateInfo;

    //操作的houseservice
    private HousingService housingService;

    //houseservice列表
    private List<HousingService> housingServiceList;

    public HousingServiceExecution(){

    }
    //失败的构造器
    public HousingServiceExecution(HousingServiceStateEnum stateEnum){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
    }
    //成功的构造器
    public HousingServiceExecution(HousingServiceStateEnum stateEnum,HousingService housingService){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.housingService=housingService;
    }//成功的构造器
    public HousingServiceExecution(HousingServiceStateEnum stateEnum,List<HousingService> housingServiceList){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
        this.housingServiceList=housingServiceList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public HousingService getHousingService() {
        return housingService;
    }

    public void setHousingService(HousingService housingService) {
        this.housingService = housingService;
    }

    public List<HousingService> getHousingServiceList() {
        return housingServiceList;
    }

    public void setHousingServiceList(List<HousingService> housingServiceList) {
        this.housingServiceList = housingServiceList;
    }
}
