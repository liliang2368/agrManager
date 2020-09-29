package com.ly.agrManader.util;

import java.io.Serializable;
import java.util.List;

public class PageObject implements Serializable {
    private List<Object> records;
    //对象的总行数
    private Integer counts;
    //当前分页大小
    private Integer pagesize;
    //当前是第几页
    private Integer current;
    //总页数
    private Integer pagecount;

    public PageObject()
    {

    }
    public PageObject(List records, Integer counts, Integer pagesize, Integer current)
    {
        this.counts=counts;
        this.records=records;
        this.pagesize=pagesize;
        this.current=current;
        this.pagecount=(counts/pagesize==0)?counts/pagesize+1:counts/pagesize;
    }

    public List<Object> getRecords() {
        return records;
    }

    public void setRecords(List<Object> records) {
        this.records = records;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getPagecount() {
        return pagecount;
    }

    public void setPagecount(Integer pagecount) {
        this.pagecount = pagecount;
    }
}
