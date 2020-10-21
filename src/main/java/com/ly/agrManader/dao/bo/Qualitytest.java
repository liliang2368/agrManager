package com.ly.agrManader.dao.bo;

public class Qualitytest {
    private Integer contractid;

    private String qualitystandard;

    private String specificstandard;

    private Integer certificate;

    private Integer stats;

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public String getQualitystandard() {
        return qualitystandard;
    }

    public void setQualitystandard(String qualitystandard) {
        this.qualitystandard = qualitystandard;
    }

    public String getSpecificstandard() {
        return specificstandard;
    }

    public void setSpecificstandard(String specificstandard) {
        this.specificstandard = specificstandard;
    }

    public Integer getCertificate() {
        return certificate;
    }

    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    public Integer getStats() {
        return stats;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }
}