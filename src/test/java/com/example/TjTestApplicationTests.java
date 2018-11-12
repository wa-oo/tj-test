package com.example;

import com.example.model.InformationSheet;
import com.example.service.InformationSheetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TjTestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    InformationSheetService informationSheetService;

    @Autowired
    static InformationSheet informationSheet;



}
