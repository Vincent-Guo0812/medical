import com.medical.dao.DepartmentMapper;
import com.medical.dao.DoctorMapper;
import com.medical.pojo.Department;
import com.medical.pojo.Doctor;
import com.medical.service.DepartmentService;
import com.medical.service.DoctorService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Set;

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
    @Autowired
    private DoctorService doctorService;

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

    @Test
    public void  shiro(){
  /*      Doctor d=doctorService.getDoctor(1);
        System.out.println(d.getName());
        Set<String> s=doctorService.getRoles(1);
        System.out.println(s);*/
        Set<String> set= doctorService.getPermissions(2);
        for(String s1:set){
            System.out.println(s1);
        }
    }

    @Test
    public void md5(){
        Md5Hash md5Hash=new Md5Hash("11","3",1024);
        System.out.println(md5Hash.toString());

    }
}
