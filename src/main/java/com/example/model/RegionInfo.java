package com.example.model;

import java.util.Date;

public class RegionInfo {
    private String areaId;

    private String areaName;

    private String areaParentid;

    private String category;

    private Date createTime;

    private String createId;

    private Date modifyTime;

    private String modifyId;

    private String remark;

    private String state;

    private String longitude;

    private String latitude;

    private String 与中央2.0对接;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getAreaParentid() {
        return areaParentid;
    }

    public void setAreaParentid(String areaParentid) {
        this.areaParentid = areaParentid == null ? null : areaParentid.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String get与中央2.0对接() {
        return 与中央2.0对接;
    }

    public void set与中央2.0对接(String 与中央2.0对接) {
        this.与中央2.0对接 = 与中央2.0对接 == null ? null : 与中央2.0对接.trim();
    }
}