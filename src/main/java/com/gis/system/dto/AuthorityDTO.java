package com.gis.system.dto;

import com.gis.model.AuthorityInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/2/16 0016.
 */
public class AuthorityDTO {
    private AuthorityInfo authorityInfo;
    private List<AuthorityInfo> anthorityInfoList;

    public AuthorityInfo getAuthorityInfo() {
        return authorityInfo;
    }

    public void setAuthorityInfo(AuthorityInfo authorityInfo) {
        this.authorityInfo = authorityInfo;
    }

    public List<AuthorityInfo> getAnthorityInfoList() {
        return anthorityInfoList;
    }

    public void setAnthorityInfoList(List<AuthorityInfo> anthorityInfoList) {
        this.anthorityInfoList = anthorityInfoList;
    }
}
