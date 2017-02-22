
package com.gis.model;

import java.util.ArrayList;
import java.util.List;

public class RoleAuthorityInfoCriteria {
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
    public RoleAuthorityInfoCriteria() {
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
     * 角色权限信息role_authority_info的基本动态SQL对象.
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

        public Criteria andRoleAuthorityIdIsNull() {
            addCriterion("role_authority_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdIsNotNull() {
            addCriterion("role_authority_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdEqualTo(Integer value) {
            addCriterion("role_authority_id =", value, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdNotEqualTo(Integer value) {
            addCriterion("role_authority_id <>", value, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdGreaterThan(Integer value) {
            addCriterion("role_authority_id >", value, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_authority_id >=", value, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdLessThan(Integer value) {
            addCriterion("role_authority_id <", value, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_authority_id <=", value, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdIn(List<Integer> values) {
            addCriterion("role_authority_id in", values, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdNotIn(List<Integer> values) {
            addCriterion("role_authority_id not in", values, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("role_authority_id between", value1, value2, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_authority_id not between", value1, value2, "roleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
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
    }

    /**
     * 角色权限信息role_authority_info的映射实体
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 角色权限信息role_authority_info的动态SQL对象.
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