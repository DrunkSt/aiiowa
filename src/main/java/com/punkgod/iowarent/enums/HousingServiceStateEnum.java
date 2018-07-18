package com.punkgod.iowarent.enums;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
public enum HousingServiceStateEnum {
    CHECK(0,"审核中"),
    OFFLINE(-1,"非法店铺"),
    SUCCESS(1,"操作成功"),
    PASS(2,"通过认证"),
    INNER_ERROR(-1001,"内部系统错误"),
    NULL_SHOPID(-1002,"ShopId为空"),
    NULL_SHOP(-1003,"Shop为空");
    private int state;
    private String stateInfo;
    private HousingServiceStateEnum(int state, String stateInfo){
        this.state=state;
        this.stateInfo=stateInfo;
    }
    /*依据传入的State返回相应的enum值*/
    public static HousingServiceStateEnum stateOf(int state){
        for(HousingServiceStateEnum stateEnum:values()){
            if(stateEnum.getState()==state){
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
