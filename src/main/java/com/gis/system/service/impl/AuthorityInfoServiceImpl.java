package com.gis.system.service.impl;


import com.gis.model.AuthorityInfo;
import com.gis.model.AuthorityInfoCriteria;
import java.util.List;

import com.gis.system.mapper.AuthorityInfoMapper;
import com.gis.system.service.AuthorityInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityInfoServiceImpl implements AuthorityInfoService {
    @Autowired
    private AuthorityInfoMapper authorityInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(AuthorityInfoServiceImpl.class);

    public int countByExample(AuthorityInfoCriteria example) {
        int count = (int)this.authorityInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AuthorityInfo selectByPrimaryKey(Integer authorityId) {
        return this.authorityInfoMapper.selectByPrimaryKey(authorityId);
    }

    public List<AuthorityInfo> selectByExample(AuthorityInfoCriteria example) {
        return this.authorityInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer authorityId) {
        return this.authorityInfoMapper.deleteByPrimaryKey(authorityId);
    }

    public int updateByPrimaryKeySelective(AuthorityInfo record) {
        return this.authorityInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AuthorityInfo record) {
        return this.authorityInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(AuthorityInfoCriteria example) {
        return this.authorityInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AuthorityInfo record, AuthorityInfoCriteria example) {
        return this.authorityInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AuthorityInfo record, AuthorityInfoCriteria example) {
        return this.authorityInfoMapper.updateByExample(record, example);
    }

    public int insert(AuthorityInfo record) {
        return this.authorityInfoMapper.insert(record);
    }

    public int insertSelective(AuthorityInfo record) {
        return this.authorityInfoMapper.insertSelective(record);
    }

    public List<AuthorityInfo> getAuthorityList(Integer roleId){return this.authorityInfoMapper.getAuthorityListByRoleId(roleId);}
}