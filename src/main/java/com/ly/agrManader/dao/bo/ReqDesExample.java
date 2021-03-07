package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.List;

public class ReqDesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReqDesExample() {
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

        public Criteria andDesIdIsNull() {
            addCriterion("des_id is null");
            return (Criteria) this;
        }

        public Criteria andDesIdIsNotNull() {
            addCriterion("des_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesIdEqualTo(Integer value) {
            addCriterion("des_id =", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdNotEqualTo(Integer value) {
            addCriterion("des_id <>", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdGreaterThan(Integer value) {
            addCriterion("des_id >", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_id >=", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdLessThan(Integer value) {
            addCriterion("des_id <", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_id <=", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdIn(List<Integer> values) {
            addCriterion("des_id in", values, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdNotIn(List<Integer> values) {
            addCriterion("des_id not in", values, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdBetween(Integer value1, Integer value2) {
            addCriterion("des_id between", value1, value2, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_id not between", value1, value2, "desId");
            return (Criteria) this;
        }

        public Criteria andReqContentIsNull() {
            addCriterion("req_content is null");
            return (Criteria) this;
        }

        public Criteria andReqContentIsNotNull() {
            addCriterion("req_content is not null");
            return (Criteria) this;
        }

        public Criteria andReqContentEqualTo(String value) {
            addCriterion("req_content =", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotEqualTo(String value) {
            addCriterion("req_content <>", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentGreaterThan(String value) {
            addCriterion("req_content >", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentGreaterThanOrEqualTo(String value) {
            addCriterion("req_content >=", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentLessThan(String value) {
            addCriterion("req_content <", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentLessThanOrEqualTo(String value) {
            addCriterion("req_content <=", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentLike(String value) {
            addCriterion("req_content like", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotLike(String value) {
            addCriterion("req_content not like", value, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentIn(List<String> values) {
            addCriterion("req_content in", values, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotIn(List<String> values) {
            addCriterion("req_content not in", values, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentBetween(String value1, String value2) {
            addCriterion("req_content between", value1, value2, "reqContent");
            return (Criteria) this;
        }

        public Criteria andReqContentNotBetween(String value1, String value2) {
            addCriterion("req_content not between", value1, value2, "reqContent");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDepReqOpIsNull() {
            addCriterion("dep_req_op is null");
            return (Criteria) this;
        }

        public Criteria andDepReqOpIsNotNull() {
            addCriterion("dep_req_op is not null");
            return (Criteria) this;
        }

        public Criteria andDepReqOpEqualTo(String value) {
            addCriterion("dep_req_op =", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpNotEqualTo(String value) {
            addCriterion("dep_req_op <>", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpGreaterThan(String value) {
            addCriterion("dep_req_op >", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpGreaterThanOrEqualTo(String value) {
            addCriterion("dep_req_op >=", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpLessThan(String value) {
            addCriterion("dep_req_op <", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpLessThanOrEqualTo(String value) {
            addCriterion("dep_req_op <=", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpLike(String value) {
            addCriterion("dep_req_op like", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpNotLike(String value) {
            addCriterion("dep_req_op not like", value, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpIn(List<String> values) {
            addCriterion("dep_req_op in", values, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpNotIn(List<String> values) {
            addCriterion("dep_req_op not in", values, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpBetween(String value1, String value2) {
            addCriterion("dep_req_op between", value1, value2, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andDepReqOpNotBetween(String value1, String value2) {
            addCriterion("dep_req_op not between", value1, value2, "depReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpIsNull() {
            addCriterion("be_req_op is null");
            return (Criteria) this;
        }

        public Criteria andBeReqOpIsNotNull() {
            addCriterion("be_req_op is not null");
            return (Criteria) this;
        }

        public Criteria andBeReqOpEqualTo(String value) {
            addCriterion("be_req_op =", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpNotEqualTo(String value) {
            addCriterion("be_req_op <>", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpGreaterThan(String value) {
            addCriterion("be_req_op >", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpGreaterThanOrEqualTo(String value) {
            addCriterion("be_req_op >=", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpLessThan(String value) {
            addCriterion("be_req_op <", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpLessThanOrEqualTo(String value) {
            addCriterion("be_req_op <=", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpLike(String value) {
            addCriterion("be_req_op like", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpNotLike(String value) {
            addCriterion("be_req_op not like", value, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpIn(List<String> values) {
            addCriterion("be_req_op in", values, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpNotIn(List<String> values) {
            addCriterion("be_req_op not in", values, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpBetween(String value1, String value2) {
            addCriterion("be_req_op between", value1, value2, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andBeReqOpNotBetween(String value1, String value2) {
            addCriterion("be_req_op not between", value1, value2, "beReqOp");
            return (Criteria) this;
        }

        public Criteria andReqStateIsNull() {
            addCriterion("req_state is null");
            return (Criteria) this;
        }

        public Criteria andReqStateIsNotNull() {
            addCriterion("req_state is not null");
            return (Criteria) this;
        }

        public Criteria andReqStateEqualTo(Integer value) {
            addCriterion("req_state =", value, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateNotEqualTo(Integer value) {
            addCriterion("req_state <>", value, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateGreaterThan(Integer value) {
            addCriterion("req_state >", value, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_state >=", value, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateLessThan(Integer value) {
            addCriterion("req_state <", value, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateLessThanOrEqualTo(Integer value) {
            addCriterion("req_state <=", value, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateIn(List<Integer> values) {
            addCriterion("req_state in", values, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateNotIn(List<Integer> values) {
            addCriterion("req_state not in", values, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateBetween(Integer value1, Integer value2) {
            addCriterion("req_state between", value1, value2, "reqState");
            return (Criteria) this;
        }

        public Criteria andReqStateNotBetween(Integer value1, Integer value2) {
            addCriterion("req_state not between", value1, value2, "reqState");
            return (Criteria) this;
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