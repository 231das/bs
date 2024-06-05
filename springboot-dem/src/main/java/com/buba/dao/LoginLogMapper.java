package com.buba.dao;

import com.buba.pojo.LoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 博酱
 * @date 2024/3/6 8:36
 * @mood happy
 */
@Mapper
public interface LoginLogMapper<list> {
    void addLoginLog(LoginLog loginLog);

    long selLoginLogCount(Map<String, Object> map);

    List<LoginLog> selLoginLogList(Map<String, Object> map);

    long delLoginLog(List<Integer> list);
}
