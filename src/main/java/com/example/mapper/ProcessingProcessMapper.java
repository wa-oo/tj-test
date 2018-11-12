package com.example.mapper;

import com.example.model.ProcessingProcess;
import com.example.model.ProcessingProcessExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProcessingProcessMapper {
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