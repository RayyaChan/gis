
package com.gis.mapper;

import com.gis.model.AuthorityInfo;
import com.gis.model.AuthorityInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityInfoMapper {
    /** 
     * 根据指定的条件获取数据库记录数
     * @param example
     */
    long countByExample(AuthorityInfoCriteria example);

    /** 
     * 根据指定的条件删除数据库符合条件的记录
     * @param example
     */
    int deleteByExample(AuthorityInfoCriteria example);

    /** 
     * 根据主键删除数据库的记录
     * @param authorityId
     */
    int deleteByPrimaryKey(Integer authorityId);

    /** 
     * 插入数据库记录
     * @param record
     */
    int insert(AuthorityInfo record);

    /** 
     * 动态字段,写入数据库记录
     * @param record
     */
    int insertSelective(AuthorityInfo record);

    /** 
     * 根据指定的条件查询符合条件的数据库记录
     * @param example
     */
    List<AuthorityInfo> selectByExample(AuthorityInfoCriteria example);

    /** 
     * 根据指定主键获取一条数据库记录
     * @param authorityId
     */
    AuthorityInfo selectByPrimaryKey(Integer authorityId);

    /** 
     * 动态根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") AuthorityInfo record, @Param("example") AuthorityInfoCriteria example);

    /** 
     * 根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") AuthorityInfo record, @Param("example") AuthorityInfoCriteria example);

    /** 
     * 动态字段,根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKeySelective(AuthorityInfo record);

    /** 
     * 根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKey(AuthorityInfo record);

    List<AuthorityInfo> getAuthorityListByRoleId(Integer roleId);
}