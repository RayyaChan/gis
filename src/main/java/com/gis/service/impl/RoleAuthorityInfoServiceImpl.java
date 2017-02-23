package com.gis.service.impl;


import com.gis.model.RoleAuthorityInfo;
import com.gis.model.RoleAuthorityInfoCriteria;
import java.util.List;

import com.gis.mapper.RoleAuthorityInfoMapper;
import com.gis.service.RoleAuthorityInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleAuthorityInfoServiceImpl implements RoleAuthorityInfoService {
    @Autowired
    private RoleAuthorityInfoMapper roleAuthorityInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(RoleAuthorityInfoServiceImpl.class);

    public int countByExample(RoleAuthorityInfoCriteria example) {
        int count = (int)this.roleAuthorityInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public RoleAuthorityInfo selectByPrimaryKey(Integer roleAuthorityId) {
        return this.roleAuthorityInfoMapper.selectByPrimaryKey(roleAuthorityId);
    }

    public List<RoleAuthorityInfo> selectByExample(RoleAuthorityInfoCriteria example) {
        return this.roleAuthorityInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer roleAuthorityId) {
        return this.roleAuthorityInfoMapper.deleteByPrimaryKey(roleAuthorityId);
    }

    public int updateByPrimaryKeySelective(RoleAuthorityInfo record) {
        return this.roleAuthorityInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(RoleAuthorityInfo record) {
        return this.roleAuthorityInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(RoleAuthorityInfoCriteria example) {
        return this.roleAuthorityInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(RoleAuthorityInfo record, RoleAuthorityInfoCriteria example) {
        return this.roleAuthorityInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(RoleAuthorityInfo record, RoleAuthorityInfoCriteria example) {
        return this.roleAuthorityInfoMapper.updateByExample(record, example);
    }

    public int insert(RoleAuthorityInfo record) {
        return this.roleAuthorityInfoMapper.insert(record);
    }

    public int insertSelective(RoleAuthorityInfo record) {
        return this.roleAuthorityInfoMapper.insertSelective(record);
    }
}