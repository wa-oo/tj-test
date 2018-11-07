package com.example.service;

import com.example.model.InformationSheet;
import com.example.model.InformationSheetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public interface InformationSheetService {

    int countByExample(InformationSheetExample example);

    int deleteByExample(InformationSheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InformationSheet record);

    int insertSelective(InformationSheet record);

    List<InformationSheet> selectByExample(InformationSheetExample example);

    InformationSheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InformationSheet record, @Param("example") InformationSheetExample example);

    int updateByExample(@Param("record") InformationSheet record, @Param("example") InformationSheetExample example);

    int updateByPrimaryKeySelective(InformationSheet record);

    int updateByPrimaryKey(InformationSheet record);
}
