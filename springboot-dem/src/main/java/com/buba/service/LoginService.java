package com.buba.service;

import com.buba.pojo.UserInfo;

import java.util.Map;

public interface LoginService {
    UserInfo login(Map<String, Object> map);
}
