package com.ly.agrManader.dao.bo;

import java.math.BigDecimal;
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

        public Criteria andQualityguaranteeperiodEqualTo(String value) {
            addCriterion("qualityGuaranteePeriod =", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotEqualTo(String value) {
            addCriterion("qualityGuaranteePeriod <>", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodGreaterThan(String value) {
            addCriterion("qualityGuaranteePeriod >", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodGreaterThanOrEqualTo(String value) {
            addCriterion("qualityGuaranteePeriod >=", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLessThan(String value) {
            addCriterion("qualityGuaranteePeriod <", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLessThanOrEqualTo(String value) {
            addCriterion("qualityGuaranteePeriod <=", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLike(String value) {
            addCriterion("qualityGuaranteePeriod like", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotLike(String value) {
            addCriterion("qualityGuaranteePeriod not like", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodIn(List<String> values) {
            addCriterion("qualityGuaranteePeriod in", values, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotIn(List<String> values) {
            addCriterion("qualityGuaranteePeriod not in", values, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodBetween(String value1, String value2) {
            addCriterion("qualityGuaranteePeriod between", value1, value2, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotBetween(String value1, String value2) {
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

        public Criteria andMinstockEqualTo(String value) {
            addCriterion("minStock =", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotEqualTo(String value) {
            addCriterion("minStock <>", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThan(String value) {
            addCriterion("minStock >", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThanOrEqualTo(String value) {
            addCriterion("minStock >=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThan(String value) {
            addCriterion("minStock <", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThanOrEqualTo(String value) {
            addCriterion("minStock <=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLike(String value) {
            addCriterion("minStock like", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotLike(String value) {
            addCriterion("minStock not like", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockIn(List<String> values) {
            addCriterion("minStock in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotIn(List<String> values) {
            addCriterion("minStock not in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockBetween(String value1, String value2) {
            addCriterion("minStock between", value1, value2, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotBetween(String value1, String value2) {
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

        public Criteria andStockEqualTo(String value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(String value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(String value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(String value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(String value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(String value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLike(String value) {
            addCriterion("stock like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotLike(String value) {
            addCriterion("stock not like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<String> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<String> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(String value1, String value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(String value1, String value2) {
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

        public Criteria andMaxstockEqualTo(String value) {
            addCriterion("maxStock =", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotEqualTo(String value) {
            addCriterion("maxStock <>", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockGreaterThan(String value) {
            addCriterion("maxStock >", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockGreaterThanOrEqualTo(String value) {
            addCriterion("maxStock >=", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockLessThan(String value) {
            addCriterion("maxStock <", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockLessThanOrEqualTo(String value) {
            addCriterion("maxStock <=", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockLike(String value) {
            addCriterion("maxStock like", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotLike(String value) {
            addCriterion("maxStock not like", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockIn(List<String> values) {
            addCriterion("maxStock in", values, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotIn(List<String> values) {
            addCriterion("maxStock not in", values, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockBetween(String value1, String value2) {
            addCriterion("maxStock between", value1, value2, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotBetween(String value1, String value2) {
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

        public Criteria andRecommendstockEqualTo(String value) {
            addCriterion("recommendStock =", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotEqualTo(String value) {
            addCriterion("recommendStock <>", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockGreaterThan(String value) {
            addCriterion("recommendStock >", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockGreaterThanOrEqualTo(String value) {
            addCriterion("recommendStock >=", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLessThan(String value) {
            addCriterion("recommendStock <", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLessThanOrEqualTo(String value) {
            addCriterion("recommendStock <=", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLike(String value) {
            addCriterion("recommendStock like", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotLike(String value) {
            addCriterion("recommendStock not like", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockIn(List<String> values) {
            addCriterion("recommendStock in", values, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotIn(List<String> values) {
            addCriterion("recommendStock not in", values, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockBetween(String value1, String value2) {
            addCriterion("recommendStock between", value1, value2, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotBetween(String value1, String value2) {
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

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andGradeEqualTo(String value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("Grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("Grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
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