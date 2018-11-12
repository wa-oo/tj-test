package com.example.service.oracle.impl;

import com.example.mapper.mysql.CommonProblemMapper;
import com.example.model.mysql.CommonProblem;
import com.example.model.mysql.CommonProblemExample;
import com.example.service.mysql.CommonProblemMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "CommonQuestionService")
public class CommonQuestionServiceImpl implements CommonProblemMapperService {
    
    @Resource
    private CommonProblemMapper commonProblemMapper;
    
    @Override
    public int countByExample(CommonProblemExample example) {
        return commonProblemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CommonProblemExample example) {
        return commonProblemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return commonProblemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CommonProblem record) {
        return commonProblemMapper.insert(record);
    }

    @Override
    public int insertSelective(CommonProblem record) {
        return commonProblemMapper.insertSelective(record);
    }

    @Override
    public List<CommonProblem> selectByExample(CommonProblemExample example) {
        return commonProblemMapper.selectByExample(example);
    }

    @Override
    public CommonProblem selectByPrimaryKey(Integer id) {
        return commonProblemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(CommonProblem record, CommonProblemExample example) {
        return commonProblemMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CommonProblem record, CommonProblemExample example) {
        return commonProblemMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CommonProblem record) {
        return commonProblemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CommonProblem record) {
        return commonProblemMapper.updateByPrimaryKey(record);
    }
}
