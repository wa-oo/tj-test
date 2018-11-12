package com.example.model.oracle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawExample() {
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

        public Criteria andLawIdIsNull() {
            addCriterion("LAW_ID is null");
            return (Criteria) this;
        }

        public Criteria andLawIdIsNotNull() {
            addCriterion("LAW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLawIdEqualTo(String value) {
            addCriterion("LAW_ID =", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdNotEqualTo(String value) {
            addCriterion("LAW_ID <>", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdGreaterThan(String value) {
            addCriterion("LAW_ID >", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdGreaterThanOrEqualTo(String value) {
            addCriterion("LAW_ID >=", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdLessThan(String value) {
            addCriterion("LAW_ID <", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdLessThanOrEqualTo(String value) {
            addCriterion("LAW_ID <=", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdLike(String value) {
            addCriterion("LAW_ID like", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdNotLike(String value) {
            addCriterion("LAW_ID not like", value, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdIn(List<String> values) {
            addCriterion("LAW_ID in", values, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdNotIn(List<String> values) {
            addCriterion("LAW_ID not in", values, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdBetween(String value1, String value2) {
            addCriterion("LAW_ID between", value1, value2, "lawId");
            return (Criteria) this;
        }

        public Criteria andLawIdNotBetween(String value1, String value2) {
            addCriterion("LAW_ID not between", value1, value2, "lawId");
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andExchangeIsNull() {
            addCriterion("EXCHANGE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNotNull() {
            addCriterion("EXCHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeEqualTo(String value) {
            addCriterion("EXCHANGE =", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotEqualTo(String value) {
            addCriterion("EXCHANGE <>", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThan(String value) {
            addCriterion("EXCHANGE >", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE >=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThan(String value) {
            addCriterion("EXCHANGE <", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE <=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLike(String value) {
            addCriterion("EXCHANGE like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotLike(String value) {
            addCriterion("EXCHANGE not like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeIn(List<String> values) {
            addCriterion("EXCHANGE in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotIn(List<String> values) {
            addCriterion("EXCHANGE not in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeBetween(String value1, String value2) {
            addCriterion("EXCHANGE between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE not between", value1, value2, "exchange");
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