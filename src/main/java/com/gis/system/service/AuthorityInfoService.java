package com.gis.system.service;

import com.gis.model.AuthorityInfo;
import com.gis.model.AuthorityInfoCriteria;
import java.util.List;

public interface AuthorityInfoService {
    int countByExample(AuthorityInfoCriteria example);

    AuthorityInfo selectByPrimaryKey(Integer authorityId);

    List<AuthorityInfo> selectByExample(AuthorityInfoCriteria example);

    int deleteByPrimaryKey(Integer authorityId);

    int updateByPrimaryKeySelective(AuthorityInfo record);

    int updateByPrimaryKey(AuthorityInfo record);

    int deleteByExample(AuthorityInfoCriteria example);

    int updateByExampleSelective(AuthorityInfo record, AuthorityInfoCriteria example);

    int updateByExample(AuthorityInfo record, AuthorityInfoCriteria example);

    int insert(AuthorityInfo record);

    int insertSelective(AuthorityInfo record);

    List<AuthorityInfo> getAuthorityList(Integer roleId);
}