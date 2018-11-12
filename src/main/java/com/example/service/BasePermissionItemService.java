package com.example.service;

import com.example.model.BasePermissionItem;
import com.example.model.BasePermissionItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */

public interface BasePermissionItemService {
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
