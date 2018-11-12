package com.example.service.impl;

import com.example.mapper.MenuInformationMapper;
import com.example.model.MenuInformation;
import com.example.model.MenuInformationExample;
import com.example.service.MenuInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "MenuInformationService")
public class MenuInformationServiceImpl implements MenuInformationService {
    
    @Resource
    private MenuInformationMapper menuInformationMapper;
    
    @Override
    public int countByExample(MenuInformationExample example) {
        return menuInformationMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MenuInformationExample example) {
        return menuInformationMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String matterId) {
        return menuInformationMapper.deleteByPrimaryKey(matterId);
    }

    @Override
    public int insert(MenuInformation record) {
        return menuInformationMapper.insert(record);
    }

    @Override
    public int insertSelective(MenuInformation record) {
        return menuInformationMapper.insertSelective(record);
    }

    @Override
    public List<MenuInformation> selectByExample(MenuInformationExample example) {
        return menuInformationMapper.selectByExample(example);
    }

    @Override
    public MenuInformation selectByPrimaryKey(String matterId) {
        return menuInformationMapper.selectByPrimaryKey(matterId);
    }

    @Override
    public int updateByExampleSelective(MenuInformation record, MenuInformationExample example) {
        return menuInformationMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MenuInformation record, MenuInformationExample example) {
        return menuInformationMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MenuInformation record) {
        return menuInformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MenuInformation record) {
        return menuInformationMapper.updateByPrimaryKey(record);
    }
}
