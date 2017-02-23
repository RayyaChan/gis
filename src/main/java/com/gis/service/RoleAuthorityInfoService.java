package com.gis.service;

import com.gis.model.RoleAuthorityInfo;
import com.gis.model.RoleAuthorityInfoCriteria;
import java.util.List;

public interface RoleAuthorityInfoService {
    int countByExample(RoleAuthorityInfoCriteria example);

    RoleAuthorityInfo selectByPrimaryKey(Integer roleAuthorityId);

    List<RoleAuthorityInfo> selectByExample(RoleAuthorityInfoCriteria example);

    int deleteByPrimaryKey(Integer roleAuthorityId);

    int updateByPrimaryKeySelective(RoleAuthorityInfo record);

    int updateByPrimaryKey(RoleAuthorityInfo record);

    int deleteByExample(RoleAuthorityInfoCriteria example);

    int updateByExampleSelective(RoleAuthorityInfo record, RoleAuthorityInfoCriteria example);

    int updateByExample(RoleAuthorityInfo record, RoleAuthorityInfoCriteria example);

    int insert(RoleAuthorityInfo record);

    int insertSelective(RoleAuthorityInfo record);
}