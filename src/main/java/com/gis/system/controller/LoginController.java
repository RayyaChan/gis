package com.gis.system.controller;

import com.gis.model.AuthorityInfo;
import com.gis.model.UserInfo;
import com.gis.model.UserInfoCriteria;
import com.gis.system.dto.AuthorityDTO;
import com.gis.service.AuthorityInfoService;
import com.gis.service.UserInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/16 0016.
 * 登录注销模块
 */
@Controller
public class LoginController {
    @Autowired
    private AuthorityInfoService authorityInfoService;
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/")
    public String index(){
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String passsword, ModelMap map) {
        //非空验证
        if(StringUtils.isNotEmpty(username)&&StringUtils.isNotEmpty(passsword)){
            //构造查询条件
            UserInfoCriteria criteria=new UserInfoCriteria();
            criteria.or()
                    .andUsernameEqualTo(username)
                    .andPasswordEqualTo(passsword);
            List<UserInfo> userList=userInfoService.selectByExample(criteria);
            if(userList!=null&&userList.size()>0){
                UserInfo user=userList.get(0);
                //根据角色id获取权限列表
                List<AuthorityInfo> authList=authorityInfoService.getAuthorityList(user.getRoleId());
                List<AuthorityDTO> dtoList=new ArrayList<>();
                //构建菜单
                for(AuthorityInfo auth:authList){
                    if(auth!=null&&auth.getAuthorityPid()==1){
                        AuthorityDTO dto=new AuthorityDTO();
                        //一级菜单
                        dto.setAuthorityInfo(auth);

                        //二级菜单
                        List<AuthorityInfo> subList=new ArrayList<>();
                        getSubAuthorityList(subList,authList,auth.getAuthorityId());
                        dto.setAnthorityInfoList(subList);
                        dtoList.add(dto);
                        map.put("dtoList",dtoList);
                    }
                }
                map.put("user",user);
                return "index";
            }else{
                map.put("info","用户名或密码错误");
            }
        }else{
            map.put("info","用户名或密码不能为空");
        }
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(SessionStatus sessionStatus){
        ///只清空使用了@SessionAttributes的session对象
        sessionStatus.setComplete();
        return "login";
    }

    private void getSubAuthorityList(List<AuthorityInfo> subList, List<AuthorityInfo> authList, Integer authorityId) {
        if (authList != null && authList.size() > 0) {
            for (AuthorityInfo anth : authList) {
                if (anth != null && anth.getAuthorityPid() != null && anth.getAuthorityPid().equals(authorityId)) {
                    subList.add(anth);
                    //继续构建下级菜单
                    getSubAuthorityList(subList, authList, anth.getAuthorityId());
                }
            }
        }
    }
}
