package com.buba.dao;

import com.buba.pojo.SysFun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 博酱
 * @date 2024/2/26 14:09
 * @mood happy
 */
@Mapper
public interface SysFunMapper {
    List<SysFun> selSysFun();

    List<SysFun> selSysFunByRoleId(Integer roleId);
}
