package com.example.controller;

import com.example.model.InformationSheet;
import com.example.service.InformationSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
@Controller
public class InformationSheetController {

    @Autowired
    private InformationSheetService informationSheetService;

    @RequestMapping("/getData")
    public String getData(Model model){
        InformationSheet informationSheet = informationSheetService.selectByPrimaryKey(34);
        model.addAttribute("info",informationSheet);
        return "hello";
    }

}
