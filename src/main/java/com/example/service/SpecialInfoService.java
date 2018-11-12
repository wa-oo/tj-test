package com.example.service;

import com.example.model.SpecialInfo;
import com.example.model.SpecialInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */

public interface SpecialInfoService {
    int countByExample(SpecialInfoExample example);

    int deleteByExample(SpecialInfoExample example);

    int deleteByPrimaryKey(String flowId);

    int insert(SpecialInfo record);

    int insertSelective(SpecialInfo record);

    List<SpecialInfo> selectByExample(SpecialInfoExample example);

    SpecialInfo selectByPrimaryKey(String flowId);

    int updateByExampleSelective(@Param("record") SpecialInfo record, @Param("example") SpecialInfoExample example);

    int updateByExample(@Param("record") SpecialInfo record, @Param("example") SpecialInfoExample example);

    int updateByPrimaryKeySelective(SpecialInfo record);

    int updateByPrimaryKey(SpecialInfo record);
}
