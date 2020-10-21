package com.ly.agrManader.dao.bo;

import java.util.Date;

public class Cooperate {
    private Integer cooperativeid;

    private String cooperativename;

    private String contacts;

    private String phone;

    private String address;

    private Date timein;

    private Date timeout;

    private Integer sarketstaff;

    private Date time;

    private Integer reputation;

    public Integer getCooperativeid() {
        return cooperativeid;
    }

    public void setCooperativeid(Integer cooperativeid) {
        this.cooperativeid = cooperativeid;
    }

    public String getCooperativename() {
        return cooperativename;
    }

    public void setCooperativename(String cooperativename) {
        this.cooperativename = cooperativename;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTimein() {
        return timein;
    }

    public void setTimein(Date timein) {
        this.timein = timein;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public Integer getSarketstaff() {
        return sarketstaff;
    }

    public void setSarketstaff(Integer sarketstaff) {
        this.sarketstaff = sarketstaff;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }
}