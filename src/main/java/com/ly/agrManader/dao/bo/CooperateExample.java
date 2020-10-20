package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CooperateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CooperateExample() {
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

        public Criteria andCooperativeidIsNull() {
            addCriterion("cooperativeId is null");
            return (Criteria) this;
        }

        public Criteria andCooperativeidIsNotNull() {
            addCriterion("cooperativeId is not null");
            return (Criteria) this;
        }

        public Criteria andCooperativeidEqualTo(Integer value) {
            addCriterion("cooperativeId =", value, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidNotEqualTo(Integer value) {
            addCriterion("cooperativeId <>", value, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidGreaterThan(Integer value) {
            addCriterion("cooperativeId >", value, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cooperativeId >=", value, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidLessThan(Integer value) {
            addCriterion("cooperativeId <", value, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidLessThanOrEqualTo(Integer value) {
            addCriterion("cooperativeId <=", value, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidIn(List<Integer> values) {
            addCriterion("cooperativeId in", values, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidNotIn(List<Integer> values) {
            addCriterion("cooperativeId not in", values, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidBetween(Integer value1, Integer value2) {
            addCriterion("cooperativeId between", value1, value2, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativeidNotBetween(Integer value1, Integer value2) {
            addCriterion("cooperativeId not between", value1, value2, "cooperativeid");
            return (Criteria) this;
        }

        public Criteria andCooperativenameIsNull() {
            addCriterion("cooperativeName is null");
            return (Criteria) this;
        }

        public Criteria andCooperativenameIsNotNull() {
            addCriterion("cooperativeName is not null");
            return (Criteria) this;
        }

        public Criteria andCooperativenameEqualTo(String value) {
            addCriterion("cooperativeName =", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameNotEqualTo(String value) {
            addCriterion("cooperativeName <>", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameGreaterThan(String value) {
            addCriterion("cooperativeName >", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameGreaterThanOrEqualTo(String value) {
            addCriterion("cooperativeName >=", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameLessThan(String value) {
            addCriterion("cooperativeName <", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameLessThanOrEqualTo(String value) {
            addCriterion("cooperativeName <=", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameLike(String value) {
            addCriterion("cooperativeName like", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameNotLike(String value) {
            addCriterion("cooperativeName not like", value, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameIn(List<String> values) {
            addCriterion("cooperativeName in", values, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameNotIn(List<String> values) {
            addCriterion("cooperativeName not in", values, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameBetween(String value1, String value2) {
            addCriterion("cooperativeName between", value1, value2, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andCooperativenameNotBetween(String value1, String value2) {
            addCriterion("cooperativeName not between", value1, value2, "cooperativename");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTimeinIsNull() {
            addCriterion("timeIn is null");
            return (Criteria) this;
        }

        public Criteria andTimeinIsNotNull() {
            addCriterion("timeIn is not null");
            return (Criteria) this;
        }

        public Criteria andTimeinEqualTo(Date value) {
            addCriterion("timeIn =", value, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinNotEqualTo(Date value) {
            addCriterion("timeIn <>", value, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinGreaterThan(Date value) {
            addCriterion("timeIn >", value, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinGreaterThanOrEqualTo(Date value) {
            addCriterion("timeIn >=", value, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinLessThan(Date value) {
            addCriterion("timeIn <", value, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinLessThanOrEqualTo(Date value) {
            addCriterion("timeIn <=", value, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinIn(List<Date> values) {
            addCriterion("timeIn in", values, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinNotIn(List<Date> values) {
            addCriterion("timeIn not in", values, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinBetween(Date value1, Date value2) {
            addCriterion("timeIn between", value1, value2, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeinNotBetween(Date value1, Date value2) {
            addCriterion("timeIn not between", value1, value2, "timein");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNull() {
            addCriterion("timeOut is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNotNull() {
            addCriterion("timeOut is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutEqualTo(Date value) {
            addCriterion("timeOut =", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotEqualTo(Date value) {
            addCriterion("timeOut <>", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThan(Date value) {
            addCriterion("timeOut >", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThanOrEqualTo(Date value) {
            addCriterion("timeOut >=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThan(Date value) {
            addCriterion("timeOut <", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThanOrEqualTo(Date value) {
            addCriterion("timeOut <=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutIn(List<Date> values) {
            addCriterion("timeOut in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotIn(List<Date> values) {
            addCriterion("timeOut not in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutBetween(Date value1, Date value2) {
            addCriterion("timeOut between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotBetween(Date value1, Date value2) {
            addCriterion("timeOut not between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andSarketstaffIsNull() {
            addCriterion("sarketStaff is null");
            return (Criteria) this;
        }

        public Criteria andSarketstaffIsNotNull() {
            addCriterion("sarketStaff is not null");
            return (Criteria) this;
        }

        public Criteria andSarketstaffEqualTo(String value) {
            addCriterion("sarketStaff =", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffNotEqualTo(String value) {
            addCriterion("sarketStaff <>", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffGreaterThan(String value) {
            addCriterion("sarketStaff >", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffGreaterThanOrEqualTo(String value) {
            addCriterion("sarketStaff >=", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffLessThan(String value) {
            addCriterion("sarketStaff <", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffLessThanOrEqualTo(String value) {
            addCriterion("sarketStaff <=", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffLike(String value) {
            addCriterion("sarketStaff like", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffNotLike(String value) {
            addCriterion("sarketStaff not like", value, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffIn(List<String> values) {
            addCriterion("sarketStaff in", values, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffNotIn(List<String> values) {
            addCriterion("sarketStaff not in", values, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffBetween(String value1, String value2) {
            addCriterion("sarketStaff between", value1, value2, "sarketstaff");
            return (Criteria) this;
        }

        public Criteria andSarketstaffNotBetween(String value1, String value2) {
            addCriterion("sarketStaff not between", value1, value2, "sarketstaff");
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

        public Criteria andReputationIsNull() {
            addCriterion("reputation is null");
            return (Criteria) this;
        }

        public Criteria andReputationIsNotNull() {
            addCriterion("reputation is not null");
            return (Criteria) this;
        }

        public Criteria andReputationEqualTo(Integer value) {
            addCriterion("reputation =", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotEqualTo(Integer value) {
            addCriterion("reputation <>", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThan(Integer value) {
            addCriterion("reputation >", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("reputation >=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThan(Integer value) {
            addCriterion("reputation <", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationLessThanOrEqualTo(Integer value) {
            addCriterion("reputation <=", value, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationIn(List<Integer> values) {
            addCriterion("reputation in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotIn(List<Integer> values) {
            addCriterion("reputation not in", values, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationBetween(Integer value1, Integer value2) {
            addCriterion("reputation between", value1, value2, "reputation");
            return (Criteria) this;
        }

        public Criteria andReputationNotBetween(Integer value1, Integer value2) {
            addCriterion("reputation not between", value1, value2, "reputation");
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