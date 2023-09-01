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
    private Long pageNo=1L;
    //每页条数
    @ApiModelProperty("每页条数")
    private Long pageSize=10L;

    public PageParams() {}

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

}
