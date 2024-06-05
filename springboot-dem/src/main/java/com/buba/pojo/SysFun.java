package com.buba.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 博酱
 * @date 2024/2/26 13:33
 * @mood happy
 */
@Data
public class SysFun {
    private Integer nodeId;
    private String displayName;
    private  String nodeURL;
    private  Integer displayOrder;
    private  Integer parentNodeId;
    private List<SysFun> childList;

    //添加子菜单
    public void  addChild(SysFun sysFun){
        if (this.childList==null){
            this.childList=new ArrayList<>();
        }
            childList.add(sysFun);

    }
}
