package com.buba.dao;

import com.buba.pojo.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserInfoMapper {
    List<UserInfo> selUserInfo();

    long selUserInfoCount(Map<String, Object> map);

    List<UserInfo> selUserInfoList(Map<String, Object> map);
}
