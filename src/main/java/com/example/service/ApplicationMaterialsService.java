package com.example.service;

import com.example.model.ApplicationMaterials;
import com.example.model.ApplicationMaterialsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public interface ApplicationMaterialsService {
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
