package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MenuInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuInformationExample() {
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

        public Criteria andOnlyOneIsNull() {
            addCriterion("ONLY_ONE is null");
            return (Criteria) this;
        }

        public Criteria andOnlyOneIsNotNull() {
            addCriterion("ONLY_ONE is not null");
            return (Criteria) this;
        }

        public Criteria andOnlyOneEqualTo(String value) {
            addCriterion("ONLY_ONE =", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneNotEqualTo(String value) {
            addCriterion("ONLY_ONE <>", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneGreaterThan(String value) {
            addCriterion("ONLY_ONE >", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneGreaterThanOrEqualTo(String value) {
            addCriterion("ONLY_ONE >=", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneLessThan(String value) {
            addCriterion("ONLY_ONE <", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneLessThanOrEqualTo(String value) {
            addCriterion("ONLY_ONE <=", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneLike(String value) {
            addCriterion("ONLY_ONE like", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneNotLike(String value) {
            addCriterion("ONLY_ONE not like", value, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneIn(List<String> values) {
            addCriterion("ONLY_ONE in", values, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneNotIn(List<String> values) {
            addCriterion("ONLY_ONE not in", values, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneBetween(String value1, String value2) {
            addCriterion("ONLY_ONE between", value1, value2, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andOnlyOneNotBetween(String value1, String value2) {
            addCriterion("ONLY_ONE not between", value1, value2, "onlyOne");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("SUBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("SUBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(String value) {
            addCriterion("SUBJECT_ID =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(String value) {
            addCriterion("SUBJECT_ID <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(String value) {
            addCriterion("SUBJECT_ID >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT_ID >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(String value) {
            addCriterion("SUBJECT_ID <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT_ID <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLike(String value) {
            addCriterion("SUBJECT_ID like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotLike(String value) {
            addCriterion("SUBJECT_ID not like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<String> values) {
            addCriterion("SUBJECT_ID in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<String> values) {
            addCriterion("SUBJECT_ID not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(String value1, String value2) {
            addCriterion("SUBJECT_ID between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(String value1, String value2) {
            addCriterion("SUBJECT_ID not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andMatterVersionIsNull() {
            addCriterion("MATTER_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andMatterVersionIsNotNull() {
            addCriterion("MATTER_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMatterVersionEqualTo(String value) {
            addCriterion("MATTER_VERSION =", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionNotEqualTo(String value) {
            addCriterion("MATTER_VERSION <>", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionGreaterThan(String value) {
            addCriterion("MATTER_VERSION >", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionGreaterThanOrEqualTo(String value) {
            addCriterion("MATTER_VERSION >=", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionLessThan(String value) {
            addCriterion("MATTER_VERSION <", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionLessThanOrEqualTo(String value) {
            addCriterion("MATTER_VERSION <=", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionLike(String value) {
            addCriterion("MATTER_VERSION like", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionNotLike(String value) {
            addCriterion("MATTER_VERSION not like", value, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionIn(List<String> values) {
            addCriterion("MATTER_VERSION in", values, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionNotIn(List<String> values) {
            addCriterion("MATTER_VERSION not in", values, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionBetween(String value1, String value2) {
            addCriterion("MATTER_VERSION between", value1, value2, "matterVersion");
            return (Criteria) this;
        }

        public Criteria andMatterVersionNotBetween(String value1, String value2) {
            addCriterion("MATTER_VERSION not between", value1, value2, "matterVersion");
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

        public Criteria andBusinessDeptIsNull() {
            addCriterion("BUSINESS_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptIsNotNull() {
            addCriterion("BUSINESS_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptEqualTo(String value) {
            addCriterion("BUSINESS_DEPT =", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotEqualTo(String value) {
            addCriterion("BUSINESS_DEPT <>", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptGreaterThan(String value) {
            addCriterion("BUSINESS_DEPT >", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_DEPT >=", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptLessThan(String value) {
            addCriterion("BUSINESS_DEPT <", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_DEPT <=", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptLike(String value) {
            addCriterion("BUSINESS_DEPT like", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotLike(String value) {
            addCriterion("BUSINESS_DEPT not like", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptIn(List<String> values) {
            addCriterion("BUSINESS_DEPT in", values, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotIn(List<String> values) {
            addCriterion("BUSINESS_DEPT not in", values, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptBetween(String value1, String value2) {
            addCriterion("BUSINESS_DEPT between", value1, value2, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_DEPT not between", value1, value2, "businessDept");
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