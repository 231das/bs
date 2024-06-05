package com.buba.dao;

import com.buba.pojo.DepartInfo;

import java.util.List;
import java.util.Map;

public interface DepartMapper {
    List<DepartInfo> selDepart();

    int delDepart(Integer id);

    int updDepart(Map<String, Object> map);
}
