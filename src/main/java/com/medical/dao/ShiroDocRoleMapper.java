package com.medical.dao;

import com.medical.pojo.ShiroDocRole;
import com.medical.pojo.ShiroDocRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiroDocRoleMapper {
    long countByExample(ShiroDocRoleExample example);

    int deleteByExample(ShiroDocRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShiroDocRole record);

    int insertSelective(ShiroDocRole record);

    List<ShiroDocRole> selectByExample(ShiroDocRoleExample example);

    ShiroDocRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShiroDocRole record, @Param("example") ShiroDocRoleExample example);

    int updateByExample(@Param("record") ShiroDocRole record, @Param("example") ShiroDocRoleExample example);

    int updateByPrimaryKeySelective(ShiroDocRole record);

    int updateByPrimaryKey(ShiroDocRole record);
}