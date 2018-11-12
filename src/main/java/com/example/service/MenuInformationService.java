package com.example.service;

import com.example.model.MenuInformation;
import com.example.model.MenuInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */

public interface MenuInformationService {
    int countByExample(MenuInformationExample example);

    int deleteByExample(MenuInformationExample example);

    int deleteByPrimaryKey(String matterId);

    int insert(MenuInformation record);

    int insertSelective(MenuInformation record);

    List<MenuInformation> selectByExample(MenuInformationExample example);

    MenuInformation selectByPrimaryKey(String matterId);

    int updateByExampleSelective(@Param("record") MenuInformation record, @Param("example") MenuInformationExample example);

    int updateByExample(@Param("record") MenuInformation record, @Param("example") MenuInformationExample example);

    int updateByPrimaryKeySelective(MenuInformation record);

    int updateByPrimaryKey(MenuInformation record);
}
