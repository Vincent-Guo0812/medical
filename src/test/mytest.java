import com.medical.dao.DepartmentMapper;
import com.medical.pojo.Department;
import com.medical.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ClassName:   mytest
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/1 20:25
 */

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({"classpath:applicationContext.xml"})
public class mytest {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private DepartmentService departmentService;

    @Test
    public void test(){
        int id=1;
       Department department=departmentMapper.selectByPrimaryKey(id);
        System.out.println(department.getId()+department.getName());
    }
    @Test
    public void sele(){
       List<Department>departmentLis= departmentService.selectAllDepartment();
       for(int i=0;i<departmentLis.size();i++){
           System.out.println(departmentLis.get(i).getName());
       }
    }
}
