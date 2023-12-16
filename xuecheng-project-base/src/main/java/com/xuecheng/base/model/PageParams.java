package com.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 分页参数
 */
@Data
@ToString
public class PageParams {
    //当前页
    @ApiModelProperty("当前页")
    private Integer pageNo=1;
    //每页条数
    @ApiModelProperty("每页条数")
    private Integer pageSize=10;

    public PageParams() {}

    public PageParams(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

}
