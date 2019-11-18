package com.hlp.controller;

import com.hlp.model.MY_MENUS;
import com.hlp.model.SY_MENUS;
import com.hlp.services.MY_MENUSServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MY_MENUSController {
    @Autowired
    private MY_MENUSServices my_menusServices;
    @RequestMapping("selectSymenus")
    public List<SY_MENUS> selectSymenus(){
        //System.outgggggggggfffffffffffffffggggg.println("lala");
        System.out.println("lalsdfghjafsa");
        System.out.println("lasdtyuisertyusdrtyla");
        List<SY_MENUS> list=my_menusServices.selectSymenus();
        return null;

    }
}
