package com.buba.service.impl;

import com.buba.dao.UserInfoMapper;
import com.buba.pojo.UserInfo;
import com.buba.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> selUserInfo() {
        return userInfoMapper.selUserInfo();
    }

    @Override
    public long selUserInfoCount(Map<String, Object> map) {
        return userInfoMapper.selUserInfoCount(map);
    }

    @Override
    public List<UserInfo> selUserInfoList(Map<String, Object> map) {
        return userInfoMapper.selUserInfoList(map);
    }


}
