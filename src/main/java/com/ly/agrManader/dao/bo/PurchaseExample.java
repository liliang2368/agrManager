package com.ly.agrManader.dao.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseExample() {
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

        public Criteria andPurchaseidIsNull() {
            addCriterion("purchaseId is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("purchaseId is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Integer value) {
            addCriterion("purchaseId =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Integer value) {
            addCriterion("purchaseId <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Integer value) {
            addCriterion("purchaseId >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseId >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Integer value) {
            addCriterion("purchaseId <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseId <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Integer> values) {
            addCriterion("purchaseId in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Integer> values) {
            addCriterion("purchaseId not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseId between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseId not between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchasenameIsNull() {
            addCriterion("purchaseName is null");
            return (Criteria) this;
        }

        public Criteria andPurchasenameIsNotNull() {
            addCriterion("purchaseName is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasenameEqualTo(String value) {
            addCriterion("purchaseName =", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameNotEqualTo(String value) {
            addCriterion("purchaseName <>", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameGreaterThan(String value) {
            addCriterion("purchaseName >", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseName >=", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameLessThan(String value) {
            addCriterion("purchaseName <", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameLessThanOrEqualTo(String value) {
            addCriterion("purchaseName <=", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameLike(String value) {
            addCriterion("purchaseName like", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameNotLike(String value) {
            addCriterion("purchaseName not like", value, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameIn(List<String> values) {
            addCriterion("purchaseName in", values, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameNotIn(List<String> values) {
            addCriterion("purchaseName not in", values, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameBetween(String value1, String value2) {
            addCriterion("purchaseName between", value1, value2, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasenameNotBetween(String value1, String value2) {
            addCriterion("purchaseName not between", value1, value2, "purchasename");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeIsNull() {
            addCriterion("purchaseCode is null");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeIsNotNull() {
            addCriterion("purchaseCode is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeEqualTo(String value) {
            addCriterion("purchaseCode =", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeNotEqualTo(String value) {
            addCriterion("purchaseCode <>", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeGreaterThan(String value) {
            addCriterion("purchaseCode >", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeGreaterThanOrEqualTo(String value) {
            addCriterion("purchaseCode >=", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeLessThan(String value) {
            addCriterion("purchaseCode <", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeLessThanOrEqualTo(String value) {
            addCriterion("purchaseCode <=", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeLike(String value) {
            addCriterion("purchaseCode like", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeNotLike(String value) {
            addCriterion("purchaseCode not like", value, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeIn(List<String> values) {
            addCriterion("purchaseCode in", values, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeNotIn(List<String> values) {
            addCriterion("purchaseCode not in", values, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeBetween(String value1, String value2) {
            addCriterion("purchaseCode between", value1, value2, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasecodeNotBetween(String value1, String value2) {
            addCriterion("purchaseCode not between", value1, value2, "purchasecode");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIsNull() {
            addCriterion("purchaseNum is null");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIsNotNull() {
            addCriterion("purchaseNum is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasenumEqualTo(Integer value) {
            addCriterion("purchaseNum =", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotEqualTo(Integer value) {
            addCriterion("purchaseNum <>", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumGreaterThan(Integer value) {
            addCriterion("purchaseNum >", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseNum >=", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumLessThan(Integer value) {
            addCriterion("purchaseNum <", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseNum <=", value, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumIn(List<Integer> values) {
            addCriterion("purchaseNum in", values, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotIn(List<Integer> values) {
            addCriterion("purchaseNum not in", values, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumBetween(Integer value1, Integer value2) {
            addCriterion("purchaseNum between", value1, value2, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andPurchasenumNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseNum not between", value1, value2, "purchasenum");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("supplierId is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("supplierId is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("supplierId =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("supplierId <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("supplierId >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplierId >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("supplierId <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("supplierId <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("supplierId in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("supplierId not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("supplierId between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("supplierId not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeIsNull() {
            addCriterion("purchaseTime is null");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeIsNotNull() {
            addCriterion("purchaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeEqualTo(Date value) {
            addCriterion("purchaseTime =", value, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeNotEqualTo(Date value) {
            addCriterion("purchaseTime <>", value, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeGreaterThan(Date value) {
            addCriterion("purchaseTime >", value, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchaseTime >=", value, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeLessThan(Date value) {
            addCriterion("purchaseTime <", value, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeLessThanOrEqualTo(Date value) {
            addCriterion("purchaseTime <=", value, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeIn(List<Date> values) {
            addCriterion("purchaseTime in", values, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeNotIn(List<Date> values) {
            addCriterion("purchaseTime not in", values, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeBetween(Date value1, Date value2) {
            addCriterion("purchaseTime between", value1, value2, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andPurchasetimeNotBetween(Date value1, Date value2) {
            addCriterion("purchaseTime not between", value1, value2, "purchasetime");
            return (Criteria) this;
        }

        public Criteria andContractpictureIsNull() {
            addCriterion("contractPicture is null");
            return (Criteria) this;
        }

        public Criteria andContractpictureIsNotNull() {
            addCriterion("contractPicture is not null");
            return (Criteria) this;
        }

        public Criteria andContractpictureEqualTo(String value) {
            addCriterion("contractPicture =", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureNotEqualTo(String value) {
            addCriterion("contractPicture <>", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureGreaterThan(String value) {
            addCriterion("contractPicture >", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureGreaterThanOrEqualTo(String value) {
            addCriterion("contractPicture >=", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureLessThan(String value) {
            addCriterion("contractPicture <", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureLessThanOrEqualTo(String value) {
            addCriterion("contractPicture <=", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureLike(String value) {
            addCriterion("contractPicture like", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureNotLike(String value) {
            addCriterion("contractPicture not like", value, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureIn(List<String> values) {
            addCriterion("contractPicture in", values, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureNotIn(List<String> values) {
            addCriterion("contractPicture not in", values, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureBetween(String value1, String value2) {
            addCriterion("contractPicture between", value1, value2, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andContractpictureNotBetween(String value1, String value2) {
            addCriterion("contractPicture not between", value1, value2, "contractpicture");
            return (Criteria) this;
        }

        public Criteria andQuaitystateIsNull() {
            addCriterion("quaitystate is null");
            return (Criteria) this;
        }

        public Criteria andQuaitystateIsNotNull() {
            addCriterion("quaitystate is not null");
            return (Criteria) this;
        }

        public Criteria andQuaitystateEqualTo(String value) {
            addCriterion("quaitystate =", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateNotEqualTo(String value) {
            addCriterion("quaitystate <>", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateGreaterThan(String value) {
            addCriterion("quaitystate >", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateGreaterThanOrEqualTo(String value) {
            addCriterion("quaitystate >=", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateLessThan(String value) {
            addCriterion("quaitystate <", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateLessThanOrEqualTo(String value) {
            addCriterion("quaitystate <=", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateLike(String value) {
            addCriterion("quaitystate like", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateNotLike(String value) {
            addCriterion("quaitystate not like", value, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateIn(List<String> values) {
            addCriterion("quaitystate in", values, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateNotIn(List<String> values) {
            addCriterion("quaitystate not in", values, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateBetween(String value1, String value2) {
            addCriterion("quaitystate between", value1, value2, "quaitystate");
            return (Criteria) this;
        }

        public Criteria andQuaitystateNotBetween(String value1, String value2) {
            addCriterion("quaitystate not between", value1, value2, "quaitystate");
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