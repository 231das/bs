package com.buba.util;

import com.buba.pojo.Message;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Message handleException(Exception e) {
        e.printStackTrace();
        return new Message(0, "发生错误");
    }
}
