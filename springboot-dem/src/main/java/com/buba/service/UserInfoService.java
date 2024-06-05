package com.buba.service;

import com.buba.pojo.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoService {
    List<UserInfo> selUserInfo();


    long selUserInfoCount(Map<String, Object> map);

    List<UserInfo> selUserInfoList(Map<String, Object> map);
}
