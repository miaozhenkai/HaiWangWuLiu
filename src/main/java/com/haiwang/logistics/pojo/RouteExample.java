package com.haiwang.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class RouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RouteExample() {
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

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Integer value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Integer value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Integer value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Integer value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Integer> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Integer> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1IsNull() {
            addCriterion("prvoinces1 is null");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1IsNotNull() {
            addCriterion("prvoinces1 is not null");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1EqualTo(String value) {
            addCriterion("prvoinces1 =", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1NotEqualTo(String value) {
            addCriterion("prvoinces1 <>", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1GreaterThan(String value) {
            addCriterion("prvoinces1 >", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1GreaterThanOrEqualTo(String value) {
            addCriterion("prvoinces1 >=", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1LessThan(String value) {
            addCriterion("prvoinces1 <", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1LessThanOrEqualTo(String value) {
            addCriterion("prvoinces1 <=", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1Like(String value) {
            addCriterion("prvoinces1 like", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1NotLike(String value) {
            addCriterion("prvoinces1 not like", value, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1In(List<String> values) {
            addCriterion("prvoinces1 in", values, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1NotIn(List<String> values) {
            addCriterion("prvoinces1 not in", values, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1Between(String value1, String value2) {
            addCriterion("prvoinces1 between", value1, value2, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces1NotBetween(String value1, String value2) {
            addCriterion("prvoinces1 not between", value1, value2, "prvoinces1");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2IsNull() {
            addCriterion("prvoinces2 is null");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2IsNotNull() {
            addCriterion("prvoinces2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2EqualTo(String value) {
            addCriterion("prvoinces2 =", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2NotEqualTo(String value) {
            addCriterion("prvoinces2 <>", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2GreaterThan(String value) {
            addCriterion("prvoinces2 >", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2GreaterThanOrEqualTo(String value) {
            addCriterion("prvoinces2 >=", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2LessThan(String value) {
            addCriterion("prvoinces2 <", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2LessThanOrEqualTo(String value) {
            addCriterion("prvoinces2 <=", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2Like(String value) {
            addCriterion("prvoinces2 like", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2NotLike(String value) {
            addCriterion("prvoinces2 not like", value, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2In(List<String> values) {
            addCriterion("prvoinces2 in", values, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2NotIn(List<String> values) {
            addCriterion("prvoinces2 not in", values, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2Between(String value1, String value2) {
            addCriterion("prvoinces2 between", value1, value2, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andPrvoinces2NotBetween(String value1, String value2) {
            addCriterion("prvoinces2 not between", value1, value2, "prvoinces2");
            return (Criteria) this;
        }

        public Criteria andRoutePriceIsNull() {
            addCriterion("route_price is null");
            return (Criteria) this;
        }

        public Criteria andRoutePriceIsNotNull() {
            addCriterion("route_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoutePriceEqualTo(Double value) {
            addCriterion("route_price =", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceNotEqualTo(Double value) {
            addCriterion("route_price <>", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceGreaterThan(Double value) {
            addCriterion("route_price >", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("route_price >=", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceLessThan(Double value) {
            addCriterion("route_price <", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceLessThanOrEqualTo(Double value) {
            addCriterion("route_price <=", value, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceIn(List<Double> values) {
            addCriterion("route_price in", values, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceNotIn(List<Double> values) {
            addCriterion("route_price not in", values, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceBetween(Double value1, Double value2) {
            addCriterion("route_price between", value1, value2, "routePrice");
            return (Criteria) this;
        }

        public Criteria andRoutePriceNotBetween(Double value1, Double value2) {
            addCriterion("route_price not between", value1, value2, "routePrice");
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