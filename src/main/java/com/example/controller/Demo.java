package com.example.controller;

import com.example.service.InformationSheetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Allen
 * @date 2018/11/9
 * @Maill wangtaog@mail.taiji.com.cn
 */

public class Demo {

    @Autowired
    private InformationSheetService informationSheetService;

    public void main(String[] args) {
        InformationSheetExample informationSheetExample = new InformationSheetExample();
        informationSheetExample.setDistinct(false);
        List<InformationSheet> list = informationSheetService.selectByExample(informationSheetExample);
        for (InformationSheet informationSheet: list) {

        }
    }
}
