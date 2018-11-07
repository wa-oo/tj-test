package com.example.mapper;

import com.example.model.Law;
import com.example.model.LawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LawMapper {
    int countByExample(LawExample example);

    int deleteByExample(LawExample example);

    int deleteByPrimaryKey(String id);

    int insert(Law record);

    int insertSelective(Law record);

    List<Law> selectByExample(LawExample example);

    Law selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Law record, @Param("example") LawExample example);

    int updateByExample(@Param("record") Law record, @Param("example") LawExample example);

    int updateByPrimaryKeySelective(Law record);

    int updateByPrimaryKey(Law record);
}