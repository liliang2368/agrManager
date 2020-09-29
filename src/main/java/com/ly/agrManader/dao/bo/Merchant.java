package com.ly.agrManader.dao.bo;

public class Merchant {
    private Integer userId;

    private String username;

    private String password;

    private String state;

    private String busliunceUrl;

    private String phone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBusliunceUrl() {
        return busliunceUrl;
    }

    public void setBusliunceUrl(String busliunceUrl) {
        this.busliunceUrl = busliunceUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}