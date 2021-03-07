package com.ly.agrManader.dao.bo;

public class UserRef {
    private String userId;

    private String username;

    private String password;

    private Integer level;

    private Integer beUser;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getBeUser() {
        return beUser;
    }

    public void setBeUser(Integer beUser) {
        this.beUser = beUser;
    }
}