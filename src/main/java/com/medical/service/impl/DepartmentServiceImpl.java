package com.medical.service.impl;

import com.medical.dao.DepartmentMapper;
import com.medical.pojo.Department;
import com.medical.pojo.DepartmentExample;
import com.medical.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * ClassName:   DepartmentServiceImpl
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/2 10:25
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectAllDepartment() {
        DepartmentExample example=new DepartmentExample();
        example.createCriteria();
        return departmentMapper.selectByExample(example);
    }
}
