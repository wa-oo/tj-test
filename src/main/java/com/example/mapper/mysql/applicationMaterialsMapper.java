package com.example.mapper.mysql;

import com.example.model.mysql.applicationMaterials;
import com.example.model.mysql.applicationMaterialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface applicationMaterialsMapper {
    int countByExample(applicationMaterialsExample example);

    int deleteByExample(applicationMaterialsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(applicationMaterials record);

    int insertSelective(applicationMaterials record);

    List<applicationMaterials> selectByExample(applicationMaterialsExample example);

    applicationMaterials selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") applicationMaterials record, @Param("example") applicationMaterialsExample example);

    int updateByExample(@Param("record") applicationMaterials record, @Param("example") applicationMaterialsExample example);

    int updateByPrimaryKeySelective(applicationMaterials record);

    int updateByPrimaryKey(applicationMaterials record);
}