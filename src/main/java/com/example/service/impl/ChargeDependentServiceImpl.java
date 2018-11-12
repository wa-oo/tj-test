package com.example.service.impl;

import com.example.mapper.ChargeDependentMapper;
import com.example.model.ChargeDependent;
import com.example.model.ChargeDependentExample;
import com.example.service.ChargeDependentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "ChargeDependentService")
public class ChargeDependentServiceImpl implements ChargeDependentService {

    @Resource
    private ChargeDependentMapper chargeDependentMapper;

    @Override
    public int countByExample(ChargeDependentExample example) {
        return chargeDependentMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ChargeDependentExample example) {
        return chargeDependentMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return chargeDependentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ChargeDependent record) {
        return chargeDependentMapper.insert(record);
    }

    @Override
    public int insertSelective(ChargeDependent record) {
        return chargeDependentMapper.insertSelective(record);
    }

    @Override
    public List<ChargeDependent> selectByExample(ChargeDependentExample example) {
        return chargeDependentMapper.selectByExample(example);
    }

    @Override
    public ChargeDependent selectByPrimaryKey(BigDecimal id) {
        return chargeDependentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ChargeDependent record, ChargeDependentExample example) {
        return chargeDependentMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ChargeDependent record, ChargeDependentExample example) {
        return chargeDependentMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ChargeDependent record) {
        return chargeDependentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ChargeDependent record) {
        return chargeDependentMapper.updateByPrimaryKey(record);
    }
}
