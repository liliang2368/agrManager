package com.ly.agrManader.dao.bo;

public class BugDts {
    private String bugId;

    private String createName;

    private String createTime;

    private String updateTime;

    private String bugName;

    private String bugDescribe;

    private Boolean bugState;

    private String bugOwner;

    public String getBugId() {
        return bugId;
    }

    public void setBugId(String bugId) {
        this.bugId = bugId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getBugName() {
        return bugName;
    }

    public void setBugName(String bugName) {
        this.bugName = bugName;
    }

    public String getBugDescribe() {
        return bugDescribe;
    }

    public void setBugDescribe(String bugDescribe) {
        this.bugDescribe = bugDescribe;
    }

    public Boolean getBugState() {
        return bugState;
    }

    public void setBugState(Boolean bugState) {
        this.bugState = bugState;
    }

    public String getBugOwner() {
        return bugOwner;
    }

    public void setBugOwner(String bugOwner) {
        this.bugOwner = bugOwner;
    }
}