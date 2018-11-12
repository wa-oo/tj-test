package com.example.service.oracle;

import com.example.model.oracle.Law;
import com.example.model.oracle.LawExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */

public interface LawService {
    int countByExample(LawExample example);

    int deleteByExample(LawExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Law record);

    int insertSelective(Law record);

    List<Law> selectByExample(LawExample example);

    Law selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Law record, @Param("example") LawExample example);

    int updateByExample(@Param("record") Law record, @Param("example") LawExample example);

    int updateByPrimaryKeySelective(Law record);

    int updateByPrimaryKey(Law record);
}
