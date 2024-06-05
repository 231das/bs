package com.buba.controller;

import com.buba.pojo.LoginLog;
import com.buba.pojo.Message;
import com.buba.service.LoginLogService;
import com.buba.util.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(allowCredentials = "true"
        , originPatterns = "*")
public class LoginLogController {
    @Autowired
    private LoginLogService loginLogService;

    @RequestMapping("/selLoginLogList")
    public Pagination<LoginLog> selLoginLogList(@RequestParam Map<String, Object> map) {
        Pagination<LoginLog> pagination = new Pagination<>();
        // 将当前页和每页条数存入分页对象中
        pagination.setPageNow(Long.parseLong(map.get("pageNow") + ""));
        pagination.setLimit(Long.parseLong(map.get("limit") + ""));
        // 分页的两个查询条件
        map.put("index", pagination.computeIndex());
        map.put("limit", pagination.getLimit());
        // 查询总条数
        pagination.setPageCount(loginLogService.selLoginLogCount(map));
        pagination.computePageTotal();
        pagination.setList(loginLogService.selLoginLogList(map));
        return pagination;
    }

    @RequestMapping("/delLoginLog")
    public Message delLoginLog(@RequestParam("ids") String ids) {
        long count = loginLogService.delLoginLog(ids);
        return new Message(1, "删除了" + count + "条数据");
    }
}
