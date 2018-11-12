package com.example.service.oracle;

import com.example.model.oracle.MaterialItem;
import com.example.model.oracle.MaterialItemExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */

public interface MaterialItemService {
    int countByExample(MaterialItemExample example);

    int deleteByExample(MaterialItemExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(MaterialItem record);

    int insertSelective(MaterialItem record);

    List<MaterialItem> selectByExample(MaterialItemExample example);

    MaterialItem selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") MaterialItem record, @Param("example") MaterialItemExample example);

    int updateByExample(@Param("record") MaterialItem record, @Param("example") MaterialItemExample example);

    int updateByPrimaryKeySelective(MaterialItem record);

    int updateByPrimaryKey(MaterialItem record);
}
