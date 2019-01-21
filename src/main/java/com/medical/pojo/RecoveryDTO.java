package com.medical.pojo;

import java.util.Date;

/**
 * ClassName:   RecoveryDTO
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/19 11:17
 */
public class RecoveryDTO {
    private Integer id;

    private Integer identityId;

    private Date visitingTime;

    private Date filingTime;

    private String department;

    private Boolean gender;

    private String patientName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public Date getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(Date visitingTime) {
        this.visitingTime = visitingTime;
    }

    public Date getFilingTime() {
        return filingTime;
    }

    public void setFilingTime(Date filingTime) {
        this.filingTime = filingTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "RecoveryDTO{" +
                "id=" + id +
                ", identityId=" + identityId +
                ", visitingTime=" + visitingTime +
                ", filingTime=" + filingTime +
                ", department='" + department + '\'' +
                ", gender=" + gender +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
