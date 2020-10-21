package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractorderExample() {
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

        public Criteria andExamineIsNull() {
            addCriterion("examine is null");
            return (Criteria) this;
        }

        public Criteria andExamineIsNotNull() {
            addCriterion("examine is not null");
            return (Criteria) this;
        }

        public Criteria andExamineEqualTo(Integer value) {
            addCriterion("examine =", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotEqualTo(Integer value) {
            addCriterion("examine <>", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThan(Integer value) {
            addCriterion("examine >", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineGreaterThanOrEqualTo(Integer value) {
            addCriterion("examine >=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThan(Integer value) {
            addCriterion("examine <", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineLessThanOrEqualTo(Integer value) {
            addCriterion("examine <=", value, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineIn(List<Integer> values) {
            addCriterion("examine in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotIn(List<Integer> values) {
            addCriterion("examine not in", values, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineBetween(Integer value1, Integer value2) {
            addCriterion("examine between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andExamineNotBetween(Integer value1, Integer value2) {
            addCriterion("examine not between", value1, value2, "examine");
            return (Criteria) this;
        }

        public Criteria andPreamountIsNull() {
            addCriterion("preAmount is null");
            return (Criteria) this;
        }

        public Criteria andPreamountIsNotNull() {
            addCriterion("preAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPreamountEqualTo(Integer value) {
            addCriterion("preAmount =", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountNotEqualTo(Integer value) {
            addCriterion("preAmount <>", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountGreaterThan(Integer value) {
            addCriterion("preAmount >", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("preAmount >=", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountLessThan(Integer value) {
            addCriterion("preAmount <", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountLessThanOrEqualTo(Integer value) {
            addCriterion("preAmount <=", value, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountIn(List<Integer> values) {
            addCriterion("preAmount in", values, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountNotIn(List<Integer> values) {
            addCriterion("preAmount not in", values, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountBetween(Integer value1, Integer value2) {
            addCriterion("preAmount between", value1, value2, "preamount");
            return (Criteria) this;
        }

        public Criteria andPreamountNotBetween(Integer value1, Integer value2) {
            addCriterion("preAmount not between", value1, value2, "preamount");
            return (Criteria) this;
        }

        public Criteria andFinamountIsNull() {
            addCriterion("finAmount is null");
            return (Criteria) this;
        }

        public Criteria andFinamountIsNotNull() {
            addCriterion("finAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFinamountEqualTo(Integer value) {
            addCriterion("finAmount =", value, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountNotEqualTo(Integer value) {
            addCriterion("finAmount <>", value, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountGreaterThan(Integer value) {
            addCriterion("finAmount >", value, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("finAmount >=", value, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountLessThan(Integer value) {
            addCriterion("finAmount <", value, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountLessThanOrEqualTo(Integer value) {
            addCriterion("finAmount <=", value, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountIn(List<Integer> values) {
            addCriterion("finAmount in", values, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountNotIn(List<Integer> values) {
            addCriterion("finAmount not in", values, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountBetween(Integer value1, Integer value2) {
            addCriterion("finAmount between", value1, value2, "finamount");
            return (Criteria) this;
        }

        public Criteria andFinamountNotBetween(Integer value1, Integer value2) {
            addCriterion("finAmount not between", value1, value2, "finamount");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIsNull() {
            addCriterion("paymentState is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIsNotNull() {
            addCriterion("paymentState is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstateEqualTo(Integer value) {
            addCriterion("paymentState =", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotEqualTo(Integer value) {
            addCriterion("paymentState <>", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateGreaterThan(Integer value) {
            addCriterion("paymentState >", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentState >=", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLessThan(Integer value) {
            addCriterion("paymentState <", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLessThanOrEqualTo(Integer value) {
            addCriterion("paymentState <=", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIn(List<Integer> values) {
            addCriterion("paymentState in", values, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotIn(List<Integer> values) {
            addCriterion("paymentState not in", values, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateBetween(Integer value1, Integer value2) {
            addCriterion("paymentState between", value1, value2, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentState not between", value1, value2, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andQualitystateIsNull() {
            addCriterion("qualityState is null");
            return (Criteria) this;
        }

        public Criteria andQualitystateIsNotNull() {
            addCriterion("qualityState is not null");
            return (Criteria) this;
        }

        public Criteria andQualitystateEqualTo(Integer value) {
            addCriterion("qualityState =", value, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateNotEqualTo(Integer value) {
            addCriterion("qualityState <>", value, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateGreaterThan(Integer value) {
            addCriterion("qualityState >", value, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualityState >=", value, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateLessThan(Integer value) {
            addCriterion("qualityState <", value, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateLessThanOrEqualTo(Integer value) {
            addCriterion("qualityState <=", value, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateIn(List<Integer> values) {
            addCriterion("qualityState in", values, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateNotIn(List<Integer> values) {
            addCriterion("qualityState not in", values, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateBetween(Integer value1, Integer value2) {
            addCriterion("qualityState between", value1, value2, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andQualitystateNotBetween(Integer value1, Integer value2) {
            addCriterion("qualityState not between", value1, value2, "qualitystate");
            return (Criteria) this;
        }

        public Criteria andWarehousIsNull() {
            addCriterion("warehous is null");
            return (Criteria) this;
        }

        public Criteria andWarehousIsNotNull() {
            addCriterion("warehous is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousEqualTo(Integer value) {
            addCriterion("warehous =", value, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousNotEqualTo(Integer value) {
            addCriterion("warehous <>", value, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousGreaterThan(Integer value) {
            addCriterion("warehous >", value, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehous >=", value, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousLessThan(Integer value) {
            addCriterion("warehous <", value, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousLessThanOrEqualTo(Integer value) {
            addCriterion("warehous <=", value, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousIn(List<Integer> values) {
            addCriterion("warehous in", values, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousNotIn(List<Integer> values) {
            addCriterion("warehous not in", values, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousBetween(Integer value1, Integer value2) {
            addCriterion("warehous between", value1, value2, "warehous");
            return (Criteria) this;
        }

        public Criteria andWarehousNotBetween(Integer value1, Integer value2) {
            addCriterion("warehous not between", value1, value2, "warehous");
            return (Criteria) this;
        }

        public Criteria andOrderprocessIsNull() {
            addCriterion("orderProcess is null");
            return (Criteria) this;
        }

        public Criteria andOrderprocessIsNotNull() {
            addCriterion("orderProcess is not null");
            return (Criteria) this;
        }

        public Criteria andOrderprocessEqualTo(Integer value) {
            addCriterion("orderProcess =", value, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessNotEqualTo(Integer value) {
            addCriterion("orderProcess <>", value, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessGreaterThan(Integer value) {
            addCriterion("orderProcess >", value, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderProcess >=", value, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessLessThan(Integer value) {
            addCriterion("orderProcess <", value, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessLessThanOrEqualTo(Integer value) {
            addCriterion("orderProcess <=", value, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessIn(List<Integer> values) {
            addCriterion("orderProcess in", values, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessNotIn(List<Integer> values) {
            addCriterion("orderProcess not in", values, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessBetween(Integer value1, Integer value2) {
            addCriterion("orderProcess between", value1, value2, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andOrderprocessNotBetween(Integer value1, Integer value2) {
            addCriterion("orderProcess not between", value1, value2, "orderprocess");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
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