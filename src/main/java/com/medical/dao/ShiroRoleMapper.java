package com.medical.dao;

import com.medical.pojo.ShiroRole;
import com.medical.pojo.ShiroRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiroRoleMapper {
    long countByExample(ShiroRoleExample example);

    int deleteByExample(ShiroRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShiroRole record);

    int insertSelective(ShiroRole record);

    List<ShiroRole> selectByExample(ShiroRoleExample example);

    ShiroRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShiroRole record, @Param("example") ShiroRoleExample example);

    int updateByExample(@Param("record") ShiroRole record, @Param("example") ShiroRoleExample example);

    int updateByPrimaryKeySelective(ShiroRole record);

    int updateByPrimaryKey(ShiroRole record);
}