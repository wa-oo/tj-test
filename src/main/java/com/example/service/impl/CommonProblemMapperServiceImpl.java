package com.example.service.impl;

import com.example.mapper.commonProblemMapper;
import com.example.model.commonProblem;
import com.example.model.commonProblemExample;
import com.example.service.CommonProblemMapperService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public class CommonProblemMapperServiceImpl implements CommonProblemMapperService {

    @Autowired
    private commonProblemMapper commonProblemMapper;

    @Override
    public int countByExample(commonProblemExample example) {
        return commonProblemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(commonProblemExample example) {
        return commonProblemMapper.deleteByExample(example);
    }

    @Override
    public int insert(commonProblem record) {
        return commonProblemMapper.insert(record);
    }

    @Override
    public int insertSelective(commonProblem record) {
        return commonProblemMapper.insertSelective(record);
    }

    @Override
    public List<commonProblem> selectByExample(commonProblemExample example) {
        return commonProblemMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(commonProblem record, commonProblemExample example) {
        return commonProblemMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(commonProblem record, commonProblemExample example) {
        return commonProblemMapper.updateByExample(record, example);
    }
}
