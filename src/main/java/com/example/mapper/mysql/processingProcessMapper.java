package com.example.mapper.mysql;

import com.example.model.mysql.processingProcess;
import com.example.model.mysql.processingProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface processingProcessMapper {
    int countByExample(processingProcessExample example);

    int deleteByExample(processingProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(processingProcess record);

    int insertSelective(processingProcess record);

    List<processingProcess> selectByExample(processingProcessExample example);

    processingProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") processingProcess record, @Param("example") processingProcessExample example);

    int updateByExample(@Param("record") processingProcess record, @Param("example") processingProcessExample example);

    int updateByPrimaryKeySelective(processingProcess record);

    int updateByPrimaryKey(processingProcess record);
}