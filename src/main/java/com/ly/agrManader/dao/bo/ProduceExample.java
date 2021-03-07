package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class ProduceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProduceExample() {
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

        public Criteria andProduceIdIsNull() {
            addCriterion("produce_id is null");
            return (Criteria) this;
        }

        public Criteria andProduceIdIsNotNull() {
            addCriterion("produce_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduceIdEqualTo(Integer value) {
            addCriterion("produce_id =", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotEqualTo(Integer value) {
            addCriterion("produce_id <>", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdGreaterThan(Integer value) {
            addCriterion("produce_id >", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("produce_id >=", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdLessThan(Integer value) {
            addCriterion("produce_id <", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdLessThanOrEqualTo(Integer value) {
            addCriterion("produce_id <=", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdIn(List<Integer> values) {
            addCriterion("produce_id in", values, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotIn(List<Integer> values) {
            addCriterion("produce_id not in", values, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdBetween(Integer value1, Integer value2) {
            addCriterion("produce_id between", value1, value2, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("produce_id not between", value1, value2, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceNameIsNull() {
            addCriterion("produce_name is null");
            return (Criteria) this;
        }

        public Criteria andProduceNameIsNotNull() {
            addCriterion("produce_name is not null");
            return (Criteria) this;
        }

        public Criteria andProduceNameEqualTo(String value) {
            addCriterion("produce_name =", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotEqualTo(String value) {
            addCriterion("produce_name <>", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameGreaterThan(String value) {
            addCriterion("produce_name >", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameGreaterThanOrEqualTo(String value) {
            addCriterion("produce_name >=", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLessThan(String value) {
            addCriterion("produce_name <", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLessThanOrEqualTo(String value) {
            addCriterion("produce_name <=", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLike(String value) {
            addCriterion("produce_name like", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotLike(String value) {
            addCriterion("produce_name not like", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameIn(List<String> values) {
            addCriterion("produce_name in", values, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotIn(List<String> values) {
            addCriterion("produce_name not in", values, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameBetween(String value1, String value2) {
            addCriterion("produce_name between", value1, value2, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotBetween(String value1, String value2) {
            addCriterion("produce_name not between", value1, value2, "produceName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCrateNameIsNull() {
            addCriterion("crate_name is null");
            return (Criteria) this;
        }

        public Criteria andCrateNameIsNotNull() {
            addCriterion("crate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCrateNameEqualTo(String value) {
            addCriterion("crate_name =", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameNotEqualTo(String value) {
            addCriterion("crate_name <>", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameGreaterThan(String value) {
            addCriterion("crate_name >", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameGreaterThanOrEqualTo(String value) {
            addCriterion("crate_name >=", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameLessThan(String value) {
            addCriterion("crate_name <", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameLessThanOrEqualTo(String value) {
            addCriterion("crate_name <=", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameLike(String value) {
            addCriterion("crate_name like", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameNotLike(String value) {
            addCriterion("crate_name not like", value, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameIn(List<String> values) {
            addCriterion("crate_name in", values, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameNotIn(List<String> values) {
            addCriterion("crate_name not in", values, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameBetween(String value1, String value2) {
            addCriterion("crate_name between", value1, value2, "crateName");
            return (Criteria) this;
        }

        public Criteria andCrateNameNotBetween(String value1, String value2) {
            addCriterion("crate_name not between", value1, value2, "crateName");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIsNull() {
            addCriterion("product_owner is null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIsNotNull() {
            addCriterion("product_owner is not null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerEqualTo(String value) {
            addCriterion("product_owner =", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotEqualTo(String value) {
            addCriterion("product_owner <>", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerGreaterThan(String value) {
            addCriterion("product_owner >", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("product_owner >=", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerLessThan(String value) {
            addCriterion("product_owner <", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerLessThanOrEqualTo(String value) {
            addCriterion("product_owner <=", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerLike(String value) {
            addCriterion("product_owner like", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotLike(String value) {
            addCriterion("product_owner not like", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIn(List<String> values) {
            addCriterion("product_owner in", values, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotIn(List<String> values) {
            addCriterion("product_owner not in", values, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerBetween(String value1, String value2) {
            addCriterion("product_owner between", value1, value2, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotBetween(String value1, String value2) {
            addCriterion("product_owner not between", value1, value2, "productOwner");
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