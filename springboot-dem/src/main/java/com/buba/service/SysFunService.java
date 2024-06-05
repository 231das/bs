package com.buba.service;

import com.buba.pojo.SysFun;

import java.util.List;

/**
 * @author 博酱
 * @date 2024/2/26 14:08
 * @mood happy
 */
public interface SysFunService {
    List<SysFun> selSysFun();

    List<SysFun> selSysFunByRoleId(Integer roleId);
}
