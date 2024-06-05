package com.buba.service.impl;

import com.buba.dao.InstitutionMapper;
import com.buba.pojo.Institution;
import com.buba.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InstitutionServiceImpl implements InstitutionService {
    @Autowired
    private InstitutionMapper institutionMapper;
    @Override
    public List<Institution> selInstitution() {
        return institutionMapper.selInstitution();
    }

    @Override
    public int addInstitution(Institution institution) {
        return institutionMapper.addInstitution(institution);
    }

    @Override
    public int delInstitution(Integer id) {
        return institutionMapper.delInstitution(id);
    }

    @Override
    public int updInstitution(Map<String, Object> map) {
        return institutionMapper.updInstitution(map);
    }


}
