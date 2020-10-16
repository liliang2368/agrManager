package com.ly.agrManader.util;


import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Page对象.<br>
 * 提供给外部系统的分页Bean<br>
 *
 * @param <T>
 *            结果集的数据类型 Date: 2017年2月22日 <br>
 *            Copyright (c) 2017 asiainfo.com <br>
 * @author gucl
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageArg implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 请求查询的页码
     */
    private int pageNum = 1;

    /**
     * 每页显示条数
     */
    private int pageSize=10;

    public PageArg() {
        super();
    }

    public PageArg(int pageNum, int pageSize) {
        this.pageNum=pageNum;
        this.pageSize=pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
