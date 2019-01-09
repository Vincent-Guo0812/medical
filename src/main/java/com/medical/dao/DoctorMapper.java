package com.medical.dao;

import com.medical.pojo.Doctor;
import com.medical.pojo.DoctorExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    /**
     * @Description 按医生id 查找医生具备的角色
     * @Date  2019/1/6 15:04
     * @Param
     * @return
     **/
    Set<String> getRolesByDoctorId(Integer doctorId);
    /**
     * @Description 按照id查找具有的的权限
     * @Date  2019/1/6 15:06
     * @Param
     * @return
     **/
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