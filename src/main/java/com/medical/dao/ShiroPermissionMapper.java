package com.medical.dao;

import com.medical.pojo.ShiroPermission;
import com.medical.pojo.ShiroPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiroPermissionMapper {
    long countByExample(ShiroPermissionExample example);

    int deleteByExample(ShiroPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShiroPermission record);

    int insertSelective(ShiroPermission record);

    List<ShiroPermission> selectByExample(ShiroPermissionExample example);

    ShiroPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShiroPermission record, @Param("example") ShiroPermissionExample example);

    int updateByExample(@Param("record") ShiroPermission record, @Param("example") ShiroPermissionExample example);

    int updateByPrimaryKeySelective(ShiroPermission record);

    int updateByPrimaryKey(ShiroPermission record);
}