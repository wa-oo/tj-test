package com.example.service.impl;

import com.example.mapper.ApplicationMaterialsMapper;
import com.example.model.ApplicationMaterials;
import com.example.model.ApplicationMaterialsExample;
import com.example.service.ApplicationMaterialsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
@Service(value = "ApplicationMaterialsService")
public class ApplicationMaterialsServiceImpl implements ApplicationMaterialsService {

    @Resource
    private ApplicationMaterialsMapper applicationMaterialsMapper;

    @Override
    public int countByExample(ApplicationMaterialsExample example) {
        return applicationMaterialsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ApplicationMaterialsExample example) {
        return applicationMaterialsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return applicationMaterialsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ApplicationMaterials record) {
        return applicationMaterialsMapper.insert(record);
    }

    @Override
    public int insertSelective(ApplicationMaterials record) {
        return applicationMaterialsMapper.insertSelective(record);
    }

    @Override
    public List<ApplicationMaterials> selectByExample(ApplicationMaterialsExample example) {
        return applicationMaterialsMapper.selectByExample(example);
    }

    @Override
    public ApplicationMaterials selectByPrimaryKey(Integer id) {
        return applicationMaterialsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ApplicationMaterials record, ApplicationMaterialsExample example) {
        return applicationMaterialsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ApplicationMaterials record, ApplicationMaterialsExample example) {
        return applicationMaterialsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ApplicationMaterials record) {
        return applicationMaterialsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApplicationMaterials record) {
        return applicationMaterialsMapper.updateByPrimaryKey(record);
    }
}
