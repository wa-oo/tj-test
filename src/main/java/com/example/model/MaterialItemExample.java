package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MaterialItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialItemExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNull() {
            addCriterion("MATERIAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNotNull() {
            addCriterion("MATERIAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdEqualTo(String value) {
            addCriterion("MATERIAL_ID =", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotEqualTo(String value) {
            addCriterion("MATERIAL_ID <>", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThan(String value) {
            addCriterion("MATERIAL_ID >", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_ID >=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThan(String value) {
            addCriterion("MATERIAL_ID <", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_ID <=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLike(String value) {
            addCriterion("MATERIAL_ID like", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotLike(String value) {
            addCriterion("MATERIAL_ID not like", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIn(List<String> values) {
            addCriterion("MATERIAL_ID in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotIn(List<String> values) {
            addCriterion("MATERIAL_ID not in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdBetween(String value1, String value2) {
            addCriterion("MATERIAL_ID between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_ID not between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("MATERIAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("MATERIAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("MATERIAL_NAME =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("MATERIAL_NAME <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("MATERIAL_NAME >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NAME >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("MATERIAL_NAME <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_NAME <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("MATERIAL_NAME like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("MATERIAL_NAME not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("MATERIAL_NAME in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("MATERIAL_NAME not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("MATERIAL_NAME between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_NAME not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andStandardTypeIsNull() {
            addCriterion("STANDARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStandardTypeIsNotNull() {
            addCriterion("STANDARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStandardTypeEqualTo(String value) {
            addCriterion("STANDARD_TYPE =", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotEqualTo(String value) {
            addCriterion("STANDARD_TYPE <>", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeGreaterThan(String value) {
            addCriterion("STANDARD_TYPE >", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARD_TYPE >=", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeLessThan(String value) {
            addCriterion("STANDARD_TYPE <", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeLessThanOrEqualTo(String value) {
            addCriterion("STANDARD_TYPE <=", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeLike(String value) {
            addCriterion("STANDARD_TYPE like", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotLike(String value) {
            addCriterion("STANDARD_TYPE not like", value, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeIn(List<String> values) {
            addCriterion("STANDARD_TYPE in", values, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotIn(List<String> values) {
            addCriterion("STANDARD_TYPE not in", values, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeBetween(String value1, String value2) {
            addCriterion("STANDARD_TYPE between", value1, value2, "standardType");
            return (Criteria) this;
        }

        public Criteria andStandardTypeNotBetween(String value1, String value2) {
            addCriterion("STANDARD_TYPE not between", value1, value2, "standardType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("CREATE_ID like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("CREATE_ID not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(String value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(String value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(String value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(String value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLike(String value) {
            addCriterion("MODIFY_TIME like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotLike(String value) {
            addCriterion("MODIFY_TIME not like", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<String> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<String> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(String value1, String value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(String value1, String value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNull() {
            addCriterion("MODIFY_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNotNull() {
            addCriterion("MODIFY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifyIdEqualTo(String value) {
            addCriterion("MODIFY_ID =", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotEqualTo(String value) {
            addCriterion("MODIFY_ID <>", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThan(String value) {
            addCriterion("MODIFY_ID >", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_ID >=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThan(String value) {
            addCriterion("MODIFY_ID <", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_ID <=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLike(String value) {
            addCriterion("MODIFY_ID like", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotLike(String value) {
            addCriterion("MODIFY_ID not like", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdIn(List<String> values) {
            addCriterion("MODIFY_ID in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotIn(List<String> values) {
            addCriterion("MODIFY_ID not in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdBetween(String value1, String value2) {
            addCriterion("MODIFY_ID between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotBetween(String value1, String value2) {
            addCriterion("MODIFY_ID not between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFormVersionIsNull() {
            addCriterion("FORM_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andFormVersionIsNotNull() {
            addCriterion("FORM_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andFormVersionEqualTo(String value) {
            addCriterion("FORM_VERSION =", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionNotEqualTo(String value) {
            addCriterion("FORM_VERSION <>", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionGreaterThan(String value) {
            addCriterion("FORM_VERSION >", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_VERSION >=", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionLessThan(String value) {
            addCriterion("FORM_VERSION <", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionLessThanOrEqualTo(String value) {
            addCriterion("FORM_VERSION <=", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionLike(String value) {
            addCriterion("FORM_VERSION like", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionNotLike(String value) {
            addCriterion("FORM_VERSION not like", value, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionIn(List<String> values) {
            addCriterion("FORM_VERSION in", values, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionNotIn(List<String> values) {
            addCriterion("FORM_VERSION not in", values, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionBetween(String value1, String value2) {
            addCriterion("FORM_VERSION between", value1, value2, "formVersion");
            return (Criteria) this;
        }

        public Criteria andFormVersionNotBetween(String value1, String value2) {
            addCriterion("FORM_VERSION not between", value1, value2, "formVersion");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidIsNull() {
            addCriterion("MATERIAL_MODELID is null");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidIsNotNull() {
            addCriterion("MATERIAL_MODELID is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidEqualTo(String value) {
            addCriterion("MATERIAL_MODELID =", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidNotEqualTo(String value) {
            addCriterion("MATERIAL_MODELID <>", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidGreaterThan(String value) {
            addCriterion("MATERIAL_MODELID >", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_MODELID >=", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidLessThan(String value) {
            addCriterion("MATERIAL_MODELID <", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_MODELID <=", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidLike(String value) {
            addCriterion("MATERIAL_MODELID like", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidNotLike(String value) {
            addCriterion("MATERIAL_MODELID not like", value, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidIn(List<String> values) {
            addCriterion("MATERIAL_MODELID in", values, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidNotIn(List<String> values) {
            addCriterion("MATERIAL_MODELID not in", values, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidBetween(String value1, String value2) {
            addCriterion("MATERIAL_MODELID between", value1, value2, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andMaterialModelidNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_MODELID not between", value1, value2, "materialModelid");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(String value) {
            addCriterion("FORM_ID =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(String value) {
            addCriterion("FORM_ID <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(String value) {
            addCriterion("FORM_ID >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_ID >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(String value) {
            addCriterion("FORM_ID <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(String value) {
            addCriterion("FORM_ID <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLike(String value) {
            addCriterion("FORM_ID like", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotLike(String value) {
            addCriterion("FORM_ID not like", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<String> values) {
            addCriterion("FORM_ID in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<String> values) {
            addCriterion("FORM_ID not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(String value1, String value2) {
            addCriterion("FORM_ID between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(String value1, String value2) {
            addCriterion("FORM_ID not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("ACTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("ACTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(String value) {
            addCriterion("ACTION_TYPE =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(String value) {
            addCriterion("ACTION_TYPE <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(String value) {
            addCriterion("ACTION_TYPE >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(String value) {
            addCriterion("ACTION_TYPE <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(String value) {
            addCriterion("ACTION_TYPE <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLike(String value) {
            addCriterion("ACTION_TYPE like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotLike(String value) {
            addCriterion("ACTION_TYPE not like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<String> values) {
            addCriterion("ACTION_TYPE in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<String> values) {
            addCriterion("ACTION_TYPE not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(String value1, String value2) {
            addCriterion("ACTION_TYPE not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andExchangeStateIsNull() {
            addCriterion("EXCHANGE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeStateIsNotNull() {
            addCriterion("EXCHANGE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeStateEqualTo(String value) {
            addCriterion("EXCHANGE_STATE =", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateNotEqualTo(String value) {
            addCriterion("EXCHANGE_STATE <>", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateGreaterThan(String value) {
            addCriterion("EXCHANGE_STATE >", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_STATE >=", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateLessThan(String value) {
            addCriterion("EXCHANGE_STATE <", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_STATE <=", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateLike(String value) {
            addCriterion("EXCHANGE_STATE like", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateNotLike(String value) {
            addCriterion("EXCHANGE_STATE not like", value, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateIn(List<String> values) {
            addCriterion("EXCHANGE_STATE in", values, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateNotIn(List<String> values) {
            addCriterion("EXCHANGE_STATE not in", values, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateBetween(String value1, String value2) {
            addCriterion("EXCHANGE_STATE between", value1, value2, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andExchangeStateNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_STATE not between", value1, value2, "exchangeState");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityIsNull() {
            addCriterion("MATERIAL_VALIDITY is null");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityIsNotNull() {
            addCriterion("MATERIAL_VALIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityEqualTo(String value) {
            addCriterion("MATERIAL_VALIDITY =", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityNotEqualTo(String value) {
            addCriterion("MATERIAL_VALIDITY <>", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityGreaterThan(String value) {
            addCriterion("MATERIAL_VALIDITY >", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_VALIDITY >=", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityLessThan(String value) {
            addCriterion("MATERIAL_VALIDITY <", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_VALIDITY <=", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityLike(String value) {
            addCriterion("MATERIAL_VALIDITY like", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityNotLike(String value) {
            addCriterion("MATERIAL_VALIDITY not like", value, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityIn(List<String> values) {
            addCriterion("MATERIAL_VALIDITY in", values, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityNotIn(List<String> values) {
            addCriterion("MATERIAL_VALIDITY not in", values, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityBetween(String value1, String value2) {
            addCriterion("MATERIAL_VALIDITY between", value1, value2, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andMaterialValidityNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_VALIDITY not between", value1, value2, "materialValidity");
            return (Criteria) this;
        }

        public Criteria andEventGroupIsNull() {
            addCriterion("EVENT_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andEventGroupIsNotNull() {
            addCriterion("EVENT_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andEventGroupEqualTo(String value) {
            addCriterion("EVENT_GROUP =", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupNotEqualTo(String value) {
            addCriterion("EVENT_GROUP <>", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupGreaterThan(String value) {
            addCriterion("EVENT_GROUP >", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_GROUP >=", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupLessThan(String value) {
            addCriterion("EVENT_GROUP <", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupLessThanOrEqualTo(String value) {
            addCriterion("EVENT_GROUP <=", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupLike(String value) {
            addCriterion("EVENT_GROUP like", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupNotLike(String value) {
            addCriterion("EVENT_GROUP not like", value, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupIn(List<String> values) {
            addCriterion("EVENT_GROUP in", values, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupNotIn(List<String> values) {
            addCriterion("EVENT_GROUP not in", values, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupBetween(String value1, String value2) {
            addCriterion("EVENT_GROUP between", value1, value2, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andEventGroupNotBetween(String value1, String value2) {
            addCriterion("EVENT_GROUP not between", value1, value2, "eventGroup");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNull() {
            addCriterion("TABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("TABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(String value) {
            addCriterion("TABLE_ID =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(String value) {
            addCriterion("TABLE_ID <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(String value) {
            addCriterion("TABLE_ID >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_ID >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(String value) {
            addCriterion("TABLE_ID <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(String value) {
            addCriterion("TABLE_ID <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLike(String value) {
            addCriterion("TABLE_ID like", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotLike(String value) {
            addCriterion("TABLE_ID not like", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<String> values) {
            addCriterion("TABLE_ID in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<String> values) {
            addCriterion("TABLE_ID not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(String value1, String value2) {
            addCriterion("TABLE_ID between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(String value1, String value2) {
            addCriterion("TABLE_ID not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andFillOnlineIsNull() {
            addCriterion("FILL_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andFillOnlineIsNotNull() {
            addCriterion("FILL_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andFillOnlineEqualTo(String value) {
            addCriterion("FILL_ONLINE =", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineNotEqualTo(String value) {
            addCriterion("FILL_ONLINE <>", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineGreaterThan(String value) {
            addCriterion("FILL_ONLINE >", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("FILL_ONLINE >=", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineLessThan(String value) {
            addCriterion("FILL_ONLINE <", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineLessThanOrEqualTo(String value) {
            addCriterion("FILL_ONLINE <=", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineLike(String value) {
            addCriterion("FILL_ONLINE like", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineNotLike(String value) {
            addCriterion("FILL_ONLINE not like", value, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineIn(List<String> values) {
            addCriterion("FILL_ONLINE in", values, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineNotIn(List<String> values) {
            addCriterion("FILL_ONLINE not in", values, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineBetween(String value1, String value2) {
            addCriterion("FILL_ONLINE between", value1, value2, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andFillOnlineNotBetween(String value1, String value2) {
            addCriterion("FILL_ONLINE not between", value1, value2, "fillOnline");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdIsNull() {
            addCriterion("MATERIALEMPTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdIsNotNull() {
            addCriterion("MATERIALEMPTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdEqualTo(String value) {
            addCriterion("MATERIALEMPTY_ID =", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdNotEqualTo(String value) {
            addCriterion("MATERIALEMPTY_ID <>", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdGreaterThan(String value) {
            addCriterion("MATERIALEMPTY_ID >", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALEMPTY_ID >=", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdLessThan(String value) {
            addCriterion("MATERIALEMPTY_ID <", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdLessThanOrEqualTo(String value) {
            addCriterion("MATERIALEMPTY_ID <=", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdLike(String value) {
            addCriterion("MATERIALEMPTY_ID like", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdNotLike(String value) {
            addCriterion("MATERIALEMPTY_ID not like", value, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdIn(List<String> values) {
            addCriterion("MATERIALEMPTY_ID in", values, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdNotIn(List<String> values) {
            addCriterion("MATERIALEMPTY_ID not in", values, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdBetween(String value1, String value2) {
            addCriterion("MATERIALEMPTY_ID between", value1, value2, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyIdNotBetween(String value1, String value2) {
            addCriterion("MATERIALEMPTY_ID not between", value1, value2, "materialemptyId");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameIsNull() {
            addCriterion("MATERIALEMPTY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameIsNotNull() {
            addCriterion("MATERIALEMPTY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameEqualTo(String value) {
            addCriterion("MATERIALEMPTY_NAME =", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameNotEqualTo(String value) {
            addCriterion("MATERIALEMPTY_NAME <>", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameGreaterThan(String value) {
            addCriterion("MATERIALEMPTY_NAME >", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALEMPTY_NAME >=", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameLessThan(String value) {
            addCriterion("MATERIALEMPTY_NAME <", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameLessThanOrEqualTo(String value) {
            addCriterion("MATERIALEMPTY_NAME <=", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameLike(String value) {
            addCriterion("MATERIALEMPTY_NAME like", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameNotLike(String value) {
            addCriterion("MATERIALEMPTY_NAME not like", value, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameIn(List<String> values) {
            addCriterion("MATERIALEMPTY_NAME in", values, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameNotIn(List<String> values) {
            addCriterion("MATERIALEMPTY_NAME not in", values, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameBetween(String value1, String value2) {
            addCriterion("MATERIALEMPTY_NAME between", value1, value2, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialemptyNameNotBetween(String value1, String value2) {
            addCriterion("MATERIALEMPTY_NAME not between", value1, value2, "materialemptyName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdIsNull() {
            addCriterion("MATERIALMODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdIsNotNull() {
            addCriterion("MATERIALMODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdEqualTo(String value) {
            addCriterion("MATERIALMODEL_ID =", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdNotEqualTo(String value) {
            addCriterion("MATERIALMODEL_ID <>", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdGreaterThan(String value) {
            addCriterion("MATERIALMODEL_ID >", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALMODEL_ID >=", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdLessThan(String value) {
            addCriterion("MATERIALMODEL_ID <", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdLessThanOrEqualTo(String value) {
            addCriterion("MATERIALMODEL_ID <=", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdLike(String value) {
            addCriterion("MATERIALMODEL_ID like", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdNotLike(String value) {
            addCriterion("MATERIALMODEL_ID not like", value, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdIn(List<String> values) {
            addCriterion("MATERIALMODEL_ID in", values, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdNotIn(List<String> values) {
            addCriterion("MATERIALMODEL_ID not in", values, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdBetween(String value1, String value2) {
            addCriterion("MATERIALMODEL_ID between", value1, value2, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelIdNotBetween(String value1, String value2) {
            addCriterion("MATERIALMODEL_ID not between", value1, value2, "materialmodelId");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameIsNull() {
            addCriterion("MATERIALMODEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameIsNotNull() {
            addCriterion("MATERIALMODEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameEqualTo(String value) {
            addCriterion("MATERIALMODEL_NAME =", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameNotEqualTo(String value) {
            addCriterion("MATERIALMODEL_NAME <>", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameGreaterThan(String value) {
            addCriterion("MATERIALMODEL_NAME >", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIALMODEL_NAME >=", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameLessThan(String value) {
            addCriterion("MATERIALMODEL_NAME <", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameLessThanOrEqualTo(String value) {
            addCriterion("MATERIALMODEL_NAME <=", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameLike(String value) {
            addCriterion("MATERIALMODEL_NAME like", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameNotLike(String value) {
            addCriterion("MATERIALMODEL_NAME not like", value, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameIn(List<String> values) {
            addCriterion("MATERIALMODEL_NAME in", values, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameNotIn(List<String> values) {
            addCriterion("MATERIALMODEL_NAME not in", values, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameBetween(String value1, String value2) {
            addCriterion("MATERIALMODEL_NAME between", value1, value2, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andMaterialmodelNameNotBetween(String value1, String value2) {
            addCriterion("MATERIALMODEL_NAME not between", value1, value2, "materialmodelName");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("DESCRIBE =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("DESCRIBE <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("DESCRIBE >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIBE >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("DESCRIBE <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("DESCRIBE <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("DESCRIBE like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("DESCRIBE not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("DESCRIBE in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("DESCRIBE not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("DESCRIBE between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("DESCRIBE not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNull() {
            addCriterion("MATERIAL_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIsNotNull() {
            addCriterion("MATERIAL_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceEqualTo(String value) {
            addCriterion("MATERIAL_SOURCE =", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotEqualTo(String value) {
            addCriterion("MATERIAL_SOURCE <>", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThan(String value) {
            addCriterion("MATERIAL_SOURCE >", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_SOURCE >=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThan(String value) {
            addCriterion("MATERIAL_SOURCE <", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_SOURCE <=", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceLike(String value) {
            addCriterion("MATERIAL_SOURCE like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotLike(String value) {
            addCriterion("MATERIAL_SOURCE not like", value, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceIn(List<String> values) {
            addCriterion("MATERIAL_SOURCE in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotIn(List<String> values) {
            addCriterion("MATERIAL_SOURCE not in", values, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceBetween(String value1, String value2) {
            addCriterion("MATERIAL_SOURCE between", value1, value2, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialSourceNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_SOURCE not between", value1, value2, "materialSource");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelIsNull() {
            addCriterion("MATERIAL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelIsNotNull() {
            addCriterion("MATERIAL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelEqualTo(String value) {
            addCriterion("MATERIAL_LEVEL =", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotEqualTo(String value) {
            addCriterion("MATERIAL_LEVEL <>", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelGreaterThan(String value) {
            addCriterion("MATERIAL_LEVEL >", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_LEVEL >=", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelLessThan(String value) {
            addCriterion("MATERIAL_LEVEL <", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_LEVEL <=", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelLike(String value) {
            addCriterion("MATERIAL_LEVEL like", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotLike(String value) {
            addCriterion("MATERIAL_LEVEL not like", value, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelIn(List<String> values) {
            addCriterion("MATERIAL_LEVEL in", values, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotIn(List<String> values) {
            addCriterion("MATERIAL_LEVEL not in", values, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelBetween(String value1, String value2) {
            addCriterion("MATERIAL_LEVEL between", value1, value2, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialLevelNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_LEVEL not between", value1, value2, "materialLevel");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("MATERIAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("MATERIAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("MATERIAL_TYPE =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("MATERIAL_TYPE <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("MATERIAL_TYPE >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_TYPE >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("MATERIAL_TYPE <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_TYPE <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("MATERIAL_TYPE like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("MATERIAL_TYPE not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("MATERIAL_TYPE in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("MATERIAL_TYPE not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("MATERIAL_TYPE between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_TYPE not between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialPointIsNull() {
            addCriterion("MATERIAL_POINT is null");
            return (Criteria) this;
        }

        public Criteria andMaterialPointIsNotNull() {
            addCriterion("MATERIAL_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialPointEqualTo(String value) {
            addCriterion("MATERIAL_POINT =", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointNotEqualTo(String value) {
            addCriterion("MATERIAL_POINT <>", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointGreaterThan(String value) {
            addCriterion("MATERIAL_POINT >", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_POINT >=", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointLessThan(String value) {
            addCriterion("MATERIAL_POINT <", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_POINT <=", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointLike(String value) {
            addCriterion("MATERIAL_POINT like", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointNotLike(String value) {
            addCriterion("MATERIAL_POINT not like", value, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointIn(List<String> values) {
            addCriterion("MATERIAL_POINT in", values, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointNotIn(List<String> values) {
            addCriterion("MATERIAL_POINT not in", values, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointBetween(String value1, String value2) {
            addCriterion("MATERIAL_POINT between", value1, value2, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andMaterialPointNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_POINT not between", value1, value2, "materialPoint");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNull() {
            addCriterion("IS_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNotNull() {
            addCriterion("IS_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandardEqualTo(String value) {
            addCriterion("IS_STANDARD =", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotEqualTo(String value) {
            addCriterion("IS_STANDARD <>", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThan(String value) {
            addCriterion("IS_STANDARD >", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThanOrEqualTo(String value) {
            addCriterion("IS_STANDARD >=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThan(String value) {
            addCriterion("IS_STANDARD <", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThanOrEqualTo(String value) {
            addCriterion("IS_STANDARD <=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLike(String value) {
            addCriterion("IS_STANDARD like", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotLike(String value) {
            addCriterion("IS_STANDARD not like", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardIn(List<String> values) {
            addCriterion("IS_STANDARD in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotIn(List<String> values) {
            addCriterion("IS_STANDARD not in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardBetween(String value1, String value2) {
            addCriterion("IS_STANDARD between", value1, value2, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotBetween(String value1, String value2) {
            addCriterion("IS_STANDARD not between", value1, value2, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsAgencyIsNull() {
            addCriterion("IS_AGENCY is null");
            return (Criteria) this;
        }

        public Criteria andIsAgencyIsNotNull() {
            addCriterion("IS_AGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgencyEqualTo(String value) {
            addCriterion("IS_AGENCY =", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyNotEqualTo(String value) {
            addCriterion("IS_AGENCY <>", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyGreaterThan(String value) {
            addCriterion("IS_AGENCY >", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AGENCY >=", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyLessThan(String value) {
            addCriterion("IS_AGENCY <", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyLessThanOrEqualTo(String value) {
            addCriterion("IS_AGENCY <=", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyLike(String value) {
            addCriterion("IS_AGENCY like", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyNotLike(String value) {
            addCriterion("IS_AGENCY not like", value, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyIn(List<String> values) {
            addCriterion("IS_AGENCY in", values, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyNotIn(List<String> values) {
            addCriterion("IS_AGENCY not in", values, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyBetween(String value1, String value2) {
            addCriterion("IS_AGENCY between", value1, value2, "isAgency");
            return (Criteria) this;
        }

        public Criteria andIsAgencyNotBetween(String value1, String value2) {
            addCriterion("IS_AGENCY not between", value1, value2, "isAgency");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidIsNull() {
            addCriterion("FILLONLINE_MODELID is null");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidIsNotNull() {
            addCriterion("FILLONLINE_MODELID is not null");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidEqualTo(String value) {
            addCriterion("FILLONLINE_MODELID =", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidNotEqualTo(String value) {
            addCriterion("FILLONLINE_MODELID <>", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidGreaterThan(String value) {
            addCriterion("FILLONLINE_MODELID >", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidGreaterThanOrEqualTo(String value) {
            addCriterion("FILLONLINE_MODELID >=", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidLessThan(String value) {
            addCriterion("FILLONLINE_MODELID <", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidLessThanOrEqualTo(String value) {
            addCriterion("FILLONLINE_MODELID <=", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidLike(String value) {
            addCriterion("FILLONLINE_MODELID like", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidNotLike(String value) {
            addCriterion("FILLONLINE_MODELID not like", value, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidIn(List<String> values) {
            addCriterion("FILLONLINE_MODELID in", values, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidNotIn(List<String> values) {
            addCriterion("FILLONLINE_MODELID not in", values, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidBetween(String value1, String value2) {
            addCriterion("FILLONLINE_MODELID between", value1, value2, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelidNotBetween(String value1, String value2) {
            addCriterion("FILLONLINE_MODELID not between", value1, value2, "fillonlineModelid");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameIsNull() {
            addCriterion("FILLONLINE_MODELNAME is null");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameIsNotNull() {
            addCriterion("FILLONLINE_MODELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameEqualTo(String value) {
            addCriterion("FILLONLINE_MODELNAME =", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameNotEqualTo(String value) {
            addCriterion("FILLONLINE_MODELNAME <>", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameGreaterThan(String value) {
            addCriterion("FILLONLINE_MODELNAME >", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("FILLONLINE_MODELNAME >=", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameLessThan(String value) {
            addCriterion("FILLONLINE_MODELNAME <", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameLessThanOrEqualTo(String value) {
            addCriterion("FILLONLINE_MODELNAME <=", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameLike(String value) {
            addCriterion("FILLONLINE_MODELNAME like", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameNotLike(String value) {
            addCriterion("FILLONLINE_MODELNAME not like", value, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameIn(List<String> values) {
            addCriterion("FILLONLINE_MODELNAME in", values, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameNotIn(List<String> values) {
            addCriterion("FILLONLINE_MODELNAME not in", values, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameBetween(String value1, String value2) {
            addCriterion("FILLONLINE_MODELNAME between", value1, value2, "fillonlineModelname");
            return (Criteria) this;
        }

        public Criteria andFillonlineModelnameNotBetween(String value1, String value2) {
            addCriterion("FILLONLINE_MODELNAME not between", value1, value2, "fillonlineModelname");
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