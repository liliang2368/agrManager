package com.ly.agrManader.dao.bo;

public class Workorder {
    private Integer workorderid;

    private String problemdescription;

    private String solution;

    private String stats;

    private String returnvisit;

    private Double amount;

    public Integer getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(Integer workorderid) {
        this.workorderid = workorderid;
    }

    public String getProblemdescription() {
        return problemdescription;
    }

    public void setProblemdescription(String problemdescription) {
        this.problemdescription = problemdescription;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public String getReturnvisit() {
        return returnvisit;
    }

    public void setReturnvisit(String returnvisit) {
        this.returnvisit = returnvisit;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}