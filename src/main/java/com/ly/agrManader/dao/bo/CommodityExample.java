package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCommodityidIsNull() {
            addCriterion("commodityId is null");
            return (Criteria) this;
        }

        public Criteria andCommodityidIsNotNull() {
            addCriterion("commodityId is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityidEqualTo(Integer value) {
            addCriterion("commodityId =", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotEqualTo(Integer value) {
            addCriterion("commodityId <>", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThan(Integer value) {
            addCriterion("commodityId >", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityId >=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThan(Integer value) {
            addCriterion("commodityId <", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThanOrEqualTo(Integer value) {
            addCriterion("commodityId <=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidIn(List<Integer> values) {
            addCriterion("commodityId in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotIn(List<Integer> values) {
            addCriterion("commodityId not in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidBetween(Integer value1, Integer value2) {
            addCriterion("commodityId between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityId not between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidIsNull() {
            addCriterion("agriculturalProductsId is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidIsNotNull() {
            addCriterion("agriculturalProductsId is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidEqualTo(Integer value) {
            addCriterion("agriculturalProductsId =", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidNotEqualTo(Integer value) {
            addCriterion("agriculturalProductsId <>", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidGreaterThan(Integer value) {
            addCriterion("agriculturalProductsId >", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("agriculturalProductsId >=", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidLessThan(Integer value) {
            addCriterion("agriculturalProductsId <", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidLessThanOrEqualTo(Integer value) {
            addCriterion("agriculturalProductsId <=", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidIn(List<Integer> values) {
            addCriterion("agriculturalProductsId in", values, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidNotIn(List<Integer> values) {
            addCriterion("agriculturalProductsId not in", values, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidBetween(Integer value1, Integer value2) {
            addCriterion("agriculturalProductsId between", value1, value2, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidNotBetween(Integer value1, Integer value2) {
            addCriterion("agriculturalProductsId not between", value1, value2, "agriculturalproductsid");
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

        public Criteria andStoragemethodIsNull() {
            addCriterion("storageMethod is null");
            return (Criteria) this;
        }

        public Criteria andStoragemethodIsNotNull() {
            addCriterion("storageMethod is not null");
            return (Criteria) this;
        }

        public Criteria andStoragemethodEqualTo(String value) {
            addCriterion("storageMethod =", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodNotEqualTo(String value) {
            addCriterion("storageMethod <>", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodGreaterThan(String value) {
            addCriterion("storageMethod >", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodGreaterThanOrEqualTo(String value) {
            addCriterion("storageMethod >=", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodLessThan(String value) {
            addCriterion("storageMethod <", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodLessThanOrEqualTo(String value) {
            addCriterion("storageMethod <=", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodLike(String value) {
            addCriterion("storageMethod like", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodNotLike(String value) {
            addCriterion("storageMethod not like", value, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodIn(List<String> values) {
            addCriterion("storageMethod in", values, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodNotIn(List<String> values) {
            addCriterion("storageMethod not in", values, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodBetween(String value1, String value2) {
            addCriterion("storageMethod between", value1, value2, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodNotBetween(String value1, String value2) {
            addCriterion("storageMethod not between", value1, value2, "storagemethod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodIsNull() {
            addCriterion("qualityGuaranteePeriod is null");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodIsNotNull() {
            addCriterion("qualityGuaranteePeriod is not null");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodEqualTo(Integer value) {
            addCriterion("qualityGuaranteePeriod =", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotEqualTo(Integer value) {
            addCriterion("qualityGuaranteePeriod <>", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodGreaterThan(Integer value) {
            addCriterion("qualityGuaranteePeriod >", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualityGuaranteePeriod >=", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLessThan(Integer value) {
            addCriterion("qualityGuaranteePeriod <", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLessThanOrEqualTo(Integer value) {
            addCriterion("qualityGuaranteePeriod <=", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodIn(List<Integer> values) {
            addCriterion("qualityGuaranteePeriod in", values, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotIn(List<Integer> values) {
            addCriterion("qualityGuaranteePeriod not in", values, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodBetween(Integer value1, Integer value2) {
            addCriterion("qualityGuaranteePeriod between", value1, value2, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("qualityGuaranteePeriod not between", value1, value2, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andMinstockIsNull() {
            addCriterion("minStock is null");
            return (Criteria) this;
        }

        public Criteria andMinstockIsNotNull() {
            addCriterion("minStock is not null");
            return (Criteria) this;
        }

        public Criteria andMinstockEqualTo(Integer value) {
            addCriterion("minStock =", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotEqualTo(Integer value) {
            addCriterion("minStock <>", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThan(Integer value) {
            addCriterion("minStock >", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("minStock >=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThan(Integer value) {
            addCriterion("minStock <", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThanOrEqualTo(Integer value) {
            addCriterion("minStock <=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockIn(List<Integer> values) {
            addCriterion("minStock in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotIn(List<Integer> values) {
            addCriterion("minStock not in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockBetween(Integer value1, Integer value2) {
            addCriterion("minStock between", value1, value2, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotBetween(Integer value1, Integer value2) {
            addCriterion("minStock not between", value1, value2, "minstock");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andMaxstockIsNull() {
            addCriterion("maxStock is null");
            return (Criteria) this;
        }

        public Criteria andMaxstockIsNotNull() {
            addCriterion("maxStock is not null");
            return (Criteria) this;
        }

        public Criteria andMaxstockEqualTo(Integer value) {
            addCriterion("maxStock =", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotEqualTo(Integer value) {
            addCriterion("maxStock <>", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockGreaterThan(Integer value) {
            addCriterion("maxStock >", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxStock >=", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockLessThan(Integer value) {
            addCriterion("maxStock <", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockLessThanOrEqualTo(Integer value) {
            addCriterion("maxStock <=", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockIn(List<Integer> values) {
            addCriterion("maxStock in", values, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotIn(List<Integer> values) {
            addCriterion("maxStock not in", values, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockBetween(Integer value1, Integer value2) {
            addCriterion("maxStock between", value1, value2, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotBetween(Integer value1, Integer value2) {
            addCriterion("maxStock not between", value1, value2, "maxstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockIsNull() {
            addCriterion("recommendStock is null");
            return (Criteria) this;
        }

        public Criteria andRecommendstockIsNotNull() {
            addCriterion("recommendStock is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendstockEqualTo(Integer value) {
            addCriterion("recommendStock =", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotEqualTo(Integer value) {
            addCriterion("recommendStock <>", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockGreaterThan(Integer value) {
            addCriterion("recommendStock >", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendStock >=", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLessThan(Integer value) {
            addCriterion("recommendStock <", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLessThanOrEqualTo(Integer value) {
            addCriterion("recommendStock <=", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockIn(List<Integer> values) {
            addCriterion("recommendStock in", values, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotIn(List<Integer> values) {
            addCriterion("recommendStock not in", values, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockBetween(Integer value1, Integer value2) {
            addCriterion("recommendStock between", value1, value2, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendStock not between", value1, value2, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Grade not between", value1, value2, "grade");
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