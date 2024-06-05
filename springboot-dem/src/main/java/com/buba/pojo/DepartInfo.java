package com.buba.pojo;

import lombok.Data;

@Data
public class DepartInfo {
    private Integer departId;
    private String departName;
    private String principalUser;
    private UserInfo userInfo;
    private Long connectTelNo;
    private Long connectMobileTelNo;
    private Long faxes;
    private Integer branchId;
    private Institution institution;
}
