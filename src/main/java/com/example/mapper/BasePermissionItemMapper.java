package com.example.mapper;

import com.example.model.BasePermissionItem;
import com.example.model.BasePermissionItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasePermissionItemMapper {

    int countByExample(BasePermissionItemExample example);

    int deleteByExample(BasePermissionItemExample example);

    int deleteByPrimaryKey(String matterId);

    int insert(BasePermissionItem record);

    int insertSelective(BasePermissionItem record);

    List<BasePermissionItem> selectByExample(BasePermissionItemExample example);

    BasePermissionItem selectByPrimaryKey(String matterId);

    int updateByExampleSelective(@Param("record") BasePermissionItem record, @Param("example") BasePermissionItemExample example);

    int updateByExample(@Param("record") BasePermissionItem record, @Param("example") BasePermissionItemExample example);

    int updateByPrimaryKeySelective(BasePermissionItem record);

    int updateByPrimaryKey(BasePermissionItem record);
}