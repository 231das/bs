package com.buba.pojo;

import lombok.Data;

/**
 * @author 博酱
 * @date 2024/3/6 8:36
 * @mood happy
 */
@Data
public class LoginLog {
    private Integer loginId;
    private String userId;
    private String loginTime;
    private Integer ifSuccess;
    private String loginUserIp;
}
