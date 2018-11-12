package com.example.model.mysql;

import java.util.ArrayList;
import java.util.List;

public class InformationSheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationSheetExample() {
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

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andBasicCodingIsNull() {
            addCriterion("basic_coding is null");
            return (Criteria) this;
        }

        public Criteria andBasicCodingIsNotNull() {
            addCriterion("basic_coding is not null");
            return (Criteria) this;
        }

        public Criteria andBasicCodingEqualTo(String value) {
            addCriterion("basic_coding =", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingNotEqualTo(String value) {
            addCriterion("basic_coding <>", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingGreaterThan(String value) {
            addCriterion("basic_coding >", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingGreaterThanOrEqualTo(String value) {
            addCriterion("basic_coding >=", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingLessThan(String value) {
            addCriterion("basic_coding <", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingLessThanOrEqualTo(String value) {
            addCriterion("basic_coding <=", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingLike(String value) {
            addCriterion("basic_coding like", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingNotLike(String value) {
            addCriterion("basic_coding not like", value, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingIn(List<String> values) {
            addCriterion("basic_coding in", values, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingNotIn(List<String> values) {
            addCriterion("basic_coding not in", values, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingBetween(String value1, String value2) {
            addCriterion("basic_coding between", value1, value2, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andBasicCodingNotBetween(String value1, String value2) {
            addCriterion("basic_coding not between", value1, value2, "basicCoding");
            return (Criteria) this;
        }

        public Criteria andChildNameIsNull() {
            addCriterion("child_name is null");
            return (Criteria) this;
        }

        public Criteria andChildNameIsNotNull() {
            addCriterion("child_name is not null");
            return (Criteria) this;
        }

        public Criteria andChildNameEqualTo(String value) {
            addCriterion("child_name =", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotEqualTo(String value) {
            addCriterion("child_name <>", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameGreaterThan(String value) {
            addCriterion("child_name >", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameGreaterThanOrEqualTo(String value) {
            addCriterion("child_name >=", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLessThan(String value) {
            addCriterion("child_name <", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLessThanOrEqualTo(String value) {
            addCriterion("child_name <=", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLike(String value) {
            addCriterion("child_name like", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotLike(String value) {
            addCriterion("child_name not like", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameIn(List<String> values) {
            addCriterion("child_name in", values, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotIn(List<String> values) {
            addCriterion("child_name not in", values, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameBetween(String value1, String value2) {
            addCriterion("child_name between", value1, value2, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotBetween(String value1, String value2) {
            addCriterion("child_name not between", value1, value2, "childName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryIsNull() {
            addCriterion("approval_category is null");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryIsNotNull() {
            addCriterion("approval_category is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryEqualTo(String value) {
            addCriterion("approval_category =", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryNotEqualTo(String value) {
            addCriterion("approval_category <>", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryGreaterThan(String value) {
            addCriterion("approval_category >", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("approval_category >=", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryLessThan(String value) {
            addCriterion("approval_category <", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryLessThanOrEqualTo(String value) {
            addCriterion("approval_category <=", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryLike(String value) {
            addCriterion("approval_category like", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryNotLike(String value) {
            addCriterion("approval_category not like", value, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryIn(List<String> values) {
            addCriterion("approval_category in", values, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryNotIn(List<String> values) {
            addCriterion("approval_category not in", values, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryBetween(String value1, String value2) {
            addCriterion("approval_category between", value1, value2, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andApprovalCategoryNotBetween(String value1, String value2) {
            addCriterion("approval_category not between", value1, value2, "approvalCategory");
            return (Criteria) this;
        }

        public Criteria andServiceObjectIsNull() {
            addCriterion("service_object is null");
            return (Criteria) this;
        }

        public Criteria andServiceObjectIsNotNull() {
            addCriterion("service_object is not null");
            return (Criteria) this;
        }

        public Criteria andServiceObjectEqualTo(String value) {
            addCriterion("service_object =", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectNotEqualTo(String value) {
            addCriterion("service_object <>", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectGreaterThan(String value) {
            addCriterion("service_object >", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectGreaterThanOrEqualTo(String value) {
            addCriterion("service_object >=", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectLessThan(String value) {
            addCriterion("service_object <", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectLessThanOrEqualTo(String value) {
            addCriterion("service_object <=", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectLike(String value) {
            addCriterion("service_object like", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectNotLike(String value) {
            addCriterion("service_object not like", value, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectIn(List<String> values) {
            addCriterion("service_object in", values, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectNotIn(List<String> values) {
            addCriterion("service_object not in", values, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectBetween(String value1, String value2) {
            addCriterion("service_object between", value1, value2, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andServiceObjectNotBetween(String value1, String value2) {
            addCriterion("service_object not between", value1, value2, "serviceObject");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationIsNull() {
            addCriterion("administrative_examination is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationIsNotNull() {
            addCriterion("administrative_examination is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationEqualTo(String value) {
            addCriterion("administrative_examination =", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationNotEqualTo(String value) {
            addCriterion("administrative_examination <>", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationGreaterThan(String value) {
            addCriterion("administrative_examination >", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationGreaterThanOrEqualTo(String value) {
            addCriterion("administrative_examination >=", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationLessThan(String value) {
            addCriterion("administrative_examination <", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationLessThanOrEqualTo(String value) {
            addCriterion("administrative_examination <=", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationLike(String value) {
            addCriterion("administrative_examination like", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationNotLike(String value) {
            addCriterion("administrative_examination not like", value, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationIn(List<String> values) {
            addCriterion("administrative_examination in", values, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationNotIn(List<String> values) {
            addCriterion("administrative_examination not in", values, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationBetween(String value1, String value2) {
            addCriterion("administrative_examination between", value1, value2, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andAdministrativeExaminationNotBetween(String value1, String value2) {
            addCriterion("administrative_examination not between", value1, value2, "administrativeExamination");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelIsNull() {
            addCriterion("exercise_level is null");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelIsNotNull() {
            addCriterion("exercise_level is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelEqualTo(String value) {
            addCriterion("exercise_level =", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelNotEqualTo(String value) {
            addCriterion("exercise_level <>", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelGreaterThan(String value) {
            addCriterion("exercise_level >", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelGreaterThanOrEqualTo(String value) {
            addCriterion("exercise_level >=", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelLessThan(String value) {
            addCriterion("exercise_level <", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelLessThanOrEqualTo(String value) {
            addCriterion("exercise_level <=", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelLike(String value) {
            addCriterion("exercise_level like", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelNotLike(String value) {
            addCriterion("exercise_level not like", value, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelIn(List<String> values) {
            addCriterion("exercise_level in", values, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelNotIn(List<String> values) {
            addCriterion("exercise_level not in", values, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelBetween(String value1, String value2) {
            addCriterion("exercise_level between", value1, value2, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andExerciseLevelNotBetween(String value1, String value2) {
            addCriterion("exercise_level not between", value1, value2, "exerciseLevel");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeIsNull() {
            addCriterion("handling_type is null");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeIsNotNull() {
            addCriterion("handling_type is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeEqualTo(String value) {
            addCriterion("handling_type =", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeNotEqualTo(String value) {
            addCriterion("handling_type <>", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeGreaterThan(String value) {
            addCriterion("handling_type >", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("handling_type >=", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeLessThan(String value) {
            addCriterion("handling_type <", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeLessThanOrEqualTo(String value) {
            addCriterion("handling_type <=", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeLike(String value) {
            addCriterion("handling_type like", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeNotLike(String value) {
            addCriterion("handling_type not like", value, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeIn(List<String> values) {
            addCriterion("handling_type in", values, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeNotIn(List<String> values) {
            addCriterion("handling_type not in", values, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeBetween(String value1, String value2) {
            addCriterion("handling_type between", value1, value2, "handlingType");
            return (Criteria) this;
        }

        public Criteria andHandlingTypeNotBetween(String value1, String value2) {
            addCriterion("handling_type not between", value1, value2, "handlingType");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentIsNull() {
            addCriterion("business_department is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentIsNotNull() {
            addCriterion("business_department is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentEqualTo(String value) {
            addCriterion("business_department =", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentNotEqualTo(String value) {
            addCriterion("business_department <>", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentGreaterThan(String value) {
            addCriterion("business_department >", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("business_department >=", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentLessThan(String value) {
            addCriterion("business_department <", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentLessThanOrEqualTo(String value) {
            addCriterion("business_department <=", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentLike(String value) {
            addCriterion("business_department like", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentNotLike(String value) {
            addCriterion("business_department not like", value, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentIn(List<String> values) {
            addCriterion("business_department in", values, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentNotIn(List<String> values) {
            addCriterion("business_department not in", values, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentBetween(String value1, String value2) {
            addCriterion("business_department between", value1, value2, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andBusinessDepartmentNotBetween(String value1, String value2) {
            addCriterion("business_department not between", value1, value2, "businessDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentIsNull() {
            addCriterion("implementation_department is null");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentIsNotNull() {
            addCriterion("implementation_department is not null");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentEqualTo(String value) {
            addCriterion("implementation_department =", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentNotEqualTo(String value) {
            addCriterion("implementation_department <>", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentGreaterThan(String value) {
            addCriterion("implementation_department >", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("implementation_department >=", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentLessThan(String value) {
            addCriterion("implementation_department <", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentLessThanOrEqualTo(String value) {
            addCriterion("implementation_department <=", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentLike(String value) {
            addCriterion("implementation_department like", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentNotLike(String value) {
            addCriterion("implementation_department not like", value, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentIn(List<String> values) {
            addCriterion("implementation_department in", values, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentNotIn(List<String> values) {
            addCriterion("implementation_department not in", values, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentBetween(String value1, String value2) {
            addCriterion("implementation_department between", value1, value2, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationDepartmentNotBetween(String value1, String value2) {
            addCriterion("implementation_department not between", value1, value2, "implementationDepartment");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingIsNull() {
            addCriterion("implementation_coding is null");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingIsNotNull() {
            addCriterion("implementation_coding is not null");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingEqualTo(String value) {
            addCriterion("implementation_coding =", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingNotEqualTo(String value) {
            addCriterion("implementation_coding <>", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingGreaterThan(String value) {
            addCriterion("implementation_coding >", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingGreaterThanOrEqualTo(String value) {
            addCriterion("implementation_coding >=", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingLessThan(String value) {
            addCriterion("implementation_coding <", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingLessThanOrEqualTo(String value) {
            addCriterion("implementation_coding <=", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingLike(String value) {
            addCriterion("implementation_coding like", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingNotLike(String value) {
            addCriterion("implementation_coding not like", value, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingIn(List<String> values) {
            addCriterion("implementation_coding in", values, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingNotIn(List<String> values) {
            addCriterion("implementation_coding not in", values, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingBetween(String value1, String value2) {
            addCriterion("implementation_coding between", value1, value2, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andImplementationCodingNotBetween(String value1, String value2) {
            addCriterion("implementation_coding not between", value1, value2, "implementationCoding");
            return (Criteria) this;
        }

        public Criteria andComplaintCallIsNull() {
            addCriterion("complaint_call is null");
            return (Criteria) this;
        }

        public Criteria andComplaintCallIsNotNull() {
            addCriterion("complaint_call is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintCallEqualTo(String value) {
            addCriterion("complaint_call =", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallNotEqualTo(String value) {
            addCriterion("complaint_call <>", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallGreaterThan(String value) {
            addCriterion("complaint_call >", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_call >=", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallLessThan(String value) {
            addCriterion("complaint_call <", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallLessThanOrEqualTo(String value) {
            addCriterion("complaint_call <=", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallLike(String value) {
            addCriterion("complaint_call like", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallNotLike(String value) {
            addCriterion("complaint_call not like", value, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallIn(List<String> values) {
            addCriterion("complaint_call in", values, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallNotIn(List<String> values) {
            addCriterion("complaint_call not in", values, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallBetween(String value1, String value2) {
            addCriterion("complaint_call between", value1, value2, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andComplaintCallNotBetween(String value1, String value2) {
            addCriterion("complaint_call not between", value1, value2, "complaintCall");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineIsNull() {
            addCriterion("support_hotline is null");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineIsNotNull() {
            addCriterion("support_hotline is not null");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineEqualTo(String value) {
            addCriterion("support_hotline =", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineNotEqualTo(String value) {
            addCriterion("support_hotline <>", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineGreaterThan(String value) {
            addCriterion("support_hotline >", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineGreaterThanOrEqualTo(String value) {
            addCriterion("support_hotline >=", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineLessThan(String value) {
            addCriterion("support_hotline <", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineLessThanOrEqualTo(String value) {
            addCriterion("support_hotline <=", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineLike(String value) {
            addCriterion("support_hotline like", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineNotLike(String value) {
            addCriterion("support_hotline not like", value, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineIn(List<String> values) {
            addCriterion("support_hotline in", values, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineNotIn(List<String> values) {
            addCriterion("support_hotline not in", values, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineBetween(String value1, String value2) {
            addCriterion("support_hotline between", value1, value2, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andSupportHotlineNotBetween(String value1, String value2) {
            addCriterion("support_hotline not between", value1, value2, "supportHotline");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeIsNull() {
            addCriterion("general_scope is null");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeIsNotNull() {
            addCriterion("general_scope is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeEqualTo(String value) {
            addCriterion("general_scope =", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeNotEqualTo(String value) {
            addCriterion("general_scope <>", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeGreaterThan(String value) {
            addCriterion("general_scope >", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeGreaterThanOrEqualTo(String value) {
            addCriterion("general_scope >=", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeLessThan(String value) {
            addCriterion("general_scope <", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeLessThanOrEqualTo(String value) {
            addCriterion("general_scope <=", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeLike(String value) {
            addCriterion("general_scope like", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeNotLike(String value) {
            addCriterion("general_scope not like", value, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeIn(List<String> values) {
            addCriterion("general_scope in", values, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeNotIn(List<String> values) {
            addCriterion("general_scope not in", values, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeBetween(String value1, String value2) {
            addCriterion("general_scope between", value1, value2, "generalScope");
            return (Criteria) this;
        }

        public Criteria andGeneralScopeNotBetween(String value1, String value2) {
            addCriterion("general_scope not between", value1, value2, "generalScope");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeIsNull() {
            addCriterion("statutory_time is null");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeIsNotNull() {
            addCriterion("statutory_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeEqualTo(String value) {
            addCriterion("statutory_time =", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeNotEqualTo(String value) {
            addCriterion("statutory_time <>", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeGreaterThan(String value) {
            addCriterion("statutory_time >", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("statutory_time >=", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeLessThan(String value) {
            addCriterion("statutory_time <", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeLessThanOrEqualTo(String value) {
            addCriterion("statutory_time <=", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeLike(String value) {
            addCriterion("statutory_time like", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeNotLike(String value) {
            addCriterion("statutory_time not like", value, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeIn(List<String> values) {
            addCriterion("statutory_time in", values, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeNotIn(List<String> values) {
            addCriterion("statutory_time not in", values, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeBetween(String value1, String value2) {
            addCriterion("statutory_time between", value1, value2, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andStatutoryTimeNotBetween(String value1, String value2) {
            addCriterion("statutory_time not between", value1, value2, "statutoryTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeIsNull() {
            addCriterion("commitment_time is null");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeIsNotNull() {
            addCriterion("commitment_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeEqualTo(String value) {
            addCriterion("commitment_time =", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeNotEqualTo(String value) {
            addCriterion("commitment_time <>", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeGreaterThan(String value) {
            addCriterion("commitment_time >", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("commitment_time >=", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeLessThan(String value) {
            addCriterion("commitment_time <", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeLessThanOrEqualTo(String value) {
            addCriterion("commitment_time <=", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeLike(String value) {
            addCriterion("commitment_time like", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeNotLike(String value) {
            addCriterion("commitment_time not like", value, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeIn(List<String> values) {
            addCriterion("commitment_time in", values, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeNotIn(List<String> values) {
            addCriterion("commitment_time not in", values, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeBetween(String value1, String value2) {
            addCriterion("commitment_time between", value1, value2, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andCommitmentTimeNotBetween(String value1, String value2) {
            addCriterion("commitment_time not between", value1, value2, "commitmentTime");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNull() {
            addCriterion("validity_period is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNotNull() {
            addCriterion("validity_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEqualTo(String value) {
            addCriterion("validity_period =", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotEqualTo(String value) {
            addCriterion("validity_period <>", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThan(String value) {
            addCriterion("validity_period >", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("validity_period >=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThan(String value) {
            addCriterion("validity_period <", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThanOrEqualTo(String value) {
            addCriterion("validity_period <=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLike(String value) {
            addCriterion("validity_period like", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotLike(String value) {
            addCriterion("validity_period not like", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIn(List<String> values) {
            addCriterion("validity_period in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotIn(List<String> values) {
            addCriterion("validity_period not in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodBetween(String value1, String value2) {
            addCriterion("validity_period between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotBetween(String value1, String value2) {
            addCriterion("validity_period not between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andDispatchIsNull() {
            addCriterion("dispatch is null");
            return (Criteria) this;
        }

        public Criteria andDispatchIsNotNull() {
            addCriterion("dispatch is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchEqualTo(String value) {
            addCriterion("dispatch =", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchNotEqualTo(String value) {
            addCriterion("dispatch <>", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchGreaterThan(String value) {
            addCriterion("dispatch >", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchGreaterThanOrEqualTo(String value) {
            addCriterion("dispatch >=", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchLessThan(String value) {
            addCriterion("dispatch <", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchLessThanOrEqualTo(String value) {
            addCriterion("dispatch <=", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchLike(String value) {
            addCriterion("dispatch like", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchNotLike(String value) {
            addCriterion("dispatch not like", value, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchIn(List<String> values) {
            addCriterion("dispatch in", values, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchNotIn(List<String> values) {
            addCriterion("dispatch not in", values, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchBetween(String value1, String value2) {
            addCriterion("dispatch between", value1, value2, "dispatch");
            return (Criteria) this;
        }

        public Criteria andDispatchNotBetween(String value1, String value2) {
            addCriterion("dispatch not between", value1, value2, "dispatch");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceIsNull() {
            addCriterion("intermediary_service is null");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceIsNotNull() {
            addCriterion("intermediary_service is not null");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceEqualTo(String value) {
            addCriterion("intermediary_service =", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceNotEqualTo(String value) {
            addCriterion("intermediary_service <>", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceGreaterThan(String value) {
            addCriterion("intermediary_service >", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceGreaterThanOrEqualTo(String value) {
            addCriterion("intermediary_service >=", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceLessThan(String value) {
            addCriterion("intermediary_service <", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceLessThanOrEqualTo(String value) {
            addCriterion("intermediary_service <=", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceLike(String value) {
            addCriterion("intermediary_service like", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceNotLike(String value) {
            addCriterion("intermediary_service not like", value, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceIn(List<String> values) {
            addCriterion("intermediary_service in", values, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceNotIn(List<String> values) {
            addCriterion("intermediary_service not in", values, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceBetween(String value1, String value2) {
            addCriterion("intermediary_service between", value1, value2, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andIntermediaryServiceNotBetween(String value1, String value2) {
            addCriterion("intermediary_service not between", value1, value2, "intermediaryService");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorIsNull() {
            addCriterion("field_connector is null");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorIsNotNull() {
            addCriterion("field_connector is not null");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorEqualTo(String value) {
            addCriterion("field_connector =", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorNotEqualTo(String value) {
            addCriterion("field_connector <>", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorGreaterThan(String value) {
            addCriterion("field_connector >", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorGreaterThanOrEqualTo(String value) {
            addCriterion("field_connector >=", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorLessThan(String value) {
            addCriterion("field_connector <", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorLessThanOrEqualTo(String value) {
            addCriterion("field_connector <=", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorLike(String value) {
            addCriterion("field_connector like", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorNotLike(String value) {
            addCriterion("field_connector not like", value, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorIn(List<String> values) {
            addCriterion("field_connector in", values, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorNotIn(List<String> values) {
            addCriterion("field_connector not in", values, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorBetween(String value1, String value2) {
            addCriterion("field_connector between", value1, value2, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andFieldConnectorNotBetween(String value1, String value2) {
            addCriterion("field_connector not between", value1, value2, "fieldConnector");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathIsNull() {
            addCriterion("site_access_path is null");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathIsNotNull() {
            addCriterion("site_access_path is not null");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathEqualTo(String value) {
            addCriterion("site_access_path =", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathNotEqualTo(String value) {
            addCriterion("site_access_path <>", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathGreaterThan(String value) {
            addCriterion("site_access_path >", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathGreaterThanOrEqualTo(String value) {
            addCriterion("site_access_path >=", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathLessThan(String value) {
            addCriterion("site_access_path <", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathLessThanOrEqualTo(String value) {
            addCriterion("site_access_path <=", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathLike(String value) {
            addCriterion("site_access_path like", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathNotLike(String value) {
            addCriterion("site_access_path not like", value, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathIn(List<String> values) {
            addCriterion("site_access_path in", values, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathNotIn(List<String> values) {
            addCriterion("site_access_path not in", values, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathBetween(String value1, String value2) {
            addCriterion("site_access_path between", value1, value2, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andSiteAccessPathNotBetween(String value1, String value2) {
            addCriterion("site_access_path not between", value1, value2, "siteAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionIsNull() {
            addCriterion("online_connection is null");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionIsNotNull() {
            addCriterion("online_connection is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionEqualTo(String value) {
            addCriterion("online_connection =", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionNotEqualTo(String value) {
            addCriterion("online_connection <>", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionGreaterThan(String value) {
            addCriterion("online_connection >", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("online_connection >=", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionLessThan(String value) {
            addCriterion("online_connection <", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionLessThanOrEqualTo(String value) {
            addCriterion("online_connection <=", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionLike(String value) {
            addCriterion("online_connection like", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionNotLike(String value) {
            addCriterion("online_connection not like", value, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionIn(List<String> values) {
            addCriterion("online_connection in", values, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionNotIn(List<String> values) {
            addCriterion("online_connection not in", values, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionBetween(String value1, String value2) {
            addCriterion("online_connection between", value1, value2, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineConnectionNotBetween(String value1, String value2) {
            addCriterion("online_connection not between", value1, value2, "onlineConnection");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathIsNull() {
            addCriterion("online_access_path is null");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathIsNotNull() {
            addCriterion("online_access_path is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathEqualTo(String value) {
            addCriterion("online_access_path =", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathNotEqualTo(String value) {
            addCriterion("online_access_path <>", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathGreaterThan(String value) {
            addCriterion("online_access_path >", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathGreaterThanOrEqualTo(String value) {
            addCriterion("online_access_path >=", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathLessThan(String value) {
            addCriterion("online_access_path <", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathLessThanOrEqualTo(String value) {
            addCriterion("online_access_path <=", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathLike(String value) {
            addCriterion("online_access_path like", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathNotLike(String value) {
            addCriterion("online_access_path not like", value, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathIn(List<String> values) {
            addCriterion("online_access_path in", values, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathNotIn(List<String> values) {
            addCriterion("online_access_path not in", values, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathBetween(String value1, String value2) {
            addCriterion("online_access_path between", value1, value2, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andOnlineAccessPathNotBetween(String value1, String value2) {
            addCriterion("online_access_path not between", value1, value2, "onlineAccessPath");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressIsNull() {
            addCriterion("logistics_express is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressIsNotNull() {
            addCriterion("logistics_express is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressEqualTo(String value) {
            addCriterion("logistics_express =", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressNotEqualTo(String value) {
            addCriterion("logistics_express <>", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressGreaterThan(String value) {
            addCriterion("logistics_express >", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_express >=", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressLessThan(String value) {
            addCriterion("logistics_express <", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressLessThanOrEqualTo(String value) {
            addCriterion("logistics_express <=", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressLike(String value) {
            addCriterion("logistics_express like", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressNotLike(String value) {
            addCriterion("logistics_express not like", value, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressIn(List<String> values) {
            addCriterion("logistics_express in", values, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressNotIn(List<String> values) {
            addCriterion("logistics_express not in", values, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressBetween(String value1, String value2) {
            addCriterion("logistics_express between", value1, value2, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andLogisticsExpressNotBetween(String value1, String value2) {
            addCriterion("logistics_express not between", value1, value2, "logisticsExpress");
            return (Criteria) this;
        }

        public Criteria andExpressFormIsNull() {
            addCriterion("express_form is null");
            return (Criteria) this;
        }

        public Criteria andExpressFormIsNotNull() {
            addCriterion("express_form is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFormEqualTo(String value) {
            addCriterion("express_form =", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormNotEqualTo(String value) {
            addCriterion("express_form <>", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormGreaterThan(String value) {
            addCriterion("express_form >", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormGreaterThanOrEqualTo(String value) {
            addCriterion("express_form >=", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormLessThan(String value) {
            addCriterion("express_form <", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormLessThanOrEqualTo(String value) {
            addCriterion("express_form <=", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormLike(String value) {
            addCriterion("express_form like", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormNotLike(String value) {
            addCriterion("express_form not like", value, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormIn(List<String> values) {
            addCriterion("express_form in", values, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormNotIn(List<String> values) {
            addCriterion("express_form not in", values, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormBetween(String value1, String value2) {
            addCriterion("express_form between", value1, value2, "expressForm");
            return (Criteria) this;
        }

        public Criteria andExpressFormNotBetween(String value1, String value2) {
            addCriterion("express_form not between", value1, value2, "expressForm");
            return (Criteria) this;
        }

        public Criteria andSupportReservationIsNull() {
            addCriterion("support_reservation is null");
            return (Criteria) this;
        }

        public Criteria andSupportReservationIsNotNull() {
            addCriterion("support_reservation is not null");
            return (Criteria) this;
        }

        public Criteria andSupportReservationEqualTo(String value) {
            addCriterion("support_reservation =", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationNotEqualTo(String value) {
            addCriterion("support_reservation <>", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationGreaterThan(String value) {
            addCriterion("support_reservation >", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationGreaterThanOrEqualTo(String value) {
            addCriterion("support_reservation >=", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationLessThan(String value) {
            addCriterion("support_reservation <", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationLessThanOrEqualTo(String value) {
            addCriterion("support_reservation <=", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationLike(String value) {
            addCriterion("support_reservation like", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationNotLike(String value) {
            addCriterion("support_reservation not like", value, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationIn(List<String> values) {
            addCriterion("support_reservation in", values, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationNotIn(List<String> values) {
            addCriterion("support_reservation not in", values, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationBetween(String value1, String value2) {
            addCriterion("support_reservation between", value1, value2, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andSupportReservationNotBetween(String value1, String value2) {
            addCriterion("support_reservation not between", value1, value2, "supportReservation");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteIsNull() {
            addCriterion("appointment_route is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteIsNotNull() {
            addCriterion("appointment_route is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteEqualTo(String value) {
            addCriterion("appointment_route =", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteNotEqualTo(String value) {
            addCriterion("appointment_route <>", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteGreaterThan(String value) {
            addCriterion("appointment_route >", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_route >=", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteLessThan(String value) {
            addCriterion("appointment_route <", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteLessThanOrEqualTo(String value) {
            addCriterion("appointment_route <=", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteLike(String value) {
            addCriterion("appointment_route like", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteNotLike(String value) {
            addCriterion("appointment_route not like", value, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteIn(List<String> values) {
            addCriterion("appointment_route in", values, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteNotIn(List<String> values) {
            addCriterion("appointment_route not in", values, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteBetween(String value1, String value2) {
            addCriterion("appointment_route between", value1, value2, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andAppointmentRouteNotBetween(String value1, String value2) {
            addCriterion("appointment_route not between", value1, value2, "appointmentRoute");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsIsNull() {
            addCriterion("quantitative_restrictions is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsIsNotNull() {
            addCriterion("quantitative_restrictions is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsEqualTo(String value) {
            addCriterion("quantitative_restrictions =", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsNotEqualTo(String value) {
            addCriterion("quantitative_restrictions <>", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsGreaterThan(String value) {
            addCriterion("quantitative_restrictions >", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsGreaterThanOrEqualTo(String value) {
            addCriterion("quantitative_restrictions >=", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsLessThan(String value) {
            addCriterion("quantitative_restrictions <", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsLessThanOrEqualTo(String value) {
            addCriterion("quantitative_restrictions <=", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsLike(String value) {
            addCriterion("quantitative_restrictions like", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsNotLike(String value) {
            addCriterion("quantitative_restrictions not like", value, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsIn(List<String> values) {
            addCriterion("quantitative_restrictions in", values, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsNotIn(List<String> values) {
            addCriterion("quantitative_restrictions not in", values, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsBetween(String value1, String value2) {
            addCriterion("quantitative_restrictions between", value1, value2, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeRestrictionsNotBetween(String value1, String value2) {
            addCriterion("quantitative_restrictions not between", value1, value2, "quantitativeRestrictions");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberIsNull() {
            addCriterion("quantitative_number is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberIsNotNull() {
            addCriterion("quantitative_number is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberEqualTo(String value) {
            addCriterion("quantitative_number =", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberNotEqualTo(String value) {
            addCriterion("quantitative_number <>", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberGreaterThan(String value) {
            addCriterion("quantitative_number >", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("quantitative_number >=", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberLessThan(String value) {
            addCriterion("quantitative_number <", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberLessThanOrEqualTo(String value) {
            addCriterion("quantitative_number <=", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberLike(String value) {
            addCriterion("quantitative_number like", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberNotLike(String value) {
            addCriterion("quantitative_number not like", value, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberIn(List<String> values) {
            addCriterion("quantitative_number in", values, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberNotIn(List<String> values) {
            addCriterion("quantitative_number not in", values, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberBetween(String value1, String value2) {
            addCriterion("quantitative_number between", value1, value2, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andQuantitativeNumberNotBetween(String value1, String value2) {
            addCriterion("quantitative_number not between", value1, value2, "quantitativeNumber");
            return (Criteria) this;
        }

        public Criteria andJointOfficeIsNull() {
            addCriterion("joint_office is null");
            return (Criteria) this;
        }

        public Criteria andJointOfficeIsNotNull() {
            addCriterion("joint_office is not null");
            return (Criteria) this;
        }

        public Criteria andJointOfficeEqualTo(String value) {
            addCriterion("joint_office =", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeNotEqualTo(String value) {
            addCriterion("joint_office <>", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeGreaterThan(String value) {
            addCriterion("joint_office >", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("joint_office >=", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeLessThan(String value) {
            addCriterion("joint_office <", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeLessThanOrEqualTo(String value) {
            addCriterion("joint_office <=", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeLike(String value) {
            addCriterion("joint_office like", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeNotLike(String value) {
            addCriterion("joint_office not like", value, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeIn(List<String> values) {
            addCriterion("joint_office in", values, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeNotIn(List<String> values) {
            addCriterion("joint_office not in", values, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeBetween(String value1, String value2) {
            addCriterion("joint_office between", value1, value2, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointOfficeNotBetween(String value1, String value2) {
            addCriterion("joint_office not between", value1, value2, "jointOffice");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentIsNull() {
            addCriterion("joint_department is null");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentIsNotNull() {
            addCriterion("joint_department is not null");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentEqualTo(String value) {
            addCriterion("joint_department =", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentNotEqualTo(String value) {
            addCriterion("joint_department <>", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentGreaterThan(String value) {
            addCriterion("joint_department >", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("joint_department >=", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentLessThan(String value) {
            addCriterion("joint_department <", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentLessThanOrEqualTo(String value) {
            addCriterion("joint_department <=", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentLike(String value) {
            addCriterion("joint_department like", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentNotLike(String value) {
            addCriterion("joint_department not like", value, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentIn(List<String> values) {
            addCriterion("joint_department in", values, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentNotIn(List<String> values) {
            addCriterion("joint_department not in", values, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentBetween(String value1, String value2) {
            addCriterion("joint_department between", value1, value2, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andJointDepartmentNotBetween(String value1, String value2) {
            addCriterion("joint_department not between", value1, value2, "jointDepartment");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemIsNull() {
            addCriterion("operating_system is null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemIsNotNull() {
            addCriterion("operating_system is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemEqualTo(String value) {
            addCriterion("operating_system =", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotEqualTo(String value) {
            addCriterion("operating_system <>", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemGreaterThan(String value) {
            addCriterion("operating_system >", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemGreaterThanOrEqualTo(String value) {
            addCriterion("operating_system >=", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemLessThan(String value) {
            addCriterion("operating_system <", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemLessThanOrEqualTo(String value) {
            addCriterion("operating_system <=", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemLike(String value) {
            addCriterion("operating_system like", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotLike(String value) {
            addCriterion("operating_system not like", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemIn(List<String> values) {
            addCriterion("operating_system in", values, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotIn(List<String> values) {
            addCriterion("operating_system not in", values, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemBetween(String value1, String value2) {
            addCriterion("operating_system between", value1, value2, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotBetween(String value1, String value2) {
            addCriterion("operating_system not between", value1, value2, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNull() {
            addCriterion("system_name is null");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNotNull() {
            addCriterion("system_name is not null");
            return (Criteria) this;
        }

        public Criteria andSystemNameEqualTo(String value) {
            addCriterion("system_name =", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotEqualTo(String value) {
            addCriterion("system_name <>", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThan(String value) {
            addCriterion("system_name >", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("system_name >=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThan(String value) {
            addCriterion("system_name <", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThanOrEqualTo(String value) {
            addCriterion("system_name <=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLike(String value) {
            addCriterion("system_name like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotLike(String value) {
            addCriterion("system_name not like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameIn(List<String> values) {
            addCriterion("system_name in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotIn(List<String> values) {
            addCriterion("system_name not in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameBetween(String value1, String value2) {
            addCriterion("system_name between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotBetween(String value1, String value2) {
            addCriterion("system_name not between", value1, value2, "systemName");
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

        public Criteria andResultSampleIsNull() {
            addCriterion("result_sample is null");
            return (Criteria) this;
        }

        public Criteria andResultSampleIsNotNull() {
            addCriterion("result_sample is not null");
            return (Criteria) this;
        }

        public Criteria andResultSampleEqualTo(String value) {
            addCriterion("result_sample =", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleNotEqualTo(String value) {
            addCriterion("result_sample <>", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleGreaterThan(String value) {
            addCriterion("result_sample >", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleGreaterThanOrEqualTo(String value) {
            addCriterion("result_sample >=", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleLessThan(String value) {
            addCriterion("result_sample <", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleLessThanOrEqualTo(String value) {
            addCriterion("result_sample <=", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleLike(String value) {
            addCriterion("result_sample like", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleNotLike(String value) {
            addCriterion("result_sample not like", value, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleIn(List<String> values) {
            addCriterion("result_sample in", values, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleNotIn(List<String> values) {
            addCriterion("result_sample not in", values, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleBetween(String value1, String value2) {
            addCriterion("result_sample between", value1, value2, "resultSample");
            return (Criteria) this;
        }

        public Criteria andResultSampleNotBetween(String value1, String value2) {
            addCriterion("result_sample not between", value1, value2, "resultSample");
            return (Criteria) this;
        }

        public Criteria andSettingBasisIsNull() {
            addCriterion("setting_basis is null");
            return (Criteria) this;
        }

        public Criteria andSettingBasisIsNotNull() {
            addCriterion("setting_basis is not null");
            return (Criteria) this;
        }

        public Criteria andSettingBasisEqualTo(String value) {
            addCriterion("setting_basis =", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisNotEqualTo(String value) {
            addCriterion("setting_basis <>", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisGreaterThan(String value) {
            addCriterion("setting_basis >", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisGreaterThanOrEqualTo(String value) {
            addCriterion("setting_basis >=", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisLessThan(String value) {
            addCriterion("setting_basis <", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisLessThanOrEqualTo(String value) {
            addCriterion("setting_basis <=", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisLike(String value) {
            addCriterion("setting_basis like", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisNotLike(String value) {
            addCriterion("setting_basis not like", value, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisIn(List<String> values) {
            addCriterion("setting_basis in", values, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisNotIn(List<String> values) {
            addCriterion("setting_basis not in", values, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisBetween(String value1, String value2) {
            addCriterion("setting_basis between", value1, value2, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andSettingBasisNotBetween(String value1, String value2) {
            addCriterion("setting_basis not between", value1, value2, "settingBasis");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(String value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(String value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(String value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(String value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(String value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(String value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLike(String value) {
            addCriterion("charge like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotLike(String value) {
            addCriterion("charge not like", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<String> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<String> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(String value1, String value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(String value1, String value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargesIsNull() {
            addCriterion("charges is null");
            return (Criteria) this;
        }

        public Criteria andChargesIsNotNull() {
            addCriterion("charges is not null");
            return (Criteria) this;
        }

        public Criteria andChargesEqualTo(String value) {
            addCriterion("charges =", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotEqualTo(String value) {
            addCriterion("charges <>", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesGreaterThan(String value) {
            addCriterion("charges >", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesGreaterThanOrEqualTo(String value) {
            addCriterion("charges >=", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesLessThan(String value) {
            addCriterion("charges <", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesLessThanOrEqualTo(String value) {
            addCriterion("charges <=", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesLike(String value) {
            addCriterion("charges like", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotLike(String value) {
            addCriterion("charges not like", value, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesIn(List<String> values) {
            addCriterion("charges in", values, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotIn(List<String> values) {
            addCriterion("charges not in", values, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesBetween(String value1, String value2) {
            addCriterion("charges between", value1, value2, "charges");
            return (Criteria) this;
        }

        public Criteria andChargesNotBetween(String value1, String value2) {
            addCriterion("charges not between", value1, value2, "charges");
            return (Criteria) this;
        }

        public Criteria andChargeBasisIsNull() {
            addCriterion("charge_basis is null");
            return (Criteria) this;
        }

        public Criteria andChargeBasisIsNotNull() {
            addCriterion("charge_basis is not null");
            return (Criteria) this;
        }

        public Criteria andChargeBasisEqualTo(String value) {
            addCriterion("charge_basis =", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisNotEqualTo(String value) {
            addCriterion("charge_basis <>", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisGreaterThan(String value) {
            addCriterion("charge_basis >", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisGreaterThanOrEqualTo(String value) {
            addCriterion("charge_basis >=", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisLessThan(String value) {
            addCriterion("charge_basis <", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisLessThanOrEqualTo(String value) {
            addCriterion("charge_basis <=", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisLike(String value) {
            addCriterion("charge_basis like", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisNotLike(String value) {
            addCriterion("charge_basis not like", value, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisIn(List<String> values) {
            addCriterion("charge_basis in", values, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisNotIn(List<String> values) {
            addCriterion("charge_basis not in", values, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisBetween(String value1, String value2) {
            addCriterion("charge_basis between", value1, value2, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andChargeBasisNotBetween(String value1, String value2) {
            addCriterion("charge_basis not between", value1, value2, "chargeBasis");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsIsNull() {
            addCriterion("application_conditions is null");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsIsNotNull() {
            addCriterion("application_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsEqualTo(String value) {
            addCriterion("application_conditions =", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsNotEqualTo(String value) {
            addCriterion("application_conditions <>", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsGreaterThan(String value) {
            addCriterion("application_conditions >", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("application_conditions >=", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsLessThan(String value) {
            addCriterion("application_conditions <", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsLessThanOrEqualTo(String value) {
            addCriterion("application_conditions <=", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsLike(String value) {
            addCriterion("application_conditions like", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsNotLike(String value) {
            addCriterion("application_conditions not like", value, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsIn(List<String> values) {
            addCriterion("application_conditions in", values, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsNotIn(List<String> values) {
            addCriterion("application_conditions not in", values, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsBetween(String value1, String value2) {
            addCriterion("application_conditions between", value1, value2, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andApplicationConditionsNotBetween(String value1, String value2) {
            addCriterion("application_conditions not between", value1, value2, "applicationConditions");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionIsNull() {
            addCriterion("authority_division is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionIsNotNull() {
            addCriterion("authority_division is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionEqualTo(String value) {
            addCriterion("authority_division =", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionNotEqualTo(String value) {
            addCriterion("authority_division <>", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionGreaterThan(String value) {
            addCriterion("authority_division >", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("authority_division >=", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionLessThan(String value) {
            addCriterion("authority_division <", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionLessThanOrEqualTo(String value) {
            addCriterion("authority_division <=", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionLike(String value) {
            addCriterion("authority_division like", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionNotLike(String value) {
            addCriterion("authority_division not like", value, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionIn(List<String> values) {
            addCriterion("authority_division in", values, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionNotIn(List<String> values) {
            addCriterion("authority_division not in", values, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionBetween(String value1, String value2) {
            addCriterion("authority_division between", value1, value2, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andAuthorityDivisionNotBetween(String value1, String value2) {
            addCriterion("authority_division not between", value1, value2, "authorityDivision");
            return (Criteria) this;
        }

        public Criteria andQuIsNull() {
            addCriterion("qu is null");
            return (Criteria) this;
        }

        public Criteria andQuIsNotNull() {
            addCriterion("qu is not null");
            return (Criteria) this;
        }

        public Criteria andQuEqualTo(String value) {
            addCriterion("qu =", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotEqualTo(String value) {
            addCriterion("qu <>", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuGreaterThan(String value) {
            addCriterion("qu >", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuGreaterThanOrEqualTo(String value) {
            addCriterion("qu >=", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLessThan(String value) {
            addCriterion("qu <", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLessThanOrEqualTo(String value) {
            addCriterion("qu <=", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLike(String value) {
            addCriterion("qu like", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotLike(String value) {
            addCriterion("qu not like", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuIn(List<String> values) {
            addCriterion("qu in", values, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotIn(List<String> values) {
            addCriterion("qu not in", values, "qu");
            return (Criteria) this;
        }

        public Criteria andQuBetween(String value1, String value2) {
            addCriterion("qu between", value1, value2, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotBetween(String value1, String value2) {
            addCriterion("qu not between", value1, value2, "qu");
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