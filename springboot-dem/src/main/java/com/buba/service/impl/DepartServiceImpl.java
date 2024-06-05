package com.buba.service.impl;

import com.buba.dao.DepartMapper;
import com.buba.pojo.DepartInfo;
import com.buba.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartMapper departMapper;
    @Override
    public List<DepartInfo> selDepart() {
        return departMapper.selDepart();
    }

    @Override
    public int delDepart(Integer id) {
        return departMapper.delDepart(id);
    }

    @Override
    public int updDepart(Map<String, Object> map) {
        return departMapper.updDepart(map);
    }

}
