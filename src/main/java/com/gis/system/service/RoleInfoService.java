package com.gis.system.service;

import com.gis.model.RoleInfo;
import com.gis.model.RoleInfoCriteria;

import java.util.List;

/**
 * Created by Administrator on 2017/2/16 0016.
 */
public interface RoleInfoService {
    int countByExample(RoleInfoCriteria example);

    RoleInfo selectByPrimaryKey(Integer roleId);

    List<RoleInfo> selectByExample(RoleInfoCriteria example);

    int deleteByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);

    int deleteByExample(RoleInfoCriteria example);

    int updateByExampleSelective(RoleInfo record, RoleInfoCriteria example);

    int updateByExample(RoleInfo record, RoleInfoCriteria example);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    /**
     * 根据角色信息获取员工列表
     * @param record
     * @return
     */
    List<RoleInfo> getRoleInfoList(RoleInfo record);
}
