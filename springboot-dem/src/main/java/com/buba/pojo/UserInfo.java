package com.buba.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class UserInfo {
    private String userId;
    private String userName;
    private String password;
    private Integer departId;
    private DepartInfo departInfo;
    private Integer gender;
    private Integer roleId;
    private UserState us;
    private Integer userState;
    private RoleInfo roleInfo;
    private String headImg;
}
