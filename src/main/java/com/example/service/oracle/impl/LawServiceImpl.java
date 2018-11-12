package com.example.service.oracle.impl;

import com.example.mapper.oracle.LawMapper;
import com.example.model.oracle.Law;
import com.example.model.oracle.LawExample;
import com.example.service.oracle.LawService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "LawService")
public class LawServiceImpl implements LawService {
    
    @Resource
    private LawMapper lawMapper;

    @Override
    public int countByExample(LawExample example) {
        return lawMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LawExample example) {
        return lawMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return lawMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Law record) {
        return lawMapper.insert(record);
    }

    @Override
    public int insertSelective(Law record) {
        return lawMapper.insertSelective(record);
    }

    @Override
    public List<Law> selectByExample(LawExample example) {
        return lawMapper.selectByExample(example);
    }

    @Override
    public Law selectByPrimaryKey(BigDecimal id) {
        return lawMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Law record, LawExample example) {
        return lawMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Law record, LawExample example) {
        return lawMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Law record) {
        return lawMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Law record) {
        return lawMapper.updateByPrimaryKey(record);
    }
}
