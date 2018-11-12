package com.example.service;

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
public interface CommonProblemMapperService {

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
