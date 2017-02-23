
package com.gis.mapper;

import com.gis.model.RoleAuthorityInfo;
import com.gis.model.RoleAuthorityInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthorityInfoMapper {
    /** 
     * 根据指定的条件获取数据库记录数
     * @param example
     */
    long countByExample(RoleAuthorityInfoCriteria example);

    /** 
     * 根据指定的条件删除数据库符合条件的记录
     * @param example
     */
    int deleteByExample(RoleAuthorityInfoCriteria example);

    /** 
     * 根据主键删除数据库的记录
     * @param roleAuthorityId
     */
    int deleteByPrimaryKey(Integer roleAuthorityId);

    /** 
     * 插入数据库记录
     * @param record
     */
    int insert(RoleAuthorityInfo record);

    /** 
     * 动态字段,写入数据库记录
     * @param record
     */
    int insertSelective(RoleAuthorityInfo record);

    /** 
     * 根据指定的条件查询符合条件的数据库记录
     * @param example
     */
    List<RoleAuthorityInfo> selectByExample(RoleAuthorityInfoCriteria example);

    /** 
     * 根据指定主键获取一条数据库记录
     * @param roleAuthorityId
     */
    RoleAuthorityInfo selectByPrimaryKey(Integer roleAuthorityId);

    /** 
     * 动态根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") RoleAuthorityInfo record, @Param("example") RoleAuthorityInfoCriteria example);

    /** 
     * 根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") RoleAuthorityInfo record, @Param("example") RoleAuthorityInfoCriteria example);

    /** 
     * 动态字段,根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKeySelective(RoleAuthorityInfo record);

    /** 
     * 根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKey(RoleAuthorityInfo record);
}