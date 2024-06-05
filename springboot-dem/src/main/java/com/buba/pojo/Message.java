package com.buba.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 信息类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Integer code;
    private String message;
}
