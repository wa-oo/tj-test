package com.example.service;

import com.example.model.informationSheet;
import com.example.model.informationSheetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangtaog@mail.taiji.com.cn
 * @date 2018/11/7
 */
public interface InformationSheetService {

    int countByExample(informationSheetExample example);

    int deleteByExample(informationSheetExample example);

    int insert(informationSheet record);

    int insertSelective(informationSheet record);

    List<informationSheet> selectByExample(informationSheetExample example);

    int updateByExampleSelective(@Param("record") informationSheet record, @Param("example") informationSheetExample example);

    int updateByExample(@Param("record") informationSheet record, @Param("example") informationSheetExample example);

}
