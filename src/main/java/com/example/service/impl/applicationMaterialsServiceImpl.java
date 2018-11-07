package com.example.service.impl;

import com.example.mapper.applicationMaterialsMapper;
import com.example.model.applicationMaterials;
import com.example.model.applicationMaterialsExample;
import com.example.service.applicationMaterialsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/6
 */
public class applicationMaterialsServiceImpl implements applicationMaterialsService {

    @Autowired
    applicationMaterialsMapper applicationMaterialsMapper;

    @Override
    public int countByExample(applicationMaterialsExample example) {
        return applicationMaterialsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(applicationMaterialsExample example) {
        return applicationMaterialsMapper.deleteByExample(example);
    }

    @Override
    public int insert(applicationMaterials record) {
        return applicationMaterialsMapper.insert(record);
    }

    @Override
    public int insertSelective(applicationMaterials record) {
        return applicationMaterialsMapper.insertSelective(record);
    }

    @Override
    public List<applicationMaterials> selectByExample(applicationMaterialsExample example) {
        return applicationMaterialsMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(applicationMaterials record, applicationMaterialsExample example) {
        return applicationMaterialsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(applicationMaterials record, applicationMaterialsExample example) {
        return applicationMaterialsMapper.updateByExample(record, example);
    }
}
