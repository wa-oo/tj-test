package com.example.service;

import com.example.model.commonProblem;
import com.example.model.commonProblemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public interface CommonProblemMapperService {

    int countByExample(commonProblemExample example);

    int deleteByExample(commonProblemExample example);

    int insert(commonProblem record);

    int insertSelective(commonProblem record);

    List<commonProblem> selectByExample(commonProblemExample example);

    int updateByExampleSelective(@Param("record") commonProblem record, @Param("example") commonProblemExample example);

    int updateByExample(@Param("record") commonProblem record, @Param("example") commonProblemExample example);

}
