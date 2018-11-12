package com.example.mapper;

import com.example.model.SpecialInfo;
import com.example.model.SpecialInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SpecialInfoMapper {
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