package com.example.mapper.mysql;

import com.example.model.mysql.CommonProblem;
import com.example.model.mysql.CommonProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonProblemMapper {
    int countByExample(CommonProblemExample example);

    int deleteByExample(CommonProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommonProblem record);

    int insertSelective(CommonProblem record);

    List<CommonProblem> selectByExample(CommonProblemExample example);

    CommonProblem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommonProblem record, @Param("example") CommonProblemExample example);

    int updateByExample(@Param("record") CommonProblem record, @Param("example") CommonProblemExample example);

    int updateByPrimaryKeySelective(CommonProblem record);

    int updateByPrimaryKey(CommonProblem record);
}