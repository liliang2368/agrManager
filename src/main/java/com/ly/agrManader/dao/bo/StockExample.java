package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockProductIsNull() {
            addCriterion("stock_product is null");
            return (Criteria) this;
        }

        public Criteria andStockProductIsNotNull() {
            addCriterion("stock_product is not null");
            return (Criteria) this;
        }

        public Criteria andStockProductEqualTo(String value) {
            addCriterion("stock_product =", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductNotEqualTo(String value) {
            addCriterion("stock_product <>", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductGreaterThan(String value) {
            addCriterion("stock_product >", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductGreaterThanOrEqualTo(String value) {
            addCriterion("stock_product >=", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductLessThan(String value) {
            addCriterion("stock_product <", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductLessThanOrEqualTo(String value) {
            addCriterion("stock_product <=", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductLike(String value) {
            addCriterion("stock_product like", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductNotLike(String value) {
            addCriterion("stock_product not like", value, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductIn(List<String> values) {
            addCriterion("stock_product in", values, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductNotIn(List<String> values) {
            addCriterion("stock_product not in", values, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductBetween(String value1, String value2) {
            addCriterion("stock_product between", value1, value2, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockProductNotBetween(String value1, String value2) {
            addCriterion("stock_product not between", value1, value2, "stockProduct");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNull() {
            addCriterion("stock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(Integer value) {
            addCriterion("stock_num =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(Integer value) {
            addCriterion("stock_num <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(Integer value) {
            addCriterion("stock_num >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_num >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(Integer value) {
            addCriterion("stock_num <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(Integer value) {
            addCriterion("stock_num <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<Integer> values) {
            addCriterion("stock_num in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<Integer> values) {
            addCriterion("stock_num not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(Integer value1, Integer value2) {
            addCriterion("stock_num between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_num not between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockStateIsNull() {
            addCriterion("stock_state is null");
            return (Criteria) this;
        }

        public Criteria andStockStateIsNotNull() {
            addCriterion("stock_state is not null");
            return (Criteria) this;
        }

        public Criteria andStockStateEqualTo(String value) {
            addCriterion("stock_state =", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateNotEqualTo(String value) {
            addCriterion("stock_state <>", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateGreaterThan(String value) {
            addCriterion("stock_state >", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateGreaterThanOrEqualTo(String value) {
            addCriterion("stock_state >=", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateLessThan(String value) {
            addCriterion("stock_state <", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateLessThanOrEqualTo(String value) {
            addCriterion("stock_state <=", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateLike(String value) {
            addCriterion("stock_state like", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateNotLike(String value) {
            addCriterion("stock_state not like", value, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateIn(List<String> values) {
            addCriterion("stock_state in", values, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateNotIn(List<String> values) {
            addCriterion("stock_state not in", values, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateBetween(String value1, String value2) {
            addCriterion("stock_state between", value1, value2, "stockState");
            return (Criteria) this;
        }

        public Criteria andStockStateNotBetween(String value1, String value2) {
            addCriterion("stock_state not between", value1, value2, "stockState");
            return (Criteria) this;
        }

        public Criteria andProducePhotoIsNull() {
            addCriterion("produce_photo is null");
            return (Criteria) this;
        }

        public Criteria andProducePhotoIsNotNull() {
            addCriterion("produce_photo is not null");
            return (Criteria) this;
        }

        public Criteria andProducePhotoEqualTo(String value) {
            addCriterion("produce_photo =", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoNotEqualTo(String value) {
            addCriterion("produce_photo <>", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoGreaterThan(String value) {
            addCriterion("produce_photo >", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("produce_photo >=", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoLessThan(String value) {
            addCriterion("produce_photo <", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoLessThanOrEqualTo(String value) {
            addCriterion("produce_photo <=", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoLike(String value) {
            addCriterion("produce_photo like", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoNotLike(String value) {
            addCriterion("produce_photo not like", value, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoIn(List<String> values) {
            addCriterion("produce_photo in", values, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoNotIn(List<String> values) {
            addCriterion("produce_photo not in", values, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoBetween(String value1, String value2) {
            addCriterion("produce_photo between", value1, value2, "producePhoto");
            return (Criteria) this;
        }

        public Criteria andProducePhotoNotBetween(String value1, String value2) {
            addCriterion("produce_photo not between", value1, value2, "producePhoto");
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