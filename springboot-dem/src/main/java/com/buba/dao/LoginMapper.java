package com.buba.dao;

import com.buba.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginMapper{
    UserInfo login(Map<String,Object> map);
    
}
