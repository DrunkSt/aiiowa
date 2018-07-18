package com.punkgod.iowarent.service;

import com.punkgod.iowarent.BaseTest;
import com.punkgod.iowarent.entity.PersonInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonInfoServiceTest extends BaseTest {
    @Autowired
    private PersonInfoService personInfoService;
    @Test
    public void testGetPersonInfoList(){
        List<PersonInfo> personInfoList=personInfoService.getPersonInfoList();
        assertEquals("张三",personInfoList.get(0).getUserName());
    }

}
