package com.buba.service;

import com.buba.pojo.RoleInfo;

import java.util.List;
import java.util.Map;

/**
 * @author 博酱
 * @date 2024/2/27 14:26
 * @mood happy
 */
public interface RoleInfoService {
    List<RoleInfo> selRoleInfo();

    List<Integer> selRoleMenu(Integer roleId);

    int addRole(String roleName);

    int delRole(Integer roleId);

    int addRoleMenu(Map<String, Object> map);
}
