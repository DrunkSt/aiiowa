package com.punkgod.iowarent.service.impl;

import com.punkgod.iowarent.dao.PersonInfoDao;
import com.punkgod.iowarent.entity.PersonInfo;
import com.punkgod.iowarent.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonInfoServiceImpl implements PersonInfoService {
    @Autowired
    private PersonInfoDao personInfoDao;
    @Override
    public List<PersonInfo> getPersonInfoList(){
        return personInfoDao.queryPersonInfo();
    }
}
