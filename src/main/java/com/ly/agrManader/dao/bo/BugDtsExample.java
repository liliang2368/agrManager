package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class BugDtsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BugDtsExample() {
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

        public Criteria andBugIdIsNull() {
            addCriterion("bug_id is null");
            return (Criteria) this;
        }

        public Criteria andBugIdIsNotNull() {
            addCriterion("bug_id is not null");
            return (Criteria) this;
        }

        public Criteria andBugIdEqualTo(String value) {
            addCriterion("bug_id =", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotEqualTo(String value) {
            addCriterion("bug_id <>", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdGreaterThan(String value) {
            addCriterion("bug_id >", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdGreaterThanOrEqualTo(String value) {
            addCriterion("bug_id >=", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdLessThan(String value) {
            addCriterion("bug_id <", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdLessThanOrEqualTo(String value) {
            addCriterion("bug_id <=", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdLike(String value) {
            addCriterion("bug_id like", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotLike(String value) {
            addCriterion("bug_id not like", value, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdIn(List<String> values) {
            addCriterion("bug_id in", values, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotIn(List<String> values) {
            addCriterion("bug_id not in", values, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdBetween(String value1, String value2) {
            addCriterion("bug_id between", value1, value2, "bugId");
            return (Criteria) this;
        }

        public Criteria andBugIdNotBetween(String value1, String value2) {
            addCriterion("bug_id not between", value1, value2, "bugId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBugNameIsNull() {
            addCriterion("bug_name is null");
            return (Criteria) this;
        }

        public Criteria andBugNameIsNotNull() {
            addCriterion("bug_name is not null");
            return (Criteria) this;
        }

        public Criteria andBugNameEqualTo(String value) {
            addCriterion("bug_name =", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameNotEqualTo(String value) {
            addCriterion("bug_name <>", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameGreaterThan(String value) {
            addCriterion("bug_name >", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameGreaterThanOrEqualTo(String value) {
            addCriterion("bug_name >=", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameLessThan(String value) {
            addCriterion("bug_name <", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameLessThanOrEqualTo(String value) {
            addCriterion("bug_name <=", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameLike(String value) {
            addCriterion("bug_name like", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameNotLike(String value) {
            addCriterion("bug_name not like", value, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameIn(List<String> values) {
            addCriterion("bug_name in", values, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameNotIn(List<String> values) {
            addCriterion("bug_name not in", values, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameBetween(String value1, String value2) {
            addCriterion("bug_name between", value1, value2, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugNameNotBetween(String value1, String value2) {
            addCriterion("bug_name not between", value1, value2, "bugName");
            return (Criteria) this;
        }

        public Criteria andBugDescribeIsNull() {
            addCriterion("bug_describe is null");
            return (Criteria) this;
        }

        public Criteria andBugDescribeIsNotNull() {
            addCriterion("bug_describe is not null");
            return (Criteria) this;
        }

        public Criteria andBugDescribeEqualTo(String value) {
            addCriterion("bug_describe =", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeNotEqualTo(String value) {
            addCriterion("bug_describe <>", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeGreaterThan(String value) {
            addCriterion("bug_describe >", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("bug_describe >=", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeLessThan(String value) {
            addCriterion("bug_describe <", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeLessThanOrEqualTo(String value) {
            addCriterion("bug_describe <=", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeLike(String value) {
            addCriterion("bug_describe like", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeNotLike(String value) {
            addCriterion("bug_describe not like", value, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeIn(List<String> values) {
            addCriterion("bug_describe in", values, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeNotIn(List<String> values) {
            addCriterion("bug_describe not in", values, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeBetween(String value1, String value2) {
            addCriterion("bug_describe between", value1, value2, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugDescribeNotBetween(String value1, String value2) {
            addCriterion("bug_describe not between", value1, value2, "bugDescribe");
            return (Criteria) this;
        }

        public Criteria andBugStateIsNull() {
            addCriterion("bug_state is null");
            return (Criteria) this;
        }

        public Criteria andBugStateIsNotNull() {
            addCriterion("bug_state is not null");
            return (Criteria) this;
        }

        public Criteria andBugStateEqualTo(Boolean value) {
            addCriterion("bug_state =", value, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateNotEqualTo(Boolean value) {
            addCriterion("bug_state <>", value, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateGreaterThan(Boolean value) {
            addCriterion("bug_state >", value, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bug_state >=", value, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateLessThan(Boolean value) {
            addCriterion("bug_state <", value, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateLessThanOrEqualTo(Boolean value) {
            addCriterion("bug_state <=", value, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateIn(List<Boolean> values) {
            addCriterion("bug_state in", values, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateNotIn(List<Boolean> values) {
            addCriterion("bug_state not in", values, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateBetween(Boolean value1, Boolean value2) {
            addCriterion("bug_state between", value1, value2, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bug_state not between", value1, value2, "bugState");
            return (Criteria) this;
        }

        public Criteria andBugOwnerIsNull() {
            addCriterion("bug_owner is null");
            return (Criteria) this;
        }

        public Criteria andBugOwnerIsNotNull() {
            addCriterion("bug_owner is not null");
            return (Criteria) this;
        }

        public Criteria andBugOwnerEqualTo(String value) {
            addCriterion("bug_owner =", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerNotEqualTo(String value) {
            addCriterion("bug_owner <>", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerGreaterThan(String value) {
            addCriterion("bug_owner >", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("bug_owner >=", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerLessThan(String value) {
            addCriterion("bug_owner <", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerLessThanOrEqualTo(String value) {
            addCriterion("bug_owner <=", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerLike(String value) {
            addCriterion("bug_owner like", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerNotLike(String value) {
            addCriterion("bug_owner not like", value, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerIn(List<String> values) {
            addCriterion("bug_owner in", values, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerNotIn(List<String> values) {
            addCriterion("bug_owner not in", values, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerBetween(String value1, String value2) {
            addCriterion("bug_owner between", value1, value2, "bugOwner");
            return (Criteria) this;
        }

        public Criteria andBugOwnerNotBetween(String value1, String value2) {
            addCriterion("bug_owner not between", value1, value2, "bugOwner");
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