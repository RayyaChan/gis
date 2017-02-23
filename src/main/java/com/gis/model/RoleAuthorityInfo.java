
package com.gis.model;

import java.io.Serializable;

/**
 * 角色权限信息 role_authority_info
 * 2017/02/22 15:55
*/
public class RoleAuthorityInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 
     * 角色权限编号
     */
    private Integer roleAuthorityId;

    /** 
     * 角色编号
     */
    private Integer roleId;

    /** 
     * 权限编号
     */
    private Integer authorityId;

    /** 
     * 构造查询条件
     */
    public RoleAuthorityInfo(Integer roleAuthorityId, Integer roleId, Integer authorityId) {
        this.roleAuthorityId = roleAuthorityId;
        this.roleId = roleId;
        this.authorityId = authorityId;
    }

    /** 
     * 构造查询条件
     */
    public RoleAuthorityInfo() {
        super();
    }

    /** 
     * 获取 角色权限编号 role_authority_info.role_authority_id
     * @return 角色权限编号
     */
    public Integer getRoleAuthorityId() {
        return roleAuthorityId;
    }

    /** 
     * 设置 角色权限编号 role_authority_info.role_authority_id
     * @param roleAuthorityId 角色权限编号
     */
    public void setRoleAuthorityId(Integer roleAuthorityId) {
        this.roleAuthorityId = roleAuthorityId;
    }

    /** 
     * 获取 角色编号 role_authority_info.role_id
     * @return 角色编号
     */
    public Integer getRoleId() {
        return roleId;
    }

    /** 
     * 设置 角色编号 role_authority_info.role_id
     * @param roleId 角色编号
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /** 
     * 获取 权限编号 role_authority_info.authority_id
     * @return 权限编号
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /** 
     * 设置 权限编号 role_authority_info.authority_id
     * @param authorityId 权限编号
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", roleAuthorityId=").append(roleAuthorityId);
        sb.append(", roleId=").append(roleId);
        sb.append(", authorityId=").append(authorityId);
        sb.append("]");
        return sb.toString();
    }
}