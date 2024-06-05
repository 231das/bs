package com.buba.controller;

import com.buba.pojo.LoginLog;
import com.buba.pojo.UserInfo;
import com.buba.service.UserInfoService;
import com.buba.util.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(allowCredentials ="true",originPatterns = "*")// 允许跨域请求访问
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/selUserInfo")
    public List<UserInfo> selUserInfo(){
        return userInfoService.selUserInfo();
    }
    @RequestMapping("/selUserInfoList")
    public Pagination<UserInfo> selUserInfoList(@RequestParam Map<String, Object> map) {
        System.out.println(map);
        Pagination<UserInfo> pagination = new Pagination<>();
        // 将当前页和每页条数存入分页对象中
//        pagination.setPageNow(Long.parseLong(map.get("pageNow") + ""));
//        pagination.setLimit(Long.parseLong(map.get("limit") + ""));
        // 分页的两个查询条件
        map.put("index", pagination.computeIndex());
        map.put("limit", pagination.getLimit());
        // 查询总条数
        pagination.setPageCount(userInfoService.selUserInfoCount(map));
//        pagination.computePageTotal();
        pagination.setList(userInfoService.selUserInfoList(map));
        System.out.println(userInfoService.selUserInfoList(map));
        return pagination;
    }
}
