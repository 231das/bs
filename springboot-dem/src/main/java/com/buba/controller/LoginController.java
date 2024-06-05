package com.buba.controller;

import com.buba.pojo.LoginLog;
import com.buba.pojo.Message;
import com.buba.pojo.UserInfo;
import com.buba.service.LoginLogService;
import com.buba.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// 登录
@RestController
@CrossOrigin (allowCredentials ="true",originPatterns = "*")// 允许跨域请求访问
public class LoginController<HttpServletRequest> {
    // 将业务层注入到控制层
    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginLogService loginLogService;
    @RequestMapping("/login")
    public Message login(@RequestParam Map<String,Object> map, jakarta.servlet.http.HttpServletRequest request){
        UserInfo userInfo = loginService.login(map);
        Message message = new Message();//返回前端的消息
        LoginLog loginLog = new LoginLog(); //储存登录日志
        if (userInfo==null){
           message.setCode(0);
           message.setMessage("登录失败");
           loginLog.setIfSuccess(0);
        }else {
            message.setCode(1);
            message.setMessage("登录成功");
            loginLog.setIfSuccess(1);
            loginLog.setUserId(userInfo.getUserId());
            request.getSession().setAttribute("login",userInfo);
        }
        //获取ip
        loginLog.setLoginUserIp(request.getRemoteAddr());
        //将登录日志存到数据库中
        loginLogService.addLoginLog(loginLog);
        return message;
    }

    @RequestMapping("/selLoginUserInfo")
    public UserInfo selLoginUserInfo(HttpSession session){
        return (UserInfo) session.getAttribute("login");
    }
}
