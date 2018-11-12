package com.example.service.impl;

import com.example.mapper.BasePermissionItemMapper;
import com.example.model.BasePermissionItem;
import com.example.model.BasePermissionItemExample;
import com.example.service.BasePermissionItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "BasePermissionItemService")
public class BasePermissionItemServiceImpl implements BasePermissionItemService {

    @Resource
    private BasePermissionItemMapper basePermissionItemMapper;

    @Override
    public int countByExample(BasePermissionItemExample example) {
        return basePermissionItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BasePermissionItemExample example) {
        return basePermissionItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String matterId) {
        return basePermissionItemMapper.deleteByPrimaryKey(matterId);
    }

    @Override
    public int insert(BasePermissionItem record) {
        return basePermissionItemMapper.insert(record);
    }

    @Override
    public int insertSelective(BasePermissionItem record) {
        return basePermissionItemMapper.insertSelective(record);
    }

    @Override
    public List<BasePermissionItem> selectByExample(BasePermissionItemExample example) {
        return basePermissionItemMapper.selectByExample(example);
    }

    @Override
    public BasePermissionItem selectByPrimaryKey(String matterId) {
        return basePermissionItemMapper.selectByPrimaryKey(matterId);
    }

    @Override
    public int updateByExampleSelective(BasePermissionItem record, BasePermissionItemExample example) {
        return basePermissionItemMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(BasePermissionItem record, BasePermissionItemExample example) {
        return basePermissionItemMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(BasePermissionItem record) {
        return basePermissionItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BasePermissionItem record) {
        return basePermissionItemMapper.updateByPrimaryKey(record);
    }
}
