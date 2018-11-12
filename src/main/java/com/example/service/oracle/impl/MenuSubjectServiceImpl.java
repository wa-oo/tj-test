package com.example.service.oracle.impl;

import com.example.mapper.oracle.MenuSubjectMapper;
import com.example.model.oracle.MenuSubject;
import com.example.model.oracle.MenuSubjectExample;
import com.example.service.oracle.MenuSubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "MenuSubjectService")
public class MenuSubjectServiceImpl implements MenuSubjectService {
    
    @Resource
    private MenuSubjectMapper menuSubjectMapper;
    
    @Override
    public int countByExample(MenuSubjectExample example) {
        return menuSubjectMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MenuSubjectExample example) {
        return menuSubjectMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return menuSubjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MenuSubject record) {
        return menuSubjectMapper.insert(record);
    }

    @Override
    public int insertSelective(MenuSubject record) {
        return menuSubjectMapper.insertSelective(record);
    }

    @Override
    public List<MenuSubject> selectByExample(MenuSubjectExample example) {
        return menuSubjectMapper.selectByExample(example);
    }

    @Override
    public MenuSubject selectByPrimaryKey(String id) {
        return menuSubjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MenuSubject record, MenuSubjectExample example) {
        return menuSubjectMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MenuSubject record, MenuSubjectExample example) {
        return menuSubjectMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MenuSubject record) {
        return menuSubjectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MenuSubject record) {
        return menuSubjectMapper.updateByPrimaryKey(record);
    }
}
