package com.buba.service;

import com.buba.pojo.Institution;

import java.util.List;
import java.util.Map;

public interface InstitutionService {
    List<Institution> selInstitution();

    int addInstitution(Institution institution);

    int delInstitution(Integer id);

    int updInstitution(Map<String, Object> map);
}
