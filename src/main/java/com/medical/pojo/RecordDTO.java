package com.medical.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:   RecordDTO
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/18 19:35
 */
public class RecordDTO implements Serializable {
    private Integer id;

    private Integer identityId;

    private Date visitingTime;

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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(Date visitingTime) {
        this.visitingTime = visitingTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    @Override
    public String toString() {
        return "RecordDTO{" +
                "id=" + id +
                ", identityId=" + identityId +
                ", patientName='" + patientName + '\'' +
                ", gender=" + gender +
                ", visitingTime=" + visitingTime +
                ", department='" + department + '\'' +
                '}';
    }
}
