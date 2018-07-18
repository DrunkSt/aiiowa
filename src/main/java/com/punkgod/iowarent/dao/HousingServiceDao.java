package com.punkgod.iowarent.dao;

import com.punkgod.iowarent.entity.HousingService;

/**
 * Created by ${张笑钦} on 2018/7/16/016
 */
public interface HousingServiceDao {
/*
* 新增住房信息
* @param HousingService
* @return*/
int insertHousingService(HousingService housingService);
/*
* 更新租房信息*/
int updateHousingService(HousingService housingService);
}
