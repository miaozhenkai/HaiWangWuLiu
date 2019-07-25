package com.haiwang.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaybillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaybillExample() {
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

        public Criteria andWaybillIdIsNull() {
            addCriterion("waybill_id is null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIsNotNull() {
            addCriterion("waybill_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillIdEqualTo(String value) {
            addCriterion("waybill_id =", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotEqualTo(String value) {
            addCriterion("waybill_id <>", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThan(String value) {
            addCriterion("waybill_id >", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_id >=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThan(String value) {
            addCriterion("waybill_id <", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLessThanOrEqualTo(String value) {
            addCriterion("waybill_id <=", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdLike(String value) {
            addCriterion("waybill_id like", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotLike(String value) {
            addCriterion("waybill_id not like", value, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdIn(List<String> values) {
            addCriterion("waybill_id in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotIn(List<String> values) {
            addCriterion("waybill_id not in", values, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdBetween(String value1, String value2) {
            addCriterion("waybill_id between", value1, value2, "waybillId");
            return (Criteria) this;
        }

        public Criteria andWaybillIdNotBetween(String value1, String value2) {
            addCriterion("waybill_id not between", value1, value2, "waybillId");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIsNull() {
            addCriterion("sender_phone is null");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIsNotNull() {
            addCriterion("sender_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneEqualTo(String value) {
            addCriterion("sender_phone =", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotEqualTo(String value) {
            addCriterion("sender_phone <>", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneGreaterThan(String value) {
            addCriterion("sender_phone >", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sender_phone >=", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLessThan(String value) {
            addCriterion("sender_phone <", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLessThanOrEqualTo(String value) {
            addCriterion("sender_phone <=", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLike(String value) {
            addCriterion("sender_phone like", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotLike(String value) {
            addCriterion("sender_phone not like", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIn(List<String> values) {
            addCriterion("sender_phone in", values, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotIn(List<String> values) {
            addCriterion("sender_phone not in", values, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneBetween(String value1, String value2) {
            addCriterion("sender_phone between", value1, value2, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotBetween(String value1, String value2) {
            addCriterion("sender_phone not between", value1, value2, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesIsNull() {
            addCriterion("sender_provinces is null");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesIsNotNull() {
            addCriterion("sender_provinces is not null");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesEqualTo(String value) {
            addCriterion("sender_provinces =", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesNotEqualTo(String value) {
            addCriterion("sender_provinces <>", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesGreaterThan(String value) {
            addCriterion("sender_provinces >", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesGreaterThanOrEqualTo(String value) {
            addCriterion("sender_provinces >=", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesLessThan(String value) {
            addCriterion("sender_provinces <", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesLessThanOrEqualTo(String value) {
            addCriterion("sender_provinces <=", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesLike(String value) {
            addCriterion("sender_provinces like", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesNotLike(String value) {
            addCriterion("sender_provinces not like", value, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesIn(List<String> values) {
            addCriterion("sender_provinces in", values, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesNotIn(List<String> values) {
            addCriterion("sender_provinces not in", values, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesBetween(String value1, String value2) {
            addCriterion("sender_provinces between", value1, value2, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderProvincesNotBetween(String value1, String value2) {
            addCriterion("sender_provinces not between", value1, value2, "senderProvinces");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNull() {
            addCriterion("sender_address is null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNotNull() {
            addCriterion("sender_address is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressEqualTo(String value) {
            addCriterion("sender_address =", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotEqualTo(String value) {
            addCriterion("sender_address <>", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThan(String value) {
            addCriterion("sender_address >", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sender_address >=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThan(String value) {
            addCriterion("sender_address <", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("sender_address <=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLike(String value) {
            addCriterion("sender_address like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotLike(String value) {
            addCriterion("sender_address not like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIn(List<String> values) {
            addCriterion("sender_address in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotIn(List<String> values) {
            addCriterion("sender_address not in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressBetween(String value1, String value2) {
            addCriterion("sender_address between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotBetween(String value1, String value2) {
            addCriterion("sender_address not between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNull() {
            addCriterion("receiver_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIsNotNull() {
            addCriterion("receiver_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverNameEqualTo(String value) {
            addCriterion("receiver_name =", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotEqualTo(String value) {
            addCriterion("receiver_name <>", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThan(String value) {
            addCriterion("receiver_name >", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_name >=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThan(String value) {
            addCriterion("receiver_name <", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLessThanOrEqualTo(String value) {
            addCriterion("receiver_name <=", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameLike(String value) {
            addCriterion("receiver_name like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotLike(String value) {
            addCriterion("receiver_name not like", value, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameIn(List<String> values) {
            addCriterion("receiver_name in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotIn(List<String> values) {
            addCriterion("receiver_name not in", values, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameBetween(String value1, String value2) {
            addCriterion("receiver_name between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverNameNotBetween(String value1, String value2) {
            addCriterion("receiver_name not between", value1, value2, "receiverName");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesIsNull() {
            addCriterion("receiver_provinces is null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesIsNotNull() {
            addCriterion("receiver_provinces is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesEqualTo(String value) {
            addCriterion("receiver_provinces =", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesNotEqualTo(String value) {
            addCriterion("receiver_provinces <>", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesGreaterThan(String value) {
            addCriterion("receiver_provinces >", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_provinces >=", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesLessThan(String value) {
            addCriterion("receiver_provinces <", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesLessThanOrEqualTo(String value) {
            addCriterion("receiver_provinces <=", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesLike(String value) {
            addCriterion("receiver_provinces like", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesNotLike(String value) {
            addCriterion("receiver_provinces not like", value, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesIn(List<String> values) {
            addCriterion("receiver_provinces in", values, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesNotIn(List<String> values) {
            addCriterion("receiver_provinces not in", values, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesBetween(String value1, String value2) {
            addCriterion("receiver_provinces between", value1, value2, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverProvincesNotBetween(String value1, String value2) {
            addCriterion("receiver_provinces not between", value1, value2, "receiverProvinces");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressLike(String value) {
            addCriterion("receiver_address like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverAddressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiverAddress");
            return (Criteria) this;
        }

        public Criteria andWaybillStateIsNull() {
            addCriterion("waybill_state is null");
            return (Criteria) this;
        }

        public Criteria andWaybillStateIsNotNull() {
            addCriterion("waybill_state is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillStateEqualTo(String value) {
            addCriterion("waybill_state =", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateNotEqualTo(String value) {
            addCriterion("waybill_state <>", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateGreaterThan(String value) {
            addCriterion("waybill_state >", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_state >=", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateLessThan(String value) {
            addCriterion("waybill_state <", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateLessThanOrEqualTo(String value) {
            addCriterion("waybill_state <=", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateLike(String value) {
            addCriterion("waybill_state like", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateNotLike(String value) {
            addCriterion("waybill_state not like", value, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateIn(List<String> values) {
            addCriterion("waybill_state in", values, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateNotIn(List<String> values) {
            addCriterion("waybill_state not in", values, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateBetween(String value1, String value2) {
            addCriterion("waybill_state between", value1, value2, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillStateNotBetween(String value1, String value2) {
            addCriterion("waybill_state not between", value1, value2, "waybillState");
            return (Criteria) this;
        }

        public Criteria andWaybillDateIsNull() {
            addCriterion("waybill_date is null");
            return (Criteria) this;
        }

        public Criteria andWaybillDateIsNotNull() {
            addCriterion("waybill_date is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillDateEqualTo(Date value) {
            addCriterion("waybill_date =", value, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateNotEqualTo(Date value) {
            addCriterion("waybill_date <>", value, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateGreaterThan(Date value) {
            addCriterion("waybill_date >", value, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateGreaterThanOrEqualTo(Date value) {
            addCriterion("waybill_date >=", value, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateLessThan(Date value) {
            addCriterion("waybill_date <", value, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateLessThanOrEqualTo(Date value) {
            addCriterion("waybill_date <=", value, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateIn(List<Date> values) {
            addCriterion("waybill_date in", values, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateNotIn(List<Date> values) {
            addCriterion("waybill_date not in", values, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateBetween(Date value1, Date value2) {
            addCriterion("waybill_date between", value1, value2, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillDateNotBetween(Date value1, Date value2) {
            addCriterion("waybill_date not between", value1, value2, "waybillDate");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceIsNull() {
            addCriterion("waybill_price is null");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceIsNotNull() {
            addCriterion("waybill_price is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceEqualTo(Double value) {
            addCriterion("waybill_price =", value, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceNotEqualTo(Double value) {
            addCriterion("waybill_price <>", value, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceGreaterThan(Double value) {
            addCriterion("waybill_price >", value, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("waybill_price >=", value, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceLessThan(Double value) {
            addCriterion("waybill_price <", value, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceLessThanOrEqualTo(Double value) {
            addCriterion("waybill_price <=", value, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceIn(List<Double> values) {
            addCriterion("waybill_price in", values, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceNotIn(List<Double> values) {
            addCriterion("waybill_price not in", values, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceBetween(Double value1, Double value2) {
            addCriterion("waybill_price between", value1, value2, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPriceNotBetween(Double value1, Double value2) {
            addCriterion("waybill_price not between", value1, value2, "waybillPrice");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentIsNull() {
            addCriterion("waybill_payment is null");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentIsNotNull() {
            addCriterion("waybill_payment is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentEqualTo(String value) {
            addCriterion("waybill_payment =", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentNotEqualTo(String value) {
            addCriterion("waybill_payment <>", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentGreaterThan(String value) {
            addCriterion("waybill_payment >", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("waybill_payment >=", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentLessThan(String value) {
            addCriterion("waybill_payment <", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentLessThanOrEqualTo(String value) {
            addCriterion("waybill_payment <=", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentLike(String value) {
            addCriterion("waybill_payment like", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentNotLike(String value) {
            addCriterion("waybill_payment not like", value, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentIn(List<String> values) {
            addCriterion("waybill_payment in", values, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentNotIn(List<String> values) {
            addCriterion("waybill_payment not in", values, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentBetween(String value1, String value2) {
            addCriterion("waybill_payment between", value1, value2, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andWaybillPaymentNotBetween(String value1, String value2) {
            addCriterion("waybill_payment not between", value1, value2, "waybillPayment");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("Item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("Item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("Item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("Item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("Item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("Item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("Item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("Item_type like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("Item_type not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("Item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("Item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("Item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("Item_type not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemWeightIsNull() {
            addCriterion("Item_weight is null");
            return (Criteria) this;
        }

        public Criteria andItemWeightIsNotNull() {
            addCriterion("Item_weight is not null");
            return (Criteria) this;
        }

        public Criteria andItemWeightEqualTo(Double value) {
            addCriterion("Item_weight =", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotEqualTo(Double value) {
            addCriterion("Item_weight <>", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightGreaterThan(Double value) {
            addCriterion("Item_weight >", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("Item_weight >=", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightLessThan(Double value) {
            addCriterion("Item_weight <", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightLessThanOrEqualTo(Double value) {
            addCriterion("Item_weight <=", value, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightIn(List<Double> values) {
            addCriterion("Item_weight in", values, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotIn(List<Double> values) {
            addCriterion("Item_weight not in", values, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightBetween(Double value1, Double value2) {
            addCriterion("Item_weight between", value1, value2, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andItemWeightNotBetween(Double value1, Double value2) {
            addCriterion("Item_weight not between", value1, value2, "itemWeight");
            return (Criteria) this;
        }

        public Criteria andStaff1IdIsNull() {
            addCriterion("staff1_id is null");
            return (Criteria) this;
        }

        public Criteria andStaff1IdIsNotNull() {
            addCriterion("staff1_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaff1IdEqualTo(Integer value) {
            addCriterion("staff1_id =", value, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdNotEqualTo(Integer value) {
            addCriterion("staff1_id <>", value, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdGreaterThan(Integer value) {
            addCriterion("staff1_id >", value, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff1_id >=", value, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdLessThan(Integer value) {
            addCriterion("staff1_id <", value, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdLessThanOrEqualTo(Integer value) {
            addCriterion("staff1_id <=", value, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdIn(List<Integer> values) {
            addCriterion("staff1_id in", values, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdNotIn(List<Integer> values) {
            addCriterion("staff1_id not in", values, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdBetween(Integer value1, Integer value2) {
            addCriterion("staff1_id between", value1, value2, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff1_id not between", value1, value2, "staff1Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdIsNull() {
            addCriterion("staff2_id is null");
            return (Criteria) this;
        }

        public Criteria andStaff2IdIsNotNull() {
            addCriterion("staff2_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaff2IdEqualTo(Integer value) {
            addCriterion("staff2_id =", value, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdNotEqualTo(Integer value) {
            addCriterion("staff2_id <>", value, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdGreaterThan(Integer value) {
            addCriterion("staff2_id >", value, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff2_id >=", value, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdLessThan(Integer value) {
            addCriterion("staff2_id <", value, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdLessThanOrEqualTo(Integer value) {
            addCriterion("staff2_id <=", value, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdIn(List<Integer> values) {
            addCriterion("staff2_id in", values, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdNotIn(List<Integer> values) {
            addCriterion("staff2_id not in", values, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdBetween(Integer value1, Integer value2) {
            addCriterion("staff2_id between", value1, value2, "staff2Id");
            return (Criteria) this;
        }

        public Criteria andStaff2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff2_id not between", value1, value2, "staff2Id");
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