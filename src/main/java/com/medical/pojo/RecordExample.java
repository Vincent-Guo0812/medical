package com.medical.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIsNull() {
            addCriterion("identity_id is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIsNotNull() {
            addCriterion("identity_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdEqualTo(Integer value) {
            addCriterion("identity_id =", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotEqualTo(Integer value) {
            addCriterion("identity_id <>", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdGreaterThan(Integer value) {
            addCriterion("identity_id >", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("identity_id >=", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLessThan(Integer value) {
            addCriterion("identity_id <", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLessThanOrEqualTo(Integer value) {
            addCriterion("identity_id <=", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIn(List<Integer> values) {
            addCriterion("identity_id in", values, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotIn(List<Integer> values) {
            addCriterion("identity_id not in", values, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdBetween(Integer value1, Integer value2) {
            addCriterion("identity_id between", value1, value2, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("identity_id not between", value1, value2, "identityId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(String value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(String value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(String value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(String value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(String value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLike(String value) {
            addCriterion("doctor_id like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotLike(String value) {
            addCriterion("doctor_id not like", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<String> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<String> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(String value1, String value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(String value1, String value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Integer value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Integer value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Integer value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Integer value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Integer> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Integer> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeIsNull() {
            addCriterion("visiting_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeIsNotNull() {
            addCriterion("visiting_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeEqualTo(Date value) {
            addCriterion("visiting_time =", value, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeNotEqualTo(Date value) {
            addCriterion("visiting_time <>", value, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeGreaterThan(Date value) {
            addCriterion("visiting_time >", value, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("visiting_time >=", value, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeLessThan(Date value) {
            addCriterion("visiting_time <", value, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeLessThanOrEqualTo(Date value) {
            addCriterion("visiting_time <=", value, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeIn(List<Date> values) {
            addCriterion("visiting_time in", values, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeNotIn(List<Date> values) {
            addCriterion("visiting_time not in", values, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeBetween(Date value1, Date value2) {
            addCriterion("visiting_time between", value1, value2, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andVisitingTimeNotBetween(Date value1, Date value2) {
            addCriterion("visiting_time not between", value1, value2, "visitingTime");
            return (Criteria) this;
        }

        public Criteria andSymtomIsNull() {
            addCriterion("symtom is null");
            return (Criteria) this;
        }

        public Criteria andSymtomIsNotNull() {
            addCriterion("symtom is not null");
            return (Criteria) this;
        }

        public Criteria andSymtomEqualTo(String value) {
            addCriterion("symtom =", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomNotEqualTo(String value) {
            addCriterion("symtom <>", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomGreaterThan(String value) {
            addCriterion("symtom >", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomGreaterThanOrEqualTo(String value) {
            addCriterion("symtom >=", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomLessThan(String value) {
            addCriterion("symtom <", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomLessThanOrEqualTo(String value) {
            addCriterion("symtom <=", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomLike(String value) {
            addCriterion("symtom like", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomNotLike(String value) {
            addCriterion("symtom not like", value, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomIn(List<String> values) {
            addCriterion("symtom in", values, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomNotIn(List<String> values) {
            addCriterion("symtom not in", values, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomBetween(String value1, String value2) {
            addCriterion("symtom between", value1, value2, "symtom");
            return (Criteria) this;
        }

        public Criteria andSymtomNotBetween(String value1, String value2) {
            addCriterion("symtom not between", value1, value2, "symtom");
            return (Criteria) this;
        }

        public Criteria andPrescribeIsNull() {
            addCriterion("prescribe is null");
            return (Criteria) this;
        }

        public Criteria andPrescribeIsNotNull() {
            addCriterion("prescribe is not null");
            return (Criteria) this;
        }

        public Criteria andPrescribeEqualTo(String value) {
            addCriterion("prescribe =", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeNotEqualTo(String value) {
            addCriterion("prescribe <>", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeGreaterThan(String value) {
            addCriterion("prescribe >", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeGreaterThanOrEqualTo(String value) {
            addCriterion("prescribe >=", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeLessThan(String value) {
            addCriterion("prescribe <", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeLessThanOrEqualTo(String value) {
            addCriterion("prescribe <=", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeLike(String value) {
            addCriterion("prescribe like", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeNotLike(String value) {
            addCriterion("prescribe not like", value, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeIn(List<String> values) {
            addCriterion("prescribe in", values, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeNotIn(List<String> values) {
            addCriterion("prescribe not in", values, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeBetween(String value1, String value2) {
            addCriterion("prescribe between", value1, value2, "prescribe");
            return (Criteria) this;
        }

        public Criteria andPrescribeNotBetween(String value1, String value2) {
            addCriterion("prescribe not between", value1, value2, "prescribe");
            return (Criteria) this;
        }

        public Criteria andHospitalizedIsNull() {
            addCriterion("hospitalized is null");
            return (Criteria) this;
        }

        public Criteria andHospitalizedIsNotNull() {
            addCriterion("hospitalized is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalizedEqualTo(Boolean value) {
            addCriterion("hospitalized =", value, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedNotEqualTo(Boolean value) {
            addCriterion("hospitalized <>", value, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedGreaterThan(Boolean value) {
            addCriterion("hospitalized >", value, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hospitalized >=", value, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedLessThan(Boolean value) {
            addCriterion("hospitalized <", value, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedLessThanOrEqualTo(Boolean value) {
            addCriterion("hospitalized <=", value, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedIn(List<Boolean> values) {
            addCriterion("hospitalized in", values, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedNotIn(List<Boolean> values) {
            addCriterion("hospitalized not in", values, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedBetween(Boolean value1, Boolean value2) {
            addCriterion("hospitalized between", value1, value2, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andHospitalizedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hospitalized not between", value1, value2, "hospitalized");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNull() {
            addCriterion("bed_number is null");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNotNull() {
            addCriterion("bed_number is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumberEqualTo(Integer value) {
            addCriterion("bed_number =", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotEqualTo(Integer value) {
            addCriterion("bed_number <>", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThan(Integer value) {
            addCriterion("bed_number >", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_number >=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThan(Integer value) {
            addCriterion("bed_number <", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("bed_number <=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberIn(List<Integer> values) {
            addCriterion("bed_number in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotIn(List<Integer> values) {
            addCriterion("bed_number not in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberBetween(Integer value1, Integer value2) {
            addCriterion("bed_number between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_number not between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedTimeIsNull() {
            addCriterion("bed_time is null");
            return (Criteria) this;
        }

        public Criteria andBedTimeIsNotNull() {
            addCriterion("bed_time is not null");
            return (Criteria) this;
        }

        public Criteria andBedTimeEqualTo(Integer value) {
            addCriterion("bed_time =", value, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeNotEqualTo(Integer value) {
            addCriterion("bed_time <>", value, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeGreaterThan(Integer value) {
            addCriterion("bed_time >", value, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_time >=", value, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeLessThan(Integer value) {
            addCriterion("bed_time <", value, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("bed_time <=", value, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeIn(List<Integer> values) {
            addCriterion("bed_time in", values, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeNotIn(List<Integer> values) {
            addCriterion("bed_time not in", values, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeBetween(Integer value1, Integer value2) {
            addCriterion("bed_time between", value1, value2, "bedTime");
            return (Criteria) this;
        }

        public Criteria andBedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_time not between", value1, value2, "bedTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeIsNull() {
            addCriterion("filing_time is null");
            return (Criteria) this;
        }

        public Criteria andFilingTimeIsNotNull() {
            addCriterion("filing_time is not null");
            return (Criteria) this;
        }

        public Criteria andFilingTimeEqualTo(Date value) {
            addCriterion("filing_time =", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeNotEqualTo(Date value) {
            addCriterion("filing_time <>", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeGreaterThan(Date value) {
            addCriterion("filing_time >", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("filing_time >=", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeLessThan(Date value) {
            addCriterion("filing_time <", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeLessThanOrEqualTo(Date value) {
            addCriterion("filing_time <=", value, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeIn(List<Date> values) {
            addCriterion("filing_time in", values, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeNotIn(List<Date> values) {
            addCriterion("filing_time not in", values, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeBetween(Date value1, Date value2) {
            addCriterion("filing_time between", value1, value2, "filingTime");
            return (Criteria) this;
        }

        public Criteria andFilingTimeNotBetween(Date value1, Date value2) {
            addCriterion("filing_time not between", value1, value2, "filingTime");
            return (Criteria) this;
        }

        public Criteria andRecoveryIsNull() {
            addCriterion("recovery is null");
            return (Criteria) this;
        }

        public Criteria andRecoveryIsNotNull() {
            addCriterion("recovery is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveryEqualTo(Boolean value) {
            addCriterion("recovery =", value, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryNotEqualTo(Boolean value) {
            addCriterion("recovery <>", value, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryGreaterThan(Boolean value) {
            addCriterion("recovery >", value, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recovery >=", value, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryLessThan(Boolean value) {
            addCriterion("recovery <", value, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryLessThanOrEqualTo(Boolean value) {
            addCriterion("recovery <=", value, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryIn(List<Boolean> values) {
            addCriterion("recovery in", values, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryNotIn(List<Boolean> values) {
            addCriterion("recovery not in", values, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryBetween(Boolean value1, Boolean value2) {
            addCriterion("recovery between", value1, value2, "recovery");
            return (Criteria) this;
        }

        public Criteria andRecoveryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recovery not between", value1, value2, "recovery");
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