package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        public Criteria andPurchaseIdIsNull() {
            addCriterion("purchase_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNotNull() {
            addCriterion("purchase_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdEqualTo(Integer value) {
            addCriterion("purchase_id =", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotEqualTo(Integer value) {
            addCriterion("purchase_id <>", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThan(Integer value) {
            addCriterion("purchase_id >", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_id >=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThan(Integer value) {
            addCriterion("purchase_id <", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_id <=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIn(List<Integer> values) {
            addCriterion("purchase_id in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotIn(List<Integer> values) {
            addCriterion("purchase_id not in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_id between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_id not between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceIsNull() {
            addCriterion("purchase_produce is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceIsNotNull() {
            addCriterion("purchase_produce is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceEqualTo(String value) {
            addCriterion("purchase_produce =", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceNotEqualTo(String value) {
            addCriterion("purchase_produce <>", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceGreaterThan(String value) {
            addCriterion("purchase_produce >", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_produce >=", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceLessThan(String value) {
            addCriterion("purchase_produce <", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceLessThanOrEqualTo(String value) {
            addCriterion("purchase_produce <=", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceLike(String value) {
            addCriterion("purchase_produce like", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceNotLike(String value) {
            addCriterion("purchase_produce not like", value, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceIn(List<String> values) {
            addCriterion("purchase_produce in", values, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceNotIn(List<String> values) {
            addCriterion("purchase_produce not in", values, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceBetween(String value1, String value2) {
            addCriterion("purchase_produce between", value1, value2, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceNotBetween(String value1, String value2) {
            addCriterion("purchase_produce not between", value1, value2, "purchaseProduce");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeIsNull() {
            addCriterion("purchase_produce_code is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeIsNotNull() {
            addCriterion("purchase_produce_code is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeEqualTo(String value) {
            addCriterion("purchase_produce_code =", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeNotEqualTo(String value) {
            addCriterion("purchase_produce_code <>", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeGreaterThan(String value) {
            addCriterion("purchase_produce_code >", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_produce_code >=", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeLessThan(String value) {
            addCriterion("purchase_produce_code <", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeLessThanOrEqualTo(String value) {
            addCriterion("purchase_produce_code <=", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeLike(String value) {
            addCriterion("purchase_produce_code like", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeNotLike(String value) {
            addCriterion("purchase_produce_code not like", value, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeIn(List<String> values) {
            addCriterion("purchase_produce_code in", values, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeNotIn(List<String> values) {
            addCriterion("purchase_produce_code not in", values, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeBetween(String value1, String value2) {
            addCriterion("purchase_produce_code between", value1, value2, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseProduceCodeNotBetween(String value1, String value2) {
            addCriterion("purchase_produce_code not between", value1, value2, "purchaseProduceCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIsNull() {
            addCriterion("purchase_state is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIsNotNull() {
            addCriterion("purchase_state is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateEqualTo(String value) {
            addCriterion("purchase_state =", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotEqualTo(String value) {
            addCriterion("purchase_state <>", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateGreaterThan(String value) {
            addCriterion("purchase_state >", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_state >=", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLessThan(String value) {
            addCriterion("purchase_state <", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLessThanOrEqualTo(String value) {
            addCriterion("purchase_state <=", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLike(String value) {
            addCriterion("purchase_state like", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotLike(String value) {
            addCriterion("purchase_state not like", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIn(List<String> values) {
            addCriterion("purchase_state in", values, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotIn(List<String> values) {
            addCriterion("purchase_state not in", values, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateBetween(String value1, String value2) {
            addCriterion("purchase_state between", value1, value2, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotBetween(String value1, String value2) {
            addCriterion("purchase_state not between", value1, value2, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceIsNull() {
            addCriterion("purchase_produce_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceIsNotNull() {
            addCriterion("purchase_produce_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceEqualTo(BigDecimal value) {
            addCriterion("purchase_produce_price =", value, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_produce_price <>", value, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_produce_price >", value, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_produce_price >=", value, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceLessThan(BigDecimal value) {
            addCriterion("purchase_produce_price <", value, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_produce_price <=", value, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceIn(List<BigDecimal> values) {
            addCriterion("purchase_produce_price in", values, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_produce_price not in", values, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_produce_price between", value1, value2, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseProducePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_produce_price not between", value1, value2, "purchaseProducePrice");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andQuaityStateIsNull() {
            addCriterion("quaity_state is null");
            return (Criteria) this;
        }

        public Criteria andQuaityStateIsNotNull() {
            addCriterion("quaity_state is not null");
            return (Criteria) this;
        }

        public Criteria andQuaityStateEqualTo(Integer value) {
            addCriterion("quaity_state =", value, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateNotEqualTo(Integer value) {
            addCriterion("quaity_state <>", value, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateGreaterThan(Integer value) {
            addCriterion("quaity_state >", value, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("quaity_state >=", value, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateLessThan(Integer value) {
            addCriterion("quaity_state <", value, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateLessThanOrEqualTo(Integer value) {
            addCriterion("quaity_state <=", value, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateIn(List<Integer> values) {
            addCriterion("quaity_state in", values, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateNotIn(List<Integer> values) {
            addCriterion("quaity_state not in", values, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateBetween(Integer value1, Integer value2) {
            addCriterion("quaity_state between", value1, value2, "quaityState");
            return (Criteria) this;
        }

        public Criteria andQuaityStateNotBetween(Integer value1, Integer value2) {
            addCriterion("quaity_state not between", value1, value2, "quaityState");
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