package com.example.mapper;

import com.example.model.RegionInfo;
import com.example.model.RegionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionInfoMapper {
    int countByExample(RegionInfoExample example);

    int deleteByExample(RegionInfoExample example);

    int deleteByPrimaryKey(String areaId);

    int insert(RegionInfo record);

    int insertSelective(RegionInfo record);

    List<RegionInfo> selectByExample(RegionInfoExample example);

    RegionInfo selectByPrimaryKey(String areaId);

    int updateByExampleSelective(@Param("record") RegionInfo record, @Param("example") RegionInfoExample example);

    int updateByExample(@Param("record") RegionInfo record, @Param("example") RegionInfoExample example);

    int updateByPrimaryKeySelective(RegionInfo record);

    int updateByPrimaryKey(RegionInfo record);
}