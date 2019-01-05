package com.medical.dao;

import com.medical.pojo.Doctor;
import com.medical.pojo.DoctorExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    Set<String> getRolesByDoctorId(Integer doctorId);
    Set<String> getPermissionsByDoctorId(Integer doctorId);

    long countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}