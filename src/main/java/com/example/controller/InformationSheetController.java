package com.example.controller;

import com.example.model.informationSheet;
import com.example.model.informationSheetExample;
import com.example.service.impl.InformationSheetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public class InformationSheetController {

    @Autowired
    static
    InformationSheetServiceImpl informationSheetService;

    public static void main(String[] args) {
        informationSheet informationSheet = new informationSheet();
        informationSheetExample informationSheetExample = new informationSheetExample();
        informationSheet.setId(33);
        informationSheetExample.createCriteria();
        System.out.println(informationSheetService.selectByExample(informationSheetExample));
    }
}
