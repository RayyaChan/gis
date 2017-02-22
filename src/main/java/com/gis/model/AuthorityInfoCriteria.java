
package com.gis.model;

import java.util.ArrayList;
import java.util.List;

public class AuthorityInfoCriteria {
    /**
     * 排序字段
     */
    protected String orderByClause;

    /**
     * 过滤重复数据
     */
    protected boolean distinct;

    /**
     * 查询条件
     */
    protected List<Criteria> oredCriteria;

    /** 
     * 构造查询条件
     */
    public AuthorityInfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /** 
     * 设置排序字段
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /** 
     * 获取排序字段
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /** 
     * 设置过滤重复数据
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /** 
     * 是否过滤重复数据
     */
    public boolean isDistinct() {
        return distinct;
    }

    /** 
     * 获取当前的查询条件实例
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /** 
     * 增加或者的查询条件,用于构建或者查询
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /** 
     * 创建一个新的或者查询条件
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /** 
     * 创建一个查询条件
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /** 
     * 内部构建查询条件对象
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /** 
     * 清除查询条件
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 权限信息authority_info的基本动态SQL对象.
     */
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

        public Criteria andAuthorityIdIsNull() {
            addCriterion("authority_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("authority_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(Integer value) {
            addCriterion("authority_id =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(Integer value) {
            addCriterion("authority_id <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(Integer value) {
            addCriterion("authority_id >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_id >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(Integer value) {
            addCriterion("authority_id <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("authority_id <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<Integer> values) {
            addCriterion("authority_id in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<Integer> values) {
            addCriterion("authority_id not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("authority_id between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_id not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidIsNull() {
            addCriterion("authority_pid is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidIsNotNull() {
            addCriterion("authority_pid is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidEqualTo(Integer value) {
            addCriterion("authority_pid =", value, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidNotEqualTo(Integer value) {
            addCriterion("authority_pid <>", value, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidGreaterThan(Integer value) {
            addCriterion("authority_pid >", value, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_pid >=", value, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidLessThan(Integer value) {
            addCriterion("authority_pid <", value, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidLessThanOrEqualTo(Integer value) {
            addCriterion("authority_pid <=", value, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidIn(List<Integer> values) {
            addCriterion("authority_pid in", values, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidNotIn(List<Integer> values) {
            addCriterion("authority_pid not in", values, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidBetween(Integer value1, Integer value2) {
            addCriterion("authority_pid between", value1, value2, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityPidNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_pid not between", value1, value2, "authorityPid");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNull() {
            addCriterion("authority_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNotNull() {
            addCriterion("authority_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameEqualTo(String value) {
            addCriterion("authority_name =", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotEqualTo(String value) {
            addCriterion("authority_name <>", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThan(String value) {
            addCriterion("authority_name >", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("authority_name >=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThan(String value) {
            addCriterion("authority_name <", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThanOrEqualTo(String value) {
            addCriterion("authority_name <=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLike(String value) {
            addCriterion("authority_name like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotLike(String value) {
            addCriterion("authority_name not like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIn(List<String> values) {
            addCriterion("authority_name in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotIn(List<String> values) {
            addCriterion("authority_name not in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameBetween(String value1, String value2) {
            addCriterion("authority_name between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotBetween(String value1, String value2) {
            addCriterion("authority_name not between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNull() {
            addCriterion("authority_desc is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNotNull() {
            addCriterion("authority_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescEqualTo(String value) {
            addCriterion("authority_desc =", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotEqualTo(String value) {
            addCriterion("authority_desc <>", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThan(String value) {
            addCriterion("authority_desc >", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThanOrEqualTo(String value) {
            addCriterion("authority_desc >=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThan(String value) {
            addCriterion("authority_desc <", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThanOrEqualTo(String value) {
            addCriterion("authority_desc <=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLike(String value) {
            addCriterion("authority_desc like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotLike(String value) {
            addCriterion("authority_desc not like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIn(List<String> values) {
            addCriterion("authority_desc in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotIn(List<String> values) {
            addCriterion("authority_desc not in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescBetween(String value1, String value2) {
            addCriterion("authority_desc between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotBetween(String value1, String value2) {
            addCriterion("authority_desc not between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlIsNull() {
            addCriterion("authority_url is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlIsNotNull() {
            addCriterion("authority_url is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlEqualTo(String value) {
            addCriterion("authority_url =", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotEqualTo(String value) {
            addCriterion("authority_url <>", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlGreaterThan(String value) {
            addCriterion("authority_url >", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlGreaterThanOrEqualTo(String value) {
            addCriterion("authority_url >=", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlLessThan(String value) {
            addCriterion("authority_url <", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlLessThanOrEqualTo(String value) {
            addCriterion("authority_url <=", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlLike(String value) {
            addCriterion("authority_url like", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotLike(String value) {
            addCriterion("authority_url not like", value, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlIn(List<String> values) {
            addCriterion("authority_url in", values, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotIn(List<String> values) {
            addCriterion("authority_url not in", values, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlBetween(String value1, String value2) {
            addCriterion("authority_url between", value1, value2, "authorityUrl");
            return (Criteria) this;
        }

        public Criteria andAuthorityUrlNotBetween(String value1, String value2) {
            addCriterion("authority_url not between", value1, value2, "authorityUrl");
            return (Criteria) this;
        }
    }

    /**
     * 权限信息authority_info的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 权限信息authority_info的动态SQL对象.
     */
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