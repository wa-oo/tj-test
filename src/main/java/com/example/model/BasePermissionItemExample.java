package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasePermissionItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasePermissionItemExample() {
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

        public Criteria andMatterIdIsNull() {
            addCriterion("MATTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMatterIdIsNotNull() {
            addCriterion("MATTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMatterIdEqualTo(String value) {
            addCriterion("MATTER_ID =", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotEqualTo(String value) {
            addCriterion("MATTER_ID <>", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThan(String value) {
            addCriterion("MATTER_ID >", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_ID >=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThan(String value) {
            addCriterion("MATTER_ID <", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLessThanOrEqualTo(String value) {
            addCriterion("MATTER_ID <=", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdLike(String value) {
            addCriterion("MATTER_ID like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotLike(String value) {
            addCriterion("MATTER_ID not like", value, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdIn(List<String> values) {
            addCriterion("MATTER_ID in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotIn(List<String> values) {
            addCriterion("MATTER_ID not in", values, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdBetween(String value1, String value2) {
            addCriterion("MATTER_ID between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andMatterIdNotBetween(String value1, String value2) {
            addCriterion("MATTER_ID not between", value1, value2, "matterId");
            return (Criteria) this;
        }

        public Criteria andImplementIdIsNull() {
            addCriterion("IMPLEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andImplementIdIsNotNull() {
            addCriterion("IMPLEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImplementIdEqualTo(String value) {
            addCriterion("IMPLEMENT_ID =", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdNotEqualTo(String value) {
            addCriterion("IMPLEMENT_ID <>", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdGreaterThan(String value) {
            addCriterion("IMPLEMENT_ID >", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdGreaterThanOrEqualTo(String value) {
            addCriterion("IMPLEMENT_ID >=", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdLessThan(String value) {
            addCriterion("IMPLEMENT_ID <", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdLessThanOrEqualTo(String value) {
            addCriterion("IMPLEMENT_ID <=", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdLike(String value) {
            addCriterion("IMPLEMENT_ID like", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdNotLike(String value) {
            addCriterion("IMPLEMENT_ID not like", value, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdIn(List<String> values) {
            addCriterion("IMPLEMENT_ID in", values, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdNotIn(List<String> values) {
            addCriterion("IMPLEMENT_ID not in", values, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdBetween(String value1, String value2) {
            addCriterion("IMPLEMENT_ID between", value1, value2, "implementId");
            return (Criteria) this;
        }

        public Criteria andImplementIdNotBetween(String value1, String value2) {
            addCriterion("IMPLEMENT_ID not between", value1, value2, "implementId");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNull() {
            addCriterion("MATTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMatterNameIsNotNull() {
            addCriterion("MATTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatterNameEqualTo(String value) {
            addCriterion("MATTER_NAME =", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotEqualTo(String value) {
            addCriterion("MATTER_NAME <>", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThan(String value) {
            addCriterion("MATTER_NAME >", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_NAME >=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThan(String value) {
            addCriterion("MATTER_NAME <", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLessThanOrEqualTo(String value) {
            addCriterion("MATTER_NAME <=", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameLike(String value) {
            addCriterion("MATTER_NAME like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotLike(String value) {
            addCriterion("MATTER_NAME not like", value, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameIn(List<String> values) {
            addCriterion("MATTER_NAME in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotIn(List<String> values) {
            addCriterion("MATTER_NAME not in", values, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameBetween(String value1, String value2) {
            addCriterion("MATTER_NAME between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andMatterNameNotBetween(String value1, String value2) {
            addCriterion("MATTER_NAME not between", value1, value2, "matterName");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("HANDLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("HANDLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("HANDLE_TIME =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("HANDLE_TIME <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("HANDLE_TIME >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HANDLE_TIME >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("HANDLE_TIME <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("HANDLE_TIME <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("HANDLE_TIME in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("HANDLE_TIME not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("HANDLE_TIME between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("HANDLE_TIME not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andMatterTypeIsNull() {
            addCriterion("MATTER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMatterTypeIsNotNull() {
            addCriterion("MATTER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMatterTypeEqualTo(String value) {
            addCriterion("MATTER_TYPE =", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeNotEqualTo(String value) {
            addCriterion("MATTER_TYPE <>", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeGreaterThan(String value) {
            addCriterion("MATTER_TYPE >", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_TYPE >=", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeLessThan(String value) {
            addCriterion("MATTER_TYPE <", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeLessThanOrEqualTo(String value) {
            addCriterion("MATTER_TYPE <=", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeLike(String value) {
            addCriterion("MATTER_TYPE like", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeNotLike(String value) {
            addCriterion("MATTER_TYPE not like", value, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeIn(List<String> values) {
            addCriterion("MATTER_TYPE in", values, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeNotIn(List<String> values) {
            addCriterion("MATTER_TYPE not in", values, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeBetween(String value1, String value2) {
            addCriterion("MATTER_TYPE between", value1, value2, "matterType");
            return (Criteria) this;
        }

        public Criteria andMatterTypeNotBetween(String value1, String value2) {
            addCriterion("MATTER_TYPE not between", value1, value2, "matterType");
            return (Criteria) this;
        }

        public Criteria andHandleItemsIsNull() {
            addCriterion("HANDLE_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andHandleItemsIsNotNull() {
            addCriterion("HANDLE_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andHandleItemsEqualTo(String value) {
            addCriterion("HANDLE_ITEMS =", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsNotEqualTo(String value) {
            addCriterion("HANDLE_ITEMS <>", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsGreaterThan(String value) {
            addCriterion("HANDLE_ITEMS >", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_ITEMS >=", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsLessThan(String value) {
            addCriterion("HANDLE_ITEMS <", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_ITEMS <=", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsLike(String value) {
            addCriterion("HANDLE_ITEMS like", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsNotLike(String value) {
            addCriterion("HANDLE_ITEMS not like", value, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsIn(List<String> values) {
            addCriterion("HANDLE_ITEMS in", values, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsNotIn(List<String> values) {
            addCriterion("HANDLE_ITEMS not in", values, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsBetween(String value1, String value2) {
            addCriterion("HANDLE_ITEMS between", value1, value2, "handleItems");
            return (Criteria) this;
        }

        public Criteria andHandleItemsNotBetween(String value1, String value2) {
            addCriterion("HANDLE_ITEMS not between", value1, value2, "handleItems");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNull() {
            addCriterion("REVIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNotNull() {
            addCriterion("REVIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdEqualTo(String value) {
            addCriterion("REVIEW_ID =", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotEqualTo(String value) {
            addCriterion("REVIEW_ID <>", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThan(String value) {
            addCriterion("REVIEW_ID >", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_ID >=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThan(String value) {
            addCriterion("REVIEW_ID <", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_ID <=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLike(String value) {
            addCriterion("REVIEW_ID like", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotLike(String value) {
            addCriterion("REVIEW_ID not like", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdIn(List<String> values) {
            addCriterion("REVIEW_ID in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotIn(List<String> values) {
            addCriterion("REVIEW_ID not in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdBetween(String value1, String value2) {
            addCriterion("REVIEW_ID between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotBetween(String value1, String value2) {
            addCriterion("REVIEW_ID not between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andImplementLevelIsNull() {
            addCriterion("IMPLEMENT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andImplementLevelIsNotNull() {
            addCriterion("IMPLEMENT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andImplementLevelEqualTo(String value) {
            addCriterion("IMPLEMENT_LEVEL =", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelNotEqualTo(String value) {
            addCriterion("IMPLEMENT_LEVEL <>", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelGreaterThan(String value) {
            addCriterion("IMPLEMENT_LEVEL >", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelGreaterThanOrEqualTo(String value) {
            addCriterion("IMPLEMENT_LEVEL >=", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelLessThan(String value) {
            addCriterion("IMPLEMENT_LEVEL <", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelLessThanOrEqualTo(String value) {
            addCriterion("IMPLEMENT_LEVEL <=", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelLike(String value) {
            addCriterion("IMPLEMENT_LEVEL like", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelNotLike(String value) {
            addCriterion("IMPLEMENT_LEVEL not like", value, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelIn(List<String> values) {
            addCriterion("IMPLEMENT_LEVEL in", values, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelNotIn(List<String> values) {
            addCriterion("IMPLEMENT_LEVEL not in", values, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelBetween(String value1, String value2) {
            addCriterion("IMPLEMENT_LEVEL between", value1, value2, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andImplementLevelNotBetween(String value1, String value2) {
            addCriterion("IMPLEMENT_LEVEL not between", value1, value2, "implementLevel");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyIsNull() {
            addCriterion("IS_EMERGENCY is null");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyIsNotNull() {
            addCriterion("IS_EMERGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyEqualTo(String value) {
            addCriterion("IS_EMERGENCY =", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotEqualTo(String value) {
            addCriterion("IS_EMERGENCY <>", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyGreaterThan(String value) {
            addCriterion("IS_EMERGENCY >", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EMERGENCY >=", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyLessThan(String value) {
            addCriterion("IS_EMERGENCY <", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyLessThanOrEqualTo(String value) {
            addCriterion("IS_EMERGENCY <=", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyLike(String value) {
            addCriterion("IS_EMERGENCY like", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotLike(String value) {
            addCriterion("IS_EMERGENCY not like", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyIn(List<String> values) {
            addCriterion("IS_EMERGENCY in", values, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotIn(List<String> values) {
            addCriterion("IS_EMERGENCY not in", values, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyBetween(String value1, String value2) {
            addCriterion("IS_EMERGENCY between", value1, value2, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotBetween(String value1, String value2) {
            addCriterion("IS_EMERGENCY not between", value1, value2, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andHandleDeptIsNull() {
            addCriterion("HANDLE_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andHandleDeptIsNotNull() {
            addCriterion("HANDLE_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andHandleDeptEqualTo(String value) {
            addCriterion("HANDLE_DEPT =", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptNotEqualTo(String value) {
            addCriterion("HANDLE_DEPT <>", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptGreaterThan(String value) {
            addCriterion("HANDLE_DEPT >", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_DEPT >=", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptLessThan(String value) {
            addCriterion("HANDLE_DEPT <", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_DEPT <=", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptLike(String value) {
            addCriterion("HANDLE_DEPT like", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptNotLike(String value) {
            addCriterion("HANDLE_DEPT not like", value, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptIn(List<String> values) {
            addCriterion("HANDLE_DEPT in", values, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptNotIn(List<String> values) {
            addCriterion("HANDLE_DEPT not in", values, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptBetween(String value1, String value2) {
            addCriterion("HANDLE_DEPT between", value1, value2, "handleDept");
            return (Criteria) this;
        }

        public Criteria andHandleDeptNotBetween(String value1, String value2) {
            addCriterion("HANDLE_DEPT not between", value1, value2, "handleDept");
            return (Criteria) this;
        }

        public Criteria andConsultCallIsNull() {
            addCriterion("CONSULT_CALL is null");
            return (Criteria) this;
        }

        public Criteria andConsultCallIsNotNull() {
            addCriterion("CONSULT_CALL is not null");
            return (Criteria) this;
        }

        public Criteria andConsultCallEqualTo(String value) {
            addCriterion("CONSULT_CALL =", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallNotEqualTo(String value) {
            addCriterion("CONSULT_CALL <>", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallGreaterThan(String value) {
            addCriterion("CONSULT_CALL >", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULT_CALL >=", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallLessThan(String value) {
            addCriterion("CONSULT_CALL <", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallLessThanOrEqualTo(String value) {
            addCriterion("CONSULT_CALL <=", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallLike(String value) {
            addCriterion("CONSULT_CALL like", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallNotLike(String value) {
            addCriterion("CONSULT_CALL not like", value, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallIn(List<String> values) {
            addCriterion("CONSULT_CALL in", values, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallNotIn(List<String> values) {
            addCriterion("CONSULT_CALL not in", values, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallBetween(String value1, String value2) {
            addCriterion("CONSULT_CALL between", value1, value2, "consultCall");
            return (Criteria) this;
        }

        public Criteria andConsultCallNotBetween(String value1, String value2) {
            addCriterion("CONSULT_CALL not between", value1, value2, "consultCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallIsNull() {
            addCriterion("SUPERVISION_CALL is null");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallIsNotNull() {
            addCriterion("SUPERVISION_CALL is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallEqualTo(String value) {
            addCriterion("SUPERVISION_CALL =", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallNotEqualTo(String value) {
            addCriterion("SUPERVISION_CALL <>", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallGreaterThan(String value) {
            addCriterion("SUPERVISION_CALL >", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERVISION_CALL >=", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallLessThan(String value) {
            addCriterion("SUPERVISION_CALL <", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallLessThanOrEqualTo(String value) {
            addCriterion("SUPERVISION_CALL <=", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallLike(String value) {
            addCriterion("SUPERVISION_CALL like", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallNotLike(String value) {
            addCriterion("SUPERVISION_CALL not like", value, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallIn(List<String> values) {
            addCriterion("SUPERVISION_CALL in", values, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallNotIn(List<String> values) {
            addCriterion("SUPERVISION_CALL not in", values, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallBetween(String value1, String value2) {
            addCriterion("SUPERVISION_CALL between", value1, value2, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andSupervisionCallNotBetween(String value1, String value2) {
            addCriterion("SUPERVISION_CALL not between", value1, value2, "supervisionCall");
            return (Criteria) this;
        }

        public Criteria andHandleLocationIsNull() {
            addCriterion("HANDLE_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andHandleLocationIsNotNull() {
            addCriterion("HANDLE_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andHandleLocationEqualTo(String value) {
            addCriterion("HANDLE_LOCATION =", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationNotEqualTo(String value) {
            addCriterion("HANDLE_LOCATION <>", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationGreaterThan(String value) {
            addCriterion("HANDLE_LOCATION >", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_LOCATION >=", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationLessThan(String value) {
            addCriterion("HANDLE_LOCATION <", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_LOCATION <=", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationLike(String value) {
            addCriterion("HANDLE_LOCATION like", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationNotLike(String value) {
            addCriterion("HANDLE_LOCATION not like", value, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationIn(List<String> values) {
            addCriterion("HANDLE_LOCATION in", values, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationNotIn(List<String> values) {
            addCriterion("HANDLE_LOCATION not in", values, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationBetween(String value1, String value2) {
            addCriterion("HANDLE_LOCATION between", value1, value2, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleLocationNotBetween(String value1, String value2) {
            addCriterion("HANDLE_LOCATION not between", value1, value2, "handleLocation");
            return (Criteria) this;
        }

        public Criteria andHandleAreaIsNull() {
            addCriterion("HANDLE_AREA is null");
            return (Criteria) this;
        }

        public Criteria andHandleAreaIsNotNull() {
            addCriterion("HANDLE_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andHandleAreaEqualTo(String value) {
            addCriterion("HANDLE_AREA =", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaNotEqualTo(String value) {
            addCriterion("HANDLE_AREA <>", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaGreaterThan(String value) {
            addCriterion("HANDLE_AREA >", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_AREA >=", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaLessThan(String value) {
            addCriterion("HANDLE_AREA <", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_AREA <=", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaLike(String value) {
            addCriterion("HANDLE_AREA like", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaNotLike(String value) {
            addCriterion("HANDLE_AREA not like", value, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaIn(List<String> values) {
            addCriterion("HANDLE_AREA in", values, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaNotIn(List<String> values) {
            addCriterion("HANDLE_AREA not in", values, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaBetween(String value1, String value2) {
            addCriterion("HANDLE_AREA between", value1, value2, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandleAreaNotBetween(String value1, String value2) {
            addCriterion("HANDLE_AREA not between", value1, value2, "handleArea");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseIsNull() {
            addCriterion("HANDLETIME_PROMISE is null");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseIsNotNull() {
            addCriterion("HANDLETIME_PROMISE is not null");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseEqualTo(Date value) {
            addCriterion("HANDLETIME_PROMISE =", value, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseNotEqualTo(Date value) {
            addCriterion("HANDLETIME_PROMISE <>", value, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseGreaterThan(Date value) {
            addCriterion("HANDLETIME_PROMISE >", value, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseGreaterThanOrEqualTo(Date value) {
            addCriterion("HANDLETIME_PROMISE >=", value, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseLessThan(Date value) {
            addCriterion("HANDLETIME_PROMISE <", value, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseLessThanOrEqualTo(Date value) {
            addCriterion("HANDLETIME_PROMISE <=", value, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseIn(List<Date> values) {
            addCriterion("HANDLETIME_PROMISE in", values, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseNotIn(List<Date> values) {
            addCriterion("HANDLETIME_PROMISE not in", values, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseBetween(Date value1, Date value2) {
            addCriterion("HANDLETIME_PROMISE between", value1, value2, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimePromiseNotBetween(Date value1, Date value2) {
            addCriterion("HANDLETIME_PROMISE not between", value1, value2, "handletimePromise");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitIsNull() {
            addCriterion("HANDLETIME_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitIsNotNull() {
            addCriterion("HANDLETIME_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitEqualTo(Date value) {
            addCriterion("HANDLETIME_LIMIT =", value, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitNotEqualTo(Date value) {
            addCriterion("HANDLETIME_LIMIT <>", value, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitGreaterThan(Date value) {
            addCriterion("HANDLETIME_LIMIT >", value, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitGreaterThanOrEqualTo(Date value) {
            addCriterion("HANDLETIME_LIMIT >=", value, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitLessThan(Date value) {
            addCriterion("HANDLETIME_LIMIT <", value, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitLessThanOrEqualTo(Date value) {
            addCriterion("HANDLETIME_LIMIT <=", value, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitIn(List<Date> values) {
            addCriterion("HANDLETIME_LIMIT in", values, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitNotIn(List<Date> values) {
            addCriterion("HANDLETIME_LIMIT not in", values, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitBetween(Date value1, Date value2) {
            addCriterion("HANDLETIME_LIMIT between", value1, value2, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andHandletimeLimitNotBetween(Date value1, Date value2) {
            addCriterion("HANDLETIME_LIMIT not between", value1, value2, "handletimeLimit");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNull() {
            addCriterion("VALIDITY_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNotNull() {
            addCriterion("VALIDITY_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD =", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD <>", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThan(Date value) {
            addCriterion("VALIDITY_PERIOD >", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD >=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThan(Date value) {
            addCriterion("VALIDITY_PERIOD <", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThanOrEqualTo(Date value) {
            addCriterion("VALIDITY_PERIOD <=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIn(List<Date> values) {
            addCriterion("VALIDITY_PERIOD in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotIn(List<Date> values) {
            addCriterion("VALIDITY_PERIOD not in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodBetween(Date value1, Date value2) {
            addCriterion("VALIDITY_PERIOD between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotBetween(Date value1, Date value2) {
            addCriterion("VALIDITY_PERIOD not between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaIsNull() {
            addCriterion("AVAILABLE_AREA is null");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaIsNotNull() {
            addCriterion("AVAILABLE_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaEqualTo(String value) {
            addCriterion("AVAILABLE_AREA =", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaNotEqualTo(String value) {
            addCriterion("AVAILABLE_AREA <>", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaGreaterThan(String value) {
            addCriterion("AVAILABLE_AREA >", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AVAILABLE_AREA >=", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaLessThan(String value) {
            addCriterion("AVAILABLE_AREA <", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaLessThanOrEqualTo(String value) {
            addCriterion("AVAILABLE_AREA <=", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaLike(String value) {
            addCriterion("AVAILABLE_AREA like", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaNotLike(String value) {
            addCriterion("AVAILABLE_AREA not like", value, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaIn(List<String> values) {
            addCriterion("AVAILABLE_AREA in", values, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaNotIn(List<String> values) {
            addCriterion("AVAILABLE_AREA not in", values, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaBetween(String value1, String value2) {
            addCriterion("AVAILABLE_AREA between", value1, value2, "availableArea");
            return (Criteria) this;
        }

        public Criteria andAvailableAreaNotBetween(String value1, String value2) {
            addCriterion("AVAILABLE_AREA not between", value1, value2, "availableArea");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewIsNull() {
            addCriterion("IS_APPOINTMENT_REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewIsNotNull() {
            addCriterion("IS_APPOINTMENT_REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewEqualTo(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW =", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewNotEqualTo(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW <>", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewGreaterThan(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW >", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewGreaterThanOrEqualTo(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW >=", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewLessThan(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW <", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewLessThanOrEqualTo(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW <=", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewLike(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW like", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewNotLike(String value) {
            addCriterion("IS_APPOINTMENT_REVIEW not like", value, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewIn(List<String> values) {
            addCriterion("IS_APPOINTMENT_REVIEW in", values, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewNotIn(List<String> values) {
            addCriterion("IS_APPOINTMENT_REVIEW not in", values, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewBetween(String value1, String value2) {
            addCriterion("IS_APPOINTMENT_REVIEW between", value1, value2, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andIsAppointmentReviewNotBetween(String value1, String value2) {
            addCriterion("IS_APPOINTMENT_REVIEW not between", value1, value2, "isAppointmentReview");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallIsNull() {
            addCriterion("APPOINTMENT_REVIEW_CALL is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallIsNotNull() {
            addCriterion("APPOINTMENT_REVIEW_CALL is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallEqualTo(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL =", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallNotEqualTo(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL <>", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallGreaterThan(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL >", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL >=", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallLessThan(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL <", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallLessThanOrEqualTo(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL <=", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallLike(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL like", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallNotLike(String value) {
            addCriterion("APPOINTMENT_REVIEW_CALL not like", value, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallIn(List<String> values) {
            addCriterion("APPOINTMENT_REVIEW_CALL in", values, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallNotIn(List<String> values) {
            addCriterion("APPOINTMENT_REVIEW_CALL not in", values, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallBetween(String value1, String value2) {
            addCriterion("APPOINTMENT_REVIEW_CALL between", value1, value2, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andAppointmentReviewCallNotBetween(String value1, String value2) {
            addCriterion("APPOINTMENT_REVIEW_CALL not between", value1, value2, "appointmentReviewCall");
            return (Criteria) this;
        }

        public Criteria andHandleCountIsNull() {
            addCriterion("HANDLE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andHandleCountIsNotNull() {
            addCriterion("HANDLE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andHandleCountEqualTo(String value) {
            addCriterion("HANDLE_COUNT =", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountNotEqualTo(String value) {
            addCriterion("HANDLE_COUNT <>", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountGreaterThan(String value) {
            addCriterion("HANDLE_COUNT >", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLE_COUNT >=", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountLessThan(String value) {
            addCriterion("HANDLE_COUNT <", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountLessThanOrEqualTo(String value) {
            addCriterion("HANDLE_COUNT <=", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountLike(String value) {
            addCriterion("HANDLE_COUNT like", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountNotLike(String value) {
            addCriterion("HANDLE_COUNT not like", value, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountIn(List<String> values) {
            addCriterion("HANDLE_COUNT in", values, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountNotIn(List<String> values) {
            addCriterion("HANDLE_COUNT not in", values, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountBetween(String value1, String value2) {
            addCriterion("HANDLE_COUNT between", value1, value2, "handleCount");
            return (Criteria) this;
        }

        public Criteria andHandleCountNotBetween(String value1, String value2) {
            addCriterion("HANDLE_COUNT not between", value1, value2, "handleCount");
            return (Criteria) this;
        }

        public Criteria andPowerSourceIsNull() {
            addCriterion("POWER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andPowerSourceIsNotNull() {
            addCriterion("POWER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSourceEqualTo(String value) {
            addCriterion("POWER_SOURCE =", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceNotEqualTo(String value) {
            addCriterion("POWER_SOURCE <>", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceGreaterThan(String value) {
            addCriterion("POWER_SOURCE >", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_SOURCE >=", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceLessThan(String value) {
            addCriterion("POWER_SOURCE <", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceLessThanOrEqualTo(String value) {
            addCriterion("POWER_SOURCE <=", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceLike(String value) {
            addCriterion("POWER_SOURCE like", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceNotLike(String value) {
            addCriterion("POWER_SOURCE not like", value, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceIn(List<String> values) {
            addCriterion("POWER_SOURCE in", values, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceNotIn(List<String> values) {
            addCriterion("POWER_SOURCE not in", values, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceBetween(String value1, String value2) {
            addCriterion("POWER_SOURCE between", value1, value2, "powerSource");
            return (Criteria) this;
        }

        public Criteria andPowerSourceNotBetween(String value1, String value2) {
            addCriterion("POWER_SOURCE not between", value1, value2, "powerSource");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNull() {
            addCriterion("IS_SPECIAL is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNotNull() {
            addCriterion("IS_SPECIAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialEqualTo(String value) {
            addCriterion("IS_SPECIAL =", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotEqualTo(String value) {
            addCriterion("IS_SPECIAL <>", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThan(String value) {
            addCriterion("IS_SPECIAL >", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SPECIAL >=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThan(String value) {
            addCriterion("IS_SPECIAL <", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThanOrEqualTo(String value) {
            addCriterion("IS_SPECIAL <=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLike(String value) {
            addCriterion("IS_SPECIAL like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotLike(String value) {
            addCriterion("IS_SPECIAL not like", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIn(List<String> values) {
            addCriterion("IS_SPECIAL in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotIn(List<String> values) {
            addCriterion("IS_SPECIAL not in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialBetween(String value1, String value2) {
            addCriterion("IS_SPECIAL between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotBetween(String value1, String value2) {
            addCriterion("IS_SPECIAL not between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNull() {
            addCriterion("ACCEPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIsNotNull() {
            addCriterion("ACCEPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeEqualTo(Date value) {
            addCriterion("ACCEPT_TIME =", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotEqualTo(Date value) {
            addCriterion("ACCEPT_TIME <>", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThan(Date value) {
            addCriterion("ACCEPT_TIME >", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCEPT_TIME >=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThan(Date value) {
            addCriterion("ACCEPT_TIME <", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACCEPT_TIME <=", value, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeIn(List<Date> values) {
            addCriterion("ACCEPT_TIME in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotIn(List<Date> values) {
            addCriterion("ACCEPT_TIME not in", values, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeBetween(Date value1, Date value2) {
            addCriterion("ACCEPT_TIME between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andAcceptTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACCEPT_TIME not between", value1, value2, "acceptTime");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineIsNull() {
            addCriterion("ISHANDLE_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineIsNotNull() {
            addCriterion("ISHANDLE_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineEqualTo(String value) {
            addCriterion("ISHANDLE_ONLINE =", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineNotEqualTo(String value) {
            addCriterion("ISHANDLE_ONLINE <>", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineGreaterThan(String value) {
            addCriterion("ISHANDLE_ONLINE >", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_ONLINE >=", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineLessThan(String value) {
            addCriterion("ISHANDLE_ONLINE <", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineLessThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_ONLINE <=", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineLike(String value) {
            addCriterion("ISHANDLE_ONLINE like", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineNotLike(String value) {
            addCriterion("ISHANDLE_ONLINE not like", value, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineIn(List<String> values) {
            addCriterion("ISHANDLE_ONLINE in", values, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineNotIn(List<String> values) {
            addCriterion("ISHANDLE_ONLINE not in", values, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineBetween(String value1, String value2) {
            addCriterion("ISHANDLE_ONLINE between", value1, value2, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleOnlineNotBetween(String value1, String value2) {
            addCriterion("ISHANDLE_ONLINE not between", value1, value2, "ishandleOnline");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseIsNull() {
            addCriterion("ISHANDLE_CLOSE is null");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseIsNotNull() {
            addCriterion("ISHANDLE_CLOSE is not null");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseEqualTo(String value) {
            addCriterion("ISHANDLE_CLOSE =", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseNotEqualTo(String value) {
            addCriterion("ISHANDLE_CLOSE <>", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseGreaterThan(String value) {
            addCriterion("ISHANDLE_CLOSE >", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseGreaterThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_CLOSE >=", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseLessThan(String value) {
            addCriterion("ISHANDLE_CLOSE <", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseLessThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_CLOSE <=", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseLike(String value) {
            addCriterion("ISHANDLE_CLOSE like", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseNotLike(String value) {
            addCriterion("ISHANDLE_CLOSE not like", value, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseIn(List<String> values) {
            addCriterion("ISHANDLE_CLOSE in", values, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseNotIn(List<String> values) {
            addCriterion("ISHANDLE_CLOSE not in", values, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseBetween(String value1, String value2) {
            addCriterion("ISHANDLE_CLOSE between", value1, value2, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIshandleCloseNotBetween(String value1, String value2) {
            addCriterion("ISHANDLE_CLOSE not between", value1, value2, "ishandleClose");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoIsNull() {
            addCriterion("ISREVIEW_AUTO is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoIsNotNull() {
            addCriterion("ISREVIEW_AUTO is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoEqualTo(String value) {
            addCriterion("ISREVIEW_AUTO =", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoNotEqualTo(String value) {
            addCriterion("ISREVIEW_AUTO <>", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoGreaterThan(String value) {
            addCriterion("ISREVIEW_AUTO >", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoGreaterThanOrEqualTo(String value) {
            addCriterion("ISREVIEW_AUTO >=", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoLessThan(String value) {
            addCriterion("ISREVIEW_AUTO <", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoLessThanOrEqualTo(String value) {
            addCriterion("ISREVIEW_AUTO <=", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoLike(String value) {
            addCriterion("ISREVIEW_AUTO like", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoNotLike(String value) {
            addCriterion("ISREVIEW_AUTO not like", value, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoIn(List<String> values) {
            addCriterion("ISREVIEW_AUTO in", values, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoNotIn(List<String> values) {
            addCriterion("ISREVIEW_AUTO not in", values, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoBetween(String value1, String value2) {
            addCriterion("ISREVIEW_AUTO between", value1, value2, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewAutoNotBetween(String value1, String value2) {
            addCriterion("ISREVIEW_AUTO not between", value1, value2, "isreviewAuto");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseIsNull() {
            addCriterion("ISREVIEW_PROMISE is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseIsNotNull() {
            addCriterion("ISREVIEW_PROMISE is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseEqualTo(String value) {
            addCriterion("ISREVIEW_PROMISE =", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseNotEqualTo(String value) {
            addCriterion("ISREVIEW_PROMISE <>", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseGreaterThan(String value) {
            addCriterion("ISREVIEW_PROMISE >", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseGreaterThanOrEqualTo(String value) {
            addCriterion("ISREVIEW_PROMISE >=", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseLessThan(String value) {
            addCriterion("ISREVIEW_PROMISE <", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseLessThanOrEqualTo(String value) {
            addCriterion("ISREVIEW_PROMISE <=", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseLike(String value) {
            addCriterion("ISREVIEW_PROMISE like", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseNotLike(String value) {
            addCriterion("ISREVIEW_PROMISE not like", value, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseIn(List<String> values) {
            addCriterion("ISREVIEW_PROMISE in", values, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseNotIn(List<String> values) {
            addCriterion("ISREVIEW_PROMISE not in", values, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseBetween(String value1, String value2) {
            addCriterion("ISREVIEW_PROMISE between", value1, value2, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIsreviewPromiseNotBetween(String value1, String value2) {
            addCriterion("ISREVIEW_PROMISE not between", value1, value2, "isreviewPromise");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentIsNull() {
            addCriterion("ISHANDLE_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentIsNotNull() {
            addCriterion("ISHANDLE_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentEqualTo(String value) {
            addCriterion("ISHANDLE_AGENT =", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentNotEqualTo(String value) {
            addCriterion("ISHANDLE_AGENT <>", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentGreaterThan(String value) {
            addCriterion("ISHANDLE_AGENT >", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentGreaterThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_AGENT >=", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentLessThan(String value) {
            addCriterion("ISHANDLE_AGENT <", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentLessThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_AGENT <=", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentLike(String value) {
            addCriterion("ISHANDLE_AGENT like", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentNotLike(String value) {
            addCriterion("ISHANDLE_AGENT not like", value, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentIn(List<String> values) {
            addCriterion("ISHANDLE_AGENT in", values, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentNotIn(List<String> values) {
            addCriterion("ISHANDLE_AGENT not in", values, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentBetween(String value1, String value2) {
            addCriterion("ISHANDLE_AGENT between", value1, value2, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAgentNotBetween(String value1, String value2) {
            addCriterion("ISHANDLE_AGENT not between", value1, value2, "ishandleAgent");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaIsNull() {
            addCriterion("ISHANDLE_ALLAREA is null");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaIsNotNull() {
            addCriterion("ISHANDLE_ALLAREA is not null");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaEqualTo(String value) {
            addCriterion("ISHANDLE_ALLAREA =", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaNotEqualTo(String value) {
            addCriterion("ISHANDLE_ALLAREA <>", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaGreaterThan(String value) {
            addCriterion("ISHANDLE_ALLAREA >", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaGreaterThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_ALLAREA >=", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaLessThan(String value) {
            addCriterion("ISHANDLE_ALLAREA <", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaLessThanOrEqualTo(String value) {
            addCriterion("ISHANDLE_ALLAREA <=", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaLike(String value) {
            addCriterion("ISHANDLE_ALLAREA like", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaNotLike(String value) {
            addCriterion("ISHANDLE_ALLAREA not like", value, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaIn(List<String> values) {
            addCriterion("ISHANDLE_ALLAREA in", values, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaNotIn(List<String> values) {
            addCriterion("ISHANDLE_ALLAREA not in", values, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaBetween(String value1, String value2) {
            addCriterion("ISHANDLE_ALLAREA between", value1, value2, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andIshandleAllareaNotBetween(String value1, String value2) {
            addCriterion("ISHANDLE_ALLAREA not between", value1, value2, "ishandleAllarea");
            return (Criteria) this;
        }

        public Criteria andShowfileIsNull() {
            addCriterion("SHOWFILE is null");
            return (Criteria) this;
        }

        public Criteria andShowfileIsNotNull() {
            addCriterion("SHOWFILE is not null");
            return (Criteria) this;
        }

        public Criteria andShowfileEqualTo(String value) {
            addCriterion("SHOWFILE =", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotEqualTo(String value) {
            addCriterion("SHOWFILE <>", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileGreaterThan(String value) {
            addCriterion("SHOWFILE >", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileGreaterThanOrEqualTo(String value) {
            addCriterion("SHOWFILE >=", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileLessThan(String value) {
            addCriterion("SHOWFILE <", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileLessThanOrEqualTo(String value) {
            addCriterion("SHOWFILE <=", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileLike(String value) {
            addCriterion("SHOWFILE like", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotLike(String value) {
            addCriterion("SHOWFILE not like", value, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileIn(List<String> values) {
            addCriterion("SHOWFILE in", values, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotIn(List<String> values) {
            addCriterion("SHOWFILE not in", values, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileBetween(String value1, String value2) {
            addCriterion("SHOWFILE between", value1, value2, "showfile");
            return (Criteria) this;
        }

        public Criteria andShowfileNotBetween(String value1, String value2) {
            addCriterion("SHOWFILE not between", value1, value2, "showfile");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidIsNull() {
            addCriterion("ISREVIEW_PAID is null");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidIsNotNull() {
            addCriterion("ISREVIEW_PAID is not null");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidEqualTo(String value) {
            addCriterion("ISREVIEW_PAID =", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidNotEqualTo(String value) {
            addCriterion("ISREVIEW_PAID <>", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidGreaterThan(String value) {
            addCriterion("ISREVIEW_PAID >", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidGreaterThanOrEqualTo(String value) {
            addCriterion("ISREVIEW_PAID >=", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidLessThan(String value) {
            addCriterion("ISREVIEW_PAID <", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidLessThanOrEqualTo(String value) {
            addCriterion("ISREVIEW_PAID <=", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidLike(String value) {
            addCriterion("ISREVIEW_PAID like", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidNotLike(String value) {
            addCriterion("ISREVIEW_PAID not like", value, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidIn(List<String> values) {
            addCriterion("ISREVIEW_PAID in", values, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidNotIn(List<String> values) {
            addCriterion("ISREVIEW_PAID not in", values, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidBetween(String value1, String value2) {
            addCriterion("ISREVIEW_PAID between", value1, value2, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andIsreviewPaidNotBetween(String value1, String value2) {
            addCriterion("ISREVIEW_PAID not between", value1, value2, "isreviewPaid");
            return (Criteria) this;
        }

        public Criteria andImplementPowerIsNull() {
            addCriterion("IMPLEMENT_POWER is null");
            return (Criteria) this;
        }

        public Criteria andImplementPowerIsNotNull() {
            addCriterion("IMPLEMENT_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andImplementPowerEqualTo(String value) {
            addCriterion("IMPLEMENT_POWER =", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerNotEqualTo(String value) {
            addCriterion("IMPLEMENT_POWER <>", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerGreaterThan(String value) {
            addCriterion("IMPLEMENT_POWER >", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerGreaterThanOrEqualTo(String value) {
            addCriterion("IMPLEMENT_POWER >=", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerLessThan(String value) {
            addCriterion("IMPLEMENT_POWER <", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerLessThanOrEqualTo(String value) {
            addCriterion("IMPLEMENT_POWER <=", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerLike(String value) {
            addCriterion("IMPLEMENT_POWER like", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerNotLike(String value) {
            addCriterion("IMPLEMENT_POWER not like", value, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerIn(List<String> values) {
            addCriterion("IMPLEMENT_POWER in", values, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerNotIn(List<String> values) {
            addCriterion("IMPLEMENT_POWER not in", values, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerBetween(String value1, String value2) {
            addCriterion("IMPLEMENT_POWER between", value1, value2, "implementPower");
            return (Criteria) this;
        }

        public Criteria andImplementPowerNotBetween(String value1, String value2) {
            addCriterion("IMPLEMENT_POWER not between", value1, value2, "implementPower");
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

        public Criteria andMatterSubnameIsNull() {
            addCriterion("MATTER_SUBNAME is null");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameIsNotNull() {
            addCriterion("MATTER_SUBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameEqualTo(String value) {
            addCriterion("MATTER_SUBNAME =", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameNotEqualTo(String value) {
            addCriterion("MATTER_SUBNAME <>", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameGreaterThan(String value) {
            addCriterion("MATTER_SUBNAME >", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_SUBNAME >=", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameLessThan(String value) {
            addCriterion("MATTER_SUBNAME <", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameLessThanOrEqualTo(String value) {
            addCriterion("MATTER_SUBNAME <=", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameLike(String value) {
            addCriterion("MATTER_SUBNAME like", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameNotLike(String value) {
            addCriterion("MATTER_SUBNAME not like", value, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameIn(List<String> values) {
            addCriterion("MATTER_SUBNAME in", values, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameNotIn(List<String> values) {
            addCriterion("MATTER_SUBNAME not in", values, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameBetween(String value1, String value2) {
            addCriterion("MATTER_SUBNAME between", value1, value2, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterSubnameNotBetween(String value1, String value2) {
            addCriterion("MATTER_SUBNAME not between", value1, value2, "matterSubname");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesIsNull() {
            addCriterion("MATTER_PROPERTIES is null");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesIsNotNull() {
            addCriterion("MATTER_PROPERTIES is not null");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesEqualTo(String value) {
            addCriterion("MATTER_PROPERTIES =", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesNotEqualTo(String value) {
            addCriterion("MATTER_PROPERTIES <>", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesGreaterThan(String value) {
            addCriterion("MATTER_PROPERTIES >", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_PROPERTIES >=", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesLessThan(String value) {
            addCriterion("MATTER_PROPERTIES <", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesLessThanOrEqualTo(String value) {
            addCriterion("MATTER_PROPERTIES <=", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesLike(String value) {
            addCriterion("MATTER_PROPERTIES like", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesNotLike(String value) {
            addCriterion("MATTER_PROPERTIES not like", value, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesIn(List<String> values) {
            addCriterion("MATTER_PROPERTIES in", values, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesNotIn(List<String> values) {
            addCriterion("MATTER_PROPERTIES not in", values, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesBetween(String value1, String value2) {
            addCriterion("MATTER_PROPERTIES between", value1, value2, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterPropertiesNotBetween(String value1, String value2) {
            addCriterion("MATTER_PROPERTIES not between", value1, value2, "matterProperties");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameIsNull() {
            addCriterion("MATTER_STAGENAME is null");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameIsNotNull() {
            addCriterion("MATTER_STAGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameEqualTo(String value) {
            addCriterion("MATTER_STAGENAME =", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameNotEqualTo(String value) {
            addCriterion("MATTER_STAGENAME <>", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameGreaterThan(String value) {
            addCriterion("MATTER_STAGENAME >", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_STAGENAME >=", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameLessThan(String value) {
            addCriterion("MATTER_STAGENAME <", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameLessThanOrEqualTo(String value) {
            addCriterion("MATTER_STAGENAME <=", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameLike(String value) {
            addCriterion("MATTER_STAGENAME like", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameNotLike(String value) {
            addCriterion("MATTER_STAGENAME not like", value, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameIn(List<String> values) {
            addCriterion("MATTER_STAGENAME in", values, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameNotIn(List<String> values) {
            addCriterion("MATTER_STAGENAME not in", values, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameBetween(String value1, String value2) {
            addCriterion("MATTER_STAGENAME between", value1, value2, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andMatterStagenameNotBetween(String value1, String value2) {
            addCriterion("MATTER_STAGENAME not between", value1, value2, "matterStagename");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNull() {
            addCriterion("CHARGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChargeIdIsNotNull() {
            addCriterion("CHARGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChargeIdEqualTo(String value) {
            addCriterion("CHARGE_ID =", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotEqualTo(String value) {
            addCriterion("CHARGE_ID <>", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThan(String value) {
            addCriterion("CHARGE_ID >", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_ID >=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThan(String value) {
            addCriterion("CHARGE_ID <", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_ID <=", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdLike(String value) {
            addCriterion("CHARGE_ID like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotLike(String value) {
            addCriterion("CHARGE_ID not like", value, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdIn(List<String> values) {
            addCriterion("CHARGE_ID in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotIn(List<String> values) {
            addCriterion("CHARGE_ID not in", values, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdBetween(String value1, String value2) {
            addCriterion("CHARGE_ID between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andChargeIdNotBetween(String value1, String value2) {
            addCriterion("CHARGE_ID not between", value1, value2, "chargeId");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIsNull() {
            addCriterion("REVIEW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIsNotNull() {
            addCriterion("REVIEW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewTypeEqualTo(String value) {
            addCriterion("REVIEW_TYPE =", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotEqualTo(String value) {
            addCriterion("REVIEW_TYPE <>", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeGreaterThan(String value) {
            addCriterion("REVIEW_TYPE >", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_TYPE >=", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeLessThan(String value) {
            addCriterion("REVIEW_TYPE <", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_TYPE <=", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeLike(String value) {
            addCriterion("REVIEW_TYPE like", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotLike(String value) {
            addCriterion("REVIEW_TYPE not like", value, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeIn(List<String> values) {
            addCriterion("REVIEW_TYPE in", values, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotIn(List<String> values) {
            addCriterion("REVIEW_TYPE not in", values, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeBetween(String value1, String value2) {
            addCriterion("REVIEW_TYPE between", value1, value2, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewTypeNotBetween(String value1, String value2) {
            addCriterion("REVIEW_TYPE not between", value1, value2, "reviewType");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgIsNull() {
            addCriterion("REVIEW_ACCEPT_ORG is null");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgIsNotNull() {
            addCriterion("REVIEW_ACCEPT_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_ORG =", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgNotEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_ORG <>", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgGreaterThan(String value) {
            addCriterion("REVIEW_ACCEPT_ORG >", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_ORG >=", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgLessThan(String value) {
            addCriterion("REVIEW_ACCEPT_ORG <", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_ORG <=", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgLike(String value) {
            addCriterion("REVIEW_ACCEPT_ORG like", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgNotLike(String value) {
            addCriterion("REVIEW_ACCEPT_ORG not like", value, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgIn(List<String> values) {
            addCriterion("REVIEW_ACCEPT_ORG in", values, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgNotIn(List<String> values) {
            addCriterion("REVIEW_ACCEPT_ORG not in", values, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgBetween(String value1, String value2) {
            addCriterion("REVIEW_ACCEPT_ORG between", value1, value2, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptOrgNotBetween(String value1, String value2) {
            addCriterion("REVIEW_ACCEPT_ORG not between", value1, value2, "reviewAcceptOrg");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationIsNull() {
            addCriterion("REVIEW_ACCEPT_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationIsNotNull() {
            addCriterion("REVIEW_ACCEPT_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION =", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationNotEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION <>", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationGreaterThan(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION >", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION >=", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationLessThan(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION <", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION <=", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationLike(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION like", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationNotLike(String value) {
            addCriterion("REVIEW_ACCEPT_LOCATION not like", value, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationIn(List<String> values) {
            addCriterion("REVIEW_ACCEPT_LOCATION in", values, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationNotIn(List<String> values) {
            addCriterion("REVIEW_ACCEPT_LOCATION not in", values, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationBetween(String value1, String value2) {
            addCriterion("REVIEW_ACCEPT_LOCATION between", value1, value2, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andReviewAcceptLocationNotBetween(String value1, String value2) {
            addCriterion("REVIEW_ACCEPT_LOCATION not between", value1, value2, "reviewAcceptLocation");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessIsNull() {
            addCriterion("ONLINE_HANDLE_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessIsNotNull() {
            addCriterion("ONLINE_HANDLE_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessEqualTo(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS =", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessNotEqualTo(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS <>", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessGreaterThan(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS >", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS >=", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessLessThan(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS <", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS <=", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessLike(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS like", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessNotLike(String value) {
            addCriterion("ONLINE_HANDLE_PROCESS not like", value, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessIn(List<String> values) {
            addCriterion("ONLINE_HANDLE_PROCESS in", values, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessNotIn(List<String> values) {
            addCriterion("ONLINE_HANDLE_PROCESS not in", values, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessBetween(String value1, String value2) {
            addCriterion("ONLINE_HANDLE_PROCESS between", value1, value2, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOnlineHandleProcessNotBetween(String value1, String value2) {
            addCriterion("ONLINE_HANDLE_PROCESS not between", value1, value2, "onlineHandleProcess");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdIsNull() {
            addCriterion("OPERATION_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdIsNotNull() {
            addCriterion("OPERATION_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdEqualTo(String value) {
            addCriterion("OPERATION_FILE_ID =", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdNotEqualTo(String value) {
            addCriterion("OPERATION_FILE_ID <>", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdGreaterThan(String value) {
            addCriterion("OPERATION_FILE_ID >", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_FILE_ID >=", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdLessThan(String value) {
            addCriterion("OPERATION_FILE_ID <", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_FILE_ID <=", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdLike(String value) {
            addCriterion("OPERATION_FILE_ID like", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdNotLike(String value) {
            addCriterion("OPERATION_FILE_ID not like", value, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdIn(List<String> values) {
            addCriterion("OPERATION_FILE_ID in", values, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdNotIn(List<String> values) {
            addCriterion("OPERATION_FILE_ID not in", values, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdBetween(String value1, String value2) {
            addCriterion("OPERATION_FILE_ID between", value1, value2, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileIdNotBetween(String value1, String value2) {
            addCriterion("OPERATION_FILE_ID not between", value1, value2, "operationFileId");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameIsNull() {
            addCriterion("OPERATION_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameIsNotNull() {
            addCriterion("OPERATION_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameEqualTo(String value) {
            addCriterion("OPERATION_FILE_NAME =", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameNotEqualTo(String value) {
            addCriterion("OPERATION_FILE_NAME <>", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameGreaterThan(String value) {
            addCriterion("OPERATION_FILE_NAME >", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_FILE_NAME >=", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameLessThan(String value) {
            addCriterion("OPERATION_FILE_NAME <", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_FILE_NAME <=", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameLike(String value) {
            addCriterion("OPERATION_FILE_NAME like", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameNotLike(String value) {
            addCriterion("OPERATION_FILE_NAME not like", value, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameIn(List<String> values) {
            addCriterion("OPERATION_FILE_NAME in", values, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameNotIn(List<String> values) {
            addCriterion("OPERATION_FILE_NAME not in", values, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameBetween(String value1, String value2) {
            addCriterion("OPERATION_FILE_NAME between", value1, value2, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andOperationFileNameNotBetween(String value1, String value2) {
            addCriterion("OPERATION_FILE_NAME not between", value1, value2, "operationFileName");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("PROCESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("PROCESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("PROCESS_ID =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("PROCESS_ID <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("PROCESS_ID >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("PROCESS_ID <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("PROCESS_ID like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("PROCESS_ID not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("PROCESS_ID in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("PROCESS_ID not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("PROCESS_ID between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_ID not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNull() {
            addCriterion("PROCESS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("PROCESS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("PROCESS_NAME =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("PROCESS_NAME <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("PROCESS_NAME >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_NAME >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("PROCESS_NAME <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_NAME <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("PROCESS_NAME like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("PROCESS_NAME not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("PROCESS_NAME in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("PROCESS_NAME not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("PROCESS_NAME between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("PROCESS_NAME not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andRelocationIsNull() {
            addCriterion("RELOCATION is null");
            return (Criteria) this;
        }

        public Criteria andRelocationIsNotNull() {
            addCriterion("RELOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andRelocationEqualTo(String value) {
            addCriterion("RELOCATION =", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationNotEqualTo(String value) {
            addCriterion("RELOCATION <>", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationGreaterThan(String value) {
            addCriterion("RELOCATION >", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationGreaterThanOrEqualTo(String value) {
            addCriterion("RELOCATION >=", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationLessThan(String value) {
            addCriterion("RELOCATION <", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationLessThanOrEqualTo(String value) {
            addCriterion("RELOCATION <=", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationLike(String value) {
            addCriterion("RELOCATION like", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationNotLike(String value) {
            addCriterion("RELOCATION not like", value, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationIn(List<String> values) {
            addCriterion("RELOCATION in", values, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationNotIn(List<String> values) {
            addCriterion("RELOCATION not in", values, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationBetween(String value1, String value2) {
            addCriterion("RELOCATION between", value1, value2, "relocation");
            return (Criteria) this;
        }

        public Criteria andRelocationNotBetween(String value1, String value2) {
            addCriterion("RELOCATION not between", value1, value2, "relocation");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(String value) {
            addCriterion("QUESTION_ID =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(String value) {
            addCriterion("QUESTION_ID <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(String value) {
            addCriterion("QUESTION_ID >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_ID >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(String value) {
            addCriterion("QUESTION_ID <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_ID <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLike(String value) {
            addCriterion("QUESTION_ID like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotLike(String value) {
            addCriterion("QUESTION_ID not like", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<String> values) {
            addCriterion("QUESTION_ID in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<String> values) {
            addCriterion("QUESTION_ID not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(String value1, String value2) {
            addCriterion("QUESTION_ID between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(String value1, String value2) {
            addCriterion("QUESTION_ID not between", value1, value2, "questionId");
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