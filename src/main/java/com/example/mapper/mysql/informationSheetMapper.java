package com.example.mapper.mysql;

import com.example.model.mysql.informationSheet;
import com.example.model.mysql.informationSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface informationSheetMapper {
    int countByExample(informationSheetExample example);

    int deleteByExample(informationSheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(informationSheet record);

    int insertSelective(informationSheet record);

    List<informationSheet> selectByExample(informationSheetExample example);

    informationSheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") informationSheet record, @Param("example") informationSheetExample example);

    int updateByExample(@Param("record") informationSheet record, @Param("example") informationSheetExample example);

    int updateByPrimaryKeySelective(informationSheet record);

    int updateByPrimaryKey(informationSheet record);
}