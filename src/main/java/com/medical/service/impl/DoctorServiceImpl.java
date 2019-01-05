package com.medical.service.impl;

import com.medical.dao.DoctorMapper;
import com.medical.pojo.Doctor;
import com.medical.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * ClassName:   DoctorServiceImpl
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/3 18:52
 */
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor getDoctor(Integer doctorId){
          return doctorMapper.selectByPrimaryKey(doctorId);
    }

   @Override
    public Set<String> getRoles(Integer doctorId){
        return doctorMapper.getRolesByDoctorId(doctorId);

    }
    @Override
    public Set<String> getPermissions(Integer doctorId){
         return doctorMapper.getPermissionsByDoctorId(doctorId);
    }
}
