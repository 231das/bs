package com.buba.service.impl;

import com.buba.dao.LoginMapper;
import com.buba.pojo.UserInfo;
import com.buba.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserInfo login(Map<String, Object> map) {
        return loginMapper.login(map);
    }
}
