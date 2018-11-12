package com.example.mapper;

import com.example.model.ChargeDependent;
import com.example.model.ChargeDependentExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargeDependentMapper {
    int countByExample(ChargeDependentExample example);

    int deleteByExample(ChargeDependentExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(ChargeDependent record);

    int insertSelective(ChargeDependent record);

    List<ChargeDependent> selectByExample(ChargeDependentExample example);

    ChargeDependent selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") ChargeDependent record, @Param("example") ChargeDependentExample example);

    int updateByExample(@Param("record") ChargeDependent record, @Param("example") ChargeDependentExample example);

    int updateByPrimaryKeySelective(ChargeDependent record);

    int updateByPrimaryKey(ChargeDependent record);
}