package com.buba.controller;

import com.buba.pojo.DepartInfo;
import com.buba.pojo.Message;
import com.buba.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(allowCredentials ="true",originPatterns = "*")// 允许跨域请求访问
public class DepartController {
    @Autowired
    private DepartService departService;
    @GetMapping("/departInfo")
    public List<DepartInfo> selDepart(){
        return departService.selDepart();
    }
    @DeleteMapping("/departInfo/{id}")
    public Message delDepart(@PathVariable Integer id){
        int i = departService.delDepart(id);
        if (i ==0){
            return new Message(0,"删除失败");
        }
        return new Message(1,"删除成功");
    }

    @PutMapping("/departInfo")
    public Message updDepart(@RequestParam Map<String,Object> map){
        System.out.println(map);
        int i = departService.updDepart(map);
        if (i ==0){
            return new Message(0,"修改失败");
        }
        return new Message(1,"修改成功");
    }

}
