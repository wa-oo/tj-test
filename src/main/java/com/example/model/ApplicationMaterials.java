package com.example.model;

public class ApplicationMaterials {
    private Integer id;

    private Integer informationId;

    private String materialName;

    private String materialLevel;

    private String materialProperties;

    private String materialSource;

    private String materialPreparation;

    private String legalBasis;

    private String reviewCriteria;

    private String emptyTable;

    private String sampleTable;

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

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getMaterialLevel() {
        return materialLevel;
    }

    public void setMaterialLevel(String materialLevel) {
        this.materialLevel = materialLevel == null ? null : materialLevel.trim();
    }

    public String getMaterialProperties() {
        return materialProperties;
    }

    public void setMaterialProperties(String materialProperties) {
        this.materialProperties = materialProperties == null ? null : materialProperties.trim();
    }

    public String getMaterialSource() {
        return materialSource;
    }

    public void setMaterialSource(String materialSource) {
        this.materialSource = materialSource == null ? null : materialSource.trim();
    }

    public String getMaterialPreparation() {
        return materialPreparation;
    }

    public void setMaterialPreparation(String materialPreparation) {
        this.materialPreparation = materialPreparation == null ? null : materialPreparation.trim();
    }

    public String getLegalBasis() {
        return legalBasis;
    }

    public void setLegalBasis(String legalBasis) {
        this.legalBasis = legalBasis == null ? null : legalBasis.trim();
    }

    public String getReviewCriteria() {
        return reviewCriteria;
    }

    public void setReviewCriteria(String reviewCriteria) {
        this.reviewCriteria = reviewCriteria == null ? null : reviewCriteria.trim();
    }

    public String getEmptyTable() {
        return emptyTable;
    }

    public void setEmptyTable(String emptyTable) {
        this.emptyTable = emptyTable == null ? null : emptyTable.trim();
    }

    public String getSampleTable() {
        return sampleTable;
    }

    public void setSampleTable(String sampleTable) {
        this.sampleTable = sampleTable == null ? null : sampleTable.trim();
    }
}