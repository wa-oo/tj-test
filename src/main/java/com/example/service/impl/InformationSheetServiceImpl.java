package com.example.service.impl;

import com.example.mapper.informationSheetMapper;
import com.example.model.informationSheet;
import com.example.model.informationSheetExample;
import com.example.service.InformationSheetService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public class InformationSheetServiceImpl implements InformationSheetService {

    @Autowired
    private informationSheetMapper informationSheetMapper;

    @Override
    public int countByExample(informationSheetExample example) {
        return informationSheetMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(informationSheetExample example) {
        return informationSheetMapper.deleteByExample(example);
    }

    @Override
    public int insert(informationSheet record) {
        return informationSheetMapper.insert(record);
    }

    @Override
    public int insertSelective(informationSheet record) {
        return informationSheetMapper.insertSelective(record);
    }

    @Override
    public List<informationSheet> selectByExample(informationSheetExample example) {
        return informationSheetMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(informationSheet record, informationSheetExample example) {
        return informationSheetMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(informationSheet record, informationSheetExample example) {
        return informationSheetMapper.updateByExample(record, example);
    }
}
