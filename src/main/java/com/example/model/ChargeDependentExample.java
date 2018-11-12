package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChargeDependentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeDependentExample() {
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

        public Criteria andChargeNameIsNull() {
            addCriterion("CHARGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChargeNameIsNotNull() {
            addCriterion("CHARGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNameEqualTo(String value) {
            addCriterion("CHARGE_NAME =", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotEqualTo(String value) {
            addCriterion("CHARGE_NAME <>", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThan(String value) {
            addCriterion("CHARGE_NAME >", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_NAME >=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThan(String value) {
            addCriterion("CHARGE_NAME <", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_NAME <=", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameLike(String value) {
            addCriterion("CHARGE_NAME like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotLike(String value) {
            addCriterion("CHARGE_NAME not like", value, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameIn(List<String> values) {
            addCriterion("CHARGE_NAME in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotIn(List<String> values) {
            addCriterion("CHARGE_NAME not in", values, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameBetween(String value1, String value2) {
            addCriterion("CHARGE_NAME between", value1, value2, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeNameNotBetween(String value1, String value2) {
            addCriterion("CHARGE_NAME not between", value1, value2, "chargeName");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIsNull() {
            addCriterion("CHARGE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIsNotNull() {
            addCriterion("CHARGE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAmountEqualTo(String value) {
            addCriterion("CHARGE_AMOUNT =", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotEqualTo(String value) {
            addCriterion("CHARGE_AMOUNT <>", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountGreaterThan(String value) {
            addCriterion("CHARGE_AMOUNT >", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_AMOUNT >=", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountLessThan(String value) {
            addCriterion("CHARGE_AMOUNT <", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_AMOUNT <=", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountLike(String value) {
            addCriterion("CHARGE_AMOUNT like", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotLike(String value) {
            addCriterion("CHARGE_AMOUNT not like", value, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountIn(List<String> values) {
            addCriterion("CHARGE_AMOUNT in", values, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotIn(List<String> values) {
            addCriterion("CHARGE_AMOUNT not in", values, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountBetween(String value1, String value2) {
            addCriterion("CHARGE_AMOUNT between", value1, value2, "chargeAmount");
            return (Criteria) this;
        }

        public Criteria andChargeAmountNotBetween(String value1, String value2) {
            addCriterion("CHARGE_AMOUNT not between", value1, value2, "chargeAmount");
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

        public Criteria andLawNameIsNull() {
            addCriterion("LAW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLawNameIsNotNull() {
            addCriterion("LAW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLawNameEqualTo(String value) {
            addCriterion("LAW_NAME =", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotEqualTo(String value) {
            addCriterion("LAW_NAME <>", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameGreaterThan(String value) {
            addCriterion("LAW_NAME >", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAW_NAME >=", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameLessThan(String value) {
            addCriterion("LAW_NAME <", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameLessThanOrEqualTo(String value) {
            addCriterion("LAW_NAME <=", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameLike(String value) {
            addCriterion("LAW_NAME like", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotLike(String value) {
            addCriterion("LAW_NAME not like", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameIn(List<String> values) {
            addCriterion("LAW_NAME in", values, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotIn(List<String> values) {
            addCriterion("LAW_NAME not in", values, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameBetween(String value1, String value2) {
            addCriterion("LAW_NAME between", value1, value2, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotBetween(String value1, String value2) {
            addCriterion("LAW_NAME not between", value1, value2, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNumberIsNull() {
            addCriterion("LAW_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLawNumberIsNotNull() {
            addCriterion("LAW_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLawNumberEqualTo(String value) {
            addCriterion("LAW_NUMBER =", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberNotEqualTo(String value) {
            addCriterion("LAW_NUMBER <>", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberGreaterThan(String value) {
            addCriterion("LAW_NUMBER >", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberGreaterThanOrEqualTo(String value) {
            addCriterion("LAW_NUMBER >=", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberLessThan(String value) {
            addCriterion("LAW_NUMBER <", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberLessThanOrEqualTo(String value) {
            addCriterion("LAW_NUMBER <=", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberLike(String value) {
            addCriterion("LAW_NUMBER like", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberNotLike(String value) {
            addCriterion("LAW_NUMBER not like", value, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberIn(List<String> values) {
            addCriterion("LAW_NUMBER in", values, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberNotIn(List<String> values) {
            addCriterion("LAW_NUMBER not in", values, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberBetween(String value1, String value2) {
            addCriterion("LAW_NUMBER between", value1, value2, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawNumberNotBetween(String value1, String value2) {
            addCriterion("LAW_NUMBER not between", value1, value2, "lawNumber");
            return (Criteria) this;
        }

        public Criteria andLawTextIsNull() {
            addCriterion("LAW_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andLawTextIsNotNull() {
            addCriterion("LAW_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andLawTextEqualTo(String value) {
            addCriterion("LAW_TEXT =", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextNotEqualTo(String value) {
            addCriterion("LAW_TEXT <>", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextGreaterThan(String value) {
            addCriterion("LAW_TEXT >", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextGreaterThanOrEqualTo(String value) {
            addCriterion("LAW_TEXT >=", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextLessThan(String value) {
            addCriterion("LAW_TEXT <", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextLessThanOrEqualTo(String value) {
            addCriterion("LAW_TEXT <=", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextLike(String value) {
            addCriterion("LAW_TEXT like", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextNotLike(String value) {
            addCriterion("LAW_TEXT not like", value, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextIn(List<String> values) {
            addCriterion("LAW_TEXT in", values, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextNotIn(List<String> values) {
            addCriterion("LAW_TEXT not in", values, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextBetween(String value1, String value2) {
            addCriterion("LAW_TEXT between", value1, value2, "lawText");
            return (Criteria) this;
        }

        public Criteria andLawTextNotBetween(String value1, String value2) {
            addCriterion("LAW_TEXT not between", value1, value2, "lawText");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("FILE_ID like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("FILE_ID not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
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