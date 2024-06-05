package com.buba.controller;

import com.buba.pojo.Message;
import com.buba.pojo.RoleInfo;
import com.buba.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author 博酱
 * @date 2024/2/27 14:25
 * @mood happy
 */
@RestController
@CrossOrigin (allowCredentials ="true",originPatterns = "*")
public class RoleInfoController {
    @Autowired
    private RoleInfoService roleInfoService;

    @RequestMapping("/selRoleInfo")
    public List<RoleInfo> selRoleInfo(){
        return roleInfoService.selRoleInfo();
    }
    @RequestMapping("/selectRole")
    public List<Integer> selRoleMenu(@RequestParam("roleId") Integer roleId){
        return roleInfoService.selRoleMenu(roleId);
    }

    @RequestMapping("/addRole")
    public Message addRole(@RequestParam("roleName") String roleName){

        int cou =roleInfoService.addRole(roleName);
        if (cou==0){
            return new Message(0,"添加失败");
        }

        return new Message(1,"添加成功");
    }

    @RequestMapping("/delRole")
    public Message delRole(@RequestParam("roleId") Integer roleId){
        int cou =roleInfoService.delRole(roleId);
        if (cou==0){
            return new Message(0,"删除失败");
        }
        return new Message(1,"删除成功");
    }

    @RequestMapping("/addRoleMenu")
    public Message addRoleMenu(@RequestParam Map<String,Object> map){
        //将数组转为字符串
        String menuList =(String) map.get("menuList");
        map.put("nodeIds",menuList.split(","));
       int cou= roleInfoService.addRoleMenu(map);
       if (cou==0){
           return new Message(0,"保存失败");
       }
        return new Message(1,"保存成功");
    }

}
