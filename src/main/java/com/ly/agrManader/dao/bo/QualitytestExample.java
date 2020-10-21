package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class QualitytestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QualitytestExample() {
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

        public Criteria andQualitystandardIsNull() {
            addCriterion("qualityStandard is null");
            return (Criteria) this;
        }

        public Criteria andQualitystandardIsNotNull() {
            addCriterion("qualityStandard is not null");
            return (Criteria) this;
        }

        public Criteria andQualitystandardEqualTo(String value) {
            addCriterion("qualityStandard =", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardNotEqualTo(String value) {
            addCriterion("qualityStandard <>", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardGreaterThan(String value) {
            addCriterion("qualityStandard >", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardGreaterThanOrEqualTo(String value) {
            addCriterion("qualityStandard >=", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardLessThan(String value) {
            addCriterion("qualityStandard <", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardLessThanOrEqualTo(String value) {
            addCriterion("qualityStandard <=", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardLike(String value) {
            addCriterion("qualityStandard like", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardNotLike(String value) {
            addCriterion("qualityStandard not like", value, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardIn(List<String> values) {
            addCriterion("qualityStandard in", values, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardNotIn(List<String> values) {
            addCriterion("qualityStandard not in", values, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardBetween(String value1, String value2) {
            addCriterion("qualityStandard between", value1, value2, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andQualitystandardNotBetween(String value1, String value2) {
            addCriterion("qualityStandard not between", value1, value2, "qualitystandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardIsNull() {
            addCriterion("specificStandard is null");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardIsNotNull() {
            addCriterion("specificStandard is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardEqualTo(String value) {
            addCriterion("specificStandard =", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardNotEqualTo(String value) {
            addCriterion("specificStandard <>", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardGreaterThan(String value) {
            addCriterion("specificStandard >", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardGreaterThanOrEqualTo(String value) {
            addCriterion("specificStandard >=", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardLessThan(String value) {
            addCriterion("specificStandard <", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardLessThanOrEqualTo(String value) {
            addCriterion("specificStandard <=", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardLike(String value) {
            addCriterion("specificStandard like", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardNotLike(String value) {
            addCriterion("specificStandard not like", value, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardIn(List<String> values) {
            addCriterion("specificStandard in", values, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardNotIn(List<String> values) {
            addCriterion("specificStandard not in", values, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardBetween(String value1, String value2) {
            addCriterion("specificStandard between", value1, value2, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andSpecificstandardNotBetween(String value1, String value2) {
            addCriterion("specificStandard not between", value1, value2, "specificstandard");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(Integer value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(Integer value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(Integer value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(Integer value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(Integer value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<Integer> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<Integer> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(Integer value1, Integer value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(Integer value1, Integer value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
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