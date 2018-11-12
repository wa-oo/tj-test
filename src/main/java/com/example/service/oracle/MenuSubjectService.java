package com.example.service.oracle;

import com.example.model.oracle.MenuSubject;
import com.example.model.oracle.MenuSubjectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */

public interface MenuSubjectService {
    int countByExample(MenuSubjectExample example);

    int deleteByExample(MenuSubjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(MenuSubject record);

    int insertSelective(MenuSubject record);

    List<MenuSubject> selectByExample(MenuSubjectExample example);

    MenuSubject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MenuSubject record, @Param("example") MenuSubjectExample example);

    int updateByExample(@Param("record") MenuSubject record, @Param("example") MenuSubjectExample example);

    int updateByPrimaryKeySelective(MenuSubject record);

    int updateByPrimaryKey(MenuSubject record);
}
