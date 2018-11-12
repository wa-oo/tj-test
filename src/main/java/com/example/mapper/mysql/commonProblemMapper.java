package com.example.mapper.mysql;

import com.example.model.mysql.commonProblem;
import com.example.model.mysql.commonProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface commonProblemMapper {
    int countByExample(commonProblemExample example);

    int deleteByExample(commonProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(commonProblem record);

    int insertSelective(commonProblem record);

    List<commonProblem> selectByExample(commonProblemExample example);

    commonProblem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") commonProblem record, @Param("example") commonProblemExample example);

    int updateByExample(@Param("record") commonProblem record, @Param("example") commonProblemExample example);

    int updateByPrimaryKeySelective(commonProblem record);

    int updateByPrimaryKey(commonProblem record);
}