package com.ly.agrManader.dao.bo;

public class ReqDes {
    private Integer desId;

    private String reqContent;

    private String startTime;

    private String endTime;

    private String depReqOp;

    private String beReqOp;

    private Integer reqState;

    private Integer produceId;

    public Integer getDesId() {
        return desId;
    }

    public void setDesId(Integer desId) {
        this.desId = desId;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDepReqOp() {
        return depReqOp;
    }

    public void setDepReqOp(String depReqOp) {
        this.depReqOp = depReqOp;
    }

    public String getBeReqOp() {
        return beReqOp;
    }

    public void setBeReqOp(String beReqOp) {
        this.beReqOp = beReqOp;
    }

    public Integer getReqState() {
        return reqState;
    }

    public void setReqState(Integer reqState) {
        this.reqState = reqState;
    }

    public Integer getProduceId() {
        return produceId;
    }

    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }
}