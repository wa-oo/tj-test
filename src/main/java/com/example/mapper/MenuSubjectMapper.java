package com.example.mapper;

import com.example.model.MenuSubject;
import com.example.model.MenuSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuSubjectMapper {
    int countByExample(MenuSubjectExample example);

    int deleteByExample(MenuSubjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(MenuSubject record);

    int insertSelective(MenuSubject record);

    List<MenuSubject> selectByExample(MenuSubjectExample example);

    MenuSubject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MenuSubject record, @Param("example") MenuSubjectExample example);

    int updateByExample(@Param("record") MenuSubject record, @Param("example") MenuSubjectExample example);

    int updateByPrimaryKeySelective(MenuSubject record);

    int updateByPrimaryKey(MenuSubject record);
}