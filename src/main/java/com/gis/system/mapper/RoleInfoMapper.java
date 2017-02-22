package com.gis.system.mapper;

import com.gis.model.RoleInfo;
import com.gis.model.RoleInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    long countByExample(RoleInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int deleteByExample(RoleInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int insert(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int insertSelective(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    List<RoleInfo> selectByExample(RoleInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    RoleInfo selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int updateByExampleSelective(@Param("record") RoleInfo record, @Param("example") RoleInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int updateByExample(@Param("record") RoleInfo record, @Param("example") RoleInfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int updateByPrimaryKeySelective(RoleInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_info
     *
     * @mbg.generated 2017/02/16 15:00
     */
    int updateByPrimaryKey(RoleInfo record);

    List<RoleInfo> getRoleInfoList(RoleInfo record);
}