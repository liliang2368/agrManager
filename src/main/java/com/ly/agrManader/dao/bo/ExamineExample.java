package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class ExamineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamineExample() {
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

        public Criteria andExamineIdIsNull() {
            addCriterion("examine_id is null");
            return (Criteria) this;
        }

        public Criteria andExamineIdIsNotNull() {
            addCriterion("examine_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamineIdEqualTo(Integer value) {
            addCriterion("examine_id =", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotEqualTo(Integer value) {
            addCriterion("examine_id <>", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThan(Integer value) {
            addCriterion("examine_id >", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examine_id >=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThan(Integer value) {
            addCriterion("examine_id <", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdLessThanOrEqualTo(Integer value) {
            addCriterion("examine_id <=", value, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdIn(List<Integer> values) {
            addCriterion("examine_id in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotIn(List<Integer> values) {
            addCriterion("examine_id not in", values, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdBetween(Integer value1, Integer value2) {
            addCriterion("examine_id between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examine_id not between", value1, value2, "examineId");
            return (Criteria) this;
        }

        public Criteria andExamineNameIsNull() {
            addCriterion("examine_name is null");
            return (Criteria) this;
        }

        public Criteria andExamineNameIsNotNull() {
            addCriterion("examine_name is not null");
            return (Criteria) this;
        }

        public Criteria andExamineNameEqualTo(String value) {
            addCriterion("examine_name =", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameNotEqualTo(String value) {
            addCriterion("examine_name <>", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameGreaterThan(String value) {
            addCriterion("examine_name >", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameGreaterThanOrEqualTo(String value) {
            addCriterion("examine_name >=", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameLessThan(String value) {
            addCriterion("examine_name <", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameLessThanOrEqualTo(String value) {
            addCriterion("examine_name <=", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameLike(String value) {
            addCriterion("examine_name like", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameNotLike(String value) {
            addCriterion("examine_name not like", value, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameIn(List<String> values) {
            addCriterion("examine_name in", values, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameNotIn(List<String> values) {
            addCriterion("examine_name not in", values, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameBetween(String value1, String value2) {
            addCriterion("examine_name between", value1, value2, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineNameNotBetween(String value1, String value2) {
            addCriterion("examine_name not between", value1, value2, "examineName");
            return (Criteria) this;
        }

        public Criteria andExamineValueIsNull() {
            addCriterion("examine_value is null");
            return (Criteria) this;
        }

        public Criteria andExamineValueIsNotNull() {
            addCriterion("examine_value is not null");
            return (Criteria) this;
        }

        public Criteria andExamineValueEqualTo(String value) {
            addCriterion("examine_value =", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueNotEqualTo(String value) {
            addCriterion("examine_value <>", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueGreaterThan(String value) {
            addCriterion("examine_value >", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueGreaterThanOrEqualTo(String value) {
            addCriterion("examine_value >=", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueLessThan(String value) {
            addCriterion("examine_value <", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueLessThanOrEqualTo(String value) {
            addCriterion("examine_value <=", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueLike(String value) {
            addCriterion("examine_value like", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueNotLike(String value) {
            addCriterion("examine_value not like", value, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueIn(List<String> values) {
            addCriterion("examine_value in", values, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueNotIn(List<String> values) {
            addCriterion("examine_value not in", values, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueBetween(String value1, String value2) {
            addCriterion("examine_value between", value1, value2, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineValueNotBetween(String value1, String value2) {
            addCriterion("examine_value not between", value1, value2, "examineValue");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdIsNull() {
            addCriterion("examine_prodce_id is null");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdIsNotNull() {
            addCriterion("examine_prodce_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdEqualTo(Integer value) {
            addCriterion("examine_prodce_id =", value, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdNotEqualTo(Integer value) {
            addCriterion("examine_prodce_id <>", value, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdGreaterThan(Integer value) {
            addCriterion("examine_prodce_id >", value, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examine_prodce_id >=", value, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdLessThan(Integer value) {
            addCriterion("examine_prodce_id <", value, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdLessThanOrEqualTo(Integer value) {
            addCriterion("examine_prodce_id <=", value, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdIn(List<Integer> values) {
            addCriterion("examine_prodce_id in", values, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdNotIn(List<Integer> values) {
            addCriterion("examine_prodce_id not in", values, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdBetween(Integer value1, Integer value2) {
            addCriterion("examine_prodce_id between", value1, value2, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineProdceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examine_prodce_id not between", value1, value2, "examineProdceId");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueIsNull() {
            addCriterion("examine_real_value is null");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueIsNotNull() {
            addCriterion("examine_real_value is not null");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueEqualTo(String value) {
            addCriterion("examine_real_value =", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueNotEqualTo(String value) {
            addCriterion("examine_real_value <>", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueGreaterThan(String value) {
            addCriterion("examine_real_value >", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueGreaterThanOrEqualTo(String value) {
            addCriterion("examine_real_value >=", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueLessThan(String value) {
            addCriterion("examine_real_value <", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueLessThanOrEqualTo(String value) {
            addCriterion("examine_real_value <=", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueLike(String value) {
            addCriterion("examine_real_value like", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueNotLike(String value) {
            addCriterion("examine_real_value not like", value, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueIn(List<String> values) {
            addCriterion("examine_real_value in", values, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueNotIn(List<String> values) {
            addCriterion("examine_real_value not in", values, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueBetween(String value1, String value2) {
            addCriterion("examine_real_value between", value1, value2, "examineRealValue");
            return (Criteria) this;
        }

        public Criteria andExamineRealValueNotBetween(String value1, String value2) {
            addCriterion("examine_real_value not between", value1, value2, "examineRealValue");
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