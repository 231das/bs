package com.buba.util;

import lombok.Data;

import java.util.List;

/**
 * @author 博酱
 * @date 2024/3/6 14:26
 * @mood happy
 */
@Data
public class Pagination<T> {
    private long pageNow;//当前页
    private long limit;//每页条数
    private long pageCount;//总条数
    private  long pageTotal;//总页数
    private List<T> list;//结果列表

    //计算总条数
    public void computePageTotal() {
        if (pageCount%limit==0){
            this.pageTotal =pageCount/limit;
        }else {
            this.pageTotal =pageCount/limit+1;
        }
    }
    //当前页数
    public long computeIndex(){
        long index = (pageNow - 1) * limit;
        return index;
    }
}



