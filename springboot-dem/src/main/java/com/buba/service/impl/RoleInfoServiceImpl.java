package com.buba.service.impl;

import com.buba.dao.RoleInfoMapper;
import com.buba.pojo.RoleInfo;
import com.buba.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 博酱
 * @date 2024/2/27 14:26
 * @mood happy
 */
@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Override
    public List<RoleInfo> selRoleInfo() {
        return roleInfoMapper.selRoleInfo();
    }

    @Override
    public List<Integer> selRoleMenu(Integer roleId) {
        return roleInfoMapper.selRoleMenu(roleId);
    }

    @Override
    public int addRole(String roleName) {
        return roleInfoMapper.addRole(roleName);
    }

    @Override
    public int delRole(Integer roleId) {
        return roleInfoMapper.delRole(roleId);
    }

    @Override
    public int addRoleMenu(Map<String, Object> map) {
        Integer roleId = Integer.valueOf( map.get("roleId")+"");
        System.out.println("roleId = " + roleId);
        roleInfoMapper.delRoleMenu(roleId);
        return roleInfoMapper.addRoleMenu(map);
    }


}
