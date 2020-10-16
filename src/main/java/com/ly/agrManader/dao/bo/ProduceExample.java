package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andProduceCodeIsNull() {
            addCriterion("produce_code is null");
            return (Criteria) this;
        }

        public Criteria andProduceCodeIsNotNull() {
            addCriterion("produce_code is not null");
            return (Criteria) this;
        }

        public Criteria andProduceCodeEqualTo(String value) {
            addCriterion("produce_code =", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeNotEqualTo(String value) {
            addCriterion("produce_code <>", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeGreaterThan(String value) {
            addCriterion("produce_code >", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("produce_code >=", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeLessThan(String value) {
            addCriterion("produce_code <", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeLessThanOrEqualTo(String value) {
            addCriterion("produce_code <=", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeLike(String value) {
            addCriterion("produce_code like", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeNotLike(String value) {
            addCriterion("produce_code not like", value, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeIn(List<String> values) {
            addCriterion("produce_code in", values, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeNotIn(List<String> values) {
            addCriterion("produce_code not in", values, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeBetween(String value1, String value2) {
            addCriterion("produce_code between", value1, value2, "produceCode");
            return (Criteria) this;
        }

        public Criteria andProduceCodeNotBetween(String value1, String value2) {
            addCriterion("produce_code not between", value1, value2, "produceCode");
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

        public Criteria andProducePriceIsNull() {
            addCriterion("produce_price is null");
            return (Criteria) this;
        }

        public Criteria andProducePriceIsNotNull() {
            addCriterion("produce_price is not null");
            return (Criteria) this;
        }

        public Criteria andProducePriceEqualTo(BigDecimal value) {
            addCriterion("produce_price =", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceNotEqualTo(BigDecimal value) {
            addCriterion("produce_price <>", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceGreaterThan(BigDecimal value) {
            addCriterion("produce_price >", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("produce_price >=", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceLessThan(BigDecimal value) {
            addCriterion("produce_price <", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("produce_price <=", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceIn(List<BigDecimal> values) {
            addCriterion("produce_price in", values, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceNotIn(List<BigDecimal> values) {
            addCriterion("produce_price not in", values, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("produce_price between", value1, value2, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("produce_price not between", value1, value2, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryIsNull() {
            addCriterion("produce_price_oridry is null");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryIsNotNull() {
            addCriterion("produce_price_oridry is not null");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryEqualTo(String value) {
            addCriterion("produce_price_oridry =", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryNotEqualTo(String value) {
            addCriterion("produce_price_oridry <>", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryGreaterThan(String value) {
            addCriterion("produce_price_oridry >", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryGreaterThanOrEqualTo(String value) {
            addCriterion("produce_price_oridry >=", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryLessThan(String value) {
            addCriterion("produce_price_oridry <", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryLessThanOrEqualTo(String value) {
            addCriterion("produce_price_oridry <=", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryLike(String value) {
            addCriterion("produce_price_oridry like", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryNotLike(String value) {
            addCriterion("produce_price_oridry not like", value, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryIn(List<String> values) {
            addCriterion("produce_price_oridry in", values, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryNotIn(List<String> values) {
            addCriterion("produce_price_oridry not in", values, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryBetween(String value1, String value2) {
            addCriterion("produce_price_oridry between", value1, value2, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProducePriceOridryNotBetween(String value1, String value2) {
            addCriterion("produce_price_oridry not between", value1, value2, "producePriceOridry");
            return (Criteria) this;
        }

        public Criteria andProduceInfoIsNull() {
            addCriterion("produce_info is null");
            return (Criteria) this;
        }

        public Criteria andProduceInfoIsNotNull() {
            addCriterion("produce_info is not null");
            return (Criteria) this;
        }

        public Criteria andProduceInfoEqualTo(String value) {
            addCriterion("produce_info =", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoNotEqualTo(String value) {
            addCriterion("produce_info <>", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoGreaterThan(String value) {
            addCriterion("produce_info >", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("produce_info >=", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoLessThan(String value) {
            addCriterion("produce_info <", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoLessThanOrEqualTo(String value) {
            addCriterion("produce_info <=", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoLike(String value) {
            addCriterion("produce_info like", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoNotLike(String value) {
            addCriterion("produce_info not like", value, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoIn(List<String> values) {
            addCriterion("produce_info in", values, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoNotIn(List<String> values) {
            addCriterion("produce_info not in", values, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoBetween(String value1, String value2) {
            addCriterion("produce_info between", value1, value2, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProduceInfoNotBetween(String value1, String value2) {
            addCriterion("produce_info not between", value1, value2, "produceInfo");
            return (Criteria) this;
        }

        public Criteria andProducePirctureIsNull() {
            addCriterion("produce_pircture is null");
            return (Criteria) this;
        }

        public Criteria andProducePirctureIsNotNull() {
            addCriterion("produce_pircture is not null");
            return (Criteria) this;
        }

        public Criteria andProducePirctureEqualTo(String value) {
            addCriterion("produce_pircture =", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureNotEqualTo(String value) {
            addCriterion("produce_pircture <>", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureGreaterThan(String value) {
            addCriterion("produce_pircture >", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureGreaterThanOrEqualTo(String value) {
            addCriterion("produce_pircture >=", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureLessThan(String value) {
            addCriterion("produce_pircture <", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureLessThanOrEqualTo(String value) {
            addCriterion("produce_pircture <=", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureLike(String value) {
            addCriterion("produce_pircture like", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureNotLike(String value) {
            addCriterion("produce_pircture not like", value, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureIn(List<String> values) {
            addCriterion("produce_pircture in", values, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureNotIn(List<String> values) {
            addCriterion("produce_pircture not in", values, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureBetween(String value1, String value2) {
            addCriterion("produce_pircture between", value1, value2, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProducePirctureNotBetween(String value1, String value2) {
            addCriterion("produce_pircture not between", value1, value2, "producePircture");
            return (Criteria) this;
        }

        public Criteria andProduceStateIsNull() {
            addCriterion("produce_state is null");
            return (Criteria) this;
        }

        public Criteria andProduceStateIsNotNull() {
            addCriterion("produce_state is not null");
            return (Criteria) this;
        }

        public Criteria andProduceStateEqualTo(String value) {
            addCriterion("produce_state =", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateNotEqualTo(String value) {
            addCriterion("produce_state <>", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateGreaterThan(String value) {
            addCriterion("produce_state >", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateGreaterThanOrEqualTo(String value) {
            addCriterion("produce_state >=", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateLessThan(String value) {
            addCriterion("produce_state <", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateLessThanOrEqualTo(String value) {
            addCriterion("produce_state <=", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateLike(String value) {
            addCriterion("produce_state like", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateNotLike(String value) {
            addCriterion("produce_state not like", value, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateIn(List<String> values) {
            addCriterion("produce_state in", values, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateNotIn(List<String> values) {
            addCriterion("produce_state not in", values, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateBetween(String value1, String value2) {
            addCriterion("produce_state between", value1, value2, "produceState");
            return (Criteria) this;
        }

        public Criteria andProduceStateNotBetween(String value1, String value2) {
            addCriterion("produce_state not between", value1, value2, "produceState");
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