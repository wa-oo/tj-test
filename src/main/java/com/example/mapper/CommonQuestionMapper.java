package com.example.mapper;

import com.example.model.CommonQuestion;
import com.example.model.CommonQuestionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonQuestionMapper {
    int countByExample(CommonQuestionExample example);

    int deleteByExample(CommonQuestionExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(CommonQuestion record);

    int insertSelective(CommonQuestion record);

    List<CommonQuestion> selectByExample(CommonQuestionExample example);

    CommonQuestion selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") CommonQuestion record, @Param("example") CommonQuestionExample example);

    int updateByExample(@Param("record") CommonQuestion record, @Param("example") CommonQuestionExample example);

    int updateByPrimaryKeySelective(CommonQuestion record);

    int updateByPrimaryKey(CommonQuestion record);
}