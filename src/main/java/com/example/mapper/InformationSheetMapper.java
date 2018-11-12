package com.example.mapper;

import com.example.model.InformationSheet;
import com.example.model.InformationSheetExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface InformationSheetMapper {
    int countByExample(InformationSheetExample example);

    int deleteByExample(InformationSheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationSheet record);

    int insertSelective(InformationSheet record);

    List<InformationSheet> selectByExample(InformationSheetExample example);

    InformationSheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationSheet record, @Param("example") InformationSheetExample example);

    int updateByExample(@Param("record") InformationSheet record, @Param("example") InformationSheetExample example);

    int updateByPrimaryKeySelective(InformationSheet record);

    int updateByPrimaryKey(InformationSheet record);
}