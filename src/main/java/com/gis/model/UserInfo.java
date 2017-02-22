
package com.gis.model;

import java.io.Serializable;

/**
 * 2017/02/22 10:28
*/
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String username;

    private String password;

    private String realname;

    private Integer roleId;

    /** 
     * 构造查询条件
     */
    public UserInfo(Integer userId, String username, String password, String realname, Integer roleId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.roleId = roleId;
    }

    /** 
     * 构造查询条件
     */
    public UserInfo() {
        super();
    }

    /** 
     * 获取 user_info.user_id
     * @return user_info.user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /** 
     * 设置 user_info.user_id
     * @param userId user_info.user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /** 
     * 获取 user_info.username
     * @return user_info.username
     */
    public String getUsername() {
        return username;
    }

    /** 
     * 设置 user_info.username
     * @param username user_info.username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /** 
     * 获取 user_info.password
     * @return user_info.password
     */
    public String getPassword() {
        return password;
    }

    /** 
     * 设置 user_info.password
     * @param password user_info.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
     * 获取 user_info.realname
     * @return user_info.realname
     */
    public String getRealname() {
        return realname;
    }

    /** 
     * 设置 user_info.realname
     * @param realname user_info.realname
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /** 
     * 获取 user_info.role_id
     * @return user_info.role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /** 
     * 设置 user_info.role_id
     * @param roleId user_info.role_id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", realname=").append(realname);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}