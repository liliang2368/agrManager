package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrepriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrepriceExample() {
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

        public Criteria andPreproductidIsNull() {
            addCriterion("preProductId is null");
            return (Criteria) this;
        }

        public Criteria andPreproductidIsNotNull() {
            addCriterion("preProductId is not null");
            return (Criteria) this;
        }

        public Criteria andPreproductidEqualTo(Integer value) {
            addCriterion("preProductId =", value, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidNotEqualTo(Integer value) {
            addCriterion("preProductId <>", value, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidGreaterThan(Integer value) {
            addCriterion("preProductId >", value, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("preProductId >=", value, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidLessThan(Integer value) {
            addCriterion("preProductId <", value, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidLessThanOrEqualTo(Integer value) {
            addCriterion("preProductId <=", value, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidIn(List<Integer> values) {
            addCriterion("preProductId in", values, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidNotIn(List<Integer> values) {
            addCriterion("preProductId not in", values, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidBetween(Integer value1, Integer value2) {
            addCriterion("preProductId between", value1, value2, "preproductid");
            return (Criteria) this;
        }

        public Criteria andPreproductidNotBetween(Integer value1, Integer value2) {
            addCriterion("preProductId not between", value1, value2, "preproductid");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodIsNull() {
            addCriterion("measurementMethod is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodIsNotNull() {
            addCriterion("measurementMethod is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodEqualTo(String value) {
            addCriterion("measurementMethod =", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotEqualTo(String value) {
            addCriterion("measurementMethod <>", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodGreaterThan(String value) {
            addCriterion("measurementMethod >", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodGreaterThanOrEqualTo(String value) {
            addCriterion("measurementMethod >=", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodLessThan(String value) {
            addCriterion("measurementMethod <", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodLessThanOrEqualTo(String value) {
            addCriterion("measurementMethod <=", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodLike(String value) {
            addCriterion("measurementMethod like", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotLike(String value) {
            addCriterion("measurementMethod not like", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodIn(List<String> values) {
            addCriterion("measurementMethod in", values, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotIn(List<String> values) {
            addCriterion("measurementMethod not in", values, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodBetween(String value1, String value2) {
            addCriterion("measurementMethod between", value1, value2, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotBetween(String value1, String value2) {
            addCriterion("measurementMethod not between", value1, value2, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andTradepriceIsNull() {
            addCriterion("tradePrice is null");
            return (Criteria) this;
        }

        public Criteria andTradepriceIsNotNull() {
            addCriterion("tradePrice is not null");
            return (Criteria) this;
        }

        public Criteria andTradepriceEqualTo(Double value) {
            addCriterion("tradePrice =", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceNotEqualTo(Double value) {
            addCriterion("tradePrice <>", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceGreaterThan(Double value) {
            addCriterion("tradePrice >", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tradePrice >=", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceLessThan(Double value) {
            addCriterion("tradePrice <", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceLessThanOrEqualTo(Double value) {
            addCriterion("tradePrice <=", value, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceIn(List<Double> values) {
            addCriterion("tradePrice in", values, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceNotIn(List<Double> values) {
            addCriterion("tradePrice not in", values, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceBetween(Double value1, Double value2) {
            addCriterion("tradePrice between", value1, value2, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andTradepriceNotBetween(Double value1, Double value2) {
            addCriterion("tradePrice not between", value1, value2, "tradeprice");
            return (Criteria) this;
        }

        public Criteria andWholesalernameIsNull() {
            addCriterion("wholesalerName is null");
            return (Criteria) this;
        }

        public Criteria andWholesalernameIsNotNull() {
            addCriterion("wholesalerName is not null");
            return (Criteria) this;
        }

        public Criteria andWholesalernameEqualTo(String value) {
            addCriterion("wholesalerName =", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameNotEqualTo(String value) {
            addCriterion("wholesalerName <>", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameGreaterThan(String value) {
            addCriterion("wholesalerName >", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameGreaterThanOrEqualTo(String value) {
            addCriterion("wholesalerName >=", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameLessThan(String value) {
            addCriterion("wholesalerName <", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameLessThanOrEqualTo(String value) {
            addCriterion("wholesalerName <=", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameLike(String value) {
            addCriterion("wholesalerName like", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameNotLike(String value) {
            addCriterion("wholesalerName not like", value, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameIn(List<String> values) {
            addCriterion("wholesalerName in", values, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameNotIn(List<String> values) {
            addCriterion("wholesalerName not in", values, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameBetween(String value1, String value2) {
            addCriterion("wholesalerName between", value1, value2, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andWholesalernameNotBetween(String value1, String value2) {
            addCriterion("wholesalerName not between", value1, value2, "wholesalername");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("marketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("marketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(Double value) {
            addCriterion("marketPrice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(Double value) {
            addCriterion("marketPrice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(Double value) {
            addCriterion("marketPrice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("marketPrice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(Double value) {
            addCriterion("marketPrice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(Double value) {
            addCriterion("marketPrice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<Double> values) {
            addCriterion("marketPrice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<Double> values) {
            addCriterion("marketPrice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(Double value1, Double value2) {
            addCriterion("marketPrice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(Double value1, Double value2) {
            addCriterion("marketPrice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketnameIsNull() {
            addCriterion("marketName is null");
            return (Criteria) this;
        }

        public Criteria andMarketnameIsNotNull() {
            addCriterion("marketName is not null");
            return (Criteria) this;
        }

        public Criteria andMarketnameEqualTo(String value) {
            addCriterion("marketName =", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameNotEqualTo(String value) {
            addCriterion("marketName <>", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameGreaterThan(String value) {
            addCriterion("marketName >", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameGreaterThanOrEqualTo(String value) {
            addCriterion("marketName >=", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameLessThan(String value) {
            addCriterion("marketName <", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameLessThanOrEqualTo(String value) {
            addCriterion("marketName <=", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameLike(String value) {
            addCriterion("marketName like", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameNotLike(String value) {
            addCriterion("marketName not like", value, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameIn(List<String> values) {
            addCriterion("marketName in", values, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameNotIn(List<String> values) {
            addCriterion("marketName not in", values, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameBetween(String value1, String value2) {
            addCriterion("marketName between", value1, value2, "marketname");
            return (Criteria) this;
        }

        public Criteria andMarketnameNotBetween(String value1, String value2) {
            addCriterion("marketName not between", value1, value2, "marketname");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNull() {
            addCriterion("inputTime is null");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNotNull() {
            addCriterion("inputTime is not null");
            return (Criteria) this;
        }

        public Criteria andInputtimeEqualTo(Date value) {
            addCriterion("inputTime =", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotEqualTo(Date value) {
            addCriterion("inputTime <>", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThan(Date value) {
            addCriterion("inputTime >", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inputTime >=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThan(Date value) {
            addCriterion("inputTime <", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThanOrEqualTo(Date value) {
            addCriterion("inputTime <=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeIn(List<Date> values) {
            addCriterion("inputTime in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotIn(List<Date> values) {
            addCriterion("inputTime not in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeBetween(Date value1, Date value2) {
            addCriterion("inputTime between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotBetween(Date value1, Date value2) {
            addCriterion("inputTime not between", value1, value2, "inputtime");
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