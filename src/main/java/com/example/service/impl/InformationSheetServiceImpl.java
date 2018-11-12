package com.example.service.impl;

import com.example.mapper.InformationSheetMapper;
import com.example.model.InformationSheet;
import com.example.model.InformationSheetExample;
import com.example.service.InformationSheetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
@Service(value = "InformationSheetService")
public class InformationSheetServiceImpl implements InformationSheetService {

    @Resource
    private InformationSheetMapper informationSheetMapper;

    @Override
    public int countByExample(InformationSheetExample example) {
        return informationSheetMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(InformationSheetExample example) {
        return informationSheetMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return informationSheetMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(InformationSheet record) {
        return informationSheetMapper.insert(record);
    }

    @Override
    public int insertSelective(InformationSheet record) {
        return informationSheetMapper.insertSelective(record);
    }

    @Override
    public List<InformationSheet> selectByExample(InformationSheetExample example) {
        return informationSheetMapper.selectByExample(example);
    }

    @Override
    public InformationSheet selectByPrimaryKey(Integer id) {
        return informationSheetMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(InformationSheet record, InformationSheetExample example) {
        return informationSheetMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(InformationSheet record, InformationSheetExample example) {
        return informationSheetMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(InformationSheet record) {
        return informationSheetMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(InformationSheet record) {
        return informationSheetMapper.updateByPrimaryKey(record);
    }
}
