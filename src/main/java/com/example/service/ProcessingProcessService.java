package com.example.service;

import com.example.model.processingProcess;
import com.example.model.processingProcessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public interface ProcessingProcessService {

    int countByExample(processingProcessExample example);

    int deleteByExample(processingProcessExample example);

    int insert(processingProcess record);

    int insertSelective(processingProcess record);

    List<processingProcess> selectByExample(processingProcessExample example);

    int updateByExampleSelective(@Param("record") processingProcess record, @Param("example") processingProcessExample example);

    int updateByExample(@Param("record") processingProcess record, @Param("example") processingProcessExample example);

}
