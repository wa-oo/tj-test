package com.example.service.impl;

import com.example.mapper.MaterialItemMapper;
import com.example.model.MaterialItem;
import com.example.model.MaterialItemExample;
import com.example.service.MaterialItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "MaterialItemService")
public class MaterialItemServiceImpl implements MaterialItemService {

    @Resource
    private MaterialItemMapper materialItemMapper;

    @Override
    public int countByExample(MaterialItemExample example) {
        return materialItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MaterialItemExample example) {
        return materialItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(BigDecimal id) {
        return materialItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MaterialItem record) {
        return materialItemMapper.insert(record);
    }

    @Override
    public int insertSelective(MaterialItem record) {
        return materialItemMapper.insertSelective(record);
    }

    @Override
    public List<MaterialItem> selectByExample(MaterialItemExample example) {
        return materialItemMapper.selectByExample(example);
    }

    @Override
    public MaterialItem selectByPrimaryKey(BigDecimal id) {
        return materialItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MaterialItem record, MaterialItemExample example) {
        return materialItemMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MaterialItem record, MaterialItemExample example) {
        return materialItemMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MaterialItem record) {
        return materialItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MaterialItem record) {
        return materialItemMapper.updateByPrimaryKey(record);
    }
}
