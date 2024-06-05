package com.buba.service.impl;

import com.buba.dao.LoginLogMapper;
import com.buba.pojo.LoginLog;
import com.buba.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 博酱
 * @date 2024/3/6 8:35
 * @mood happy
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Autowired
    private LoginLogMapper loginLogMapper;
    @Override
    public void addLoginLog(LoginLog loginLog) {
        loginLogMapper.addLoginLog(loginLog);
    }

    @Override
    public long selLoginLogCount(Map<String, Object> map) {
        return loginLogMapper.selLoginLogCount(map);
    }

    @Override
    public List<LoginLog> selLoginLogList(Map<String, Object> map) {
        return loginLogMapper.selLoginLogList(map);
    }

    @Override
    public long delLoginLog(String ids) {
        List<Integer> list = new ArrayList<>();
        for(String id:ids.split(","))
            list.add(Integer.valueOf(id));
        return loginLogMapper.delLoginLog(list);
    }

}
