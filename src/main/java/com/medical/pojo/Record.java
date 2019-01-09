package com.medical.pojo;

import java.util.Date;

public class Record {
    private Integer id;

    private Integer identityId;

    private String doctorId;

    private Integer department;

    private Date visitingTime;

    private String symtom;

    private String prescribe;

    private Boolean hospitalized;

    private Integer bedNumber;

    private Integer bedTime;

    private Date filingTime;

    private Boolean recovery;

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

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Date getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(Date visitingTime) {
        this.visitingTime = visitingTime;
    }

    public String getSymtom() {
        return symtom;
    }

    public void setSymtom(String symtom) {
        this.symtom = symtom == null ? null : symtom.trim();
    }

    public String getPrescribe() {
        return prescribe;
    }

    public void setPrescribe(String prescribe) {
        this.prescribe = prescribe == null ? null : prescribe.trim();
    }

    public Boolean getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(Boolean hospitalized) {
        this.hospitalized = hospitalized;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Integer getBedTime() {
        return bedTime;
    }

    public void setBedTime(Integer bedTime) {
        this.bedTime = bedTime;
    }

    public Date getFilingTime() {
        return filingTime;
    }

    public void setFilingTime(Date filingTime) {
        this.filingTime = filingTime;
    }

    public Boolean getRecovery() {
        return recovery;
    }

    public void setRecovery(Boolean recovery) {
        this.recovery = recovery;
    }
}