package com.example.service;

import com.example.model.CommonProblem;
import com.example.model.CommonProblemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public interface CommonProblemMapperService {

    int countByExample(CommonProblemExample example);

    int deleteByExample(CommonProblemExample example);

    int insert(CommonProblem record);

    int insertSelective(CommonProblem record);

    List<CommonProblem> selectByExample(CommonProblemExample example);

    int updateByExampleSelective(@Param("record") CommonProblem record, @Param("example") CommonProblemExample example);

    int updateByExample(@Param("record") CommonProblem record, @Param("example") CommonProblemExample example);

}
