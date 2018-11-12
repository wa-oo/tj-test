package com.example.model;

import java.util.Date;

public class MenuInformation {
    private String matterId;

    private String implementId;

    private String matterType;

    private String matterName;

    private String matterSubname;

    private String handleItems;

    private String onlyOne;

    private String subjectId;

    private String matterVersion;

    private Date createTime;

    private String businessDept;

    private String state;

    public String getMatterId() {
        return matterId;
    }

    public void setMatterId(String matterId) {
        this.matterId = matterId == null ? null : matterId.trim();
    }

    public String getImplementId() {
        return implementId;
    }

    public void setImplementId(String implementId) {
        this.implementId = implementId == null ? null : implementId.trim();
    }

    public String getMatterType() {
        return matterType;
    }

    public void setMatterType(String matterType) {
        this.matterType = matterType == null ? null : matterType.trim();
    }

    public String getMatterName() {
        return matterName;
    }

    public void setMatterName(String matterName) {
        this.matterName = matterName == null ? null : matterName.trim();
    }

    public String getMatterSubname() {
        return matterSubname;
    }

    public void setMatterSubname(String matterSubname) {
        this.matterSubname = matterSubname == null ? null : matterSubname.trim();
    }

    public String getHandleItems() {
        return handleItems;
    }

    public void setHandleItems(String handleItems) {
        this.handleItems = handleItems == null ? null : handleItems.trim();
    }

    public String getOnlyOne() {
        return onlyOne;
    }

    public void setOnlyOne(String onlyOne) {
        this.onlyOne = onlyOne == null ? null : onlyOne.trim();
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    public String getMatterVersion() {
        return matterVersion;
    }

    public void setMatterVersion(String matterVersion) {
        this.matterVersion = matterVersion == null ? null : matterVersion.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBusinessDept() {
        return businessDept;
    }

    public void setBusinessDept(String businessDept) {
        this.businessDept = businessDept == null ? null : businessDept.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}