package com.punkgod.iowarent.service;

import com.punkgod.iowarent.dto.HousingServiceExecution;
import com.punkgod.iowarent.entity.HousingService;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.InputStream;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
public interface HousingServiceService {
    HousingServiceExecution addHousingService(HousingService housingService, InputStream houseImgInputStream, String fileName);
}
