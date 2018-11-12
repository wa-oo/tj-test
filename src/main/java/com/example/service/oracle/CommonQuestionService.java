package com.example.service.oracle;

import com.example.model.oracle.CommonQuestion;
import com.example.model.oracle.CommonQuestionExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */

public interface CommonQuestionService {
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
