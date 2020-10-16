package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameIsNull() {
            addCriterion("staff_username is null");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameIsNotNull() {
            addCriterion("staff_username is not null");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameEqualTo(String value) {
            addCriterion("staff_username =", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotEqualTo(String value) {
            addCriterion("staff_username <>", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameGreaterThan(String value) {
            addCriterion("staff_username >", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_username >=", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameLessThan(String value) {
            addCriterion("staff_username <", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameLessThanOrEqualTo(String value) {
            addCriterion("staff_username <=", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameLike(String value) {
            addCriterion("staff_username like", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotLike(String value) {
            addCriterion("staff_username not like", value, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameIn(List<String> values) {
            addCriterion("staff_username in", values, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotIn(List<String> values) {
            addCriterion("staff_username not in", values, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameBetween(String value1, String value2) {
            addCriterion("staff_username between", value1, value2, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffUsernameNotBetween(String value1, String value2) {
            addCriterion("staff_username not between", value1, value2, "staffUsername");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIsNull() {
            addCriterion("staff_password is null");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIsNotNull() {
            addCriterion("staff_password is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordEqualTo(String value) {
            addCriterion("staff_password =", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotEqualTo(String value) {
            addCriterion("staff_password <>", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordGreaterThan(String value) {
            addCriterion("staff_password >", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("staff_password >=", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLessThan(String value) {
            addCriterion("staff_password <", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLessThanOrEqualTo(String value) {
            addCriterion("staff_password <=", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordLike(String value) {
            addCriterion("staff_password like", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotLike(String value) {
            addCriterion("staff_password not like", value, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordIn(List<String> values) {
            addCriterion("staff_password in", values, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotIn(List<String> values) {
            addCriterion("staff_password not in", values, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordBetween(String value1, String value2) {
            addCriterion("staff_password between", value1, value2, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPasswordNotBetween(String value1, String value2) {
            addCriterion("staff_password not between", value1, value2, "staffPassword");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNull() {
            addCriterion("staff_phone is null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIsNotNull() {
            addCriterion("staff_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneEqualTo(String value) {
            addCriterion("staff_phone =", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotEqualTo(String value) {
            addCriterion("staff_phone <>", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThan(String value) {
            addCriterion("staff_phone >", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("staff_phone >=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThan(String value) {
            addCriterion("staff_phone <", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLessThanOrEqualTo(String value) {
            addCriterion("staff_phone <=", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneLike(String value) {
            addCriterion("staff_phone like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotLike(String value) {
            addCriterion("staff_phone not like", value, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneIn(List<String> values) {
            addCriterion("staff_phone in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotIn(List<String> values) {
            addCriterion("staff_phone not in", values, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneBetween(String value1, String value2) {
            addCriterion("staff_phone between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffPhoneNotBetween(String value1, String value2) {
            addCriterion("staff_phone not between", value1, value2, "staffPhone");
            return (Criteria) this;
        }

        public Criteria andStaffRoleIsNull() {
            addCriterion("staff_role is null");
            return (Criteria) this;
        }

        public Criteria andStaffRoleIsNotNull() {
            addCriterion("staff_role is not null");
            return (Criteria) this;
        }

        public Criteria andStaffRoleEqualTo(String value) {
            addCriterion("staff_role =", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleNotEqualTo(String value) {
            addCriterion("staff_role <>", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleGreaterThan(String value) {
            addCriterion("staff_role >", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleGreaterThanOrEqualTo(String value) {
            addCriterion("staff_role >=", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleLessThan(String value) {
            addCriterion("staff_role <", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleLessThanOrEqualTo(String value) {
            addCriterion("staff_role <=", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleLike(String value) {
            addCriterion("staff_role like", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleNotLike(String value) {
            addCriterion("staff_role not like", value, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleIn(List<String> values) {
            addCriterion("staff_role in", values, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleNotIn(List<String> values) {
            addCriterion("staff_role not in", values, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleBetween(String value1, String value2) {
            addCriterion("staff_role between", value1, value2, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffRoleNotBetween(String value1, String value2) {
            addCriterion("staff_role not between", value1, value2, "staffRole");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNull() {
            addCriterion("staff_state is null");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNotNull() {
            addCriterion("staff_state is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStateEqualTo(String value) {
            addCriterion("staff_state =", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotEqualTo(String value) {
            addCriterion("staff_state <>", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThan(String value) {
            addCriterion("staff_state >", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_state >=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThan(String value) {
            addCriterion("staff_state <", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThanOrEqualTo(String value) {
            addCriterion("staff_state <=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLike(String value) {
            addCriterion("staff_state like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotLike(String value) {
            addCriterion("staff_state not like", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateIn(List<String> values) {
            addCriterion("staff_state in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotIn(List<String> values) {
            addCriterion("staff_state not in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateBetween(String value1, String value2) {
            addCriterion("staff_state between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotBetween(String value1, String value2) {
            addCriterion("staff_state not between", value1, value2, "staffState");
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