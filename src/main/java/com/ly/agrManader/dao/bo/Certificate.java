package com.ly.agrManader.dao.bo;

public class Certificate {
    private Integer id;

    private String certificateName;

    private String certificatePicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificatePicture() {
        return certificatePicture;
    }

    public void setCertificatePicture(String certificatePicture) {
        this.certificatePicture = certificatePicture;
    }
}