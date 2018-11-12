package com.example.service.impl;

import com.example.mapper.ProcessingProcessMapper;
import com.example.model.ProcessingProcess;
import com.example.model.ProcessingProcessExample;
import com.example.service.ProcessingProcessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
@Service(value = "ProcessingProcessService")
public class ProcessingProcessServiceImpl implements ProcessingProcessService {

    @Resource
    private ProcessingProcessMapper processingProcessMapper;

    @Override
    public int countByExample(ProcessingProcessExample example) {
        return processingProcessMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ProcessingProcessExample example) {
        return processingProcessMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return processingProcessMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ProcessingProcess record) {
        return processingProcessMapper.insert(record);
    }

    @Override
    public int insertSelective(ProcessingProcess record) {
        return processingProcessMapper.insertSelective(record);
    }

    @Override
    public List<ProcessingProcess> selectByExample(ProcessingProcessExample example) {
        return processingProcessMapper.selectByExample(example);
    }

    @Override
    public ProcessingProcess selectByPrimaryKey(Integer id) {
        return processingProcessMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(ProcessingProcess record, ProcessingProcessExample example) {
        return processingProcessMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ProcessingProcess record, ProcessingProcessExample example) {
        return processingProcessMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ProcessingProcess record) {
        return processingProcessMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ProcessingProcess record) {
        return processingProcessMapper.updateByPrimaryKey(record);
    }
}
