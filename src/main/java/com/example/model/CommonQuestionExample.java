package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class CommonQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonQuestionExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andQuestionNameIsNull() {
            addCriterion("QUESTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIsNotNull() {
            addCriterion("QUESTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNameEqualTo(String value) {
            addCriterion("QUESTION_NAME =", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotEqualTo(String value) {
            addCriterion("QUESTION_NAME <>", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThan(String value) {
            addCriterion("QUESTION_NAME >", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_NAME >=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThan(String value) {
            addCriterion("QUESTION_NAME <", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_NAME <=", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameLike(String value) {
            addCriterion("QUESTION_NAME like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotLike(String value) {
            addCriterion("QUESTION_NAME not like", value, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameIn(List<String> values) {
            addCriterion("QUESTION_NAME in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotIn(List<String> values) {
            addCriterion("QUESTION_NAME not in", values, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameBetween(String value1, String value2) {
            addCriterion("QUESTION_NAME between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionNameNotBetween(String value1, String value2) {
            addCriterion("QUESTION_NAME not between", value1, value2, "questionName");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIsNull() {
            addCriterion("QUESTION_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIsNotNull() {
            addCriterion("QUESTION_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerEqualTo(String value) {
            addCriterion("QUESTION_ANSWER =", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotEqualTo(String value) {
            addCriterion("QUESTION_ANSWER <>", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerGreaterThan(String value) {
            addCriterion("QUESTION_ANSWER >", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_ANSWER >=", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLessThan(String value) {
            addCriterion("QUESTION_ANSWER <", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_ANSWER <=", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerLike(String value) {
            addCriterion("QUESTION_ANSWER like", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotLike(String value) {
            addCriterion("QUESTION_ANSWER not like", value, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerIn(List<String> values) {
            addCriterion("QUESTION_ANSWER in", values, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotIn(List<String> values) {
            addCriterion("QUESTION_ANSWER not in", values, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerBetween(String value1, String value2) {
            addCriterion("QUESTION_ANSWER between", value1, value2, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionAnswerNotBetween(String value1, String value2) {
            addCriterion("QUESTION_ANSWER not between", value1, value2, "questionAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionIsNull() {
            addCriterion("QUESTION_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionIsNotNull() {
            addCriterion("QUESTION_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionEqualTo(String value) {
            addCriterion("QUESTION_VERSION =", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionNotEqualTo(String value) {
            addCriterion("QUESTION_VERSION <>", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionGreaterThan(String value) {
            addCriterion("QUESTION_VERSION >", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_VERSION >=", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionLessThan(String value) {
            addCriterion("QUESTION_VERSION <", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_VERSION <=", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionLike(String value) {
            addCriterion("QUESTION_VERSION like", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionNotLike(String value) {
            addCriterion("QUESTION_VERSION not like", value, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionIn(List<String> values) {
            addCriterion("QUESTION_VERSION in", values, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionNotIn(List<String> values) {
            addCriterion("QUESTION_VERSION not in", values, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionBetween(String value1, String value2) {
            addCriterion("QUESTION_VERSION between", value1, value2, "questionVersion");
            return (Criteria) this;
        }

        public Criteria andQuestionVersionNotBetween(String value1, String value2) {
            addCriterion("QUESTION_VERSION not between", value1, value2, "questionVersion");
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