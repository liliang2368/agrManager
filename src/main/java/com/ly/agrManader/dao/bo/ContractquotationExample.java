package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class ContractquotationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractquotationExample() {
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

        public Criteria andContractidIsNull() {
            addCriterion("contractId is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("contractId is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(Integer value) {
            addCriterion("contractId =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(Integer value) {
            addCriterion("contractId <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(Integer value) {
            addCriterion("contractId >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(Integer value) {
            addCriterion("contractId >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(Integer value) {
            addCriterion("contractId <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(Integer value) {
            addCriterion("contractId <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<Integer> values) {
            addCriterion("contractId in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<Integer> values) {
            addCriterion("contractId not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(Integer value1, Integer value2) {
            addCriterion("contractId between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(Integer value1, Integer value2) {
            addCriterion("contractId not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandIsNull() {
            addCriterion("customerDemand is null");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandIsNotNull() {
            addCriterion("customerDemand is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandEqualTo(String value) {
            addCriterion("customerDemand =", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandNotEqualTo(String value) {
            addCriterion("customerDemand <>", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandGreaterThan(String value) {
            addCriterion("customerDemand >", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandGreaterThanOrEqualTo(String value) {
            addCriterion("customerDemand >=", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandLessThan(String value) {
            addCriterion("customerDemand <", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandLessThanOrEqualTo(String value) {
            addCriterion("customerDemand <=", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandLike(String value) {
            addCriterion("customerDemand like", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandNotLike(String value) {
            addCriterion("customerDemand not like", value, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandIn(List<String> values) {
            addCriterion("customerDemand in", values, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandNotIn(List<String> values) {
            addCriterion("customerDemand not in", values, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandBetween(String value1, String value2) {
            addCriterion("customerDemand between", value1, value2, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andCustomerdemandNotBetween(String value1, String value2) {
            addCriterion("customerDemand not between", value1, value2, "customerdemand");
            return (Criteria) this;
        }

        public Criteria andSolutionIsNull() {
            addCriterion("solution is null");
            return (Criteria) this;
        }

        public Criteria andSolutionIsNotNull() {
            addCriterion("solution is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionEqualTo(String value) {
            addCriterion("solution =", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotEqualTo(String value) {
            addCriterion("solution <>", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionGreaterThan(String value) {
            addCriterion("solution >", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("solution >=", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionLessThan(String value) {
            addCriterion("solution <", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionLessThanOrEqualTo(String value) {
            addCriterion("solution <=", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionLike(String value) {
            addCriterion("solution like", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotLike(String value) {
            addCriterion("solution not like", value, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionIn(List<String> values) {
            addCriterion("solution in", values, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotIn(List<String> values) {
            addCriterion("solution not in", values, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionBetween(String value1, String value2) {
            addCriterion("solution between", value1, value2, "solution");
            return (Criteria) this;
        }

        public Criteria andSolutionNotBetween(String value1, String value2) {
            addCriterion("solution not between", value1, value2, "solution");
            return (Criteria) this;
        }

        public Criteria andFinpriceIsNull() {
            addCriterion("finPrice is null");
            return (Criteria) this;
        }

        public Criteria andFinpriceIsNotNull() {
            addCriterion("finPrice is not null");
            return (Criteria) this;
        }

        public Criteria andFinpriceEqualTo(Double value) {
            addCriterion("finPrice =", value, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceNotEqualTo(Double value) {
            addCriterion("finPrice <>", value, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceGreaterThan(Double value) {
            addCriterion("finPrice >", value, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("finPrice >=", value, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceLessThan(Double value) {
            addCriterion("finPrice <", value, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceLessThanOrEqualTo(Double value) {
            addCriterion("finPrice <=", value, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceIn(List<Double> values) {
            addCriterion("finPrice in", values, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceNotIn(List<Double> values) {
            addCriterion("finPrice not in", values, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceBetween(Double value1, Double value2) {
            addCriterion("finPrice between", value1, value2, "finprice");
            return (Criteria) this;
        }

        public Criteria andFinpriceNotBetween(Double value1, Double value2) {
            addCriterion("finPrice not between", value1, value2, "finprice");
            return (Criteria) this;
        }

        public Criteria andStatsIsNull() {
            addCriterion("stats is null");
            return (Criteria) this;
        }

        public Criteria andStatsIsNotNull() {
            addCriterion("stats is not null");
            return (Criteria) this;
        }

        public Criteria andStatsEqualTo(Integer value) {
            addCriterion("stats =", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotEqualTo(Integer value) {
            addCriterion("stats <>", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsGreaterThan(Integer value) {
            addCriterion("stats >", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats >=", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsLessThan(Integer value) {
            addCriterion("stats <", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsLessThanOrEqualTo(Integer value) {
            addCriterion("stats <=", value, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsIn(List<Integer> values) {
            addCriterion("stats in", values, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotIn(List<Integer> values) {
            addCriterion("stats not in", values, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsBetween(Integer value1, Integer value2) {
            addCriterion("stats between", value1, value2, "stats");
            return (Criteria) this;
        }

        public Criteria andStatsNotBetween(Integer value1, Integer value2) {
            addCriterion("stats not between", value1, value2, "stats");
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