package com.punkgod.iowarent.dao;

import com.punkgod.iowarent.entity.PersonInfo;

import java.util.List;

public interface PersonInfoDao {
    /*
    * 列出区域列表
    * @return areaList
    * */
    List<PersonInfo> queryPersonInfo();
}
