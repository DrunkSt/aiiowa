package com.punkgod.iowarent.service;

import com.punkgod.iowarent.BaseTest;
import com.punkgod.iowarent.dto.HousingServiceExecution;
import com.punkgod.iowarent.entity.HousingService;
import com.punkgod.iowarent.entity.PersonInfo;
import com.punkgod.iowarent.entity.ServiceCategory;
import com.punkgod.iowarent.enums.HousingServiceStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import static org.junit.Assert.assertEquals;

import java.util.Date;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
public class HousingServiceServiceTest extends BaseTest {
    @Autowired
    private HousingServiceService housingServiceService;

    @Test
    public void testAddHousingService(){
        HousingService housingService=new HousingService();
        PersonInfo owner=new PersonInfo();
        ServiceCategory serviceCategory=new ServiceCategory();

        owner.setUserId(1L);
        serviceCategory.setServiceCategoryId(1L);
        housingService.setOwner(owner);
        housingService.setServiceCategory(serviceCategory);
        housingService.setHouseName("测试的信息1");
        housingService.setHouseDesc("测试的信息2");
        housingService.setHouseAddr("test");
        housingService.setHouseAddrNum("test");
        housingService.setCreateTime(new Date());
        housingService.setEnableStatus(HousingServiceStateEnum.CHECK.getState());
    }

}
