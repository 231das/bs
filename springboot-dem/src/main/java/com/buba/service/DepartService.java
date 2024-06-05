package com.buba.service;

import com.buba.pojo.DepartInfo;

import java.util.List;
import java.util.Map;

public interface DepartService {
    List<DepartInfo> selDepart();

    int delDepart(Integer id);

    int updDepart(Map<String, Object> map);
}
