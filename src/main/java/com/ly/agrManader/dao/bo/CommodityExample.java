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
            addCriterion("commodityid is null");
            return (Criteria) this;
        }

        public Criteria andCommodityidIsNotNull() {
            addCriterion("commodityid is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityidEqualTo(Integer value) {
            addCriterion("commodityid =", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotEqualTo(Integer value) {
            addCriterion("commodityid <>", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThan(Integer value) {
            addCriterion("commodityid >", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodityid >=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThan(Integer value) {
            addCriterion("commodityid <", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidLessThanOrEqualTo(Integer value) {
            addCriterion("commodityid <=", value, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidIn(List<Integer> values) {
            addCriterion("commodityid in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotIn(List<Integer> values) {
            addCriterion("commodityid not in", values, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidBetween(Integer value1, Integer value2) {
            addCriterion("commodityid between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andCommodityidNotBetween(Integer value1, Integer value2) {
            addCriterion("commodityid not between", value1, value2, "commodityid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidIsNull() {
            addCriterion("agriculturalproductsid is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidIsNotNull() {
            addCriterion("agriculturalproductsid is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidEqualTo(Integer value) {
            addCriterion("agriculturalproductsid =", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidNotEqualTo(Integer value) {
            addCriterion("agriculturalproductsid <>", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidGreaterThan(Integer value) {
            addCriterion("agriculturalproductsid >", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("agriculturalproductsid >=", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidLessThan(Integer value) {
            addCriterion("agriculturalproductsid <", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidLessThanOrEqualTo(Integer value) {
            addCriterion("agriculturalproductsid <=", value, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidIn(List<Integer> values) {
            addCriterion("agriculturalproductsid in", values, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidNotIn(List<Integer> values) {
            addCriterion("agriculturalproductsid not in", values, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidBetween(Integer value1, Integer value2) {
            addCriterion("agriculturalproductsid between", value1, value2, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andAgriculturalproductsidNotBetween(Integer value1, Integer value2) {
            addCriterion("agriculturalproductsid not between", value1, value2, "agriculturalproductsid");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNull() {
            addCriterion("commodityname is null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIsNotNull() {
            addCriterion("commodityname is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditynameEqualTo(String value) {
            addCriterion("commodityname =", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotEqualTo(String value) {
            addCriterion("commodityname <>", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThan(String value) {
            addCriterion("commodityname >", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameGreaterThanOrEqualTo(String value) {
            addCriterion("commodityname >=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThan(String value) {
            addCriterion("commodityname <", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLessThanOrEqualTo(String value) {
            addCriterion("commodityname <=", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameLike(String value) {
            addCriterion("commodityname like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotLike(String value) {
            addCriterion("commodityname not like", value, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameIn(List<String> values) {
            addCriterion("commodityname in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotIn(List<String> values) {
            addCriterion("commodityname not in", values, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameBetween(String value1, String value2) {
            addCriterion("commodityname between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andCommoditynameNotBetween(String value1, String value2) {
            addCriterion("commodityname not between", value1, value2, "commodityname");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodIsNull() {
            addCriterion("measurementmethod is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodIsNotNull() {
            addCriterion("measurementmethod is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodEqualTo(String value) {
            addCriterion("measurementmethod =", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotEqualTo(String value) {
            addCriterion("measurementmethod <>", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodGreaterThan(String value) {
            addCriterion("measurementmethod >", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodGreaterThanOrEqualTo(String value) {
            addCriterion("measurementmethod >=", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodLessThan(String value) {
            addCriterion("measurementmethod <", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodLessThanOrEqualTo(String value) {
            addCriterion("measurementmethod <=", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodLike(String value) {
            addCriterion("measurementmethod like", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotLike(String value) {
            addCriterion("measurementmethod not like", value, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodIn(List<String> values) {
            addCriterion("measurementmethod in", values, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotIn(List<String> values) {
            addCriterion("measurementmethod not in", values, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodBetween(String value1, String value2) {
            addCriterion("measurementmethod between", value1, value2, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andMeasurementmethodNotBetween(String value1, String value2) {
            addCriterion("measurementmethod not between", value1, value2, "measurementmethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodIsNull() {
            addCriterion("storagemethodstoragemethod is null");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodIsNotNull() {
            addCriterion("storagemethodstoragemethod is not null");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodEqualTo(String value) {
            addCriterion("storagemethodstoragemethod =", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodNotEqualTo(String value) {
            addCriterion("storagemethodstoragemethod <>", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodGreaterThan(String value) {
            addCriterion("storagemethodstoragemethod >", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodGreaterThanOrEqualTo(String value) {
            addCriterion("storagemethodstoragemethod >=", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodLessThan(String value) {
            addCriterion("storagemethodstoragemethod <", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodLessThanOrEqualTo(String value) {
            addCriterion("storagemethodstoragemethod <=", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodLike(String value) {
            addCriterion("storagemethodstoragemethod like", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodNotLike(String value) {
            addCriterion("storagemethodstoragemethod not like", value, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodIn(List<String> values) {
            addCriterion("storagemethodstoragemethod in", values, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodNotIn(List<String> values) {
            addCriterion("storagemethodstoragemethod not in", values, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodBetween(String value1, String value2) {
            addCriterion("storagemethodstoragemethod between", value1, value2, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andStoragemethodstoragemethodNotBetween(String value1, String value2) {
            addCriterion("storagemethodstoragemethod not between", value1, value2, "storagemethodstoragemethod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodIsNull() {
            addCriterion("qualityguaranteeperiod is null");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodIsNotNull() {
            addCriterion("qualityguaranteeperiod is not null");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodEqualTo(String value) {
            addCriterion("qualityguaranteeperiod =", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotEqualTo(String value) {
            addCriterion("qualityguaranteeperiod <>", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodGreaterThan(String value) {
            addCriterion("qualityguaranteeperiod >", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodGreaterThanOrEqualTo(String value) {
            addCriterion("qualityguaranteeperiod >=", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLessThan(String value) {
            addCriterion("qualityguaranteeperiod <", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLessThanOrEqualTo(String value) {
            addCriterion("qualityguaranteeperiod <=", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodLike(String value) {
            addCriterion("qualityguaranteeperiod like", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotLike(String value) {
            addCriterion("qualityguaranteeperiod not like", value, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodIn(List<String> values) {
            addCriterion("qualityguaranteeperiod in", values, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotIn(List<String> values) {
            addCriterion("qualityguaranteeperiod not in", values, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodBetween(String value1, String value2) {
            addCriterion("qualityguaranteeperiod between", value1, value2, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andQualityguaranteeperiodNotBetween(String value1, String value2) {
            addCriterion("qualityguaranteeperiod not between", value1, value2, "qualityguaranteeperiod");
            return (Criteria) this;
        }

        public Criteria andMinstockIsNull() {
            addCriterion("minstock is null");
            return (Criteria) this;
        }

        public Criteria andMinstockIsNotNull() {
            addCriterion("minstock is not null");
            return (Criteria) this;
        }

        public Criteria andMinstockEqualTo(Integer value) {
            addCriterion("minstock =", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotEqualTo(Integer value) {
            addCriterion("minstock <>", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThan(Integer value) {
            addCriterion("minstock >", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("minstock >=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThan(Integer value) {
            addCriterion("minstock <", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockLessThanOrEqualTo(Integer value) {
            addCriterion("minstock <=", value, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockIn(List<Integer> values) {
            addCriterion("minstock in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotIn(List<Integer> values) {
            addCriterion("minstock not in", values, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockBetween(Integer value1, Integer value2) {
            addCriterion("minstock between", value1, value2, "minstock");
            return (Criteria) this;
        }

        public Criteria andMinstockNotBetween(Integer value1, Integer value2) {
            addCriterion("minstock not between", value1, value2, "minstock");
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
            addCriterion("maxstock is null");
            return (Criteria) this;
        }

        public Criteria andMaxstockIsNotNull() {
            addCriterion("maxstock is not null");
            return (Criteria) this;
        }

        public Criteria andMaxstockEqualTo(Integer value) {
            addCriterion("maxstock =", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotEqualTo(Integer value) {
            addCriterion("maxstock <>", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockGreaterThan(Integer value) {
            addCriterion("maxstock >", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxstock >=", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockLessThan(Integer value) {
            addCriterion("maxstock <", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockLessThanOrEqualTo(Integer value) {
            addCriterion("maxstock <=", value, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockIn(List<Integer> values) {
            addCriterion("maxstock in", values, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotIn(List<Integer> values) {
            addCriterion("maxstock not in", values, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockBetween(Integer value1, Integer value2) {
            addCriterion("maxstock between", value1, value2, "maxstock");
            return (Criteria) this;
        }

        public Criteria andMaxstockNotBetween(Integer value1, Integer value2) {
            addCriterion("maxstock not between", value1, value2, "maxstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockIsNull() {
            addCriterion("recommendstock is null");
            return (Criteria) this;
        }

        public Criteria andRecommendstockIsNotNull() {
            addCriterion("recommendstock is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendstockEqualTo(String value) {
            addCriterion("recommendstock =", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotEqualTo(String value) {
            addCriterion("recommendstock <>", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockGreaterThan(String value) {
            addCriterion("recommendstock >", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockGreaterThanOrEqualTo(String value) {
            addCriterion("recommendstock >=", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLessThan(String value) {
            addCriterion("recommendstock <", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLessThanOrEqualTo(String value) {
            addCriterion("recommendstock <=", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockLike(String value) {
            addCriterion("recommendstock like", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotLike(String value) {
            addCriterion("recommendstock not like", value, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockIn(List<String> values) {
            addCriterion("recommendstock in", values, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotIn(List<String> values) {
            addCriterion("recommendstock not in", values, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockBetween(String value1, String value2) {
            addCriterion("recommendstock between", value1, value2, "recommendstock");
            return (Criteria) this;
        }

        public Criteria andRecommendstockNotBetween(String value1, String value2) {
            addCriterion("recommendstock not between", value1, value2, "recommendstock");
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
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNull() {
            addCriterion("costprice is null");
            return (Criteria) this;
        }

        public Criteria andCostpriceIsNotNull() {
            addCriterion("costprice is not null");
            return (Criteria) this;
        }

        public Criteria andCostpriceEqualTo(BigDecimal value) {
            addCriterion("costprice =", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotEqualTo(BigDecimal value) {
            addCriterion("costprice <>", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThan(BigDecimal value) {
            addCriterion("costprice >", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("costprice >=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThan(BigDecimal value) {
            addCriterion("costprice <", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("costprice <=", value, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceIn(List<BigDecimal> values) {
            addCriterion("costprice in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotIn(List<BigDecimal> values) {
            addCriterion("costprice not in", values, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("costprice between", value1, value2, "costprice");
            return (Criteria) this;
        }

        public Criteria andCostpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("costprice not between", value1, value2, "costprice");
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