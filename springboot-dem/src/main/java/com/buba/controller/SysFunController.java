package com.buba.controller;

import com.buba.pojo.SysFun;
import com.buba.pojo.UserInfo;
import com.buba.service.SysFunService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 博酱
 * @date 2024/2/26 13:36
 * @mood happy
 */
@RestController
@CrossOrigin (allowCredentials ="true",originPatterns = "*")
public class SysFunController {
    @Autowired
    private SysFunService sysFunService;

    @RequestMapping("/selSysFunByRoleId")
    public List<SysFun> selSysFunByRoleId(HttpSession session){
       UserInfo userInfo = (UserInfo) session.getAttribute("login");
        return sysFunService.selSysFunByRoleId(userInfo.getRoleId());
    }
    //查询菜单信息
    @RequestMapping("/selSysFun")
    public List<SysFun> selSysFun(){
        return sysFunService.selSysFun();
    }
}
