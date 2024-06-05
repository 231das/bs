package com.buba.service;

import com.buba.pojo.LoginLog;

import java.util.List;
import java.util.Map;

/**
 * @author 博酱
 * @date 2024/3/6 8:35
 * @mood happy
 */
public interface LoginLogService {
    void addLoginLog(LoginLog loginLog);

    long selLoginLogCount(Map<String, Object> map);

    List<LoginLog> selLoginLogList(Map<String, Object> map);

    long delLoginLog(String ids);
}
