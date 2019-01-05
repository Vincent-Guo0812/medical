package com.medical.service;

import com.medical.pojo.Doctor;

import java.util.Set;

/**
 * ClassName:   DoctorService
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/3 18:46
 */
public interface DoctorService {
    /**
     * @Description  按照id查找医生
     * @Date  2019/1/3 19:45
     * @Param
     * @return
     **/
    public Doctor getDoctor(Integer doctorId);


    /**
     * @Description  按照医生id查找对用的角色
     * @Date  2019/1/3 19:45
     * @Param
     * @return
     **/
    public Set<String> getRoles(Integer doctorId);

    /**
     * @Description 按照医生id查找所拥有的权限
     * @Date  2019/1/3 19:45
     * @Param
     * @return
     **/
    public Set<String> getPermissions(Integer doctorId);
}
