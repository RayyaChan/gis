package com.gis.system.service.impl;

import com.gis.model.RoleInfo;
import com.gis.model.RoleInfoCriteria;
import com.gis.system.mapper.RoleInfoMapper;
import com.gis.system.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/2/16 0016.
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {
    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Override
    public int countByExample(RoleInfoCriteria example) {
        return (int)this.roleInfoMapper.countByExample(example);
    }

    @Override
    public RoleInfo selectByPrimaryKey(Integer roleId) {
        return this.roleInfoMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public List<RoleInfo> selectByExample(RoleInfoCriteria example) {
        return this.roleInfoMapper.selectByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer roleId) {
        return this.roleInfoMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleInfo record) {
        return this.roleInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleInfo record) {
        return this.roleInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByExample(RoleInfoCriteria example) {
        return this.roleInfoMapper.deleteByExample(example);
    }

    @Override
    public int updateByExampleSelective(RoleInfo record, RoleInfoCriteria example) {
        return this.roleInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(RoleInfo record, RoleInfoCriteria example) {
        return this.updateByExample(record,example);
    }

    @Override
    public int insert(RoleInfo record) {
        return this.insert(record);
    }

    @Override
    public int insertSelective(RoleInfo record) {
        return this.insertSelective(record);
    }

    @Override
    public List<RoleInfo> getRoleInfoList(RoleInfo record) {
        return this.getRoleInfoList(record);
    }
}
