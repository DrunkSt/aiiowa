package com.punkgod.iowarent.web.housingserviceadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ${张笑钦} on 2018/7/17/017
 */
@Controller
@RequestMapping(value = "houseadmin",method = {RequestMethod.GET})
public class HousingServiceAdminController {
    @RequestMapping(value = "/houseoperation")
    public String houseOperation(){
        return "HousingService/HousingServiceOperation";
    }
}
