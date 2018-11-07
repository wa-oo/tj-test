package com.example.model;

import java.util.Date;

public class SpecialInfo {
    private String flowId;

    private String flowName;

    private String flowType;

    private String nodeName;

    private String nodePrevious;

    private String nodeNext;

    private String reviewName;

    private String reviewId;

    private Date reviewTime;

    private String state;

    private String remark;

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName == null ? null : flowName.trim();
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodePrevious() {
        return nodePrevious;
    }

    public void setNodePrevious(String nodePrevious) {
        this.nodePrevious = nodePrevious == null ? null : nodePrevious.trim();
    }

    public String getNodeNext() {
        return nodeNext;
    }

    public void setNodeNext(String nodeNext) {
        this.nodeNext = nodeNext == null ? null : nodeNext.trim();
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName == null ? null : reviewName.trim();
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId == null ? null : reviewId.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}