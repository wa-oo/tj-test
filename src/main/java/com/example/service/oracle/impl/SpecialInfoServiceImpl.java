package com.example.service.oracle.impl;

import com.example.mapper.oracle.SpecialInfoMapper;
import com.example.model.oracle.SpecialInfo;
import com.example.model.oracle.SpecialInfoExample;
import com.example.service.oracle.SpecialInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "SpecialInfoService")
public class SpecialInfoServiceImpl implements SpecialInfoService {
    
    @Resource
    private SpecialInfoMapper specialInfoMapper;
    
    
    @Override
    public int countByExample(SpecialInfoExample example) {
        return specialInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SpecialInfoExample example) {
        return specialInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String flowId) {
        return specialInfoMapper.deleteByPrimaryKey(flowId);
    }

    @Override
    public int insert(SpecialInfo record) {
        return specialInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(SpecialInfo record) {
        return specialInfoMapper.insertSelective(record);
    }

    @Override
    public List<SpecialInfo> selectByExample(SpecialInfoExample example) {
        return specialInfoMapper.selectByExample(example);
    }

    @Override
    public SpecialInfo selectByPrimaryKey(String flowId) {
        return specialInfoMapper.selectByPrimaryKey(flowId);
    }

    @Override
    public int updateByExampleSelective(SpecialInfo record, SpecialInfoExample example) {
        return specialInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SpecialInfo record, SpecialInfoExample example) {
        return specialInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SpecialInfo record) {
        return specialInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SpecialInfo record) {
        return specialInfoMapper.updateByPrimaryKey(record);
    }
}
