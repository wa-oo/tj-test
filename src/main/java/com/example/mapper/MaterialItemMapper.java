package com.example.mapper;

import com.example.model.MaterialItem;
import com.example.model.MaterialItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialItemMapper {
    int countByExample(MaterialItemExample example);

    int deleteByExample(MaterialItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(MaterialItem record);

    int insertSelective(MaterialItem record);

    List<MaterialItem> selectByExample(MaterialItemExample example);

    MaterialItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MaterialItem record, @Param("example") MaterialItemExample example);

    int updateByExample(@Param("record") MaterialItem record, @Param("example") MaterialItemExample example);

    int updateByPrimaryKeySelective(MaterialItem record);

    int updateByPrimaryKey(MaterialItem record);
}