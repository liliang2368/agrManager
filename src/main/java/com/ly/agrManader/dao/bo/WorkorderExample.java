package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class WorkorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkorderExample() {
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

        public Criteria andWorkorderidIsNull() {
            addCriterion("workOrderId is null");
            return (Criteria) this;
        }

        public Criteria andWorkorderidIsNotNull() {
            addCriterion("workOrderId is not null");
            return (Criteria) this;
        }

        public Criteria andWorkorderidEqualTo(Integer value) {
            addCriterion("workOrderId =", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidNotEqualTo(Integer value) {
            addCriterion("workOrderId <>", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidGreaterThan(Integer value) {
            addCriterion("workOrderId >", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workOrderId >=", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidLessThan(Integer value) {
            addCriterion("workOrderId <", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidLessThanOrEqualTo(Integer value) {
            addCriterion("workOrderId <=", value, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidIn(List<Integer> values) {
            addCriterion("workOrderId in", values, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidNotIn(List<Integer> values) {
            addCriterion("workOrderId not in", values, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidBetween(Integer value1, Integer value2) {
            addCriterion("workOrderId between", value1, value2, "workorderid");
            return (Criteria) this;
        }

        public Criteria andWorkorderidNotBetween(Integer value1, Integer value2) {
            addCriterion("workOrderId not between", value1, value2, "workorderid");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionIsNull() {
            addCriterion("problemDescription is null");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionIsNotNull() {
            addCriterion("problemDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionEqualTo(String value) {
            addCriterion("problemDescription =", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotEqualTo(String value) {
            addCriterion("problemDescription <>", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionGreaterThan(String value) {
            addCriterion("problemDescription >", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("problemDescription >=", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionLessThan(String value) {
            addCriterion("problemDescription <", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionLessThanOrEqualTo(String value) {
            addCriterion("problemDescription <=", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionLike(String value) {
            addCriterion("problemDescription like", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotLike(String value) {
            addCriterion("problemDescription not like", value, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionIn(List<String> values) {
            addCriterion("problemDescription in", values, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotIn(List<String> values) {
            addCriterion("problemDescription not in", values, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionBetween(String value1, String value2) {
            addCriterion("problemDescription between", value1, value2, "problemdescription");
            return (Criteria) this;
        }

        public Criteria andProblemdescriptionNotBetween(String value1, String value2) {
            addCriterion("problemDescription not between", value1, value2, "problemdescription");
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

        public Criteria andReturnvisitIsNull() {
            addCriterion("returnVisit is null");
            return (Criteria) this;
        }

        public Criteria andReturnvisitIsNotNull() {
            addCriterion("returnVisit is not null");
            return (Criteria) this;
        }

        public Criteria andReturnvisitEqualTo(String value) {
            addCriterion("returnVisit =", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitNotEqualTo(String value) {
            addCriterion("returnVisit <>", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitGreaterThan(String value) {
            addCriterion("returnVisit >", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitGreaterThanOrEqualTo(String value) {
            addCriterion("returnVisit >=", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitLessThan(String value) {
            addCriterion("returnVisit <", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitLessThanOrEqualTo(String value) {
            addCriterion("returnVisit <=", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitLike(String value) {
            addCriterion("returnVisit like", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitNotLike(String value) {
            addCriterion("returnVisit not like", value, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitIn(List<String> values) {
            addCriterion("returnVisit in", values, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitNotIn(List<String> values) {
            addCriterion("returnVisit not in", values, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitBetween(String value1, String value2) {
            addCriterion("returnVisit between", value1, value2, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andReturnvisitNotBetween(String value1, String value2) {
            addCriterion("returnVisit not between", value1, value2, "returnvisit");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
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