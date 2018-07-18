package com.punkgod.iowarent.service.impl;

import com.punkgod.iowarent.dao.HousingServiceDao;
import com.punkgod.iowarent.dto.HousingServiceExecution;
import com.punkgod.iowarent.entity.HousingService;
import com.punkgod.iowarent.enums.HousingServiceStateEnum;
import com.punkgod.iowarent.service.HousingServiceService;
import com.punkgod.iowarent.util.ImageUtil;
import com.punkgod.iowarent.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.InputStream;
import java.util.Date;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
@Service
public class HousingServiceServiceImpl implements HousingServiceService {
@Autowired
private HousingServiceDao housingServiceDao;
    @Override
    @Transactional
    public HousingServiceExecution addHousingService(HousingService housingService, InputStream houseImgInputStream, String fileName){
        //空值判断
        if(housingService==null){
            return new HousingServiceExecution(HousingServiceStateEnum.NULL_SHOP);
        }
        try{
            //赋予初始值
            housingService.setEnableStatus(0);
            housingService.setCreateTime(new Date());
            housingService.setLastEditTime(new Date());
            //添加店铺信息
            int effectedNum=housingServiceDao.insertHousingService(housingService
            );
            if(effectedNum<=0){
                throw new RuntimeException("店铺创建失败");
            }else{
                if(houseImgInputStream !=null){
                    //存储图片
                    try{
                        addHouseImg(housingService, houseImgInputStream, fileName);
                    }catch (Exception e){
                        throw new RuntimeException("addHouseImg error"+e.getMessage());
                    }
                    //更新店铺图片地址
                    effectedNum=housingServiceDao.updateHousingService(housingService);
                    if(effectedNum<=0){
                        throw new RuntimeException("更新图片地址失败");
                    }
                }
            }
        }catch (Exception e){
            throw new RuntimeException("addHousingService error:"+e.getMessage());
        }
        return new HousingServiceExecution(HousingServiceStateEnum.CHECK,housingService);
    }

    private void addHouseImg(HousingService housingService, InputStream houseImgInputStream, String fileName){
        //获取house图片目录的相对值路径
        String dest=PathUtil.getHouseImagePath(housingService.getHouseId());
        String houseImgAddr=ImageUtil.generateThumbnail(houseImgInputStream,dest,fileName);
        housingService.setHouseImg(houseImgAddr);
    }
}
