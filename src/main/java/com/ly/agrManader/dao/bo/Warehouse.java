package com.ly.agrManader.dao.bo;

public class Warehouse {
    private Integer warehouseid;

    private String warehousestorage;

    private Integer size;

    private String stats;

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getWarehousestorage() {
        return warehousestorage;
    }

    public void setWarehousestorage(String warehousestorage) {
        this.warehousestorage = warehousestorage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }
}