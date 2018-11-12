package com.example.mapper;

import com.example.model.ApplicationMaterials;
import com.example.model.ApplicationMaterialsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMaterialsMapper {
    int countByExample(ApplicationMaterialsExample example);

    int deleteByExample(ApplicationMaterialsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplicationMaterials record);

    int insertSelective(ApplicationMaterials record);

    List<ApplicationMaterials> selectByExample(ApplicationMaterialsExample example);

    ApplicationMaterials selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplicationMaterials record, @Param("example") ApplicationMaterialsExample example);

    int updateByExample(@Param("record") ApplicationMaterials record, @Param("example") ApplicationMaterialsExample example);

    int updateByPrimaryKeySelective(ApplicationMaterials record);

    int updateByPrimaryKey(ApplicationMaterials record);
}