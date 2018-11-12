package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeptInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptInfoExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(String value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(String value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(String value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(String value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(String value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLike(String value) {
            addCriterion("DEPT_ID like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotLike(String value) {
            addCriterion("DEPT_ID not like", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<String> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<String> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(String value1, String value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(String value1, String value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameIsNull() {
            addCriterion("DEPT_SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameIsNotNull() {
            addCriterion("DEPT_SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameEqualTo(String value) {
            addCriterion("DEPT_SHORTNAME =", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameNotEqualTo(String value) {
            addCriterion("DEPT_SHORTNAME <>", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameGreaterThan(String value) {
            addCriterion("DEPT_SHORTNAME >", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_SHORTNAME >=", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameLessThan(String value) {
            addCriterion("DEPT_SHORTNAME <", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_SHORTNAME <=", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameLike(String value) {
            addCriterion("DEPT_SHORTNAME like", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameNotLike(String value) {
            addCriterion("DEPT_SHORTNAME not like", value, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameIn(List<String> values) {
            addCriterion("DEPT_SHORTNAME in", values, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameNotIn(List<String> values) {
            addCriterion("DEPT_SHORTNAME not in", values, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameBetween(String value1, String value2) {
            addCriterion("DEPT_SHORTNAME between", value1, value2, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptShortnameNotBetween(String value1, String value2) {
            addCriterion("DEPT_SHORTNAME not between", value1, value2, "deptShortname");
            return (Criteria) this;
        }

        public Criteria andDeptParentidIsNull() {
            addCriterion("DEPT_PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptParentidIsNotNull() {
            addCriterion("DEPT_PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptParentidEqualTo(String value) {
            addCriterion("DEPT_PARENTID =", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidNotEqualTo(String value) {
            addCriterion("DEPT_PARENTID <>", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidGreaterThan(String value) {
            addCriterion("DEPT_PARENTID >", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_PARENTID >=", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidLessThan(String value) {
            addCriterion("DEPT_PARENTID <", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidLessThanOrEqualTo(String value) {
            addCriterion("DEPT_PARENTID <=", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidLike(String value) {
            addCriterion("DEPT_PARENTID like", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidNotLike(String value) {
            addCriterion("DEPT_PARENTID not like", value, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidIn(List<String> values) {
            addCriterion("DEPT_PARENTID in", values, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidNotIn(List<String> values) {
            addCriterion("DEPT_PARENTID not in", values, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidBetween(String value1, String value2) {
            addCriterion("DEPT_PARENTID between", value1, value2, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptParentidNotBetween(String value1, String value2) {
            addCriterion("DEPT_PARENTID not between", value1, value2, "deptParentid");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIsNull() {
            addCriterion("DEPT_AREA is null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIsNotNull() {
            addCriterion("DEPT_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaEqualTo(String value) {
            addCriterion("DEPT_AREA =", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotEqualTo(String value) {
            addCriterion("DEPT_AREA <>", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaGreaterThan(String value) {
            addCriterion("DEPT_AREA >", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_AREA >=", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLessThan(String value) {
            addCriterion("DEPT_AREA <", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLessThanOrEqualTo(String value) {
            addCriterion("DEPT_AREA <=", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLike(String value) {
            addCriterion("DEPT_AREA like", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotLike(String value) {
            addCriterion("DEPT_AREA not like", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIn(List<String> values) {
            addCriterion("DEPT_AREA in", values, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotIn(List<String> values) {
            addCriterion("DEPT_AREA not in", values, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaBetween(String value1, String value2) {
            addCriterion("DEPT_AREA between", value1, value2, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotBetween(String value1, String value2) {
            addCriterion("DEPT_AREA not between", value1, value2, "deptArea");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
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

        public Criteria andSysIdIsNull() {
            addCriterion("SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("SYS_ID =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("SYS_ID <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("SYS_ID >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ID >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("SYS_ID <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("SYS_ID <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("SYS_ID like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("SYS_ID not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("SYS_ID in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("SYS_ID not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("SYS_ID between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("SYS_ID not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIsNull() {
            addCriterion("DEPT_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIsNotNull() {
            addCriterion("DEPT_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderEqualTo(String value) {
            addCriterion("DEPT_LEADER =", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotEqualTo(String value) {
            addCriterion("DEPT_LEADER <>", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderGreaterThan(String value) {
            addCriterion("DEPT_LEADER >", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_LEADER >=", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderLessThan(String value) {
            addCriterion("DEPT_LEADER <", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderLessThanOrEqualTo(String value) {
            addCriterion("DEPT_LEADER <=", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderLike(String value) {
            addCriterion("DEPT_LEADER like", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotLike(String value) {
            addCriterion("DEPT_LEADER not like", value, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIn(List<String> values) {
            addCriterion("DEPT_LEADER in", values, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotIn(List<String> values) {
            addCriterion("DEPT_LEADER not in", values, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderBetween(String value1, String value2) {
            addCriterion("DEPT_LEADER between", value1, value2, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNotBetween(String value1, String value2) {
            addCriterion("DEPT_LEADER not between", value1, value2, "deptLeader");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNull() {
            addCriterion("DEPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("DEPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(String value) {
            addCriterion("DEPT_TYPE =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(String value) {
            addCriterion("DEPT_TYPE <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(String value) {
            addCriterion("DEPT_TYPE >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(String value) {
            addCriterion("DEPT_TYPE <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLike(String value) {
            addCriterion("DEPT_TYPE like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotLike(String value) {
            addCriterion("DEPT_TYPE not like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<String> values) {
            addCriterion("DEPT_TYPE in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<String> values) {
            addCriterion("DEPT_TYPE not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeIsNull() {
            addCriterion("DEPT_CHARGECODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeIsNotNull() {
            addCriterion("DEPT_CHARGECODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeEqualTo(String value) {
            addCriterion("DEPT_CHARGECODE =", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeNotEqualTo(String value) {
            addCriterion("DEPT_CHARGECODE <>", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeGreaterThan(String value) {
            addCriterion("DEPT_CHARGECODE >", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CHARGECODE >=", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeLessThan(String value) {
            addCriterion("DEPT_CHARGECODE <", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CHARGECODE <=", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeLike(String value) {
            addCriterion("DEPT_CHARGECODE like", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeNotLike(String value) {
            addCriterion("DEPT_CHARGECODE not like", value, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeIn(List<String> values) {
            addCriterion("DEPT_CHARGECODE in", values, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeNotIn(List<String> values) {
            addCriterion("DEPT_CHARGECODE not in", values, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeBetween(String value1, String value2) {
            addCriterion("DEPT_CHARGECODE between", value1, value2, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andDeptChargecodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CHARGECODE not between", value1, value2, "deptChargecode");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptIsNull() {
            addCriterion("IS_REVIEWDEPT is null");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptIsNotNull() {
            addCriterion("IS_REVIEWDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptEqualTo(String value) {
            addCriterion("IS_REVIEWDEPT =", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptNotEqualTo(String value) {
            addCriterion("IS_REVIEWDEPT <>", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptGreaterThan(String value) {
            addCriterion("IS_REVIEWDEPT >", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REVIEWDEPT >=", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptLessThan(String value) {
            addCriterion("IS_REVIEWDEPT <", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptLessThanOrEqualTo(String value) {
            addCriterion("IS_REVIEWDEPT <=", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptLike(String value) {
            addCriterion("IS_REVIEWDEPT like", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptNotLike(String value) {
            addCriterion("IS_REVIEWDEPT not like", value, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptIn(List<String> values) {
            addCriterion("IS_REVIEWDEPT in", values, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptNotIn(List<String> values) {
            addCriterion("IS_REVIEWDEPT not in", values, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptBetween(String value1, String value2) {
            addCriterion("IS_REVIEWDEPT between", value1, value2, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andIsReviewdeptNotBetween(String value1, String value2) {
            addCriterion("IS_REVIEWDEPT not between", value1, value2, "isReviewdept");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNull() {
            addCriterion("DEPT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNotNull() {
            addCriterion("DEPT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneEqualTo(String value) {
            addCriterion("DEPT_PHONE =", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotEqualTo(String value) {
            addCriterion("DEPT_PHONE <>", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThan(String value) {
            addCriterion("DEPT_PHONE >", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_PHONE >=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThan(String value) {
            addCriterion("DEPT_PHONE <", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThanOrEqualTo(String value) {
            addCriterion("DEPT_PHONE <=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLike(String value) {
            addCriterion("DEPT_PHONE like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotLike(String value) {
            addCriterion("DEPT_PHONE not like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIn(List<String> values) {
            addCriterion("DEPT_PHONE in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotIn(List<String> values) {
            addCriterion("DEPT_PHONE not in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneBetween(String value1, String value2) {
            addCriterion("DEPT_PHONE between", value1, value2, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotBetween(String value1, String value2) {
            addCriterion("DEPT_PHONE not between", value1, value2, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptLocationIsNull() {
            addCriterion("DEPT_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andDeptLocationIsNotNull() {
            addCriterion("DEPT_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLocationEqualTo(String value) {
            addCriterion("DEPT_LOCATION =", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationNotEqualTo(String value) {
            addCriterion("DEPT_LOCATION <>", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationGreaterThan(String value) {
            addCriterion("DEPT_LOCATION >", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_LOCATION >=", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationLessThan(String value) {
            addCriterion("DEPT_LOCATION <", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationLessThanOrEqualTo(String value) {
            addCriterion("DEPT_LOCATION <=", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationLike(String value) {
            addCriterion("DEPT_LOCATION like", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationNotLike(String value) {
            addCriterion("DEPT_LOCATION not like", value, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationIn(List<String> values) {
            addCriterion("DEPT_LOCATION in", values, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationNotIn(List<String> values) {
            addCriterion("DEPT_LOCATION not in", values, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationBetween(String value1, String value2) {
            addCriterion("DEPT_LOCATION between", value1, value2, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptLocationNotBetween(String value1, String value2) {
            addCriterion("DEPT_LOCATION not between", value1, value2, "deptLocation");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteIsNull() {
            addCriterion("DEPT_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteIsNotNull() {
            addCriterion("DEPT_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteEqualTo(String value) {
            addCriterion("DEPT_WEBSITE =", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteNotEqualTo(String value) {
            addCriterion("DEPT_WEBSITE <>", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteGreaterThan(String value) {
            addCriterion("DEPT_WEBSITE >", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_WEBSITE >=", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteLessThan(String value) {
            addCriterion("DEPT_WEBSITE <", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteLessThanOrEqualTo(String value) {
            addCriterion("DEPT_WEBSITE <=", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteLike(String value) {
            addCriterion("DEPT_WEBSITE like", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteNotLike(String value) {
            addCriterion("DEPT_WEBSITE not like", value, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteIn(List<String> values) {
            addCriterion("DEPT_WEBSITE in", values, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteNotIn(List<String> values) {
            addCriterion("DEPT_WEBSITE not in", values, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteBetween(String value1, String value2) {
            addCriterion("DEPT_WEBSITE between", value1, value2, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptWebsiteNotBetween(String value1, String value2) {
            addCriterion("DEPT_WEBSITE not between", value1, value2, "deptWebsite");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionIsNull() {
            addCriterion("DEPT_FUNCTION is null");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionIsNotNull() {
            addCriterion("DEPT_FUNCTION is not null");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionEqualTo(String value) {
            addCriterion("DEPT_FUNCTION =", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionNotEqualTo(String value) {
            addCriterion("DEPT_FUNCTION <>", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionGreaterThan(String value) {
            addCriterion("DEPT_FUNCTION >", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_FUNCTION >=", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionLessThan(String value) {
            addCriterion("DEPT_FUNCTION <", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionLessThanOrEqualTo(String value) {
            addCriterion("DEPT_FUNCTION <=", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionLike(String value) {
            addCriterion("DEPT_FUNCTION like", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionNotLike(String value) {
            addCriterion("DEPT_FUNCTION not like", value, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionIn(List<String> values) {
            addCriterion("DEPT_FUNCTION in", values, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionNotIn(List<String> values) {
            addCriterion("DEPT_FUNCTION not in", values, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionBetween(String value1, String value2) {
            addCriterion("DEPT_FUNCTION between", value1, value2, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptFunctionNotBetween(String value1, String value2) {
            addCriterion("DEPT_FUNCTION not between", value1, value2, "deptFunction");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeIsNull() {
            addCriterion("DEPT_INNERCODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeIsNotNull() {
            addCriterion("DEPT_INNERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeEqualTo(String value) {
            addCriterion("DEPT_INNERCODE =", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeNotEqualTo(String value) {
            addCriterion("DEPT_INNERCODE <>", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeGreaterThan(String value) {
            addCriterion("DEPT_INNERCODE >", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_INNERCODE >=", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeLessThan(String value) {
            addCriterion("DEPT_INNERCODE <", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_INNERCODE <=", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeLike(String value) {
            addCriterion("DEPT_INNERCODE like", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeNotLike(String value) {
            addCriterion("DEPT_INNERCODE not like", value, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeIn(List<String> values) {
            addCriterion("DEPT_INNERCODE in", values, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeNotIn(List<String> values) {
            addCriterion("DEPT_INNERCODE not in", values, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeBetween(String value1, String value2) {
            addCriterion("DEPT_INNERCODE between", value1, value2, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andDeptInnercodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_INNERCODE not between", value1, value2, "deptInnercode");
            return (Criteria) this;
        }

        public Criteria andBusTypeIsNull() {
            addCriterion("BUS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusTypeIsNotNull() {
            addCriterion("BUS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusTypeEqualTo(String value) {
            addCriterion("BUS_TYPE =", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotEqualTo(String value) {
            addCriterion("BUS_TYPE <>", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeGreaterThan(String value) {
            addCriterion("BUS_TYPE >", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_TYPE >=", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLessThan(String value) {
            addCriterion("BUS_TYPE <", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLessThanOrEqualTo(String value) {
            addCriterion("BUS_TYPE <=", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeLike(String value) {
            addCriterion("BUS_TYPE like", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotLike(String value) {
            addCriterion("BUS_TYPE not like", value, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeIn(List<String> values) {
            addCriterion("BUS_TYPE in", values, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotIn(List<String> values) {
            addCriterion("BUS_TYPE not in", values, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeBetween(String value1, String value2) {
            addCriterion("BUS_TYPE between", value1, value2, "busType");
            return (Criteria) this;
        }

        public Criteria andBusTypeNotBetween(String value1, String value2) {
            addCriterion("BUS_TYPE not between", value1, value2, "busType");
            return (Criteria) this;
        }

        public Criteria andBusNameIsNull() {
            addCriterion("BUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBusNameIsNotNull() {
            addCriterion("BUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusNameEqualTo(String value) {
            addCriterion("BUS_NAME =", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotEqualTo(String value) {
            addCriterion("BUS_NAME <>", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameGreaterThan(String value) {
            addCriterion("BUS_NAME >", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUS_NAME >=", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLessThan(String value) {
            addCriterion("BUS_NAME <", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLessThanOrEqualTo(String value) {
            addCriterion("BUS_NAME <=", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLike(String value) {
            addCriterion("BUS_NAME like", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotLike(String value) {
            addCriterion("BUS_NAME not like", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameIn(List<String> values) {
            addCriterion("BUS_NAME in", values, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotIn(List<String> values) {
            addCriterion("BUS_NAME not in", values, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameBetween(String value1, String value2) {
            addCriterion("BUS_NAME between", value1, value2, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotBetween(String value1, String value2) {
            addCriterion("BUS_NAME not between", value1, value2, "busName");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineIsNull() {
            addCriterion("IS_BOOKONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineIsNotNull() {
            addCriterion("IS_BOOKONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineEqualTo(String value) {
            addCriterion("IS_BOOKONLINE =", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineNotEqualTo(String value) {
            addCriterion("IS_BOOKONLINE <>", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineGreaterThan(String value) {
            addCriterion("IS_BOOKONLINE >", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineGreaterThanOrEqualTo(String value) {
            addCriterion("IS_BOOKONLINE >=", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineLessThan(String value) {
            addCriterion("IS_BOOKONLINE <", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineLessThanOrEqualTo(String value) {
            addCriterion("IS_BOOKONLINE <=", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineLike(String value) {
            addCriterion("IS_BOOKONLINE like", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineNotLike(String value) {
            addCriterion("IS_BOOKONLINE not like", value, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineIn(List<String> values) {
            addCriterion("IS_BOOKONLINE in", values, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineNotIn(List<String> values) {
            addCriterion("IS_BOOKONLINE not in", values, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineBetween(String value1, String value2) {
            addCriterion("IS_BOOKONLINE between", value1, value2, "isBookonline");
            return (Criteria) this;
        }

        public Criteria andIsBookonlineNotBetween(String value1, String value2) {
            addCriterion("IS_BOOKONLINE not between", value1, value2, "isBookonline");
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