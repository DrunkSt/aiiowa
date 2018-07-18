package com.punkgod.iowarent.dao;

import com.punkgod.iowarent.BaseTest;
import com.punkgod.iowarent.entity.PersonInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonInfoDaoTest extends BaseTest {
    @Autowired
    private PersonInfoDao PersonInfoDao;

    @Test
    public void testQueryPersonInfo(){
        List<PersonInfo> personInfoList=PersonInfoDao.queryPersonInfo();
        assertEquals(2,personInfoList.size());
    }
}
