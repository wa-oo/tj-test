package com.example.service;

import com.example.model.applicationMaterials;
import com.example.model.applicationMaterialsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/6
 */
public interface applicationMaterialsService {

    int countByExample(applicationMaterialsExample example);

    int deleteByExample(applicationMaterialsExample example);

    int insert(applicationMaterials record);

    int insertSelective(applicationMaterials record);

    List<applicationMaterials> selectByExample(applicationMaterialsExample example);

    int updateByExampleSelective(@Param("record") applicationMaterials record, @Param("example") applicationMaterialsExample example);

    int updateByExample(@Param("record") applicationMaterials record, @Param("example") applicationMaterialsExample example);

}
