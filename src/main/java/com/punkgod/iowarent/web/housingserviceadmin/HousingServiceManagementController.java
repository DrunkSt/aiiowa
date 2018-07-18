package com.punkgod.iowarent.web.housingserviceadmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.punkgod.iowarent.dto.HousingServiceExecution;
import com.punkgod.iowarent.entity.HousingService;
import com.punkgod.iowarent.entity.PersonInfo;
import com.punkgod.iowarent.enums.HousingServiceStateEnum;
import com.punkgod.iowarent.exceptions.HousingServiceOperationException;
import com.punkgod.iowarent.service.HousingServiceService;
import com.punkgod.iowarent.util.HttpServletRequestUtil;
import com.punkgod.iowarent.util.ImageUtil;
import com.punkgod.iowarent.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
@Controller
@RequestMapping("/houseadmin")
public class HousingServiceManagementController {
    @Autowired
    private HousingServiceService housingServiceService;
    @RequestMapping(value="/registerhouse",method=RequestMethod.POST)
    @ResponseBody
    private Map<String,Object> registerHousingService(HttpServletRequest request){
        Map<String,Object> modelMap=new HashMap<>();
        //1.接受并转化相应的参数，包括住房信息，图片信息
        String housingserviceStr=HttpServletRequestUtil.getString(request,"housingserviceStr");
        ObjectMapper mapper=new ObjectMapper();
        HousingService housingService=null;
        try{
            housingService=mapper.readValue(housingserviceStr,HousingService.class);
        }catch (Exception e){
            modelMap.put("success",false);
            modelMap.put("errMsg",e.getMessage());
            return modelMap;
        }
        CommonsMultipartFile houseImg=null;
        CommonsMultipartResolver commonsMultipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        if(commonsMultipartResolver.isMultipart(request)){
            MultipartHttpServletRequest multipartHttpServletRequest=(MultipartHttpServletRequest) request;
            houseImg=(CommonsMultipartFile) multipartHttpServletRequest.getFile("houseImg");
        }else{
            modelMap.put("success",false);
            modelMap.put("errMsg","上传图片不能为空");
            return modelMap;
        }
        //2.注册住房
        if(housingService!=null&&houseImg!=null){
            //session to do
            PersonInfo owner=new PersonInfo();
            owner.setUserId(1L);
            housingService.setOwner(owner);
            File houseImgFile=new File(PathUtil.getImgBasePath()+ImageUtil.getRandomFileName());
            try{
                houseImgFile.createNewFile();
            }catch (IOException e){
                modelMap.put("success",false);
                modelMap.put("errMsg",e.getMessage());
                return modelMap;
            }
//            try {
//                inputStreamToFile(houseImg.getInputStream(),houseImgFile);
//            }catch (IOException e){
//                modelMap.put("success",false);
//                modelMap.put("errMsg",e.getMessage());
//                return modelMap;
//            }
            HousingServiceExecution se= null;
            try {
                se = housingServiceService.addHousingService(housingService,houseImg.getInputStream(),houseImg.getOriginalFilename());
                if(se.getState()==HousingServiceStateEnum.CHECK.getState()){
                    modelMap.put("success",true);
                }else{
                    modelMap.put("success",false);
                    modelMap.put("errMsg",se.getStateInfo());
                }
            }catch (HousingServiceOperationException e){
                modelMap.put("success",false);
                modelMap.put("errMsg",e.getMessage());
            }
            catch (IOException e) {
                modelMap.put("success",false);
                modelMap.put("errMsg",e.getMessage());
            }
            return modelMap;
        }else{
            modelMap.put("success",false);
            modelMap.put("errMsg","请输入店铺信息");
            return modelMap;
        }
        //3.返回结果
    }
//    private static void inputStreamToFile(InputStream ins, File file){
//        FileOutputStream os=null;
//        try{
//            os=new FileOutputStream(file);
//            int bytesRead=0;
//            byte[] buffer=new byte[1024];
//            while ((bytesRead=ins.read(buffer))!=-1){
//                os.write(buffer,0,bytesRead);
//            }
//        }catch (Exception e){
//            throw new RuntimeException("调用inputStreamToFile产生异常"+e.getMessage());
//        }finally {
//            try {
//                if(os!=null){
//                    os.close();
//                }
//                if(ins!=null){
//                    ins.close();
//                }
//            }catch (IOException e){
//                throw new RuntimeException("inputStreamToFile关闭io产生异常"+e.getMessage());
//            }
//        }
//    }
}
