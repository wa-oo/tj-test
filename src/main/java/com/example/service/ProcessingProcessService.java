package com.example.service;

import com.example.model.ProcessingProcess;
import com.example.model.ProcessingProcessExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
@Service
@Transactional
public interface ProcessingProcessService {

    int countByExample(ProcessingProcessExample example);

    int deleteByExample(ProcessingProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProcessingProcess record);

    int insertSelective(ProcessingProcess record);

    List<ProcessingProcess> selectByExample(ProcessingProcessExample example);

    ProcessingProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProcessingProcess record, @Param("example") ProcessingProcessExample example);

    int updateByExample(@Param("record") ProcessingProcess record, @Param("example") ProcessingProcessExample example);

    int updateByPrimaryKeySelective(ProcessingProcess record);

    int updateByPrimaryKey(ProcessingProcess record);
}
