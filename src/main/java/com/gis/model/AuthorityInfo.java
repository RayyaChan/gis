
package com.gis.model;

import java.io.Serializable;

/**
 * 权限信息 authority_info
 * 2017/02/22 15:55
*/
public class AuthorityInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 
     * 权限编号
     */
    private Integer authorityId;

    /** 
     * 上级编号
     */
    private Integer authorityPid;

    /** 
     * 权限名称
     */
    private String authorityName;

    /** 
     * 权限描述
     */
    private String authorityDesc;

    /** 
     * 权限url
     */
    private String authorityUrl;

    /** 
     * 构造查询条件
     */
    public AuthorityInfo(Integer authorityId, Integer authorityPid, String authorityName, String authorityDesc, String authorityUrl) {
        this.authorityId = authorityId;
        this.authorityPid = authorityPid;
        this.authorityName = authorityName;
        this.authorityDesc = authorityDesc;
        this.authorityUrl = authorityUrl;
    }

    /** 
     * 构造查询条件
     */
    public AuthorityInfo() {
        super();
    }

    /** 
     * 获取 权限编号 authority_info.authority_id
     * @return 权限编号
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /** 
     * 设置 权限编号 authority_info.authority_id
     * @param authorityId 权限编号
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    /** 
     * 获取 上级编号 authority_info.authority_pid
     * @return 上级编号
     */
    public Integer getAuthorityPid() {
        return authorityPid;
    }

    /** 
     * 设置 上级编号 authority_info.authority_pid
     * @param authorityPid 上级编号
     */
    public void setAuthorityPid(Integer authorityPid) {
        this.authorityPid = authorityPid;
    }

    /** 
     * 获取 权限名称 authority_info.authority_name
     * @return 权限名称
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /** 
     * 设置 权限名称 authority_info.authority_name
     * @param authorityName 权限名称
     */
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    /** 
     * 获取 权限描述 authority_info.authority_desc
     * @return 权限描述
     */
    public String getAuthorityDesc() {
        return authorityDesc;
    }

    /** 
     * 设置 权限描述 authority_info.authority_desc
     * @param authorityDesc 权限描述
     */
    public void setAuthorityDesc(String authorityDesc) {
        this.authorityDesc = authorityDesc == null ? null : authorityDesc.trim();
    }

    /** 
     * 获取 权限url authority_info.authority_url
     * @return 权限url
     */
    public String getAuthorityUrl() {
        return authorityUrl;
    }

    /** 
     * 设置 权限url authority_info.authority_url
     * @param authorityUrl 权限url
     */
    public void setAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl == null ? null : authorityUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", authorityId=").append(authorityId);
        sb.append(", authorityPid=").append(authorityPid);
        sb.append(", authorityName=").append(authorityName);
        sb.append(", authorityDesc=").append(authorityDesc);
        sb.append(", authorityUrl=").append(authorityUrl);
        sb.append("]");
        return sb.toString();
    }
}