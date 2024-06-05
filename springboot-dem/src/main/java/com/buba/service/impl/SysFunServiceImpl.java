package com.buba.service.impl;

import com.buba.dao.SysFunMapper;
import com.buba.pojo.SysFun;
import com.buba.service.SysFunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 博酱
 * @date 2024/2/26 14:08
 * @mood happy
 */
@Service
public class SysFunServiceImpl implements SysFunService {

    @Autowired
    private SysFunMapper sysFunMapper;
    @Override
    public List<SysFun> selSysFun() {
        List<SysFun> sysFuns = sysFunMapper.selSysFun();
        return adjust(sysFuns);
    }

    @Override
    public List<SysFun> selSysFunByRoleId(Integer roleId) {
        List<SysFun> sysFuns = sysFunMapper.selSysFunByRoleId(roleId);
        return adjust(sysFuns);
    }
    //调整字符集菜单结构
    private List<SysFun> adjust(List<SysFun> sysFuns){
        List<SysFun> newSysFuns =new ArrayList<>();
        //查询出所有父菜单
        sysFuns.forEach(sysFun -> {
            if (sysFun.getParentNodeId()==0){
                for (SysFun s : sysFuns){
                    if (s.getParentNodeId()==sysFun.getNodeId())
                        sysFun.addChild(s);
                }
                newSysFuns.add(sysFun);
            }
        });
        return newSysFuns;
    }
}
