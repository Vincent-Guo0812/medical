package com.medical.service;

import com.medical.pojo.Patient;

import java.util.List;

public interface PatientService {
    /**
     * @Description  病人登记
     * @Date  2019/1/9 20:49
     * @Param
     * @return
     **/
    public void register(Patient patient);

    /**
     * @Description  查询所有病人
     * @Date  2019/1/9 20:49
     * @Param
     * @return
     **/
    public List<Patient> selectAll();

    /**
     * @Description  按照id查询数据
     * @Date  2019/1/10 15:33
     * @Param
     * @return
     **/
    public Patient selectById(Integer id);
}
