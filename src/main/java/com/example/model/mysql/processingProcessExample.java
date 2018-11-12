package com.example.model.mysql;

import java.util.ArrayList;
import java.util.List;

public class processingProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public processingProcessExample() {
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

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("step is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("step is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(String value) {
            addCriterion("step =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(String value) {
            addCriterion("step <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(String value) {
            addCriterion("step >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(String value) {
            addCriterion("step >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(String value) {
            addCriterion("step <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(String value) {
            addCriterion("step <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLike(String value) {
            addCriterion("step like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotLike(String value) {
            addCriterion("step not like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<String> values) {
            addCriterion("step in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<String> values) {
            addCriterion("step not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(String value1, String value2) {
            addCriterion("step between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(String value1, String value2) {
            addCriterion("step not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNull() {
            addCriterion("handler is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIsNotNull() {
            addCriterion("handler is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerEqualTo(String value) {
            addCriterion("handler =", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotEqualTo(String value) {
            addCriterion("handler <>", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThan(String value) {
            addCriterion("handler >", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerGreaterThanOrEqualTo(String value) {
            addCriterion("handler >=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThan(String value) {
            addCriterion("handler <", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLessThanOrEqualTo(String value) {
            addCriterion("handler <=", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerLike(String value) {
            addCriterion("handler like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotLike(String value) {
            addCriterion("handler not like", value, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerIn(List<String> values) {
            addCriterion("handler in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotIn(List<String> values) {
            addCriterion("handler not in", values, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerBetween(String value1, String value2) {
            addCriterion("handler between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andHandlerNotBetween(String value1, String value2) {
            addCriterion("handler not between", value1, value2, "handler");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(String value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(String value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(String value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(String value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(String value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLike(String value) {
            addCriterion("time_limit like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotLike(String value) {
            addCriterion("time_limit not like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<String> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<String> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(String value1, String value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(String value1, String value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
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

        public Criteria andBasisIsNull() {
            addCriterion("basis is null");
            return (Criteria) this;
        }

        public Criteria andBasisIsNotNull() {
            addCriterion("basis is not null");
            return (Criteria) this;
        }

        public Criteria andBasisEqualTo(String value) {
            addCriterion("basis =", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotEqualTo(String value) {
            addCriterion("basis <>", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisGreaterThan(String value) {
            addCriterion("basis >", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisGreaterThanOrEqualTo(String value) {
            addCriterion("basis >=", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisLessThan(String value) {
            addCriterion("basis <", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisLessThanOrEqualTo(String value) {
            addCriterion("basis <=", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisLike(String value) {
            addCriterion("basis like", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotLike(String value) {
            addCriterion("basis not like", value, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisIn(List<String> values) {
            addCriterion("basis in", values, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotIn(List<String> values) {
            addCriterion("basis not in", values, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisBetween(String value1, String value2) {
            addCriterion("basis between", value1, value2, "basis");
            return (Criteria) this;
        }

        public Criteria andBasisNotBetween(String value1, String value2) {
            addCriterion("basis not between", value1, value2, "basis");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsIsNull() {
            addCriterion("processing_results is null");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsIsNotNull() {
            addCriterion("processing_results is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsEqualTo(String value) {
            addCriterion("processing_results =", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsNotEqualTo(String value) {
            addCriterion("processing_results <>", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsGreaterThan(String value) {
            addCriterion("processing_results >", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsGreaterThanOrEqualTo(String value) {
            addCriterion("processing_results >=", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsLessThan(String value) {
            addCriterion("processing_results <", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsLessThanOrEqualTo(String value) {
            addCriterion("processing_results <=", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsLike(String value) {
            addCriterion("processing_results like", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsNotLike(String value) {
            addCriterion("processing_results not like", value, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsIn(List<String> values) {
            addCriterion("processing_results in", values, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsNotIn(List<String> values) {
            addCriterion("processing_results not in", values, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsBetween(String value1, String value2) {
            addCriterion("processing_results between", value1, value2, "processingResults");
            return (Criteria) this;
        }

        public Criteria andProcessingResultsNotBetween(String value1, String value2) {
            addCriterion("processing_results not between", value1, value2, "processingResults");
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