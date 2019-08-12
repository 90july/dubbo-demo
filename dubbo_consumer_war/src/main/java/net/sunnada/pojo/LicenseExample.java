package net.sunnada.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LicenseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOwnertypeIsNull() {
            addCriterion("OWNERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOwnertypeIsNotNull() {
            addCriterion("OWNERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnertypeEqualTo(BigDecimal value) {
            addCriterion("OWNERTYPE =", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeNotEqualTo(BigDecimal value) {
            addCriterion("OWNERTYPE <>", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeGreaterThan(BigDecimal value) {
            addCriterion("OWNERTYPE >", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OWNERTYPE >=", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeLessThan(BigDecimal value) {
            addCriterion("OWNERTYPE <", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OWNERTYPE <=", value, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeIn(List<BigDecimal> values) {
            addCriterion("OWNERTYPE in", values, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeNotIn(List<BigDecimal> values) {
            addCriterion("OWNERTYPE not in", values, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OWNERTYPE between", value1, value2, "ownertype");
            return (Criteria) this;
        }

        public Criteria andOwnertypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OWNERTYPE not between", value1, value2, "ownertype");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNull() {
            addCriterion("TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTablenameIsNotNull() {
            addCriterion("TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTablenameEqualTo(String value) {
            addCriterion("TABLENAME =", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotEqualTo(String value) {
            addCriterion("TABLENAME <>", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThan(String value) {
            addCriterion("TABLENAME >", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLENAME >=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThan(String value) {
            addCriterion("TABLENAME <", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLessThanOrEqualTo(String value) {
            addCriterion("TABLENAME <=", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameLike(String value) {
            addCriterion("TABLENAME like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotLike(String value) {
            addCriterion("TABLENAME not like", value, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameIn(List<String> values) {
            addCriterion("TABLENAME in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotIn(List<String> values) {
            addCriterion("TABLENAME not in", values, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameBetween(String value1, String value2) {
            addCriterion("TABLENAME between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andTablenameNotBetween(String value1, String value2) {
            addCriterion("TABLENAME not between", value1, value2, "tablename");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatIsNull() {
            addCriterion("SERIALNUMBERFORMAT is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatIsNotNull() {
            addCriterion("SERIALNUMBERFORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMAT =", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatNotEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMAT <>", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatGreaterThan(String value) {
            addCriterion("SERIALNUMBERFORMAT >", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMAT >=", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatLessThan(String value) {
            addCriterion("SERIALNUMBERFORMAT <", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatLessThanOrEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMAT <=", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatLike(String value) {
            addCriterion("SERIALNUMBERFORMAT like", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatNotLike(String value) {
            addCriterion("SERIALNUMBERFORMAT not like", value, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatIn(List<String> values) {
            addCriterion("SERIALNUMBERFORMAT in", values, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatNotIn(List<String> values) {
            addCriterion("SERIALNUMBERFORMAT not in", values, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatBetween(String value1, String value2) {
            addCriterion("SERIALNUMBERFORMAT between", value1, value2, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatNotBetween(String value1, String value2) {
            addCriterion("SERIALNUMBERFORMAT not between", value1, value2, "serialnumberformat");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexIsNull() {
            addCriterion("SERIALNUMBERFORMATREGEX is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexIsNotNull() {
            addCriterion("SERIALNUMBERFORMATREGEX is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX =", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexNotEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX <>", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexGreaterThan(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX >", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX >=", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexLessThan(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX <", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexLessThanOrEqualTo(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX <=", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexLike(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX like", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexNotLike(String value) {
            addCriterion("SERIALNUMBERFORMATREGEX not like", value, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexIn(List<String> values) {
            addCriterion("SERIALNUMBERFORMATREGEX in", values, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexNotIn(List<String> values) {
            addCriterion("SERIALNUMBERFORMATREGEX not in", values, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexBetween(String value1, String value2) {
            addCriterion("SERIALNUMBERFORMATREGEX between", value1, value2, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andSerialnumberformatregexNotBetween(String value1, String value2) {
            addCriterion("SERIALNUMBERFORMATREGEX not between", value1, value2, "serialnumberformatregex");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(BigDecimal value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(BigDecimal value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(BigDecimal value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(BigDecimal value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<BigDecimal> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<BigDecimal> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNull() {
            addCriterion("ORGANIZATIONID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("ORGANIZATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("ORGANIZATIONID =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("ORGANIZATIONID <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("ORGANIZATIONID >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONID >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("ORGANIZATIONID <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONID <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("ORGANIZATIONID like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("ORGANIZATIONID not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("ORGANIZATIONID in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("ORGANIZATIONID not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONID between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONID not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsIsNull() {
            addCriterion("PRINTPAGEINDEXS is null");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsIsNotNull() {
            addCriterion("PRINTPAGEINDEXS is not null");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsEqualTo(String value) {
            addCriterion("PRINTPAGEINDEXS =", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsNotEqualTo(String value) {
            addCriterion("PRINTPAGEINDEXS <>", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsGreaterThan(String value) {
            addCriterion("PRINTPAGEINDEXS >", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTPAGEINDEXS >=", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsLessThan(String value) {
            addCriterion("PRINTPAGEINDEXS <", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsLessThanOrEqualTo(String value) {
            addCriterion("PRINTPAGEINDEXS <=", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsLike(String value) {
            addCriterion("PRINTPAGEINDEXS like", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsNotLike(String value) {
            addCriterion("PRINTPAGEINDEXS not like", value, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsIn(List<String> values) {
            addCriterion("PRINTPAGEINDEXS in", values, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsNotIn(List<String> values) {
            addCriterion("PRINTPAGEINDEXS not in", values, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsBetween(String value1, String value2) {
            addCriterion("PRINTPAGEINDEXS between", value1, value2, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andPrintpageindexsNotBetween(String value1, String value2) {
            addCriterion("PRINTPAGEINDEXS not between", value1, value2, "printpageindexs");
            return (Criteria) this;
        }

        public Criteria andVersionsIsNull() {
            addCriterion("VERSIONS is null");
            return (Criteria) this;
        }

        public Criteria andVersionsIsNotNull() {
            addCriterion("VERSIONS is not null");
            return (Criteria) this;
        }

        public Criteria andVersionsEqualTo(String value) {
            addCriterion("VERSIONS =", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotEqualTo(String value) {
            addCriterion("VERSIONS <>", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsGreaterThan(String value) {
            addCriterion("VERSIONS >", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsGreaterThanOrEqualTo(String value) {
            addCriterion("VERSIONS >=", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLessThan(String value) {
            addCriterion("VERSIONS <", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLessThanOrEqualTo(String value) {
            addCriterion("VERSIONS <=", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsLike(String value) {
            addCriterion("VERSIONS like", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotLike(String value) {
            addCriterion("VERSIONS not like", value, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsIn(List<String> values) {
            addCriterion("VERSIONS in", values, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotIn(List<String> values) {
            addCriterion("VERSIONS not in", values, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsBetween(String value1, String value2) {
            addCriterion("VERSIONS between", value1, value2, "versions");
            return (Criteria) this;
        }

        public Criteria andVersionsNotBetween(String value1, String value2) {
            addCriterion("VERSIONS not between", value1, value2, "versions");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("UPDATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("UPDATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("UPDATEUSER =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("UPDATEUSER <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("UPDATEUSER >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("UPDATEUSER <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("UPDATEUSER like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("UPDATEUSER not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("UPDATEUSER in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("UPDATEUSER not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("UPDATEUSER between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSER not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberIsNull() {
            addCriterion("AUTOSERIALNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberIsNotNull() {
            addCriterion("AUTOSERIALNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberEqualTo(BigDecimal value) {
            addCriterion("AUTOSERIALNUMBER =", value, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberNotEqualTo(BigDecimal value) {
            addCriterion("AUTOSERIALNUMBER <>", value, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberGreaterThan(BigDecimal value) {
            addCriterion("AUTOSERIALNUMBER >", value, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOSERIALNUMBER >=", value, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberLessThan(BigDecimal value) {
            addCriterion("AUTOSERIALNUMBER <", value, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOSERIALNUMBER <=", value, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberIn(List<BigDecimal> values) {
            addCriterion("AUTOSERIALNUMBER in", values, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberNotIn(List<BigDecimal> values) {
            addCriterion("AUTOSERIALNUMBER not in", values, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOSERIALNUMBER between", value1, value2, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andAutoserialnumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOSERIALNUMBER not between", value1, value2, "autoserialnumber");
            return (Criteria) this;
        }

        public Criteria andTransparentsealIsNull() {
            addCriterion("TRANSPARENTSEAL is null");
            return (Criteria) this;
        }

        public Criteria andTransparentsealIsNotNull() {
            addCriterion("TRANSPARENTSEAL is not null");
            return (Criteria) this;
        }

        public Criteria andTransparentsealEqualTo(BigDecimal value) {
            addCriterion("TRANSPARENTSEAL =", value, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealNotEqualTo(BigDecimal value) {
            addCriterion("TRANSPARENTSEAL <>", value, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealGreaterThan(BigDecimal value) {
            addCriterion("TRANSPARENTSEAL >", value, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSPARENTSEAL >=", value, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealLessThan(BigDecimal value) {
            addCriterion("TRANSPARENTSEAL <", value, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSPARENTSEAL <=", value, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealIn(List<BigDecimal> values) {
            addCriterion("TRANSPARENTSEAL in", values, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealNotIn(List<BigDecimal> values) {
            addCriterion("TRANSPARENTSEAL not in", values, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSPARENTSEAL between", value1, value2, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andTransparentsealNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSPARENTSEAL not between", value1, value2, "transparentseal");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNull() {
            addCriterion("ORGANIZATIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNotNull() {
            addCriterion("ORGANIZATIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME =", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME <>", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThan(String value) {
            addCriterion("ORGANIZATIONNAME >", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME >=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThan(String value) {
            addCriterion("ORGANIZATIONNAME <", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME <=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLike(String value) {
            addCriterion("ORGANIZATIONNAME like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotLike(String value) {
            addCriterion("ORGANIZATIONNAME not like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIn(List<String> values) {
            addCriterion("ORGANIZATIONNAME in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotIn(List<String> values) {
            addCriterion("ORGANIZATIONNAME not in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONNAME between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONNAME not between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNull() {
            addCriterion("FLAGS is null");
            return (Criteria) this;
        }

        public Criteria andFlagsIsNotNull() {
            addCriterion("FLAGS is not null");
            return (Criteria) this;
        }

        public Criteria andFlagsEqualTo(BigDecimal value) {
            addCriterion("FLAGS =", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotEqualTo(BigDecimal value) {
            addCriterion("FLAGS <>", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThan(BigDecimal value) {
            addCriterion("FLAGS >", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLAGS >=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThan(BigDecimal value) {
            addCriterion("FLAGS <", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLAGS <=", value, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsIn(List<BigDecimal> values) {
            addCriterion("FLAGS in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotIn(List<BigDecimal> values) {
            addCriterion("FLAGS not in", values, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLAGS between", value1, value2, "flags");
            return (Criteria) this;
        }

        public Criteria andFlagsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLAGS not between", value1, value2, "flags");
            return (Criteria) this;
        }

        public Criteria andOldxsdIsNull() {
            addCriterion("OLDXSD is null");
            return (Criteria) this;
        }

        public Criteria andOldxsdIsNotNull() {
            addCriterion("OLDXSD is not null");
            return (Criteria) this;
        }

        public Criteria andOldxsdEqualTo(Object value) {
            addCriterion("OLDXSD =", value, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdNotEqualTo(Object value) {
            addCriterion("OLDXSD <>", value, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdGreaterThan(Object value) {
            addCriterion("OLDXSD >", value, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdGreaterThanOrEqualTo(Object value) {
            addCriterion("OLDXSD >=", value, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdLessThan(Object value) {
            addCriterion("OLDXSD <", value, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdLessThanOrEqualTo(Object value) {
            addCriterion("OLDXSD <=", value, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdIn(List<Object> values) {
            addCriterion("OLDXSD in", values, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdNotIn(List<Object> values) {
            addCriterion("OLDXSD not in", values, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdBetween(Object value1, Object value2) {
            addCriterion("OLDXSD between", value1, value2, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andOldxsdNotBetween(Object value1, Object value2) {
            addCriterion("OLDXSD not between", value1, value2, "oldxsd");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNull() {
            addCriterion("MODELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNotNull() {
            addCriterion("MODELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypeEqualTo(BigDecimal value) {
            addCriterion("MODELTYPE =", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotEqualTo(BigDecimal value) {
            addCriterion("MODELTYPE <>", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThan(BigDecimal value) {
            addCriterion("MODELTYPE >", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MODELTYPE >=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThan(BigDecimal value) {
            addCriterion("MODELTYPE <", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MODELTYPE <=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeIn(List<BigDecimal> values) {
            addCriterion("MODELTYPE in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotIn(List<BigDecimal> values) {
            addCriterion("MODELTYPE not in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODELTYPE between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MODELTYPE not between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andSealprintIsNull() {
            addCriterion("SEALPRINT is null");
            return (Criteria) this;
        }

        public Criteria andSealprintIsNotNull() {
            addCriterion("SEALPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andSealprintEqualTo(BigDecimal value) {
            addCriterion("SEALPRINT =", value, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintNotEqualTo(BigDecimal value) {
            addCriterion("SEALPRINT <>", value, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintGreaterThan(BigDecimal value) {
            addCriterion("SEALPRINT >", value, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEALPRINT >=", value, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintLessThan(BigDecimal value) {
            addCriterion("SEALPRINT <", value, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEALPRINT <=", value, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintIn(List<BigDecimal> values) {
            addCriterion("SEALPRINT in", values, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintNotIn(List<BigDecimal> values) {
            addCriterion("SEALPRINT not in", values, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEALPRINT between", value1, value2, "sealprint");
            return (Criteria) this;
        }

        public Criteria andSealprintNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEALPRINT not between", value1, value2, "sealprint");
            return (Criteria) this;
        }

        public Criteria andLegalcallIsNull() {
            addCriterion("LEGALCALL is null");
            return (Criteria) this;
        }

        public Criteria andLegalcallIsNotNull() {
            addCriterion("LEGALCALL is not null");
            return (Criteria) this;
        }

        public Criteria andLegalcallEqualTo(BigDecimal value) {
            addCriterion("LEGALCALL =", value, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallNotEqualTo(BigDecimal value) {
            addCriterion("LEGALCALL <>", value, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallGreaterThan(BigDecimal value) {
            addCriterion("LEGALCALL >", value, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEGALCALL >=", value, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallLessThan(BigDecimal value) {
            addCriterion("LEGALCALL <", value, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEGALCALL <=", value, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallIn(List<BigDecimal> values) {
            addCriterion("LEGALCALL in", values, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallNotIn(List<BigDecimal> values) {
            addCriterion("LEGALCALL not in", values, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEGALCALL between", value1, value2, "legalcall");
            return (Criteria) this;
        }

        public Criteria andLegalcallNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEGALCALL not between", value1, value2, "legalcall");
            return (Criteria) this;
        }

        public Criteria andMintypeidIsNull() {
            addCriterion("MINTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andMintypeidIsNotNull() {
            addCriterion("MINTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andMintypeidEqualTo(String value) {
            addCriterion("MINTYPEID =", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidNotEqualTo(String value) {
            addCriterion("MINTYPEID <>", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidGreaterThan(String value) {
            addCriterion("MINTYPEID >", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidGreaterThanOrEqualTo(String value) {
            addCriterion("MINTYPEID >=", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidLessThan(String value) {
            addCriterion("MINTYPEID <", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidLessThanOrEqualTo(String value) {
            addCriterion("MINTYPEID <=", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidLike(String value) {
            addCriterion("MINTYPEID like", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidNotLike(String value) {
            addCriterion("MINTYPEID not like", value, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidIn(List<String> values) {
            addCriterion("MINTYPEID in", values, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidNotIn(List<String> values) {
            addCriterion("MINTYPEID not in", values, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidBetween(String value1, String value2) {
            addCriterion("MINTYPEID between", value1, value2, "mintypeid");
            return (Criteria) this;
        }

        public Criteria andMintypeidNotBetween(String value1, String value2) {
            addCriterion("MINTYPEID not between", value1, value2, "mintypeid");
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