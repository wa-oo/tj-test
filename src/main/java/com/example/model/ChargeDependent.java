package com.example.model;

import java.math.BigDecimal;

public class ChargeDependent {
    private BigDecimal id;

    private String chargeId;

    private String chargeName;

    private String chargeAmount;

    private String createTime;

    private String createId;

    private String remark;

    private String state;

    private String materialValidity;

    private String lawName;

    private String lawNumber;

    private String lawText;

    private String fileId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getChargeId() {
        return chargeId;
    }

    public void setChargeId(String chargeId) {
        this.chargeId = chargeId == null ? null : chargeId.trim();
    }

    public String getChargeName() {
        return chargeName;
    }

    public void setChargeName(String chargeName) {
        this.chargeName = chargeName == null ? null : chargeName.trim();
    }

    public String getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount == null ? null : chargeAmount.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
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

    public String getMaterialValidity() {
        return materialValidity;
    }

    public void setMaterialValidity(String materialValidity) {
        this.materialValidity = materialValidity == null ? null : materialValidity.trim();
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName == null ? null : lawName.trim();
    }

    public String getLawNumber() {
        return lawNumber;
    }

    public void setLawNumber(String lawNumber) {
        this.lawNumber = lawNumber == null ? null : lawNumber.trim();
    }

    public String getLawText() {
        return lawText;
    }

    public void setLawText(String lawText) {
        this.lawText = lawText == null ? null : lawText.trim();
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }
}