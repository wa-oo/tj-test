package com.example.mapper.oracle;

import com.example.model.oracle.MaterialItem;
import com.example.model.oracle.MaterialItemExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialItemMapper {
    int countByExample(MaterialItemExample example);

    int deleteByExample(MaterialItemExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(MaterialItem record);

    int insertSelective(MaterialItem record);

    List<MaterialItem> selectByExample(MaterialItemExample example);

    MaterialItem selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") MaterialItem record, @Param("example") MaterialItemExample example);

    int updateByExample(@Param("record") MaterialItem record, @Param("example") MaterialItemExample example);

    int updateByPrimaryKeySelective(MaterialItem record);

    int updateByPrimaryKey(MaterialItem record);
}