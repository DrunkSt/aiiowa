package com.punkgod.iowarent.util;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
public class PathUtil {
    private static String seperator=System.getProperty("file.separator");
    public static String getImgBasePath(){
        String os=System.getProperty("os.name");
        String basePath="";
        if(os.toLowerCase().startsWith("win")){
            basePath="D:/projectdev/image/";
        }else{
            basePath="/home/user/image/";
        }
        basePath=basePath.replace("/",seperator);
        return basePath;
    }

    public static String getHouseImagePath(long houseId){
        String imagePath="upload/item/house/"+houseId+"/";
        return imagePath.replace("/",seperator);
    }
}
