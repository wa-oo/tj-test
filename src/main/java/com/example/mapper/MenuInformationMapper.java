package com.example.mapper;

import com.example.model.MenuInformation;
import com.example.model.MenuInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuInformationMapper {
    int countByExample(MenuInformationExample example);

    int deleteByExample(MenuInformationExample example);

    int deleteByPrimaryKey(String id);

    int insert(MenuInformation record);

    int insertSelective(MenuInformation record);

    List<MenuInformation> selectByExample(MenuInformationExample example);

    MenuInformation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MenuInformation record, @Param("example") MenuInformationExample example);

    int updateByExample(@Param("record") MenuInformation record, @Param("example") MenuInformationExample example);

    int updateByPrimaryKeySelective(MenuInformation record);

    int updateByPrimaryKey(MenuInformation record);
}