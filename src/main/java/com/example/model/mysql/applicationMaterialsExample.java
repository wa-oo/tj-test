package com.example.model.mysql;

import java.util.ArrayList;
import java.util.List;

public class applicationMaterialsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public applicationMaterialsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNull() {
            addCriterion("information_id is null");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNotNull() {
            addCriterion("information_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformationIdEqualTo(Integer value) {
            addCriterion("information_id =", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotEqualTo(Integer value) {
            addCriterion("information_id <>", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThan(Integer value) {
            addCriterion("information_id >", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_id >=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThan(Integer value) {
            addCriterion("information_id <", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("information_id <=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdIn(List<Integer> values) {
            addCriterion("information_id in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotIn(List<Integer> values) {
            addCriterion("information_id not in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("information_id between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("information_id not between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelIsNull() {
            addCriterion("material_level is null");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelIsNotNull() {
            addCriterion("material_level is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelEqualTo(String value) {
            addCriterion("material_level =", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotEqualTo(String value) {
            addCriterion("material_level <>", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelGreaterThan(String value) {
            addCriterion("material_level >", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelGreaterThanOrEqualTo(String value) {
            addCriterion("material_level >=", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelLessThan(String value) {
            addCriterion("material_level <", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelLessThanOrEqualTo(String value) {
            addCriterion("material_level <=", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelLike(String value) {
            addCriterion("material_level like", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotLike(String value) {
            addCriterion("material_level not like", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelIn(List<String> values) {
            addCriterion("material_level in", values, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotIn(List<String> values) {
            addCriterion("material_level not in", values, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelBetween(String value1, String value2) {
            addCriterion("material_level between", value1, value2, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotBetween(String value1, String value2) {
            addCriterion("material_level not between", value1, value2, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesIsNull() {
            addCriterion("material_properties is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesIsNotNull() {
            addCriterion("material_properties is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesEqualTo(String value) {
            addCriterion("material_properties =", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesNotEqualTo(String value) {
            addCriterion("material_properties <>", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesGreaterThan(String value) {
            addCriterion("material_properties >", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("material_properties >=", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesLessThan(String value) {
            addCriterion("material_properties <", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesLessThanOrEqualTo(String value) {
            addCriterion("material_properties <=", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesLike(String value) {
            addCriterion("material_properties like", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesNotLike(String value) {
            addCriterion("material_properties not like", value, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesIn(List<String> values) {
            addCriterion("material_properties in", values, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesNotIn(List<String> values) {
            addCriterion("material_properties not in", values, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesBetween(String value1, String value2) {
            addCriterion("material_properties between", value1, value2, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialPropertiesNotBetween(String value1, String value2) {
            addCriterion("material_properties not between", value1, value2, "materialProperties");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNull() {
            addCriterion("material_source is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNotNull() {
            addCriterion("material_source is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceEqualTo(String value) {
            addCriterion("material_source =", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotEqualTo(String value) {
            addCriterion("material_source <>", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThan(String value) {
            addCriterion("material_source >", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThanOrEqualTo(String value) {
            addCriterion("material_source >=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThan(String value) {
            addCriterion("material_source <", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThanOrEqualTo(String value) {
            addCriterion("material_source <=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLike(String value) {
            addCriterion("material_source like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotLike(String value) {
            addCriterion("material_source not like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIn(List<String> values) {
            addCriterion("material_source in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotIn(List<String> values) {
            addCriterion("material_source not in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceBetween(String value1, String value2) {
            addCriterion("material_source between", value1, value2, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotBetween(String value1, String value2) {
            addCriterion("material_source not between", value1, value2, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationIsNull() {
            addCriterion("material_preparation is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationIsNotNull() {
            addCriterion("material_preparation is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationEqualTo(String value) {
            addCriterion("material_preparation =", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationNotEqualTo(String value) {
            addCriterion("material_preparation <>", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationGreaterThan(String value) {
            addCriterion("material_preparation >", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationGreaterThanOrEqualTo(String value) {
            addCriterion("material_preparation >=", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationLessThan(String value) {
            addCriterion("material_preparation <", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationLessThanOrEqualTo(String value) {
            addCriterion("material_preparation <=", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationLike(String value) {
            addCriterion("material_preparation like", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationNotLike(String value) {
            addCriterion("material_preparation not like", value, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationIn(List<String> values) {
            addCriterion("material_preparation in", values, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationNotIn(List<String> values) {
            addCriterion("material_preparation not in", values, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationBetween(String value1, String value2) {
            addCriterion("material_preparation between", value1, value2, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andMaterialPreparationNotBetween(String value1, String value2) {
            addCriterion("material_preparation not between", value1, value2, "materialPreparation");
            return (Criteria) this;
        }

        public Criteria andLegalBasisIsNull() {
            addCriterion("legal_basis is null");
            return (Criteria) this;
        }

        public Criteria andLegalBasisIsNotNull() {
            addCriterion("legal_basis is not null");
            return (Criteria) this;
        }

        public Criteria andLegalBasisEqualTo(String value) {
            addCriterion("legal_basis =", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisNotEqualTo(String value) {
            addCriterion("legal_basis <>", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisGreaterThan(String value) {
            addCriterion("legal_basis >", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisGreaterThanOrEqualTo(String value) {
            addCriterion("legal_basis >=", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisLessThan(String value) {
            addCriterion("legal_basis <", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisLessThanOrEqualTo(String value) {
            addCriterion("legal_basis <=", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisLike(String value) {
            addCriterion("legal_basis like", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisNotLike(String value) {
            addCriterion("legal_basis not like", value, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisIn(List<String> values) {
            addCriterion("legal_basis in", values, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisNotIn(List<String> values) {
            addCriterion("legal_basis not in", values, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisBetween(String value1, String value2) {
            addCriterion("legal_basis between", value1, value2, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andLegalBasisNotBetween(String value1, String value2) {
            addCriterion("legal_basis not between", value1, value2, "legalBasis");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaIsNull() {
            addCriterion("review_criteria is null");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaIsNotNull() {
            addCriterion("review_criteria is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaEqualTo(String value) {
            addCriterion("review_criteria =", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaNotEqualTo(String value) {
            addCriterion("review_criteria <>", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaGreaterThan(String value) {
            addCriterion("review_criteria >", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaGreaterThanOrEqualTo(String value) {
            addCriterion("review_criteria >=", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaLessThan(String value) {
            addCriterion("review_criteria <", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaLessThanOrEqualTo(String value) {
            addCriterion("review_criteria <=", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaLike(String value) {
            addCriterion("review_criteria like", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaNotLike(String value) {
            addCriterion("review_criteria not like", value, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaIn(List<String> values) {
            addCriterion("review_criteria in", values, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaNotIn(List<String> values) {
            addCriterion("review_criteria not in", values, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaBetween(String value1, String value2) {
            addCriterion("review_criteria between", value1, value2, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andReviewCriteriaNotBetween(String value1, String value2) {
            addCriterion("review_criteria not between", value1, value2, "reviewCriteria");
            return (Criteria) this;
        }

        public Criteria andEmptyTableIsNull() {
            addCriterion("empty_table is null");
            return (Criteria) this;
        }

        public Criteria andEmptyTableIsNotNull() {
            addCriterion("empty_table is not null");
            return (Criteria) this;
        }

        public Criteria andEmptyTableEqualTo(String value) {
            addCriterion("empty_table =", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableNotEqualTo(String value) {
            addCriterion("empty_table <>", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableGreaterThan(String value) {
            addCriterion("empty_table >", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableGreaterThanOrEqualTo(String value) {
            addCriterion("empty_table >=", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableLessThan(String value) {
            addCriterion("empty_table <", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableLessThanOrEqualTo(String value) {
            addCriterion("empty_table <=", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableLike(String value) {
            addCriterion("empty_table like", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableNotLike(String value) {
            addCriterion("empty_table not like", value, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableIn(List<String> values) {
            addCriterion("empty_table in", values, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableNotIn(List<String> values) {
            addCriterion("empty_table not in", values, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableBetween(String value1, String value2) {
            addCriterion("empty_table between", value1, value2, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andEmptyTableNotBetween(String value1, String value2) {
            addCriterion("empty_table not between", value1, value2, "emptyTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableIsNull() {
            addCriterion("sample_table is null");
            return (Criteria) this;
        }

        public Criteria andSampleTableIsNotNull() {
            addCriterion("sample_table is not null");
            return (Criteria) this;
        }

        public Criteria andSampleTableEqualTo(String value) {
            addCriterion("sample_table =", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableNotEqualTo(String value) {
            addCriterion("sample_table <>", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableGreaterThan(String value) {
            addCriterion("sample_table >", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableGreaterThanOrEqualTo(String value) {
            addCriterion("sample_table >=", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableLessThan(String value) {
            addCriterion("sample_table <", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableLessThanOrEqualTo(String value) {
            addCriterion("sample_table <=", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableLike(String value) {
            addCriterion("sample_table like", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableNotLike(String value) {
            addCriterion("sample_table not like", value, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableIn(List<String> values) {
            addCriterion("sample_table in", values, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableNotIn(List<String> values) {
            addCriterion("sample_table not in", values, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableBetween(String value1, String value2) {
            addCriterion("sample_table between", value1, value2, "sampleTable");
            return (Criteria) this;
        }

        public Criteria andSampleTableNotBetween(String value1, String value2) {
            addCriterion("sample_table not between", value1, value2, "sampleTable");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}