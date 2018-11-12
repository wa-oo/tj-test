package com.example.service.impl;

import com.example.mapper.DeptInfoMapper;
import com.example.model.DeptInfo;
import com.example.model.DeptInfoExample;
import com.example.service.DeptInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "DeptInfoService")
public class DeptInfoServiceImpl implements DeptInfoService {
    
    @Resource
    private DeptInfoMapper deptInfoMapper;
    
    @Override
    public int countByExample(DeptInfoExample example) {
        return deptInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DeptInfoExample example) {
        return deptInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return deptInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DeptInfo record) {
        return deptInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(DeptInfo record) {
        return deptInfoMapper.insertSelective(record);
    }

    @Override
    public List<DeptInfo> selectByExample(DeptInfoExample example) {
        return deptInfoMapper.selectByExample(example);
    }

    @Override
    public DeptInfo selectByPrimaryKey(BigDecimal id) {
        return deptInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(DeptInfo record, DeptInfoExample example) {
        return deptInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DeptInfo record, DeptInfoExample example) {
        return deptInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(DeptInfo record) {
        return deptInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DeptInfo record) {
        return deptInfoMapper.updateByPrimaryKey(record);
    }
}
