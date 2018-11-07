package com.example.mapper;

import com.example.model.DeptInfo;
import com.example.model.DeptInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptInfoMapper {
    int countByExample(DeptInfoExample example);

    int deleteByExample(DeptInfoExample example);

    int deleteByPrimaryKey(String deptId);

    int insert(DeptInfo record);

    int insertSelective(DeptInfo record);

    List<DeptInfo> selectByExample(DeptInfoExample example);

    DeptInfo selectByPrimaryKey(String deptId);

    int updateByExampleSelective(@Param("record") DeptInfo record, @Param("example") DeptInfoExample example);

    int updateByExample(@Param("record") DeptInfo record, @Param("example") DeptInfoExample example);

    int updateByPrimaryKeySelective(DeptInfo record);

    int updateByPrimaryKey(DeptInfo record);
}