package com.ly.agrManader.dao.bo;

public class Dept {
    private Integer id;

    private Integer deptId;

    private String deptName;

    private String deptOwner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptOwner() {
        return deptOwner;
    }

    public void setDeptOwner(String deptOwner) {
        this.deptOwner = deptOwner;
    }
}