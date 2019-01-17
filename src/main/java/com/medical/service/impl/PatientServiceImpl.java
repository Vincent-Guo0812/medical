package com.medical.service.impl;

import com.medical.dao.PatientMapper;
import com.medical.pojo.Patient;
import com.medical.pojo.PatientExample;
import com.medical.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ClassName:   PatientServiceImpl
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/9 16:12
 */

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientMapper patientMapper;
    @Override
    public void register(Patient patient){

        Patient patient1=new Patient();
        patient1.setId(patient.getId());
        patient1.setGender(patient.getGender());
        patient1.setMedicalHistory(patient.getMedicalHistory());
        patient1.setName(patient.getName());
        patient1.setRegisterTime(new Date());
        patient1.setTelephone(patient.getTelephone());
        patientMapper.insert(patient1);
    }

    @Override
    public List<Patient> selectAll(){
        PatientExample example=new PatientExample();
        example.createCriteria();
       List<Patient> patientList=patientMapper.selectByExample(example);
       return patientList;
    }

    @Override
    public Patient selectById(Integer id){
        Patient patient=patientMapper.selectByPrimaryKey(id);
        return patient;
    }
}
