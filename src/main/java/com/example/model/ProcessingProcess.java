package com.example.model;

public class ProcessingProcess {
    private Integer id;

    private Integer informationId;

    private String link;

    private String step;

    private String handler;

    private String timeLimit;

    private String reviewCriteria;

    private String basis;

    private String processingResults;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step == null ? null : step.trim();
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public String getReviewCriteria() {
        return reviewCriteria;
    }

    public void setReviewCriteria(String reviewCriteria) {
        this.reviewCriteria = reviewCriteria == null ? null : reviewCriteria.trim();
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis == null ? null : basis.trim();
    }

    public String getProcessingResults() {
        return processingResults;
    }

    public void setProcessingResults(String processingResults) {
        this.processingResults = processingResults == null ? null : processingResults.trim();
    }
}