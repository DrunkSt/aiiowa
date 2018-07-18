package com.punkgod.iowarent.dao;

import com.punkgod.iowarent.BaseTest;
import com.punkgod.iowarent.entity.HousingService;
import com.punkgod.iowarent.entity.PersonInfo;
import com.punkgod.iowarent.entity.ServiceCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by ${张笑钦} on 2018/7/16/016
 */
public class HousingServiceDaoTest extends BaseTest {
    @Autowired
    private HousingServiceDao housingServiceDao;
    @Test
    @Ignore
    public void testInsertHousingService(){
        HousingService housingService=new HousingService();
        PersonInfo owner=new PersonInfo();
        ServiceCategory serviceCategory=new ServiceCategory();

        owner.setUserId(1L);
        serviceCategory.setServiceCategoryId(1L);
        housingService.setOwner(owner);
        housingService.setServiceCategory(serviceCategory);
        housingService.setHouseName("测试的信息");
        housingService.setHouseDesc("测试的信息");
        housingService.setHouseAddr("test");
        housingService.setHouseAddrNum("test");
        housingService.setCreateTime(new Date());
        int effectedNum=housingServiceDao.insertHousingService(housingService);
        assertEquals(1,effectedNum);
    }

    @Test
    public void testUpdateHousingService(){
        HousingService housingService=new HousingService();
        housingService.setHouseId(1L);
        housingService.setHouseDesc("测试描述");
        housingService.setHouseAddr("测试地址");
        housingService.setLastEditTime(new Date());
        int effectedNum=housingServiceDao.updateHousingService(housingService);
        assertEquals(1,effectedNum);
    }
}
