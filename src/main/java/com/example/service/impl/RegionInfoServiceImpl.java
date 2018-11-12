package com.example.service.impl;

import com.example.mapper.RegionInfoMapper;
import com.example.model.RegionInfo;
import com.example.model.RegionInfoExample;
import com.example.service.RegionInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Allen
 * @date 2018/11/12
 * @Maill wangtaog@mail.taiji.com.cn
 */
@Service(value = "RegionInfoService")
public class RegionInfoServiceImpl implements RegionInfoService {
    
    @Resource
    private RegionInfoMapper regionInfoMapper;
    @Override
    public int countByExample(RegionInfoExample example) {
        return regionInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RegionInfoExample example) {
        return regionInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String areaId) {
        return regionInfoMapper.deleteByPrimaryKey(areaId);
    }

    @Override
    public int insert(RegionInfo record) {
        return regionInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(RegionInfo record) {
        return regionInfoMapper.insertSelective(record);
    }

    @Override
    public List<RegionInfo> selectByExample(RegionInfoExample example) {
        return regionInfoMapper.selectByExample(example);
    }

    @Override
    public RegionInfo selectByPrimaryKey(String areaId) {
        return regionInfoMapper.selectByPrimaryKey(areaId);
    }

    @Override
    public int updateByExampleSelective(RegionInfo record, RegionInfoExample example) {
        return regionInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(RegionInfo record, RegionInfoExample example) {
        return regionInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(RegionInfo record) {
        return regionInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RegionInfo record) {
        return regionInfoMapper.updateByPrimaryKey(record);
    }
}
