package com.example.controller;

import com.example.model.InformationSheet;
import com.example.model.InformationSheetExample;
import com.example.service.InformationSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Allen
 * @date 2018/11/9
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Controller
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
