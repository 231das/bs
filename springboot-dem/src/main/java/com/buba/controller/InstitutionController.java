package com.buba.controller;

import com.buba.pojo.Institution;
import com.buba.pojo.Message;
import com.buba.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(allowCredentials ="true",originPatterns = "*")// 允许跨域请求访问
public class InstitutionController {
    @Autowired
    private InstitutionService institutionService;

    @RequestMapping("/selInstitution")
    public List<Institution> selInstitution(){
        return institutionService.selInstitution();
    }

    @RequestMapping("/addInstitution")
    public Message addInstitution(Institution institution){
        System.out.println(institution);
        System.out.println(111);
        int count =institutionService.addInstitution(institution);
        if (count ==0){
            return new Message(0,"添加失败");
        }
        return new Message(1,"添加成功");
    }

    @RequestMapping("/delInstitution")
    public Message delInstitution(@RequestParam("id")Integer id){
        int count =institutionService.delInstitution(id);
        if (count ==0){
            return new Message(0,"删除失败");
        }
        return new Message(1,"删除成功");
    }
    @RequestMapping("/updInstitution")
    public Message updInstitution(@RequestParam Map<String,Object> map){
        System.out.println(map);
       int count= institutionService.updInstitution(map);
       if (count ==0){
           return new Message(0,"修改失败");
       }
        return new Message(1,"修改成功");
    }
}
