package com.example.service.impl;

import com.example.mapper.processingProcessMapper;
import com.example.model.processingProcess;
import com.example.model.processingProcessExample;
import com.example.service.ProcessingProcessService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public class ProcessingProcessServiceImpl implements ProcessingProcessService {

    @Autowired
    private processingProcessMapper processingProcessMapper;

    @Override
    public int countByExample(processingProcessExample example) {
        return processingProcessMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(processingProcessExample example) {
        return processingProcessMapper.deleteByExample(example);
    }

    @Override
    public int insert(processingProcess record) {
        return processingProcessMapper.insert(record);
    }

    @Override
    public int insertSelective(processingProcess record) {
        return processingProcessMapper.insertSelective(record);
    }

    @Override
    public List<processingProcess> selectByExample(processingProcessExample example) {
        return processingProcessMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(processingProcess record, processingProcessExample example) {
        return processingProcessMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(processingProcess record, processingProcessExample example) {
        return processingProcessMapper.updateByExample(record, example);
    }
}
