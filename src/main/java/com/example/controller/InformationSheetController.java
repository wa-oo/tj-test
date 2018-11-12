package com.example.controller;

import com.example.model.InformationSheet;
import com.example.model.InformationSheetExample;
import com.example.service.InformationSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
        InformationSheetExample informationSheet = new InformationSheetExample();
        informationSheet.setDistinct(false);
        List<InformationSheet> list  = informationSheetService.selectByExample(informationSheet);
        model.addAttribute("info",list);
        return "hello";
    }

}
