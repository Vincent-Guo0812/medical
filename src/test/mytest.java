import com.medical.dao.DepartmentMapper;
import com.medical.dao.DoctorMapper;
import com.medical.dao.RecordMapper;
import com.medical.pojo.*;
import com.medical.service.DepartmentService;
import com.medical.service.DoctorService;
import com.medical.service.PatientService;
import com.medical.service.RecordService;
import com.sun.prism.impl.Disposer;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    @Autowired
    private PatientService patientService;
    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private RecordService recordService;

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
    @Test
    public void selectById(){
        String id="2122";
        Patient patient=patientService.selectById(Integer.parseInt(id));
        List<Patient> patientList=new ArrayList<>();
        patientList.add(patient);
        System.out.println(patientList);

    }

    @Test
    public void recordList(){
        List<RecordDTO> recordList=recordMapper.recordList();
        for(RecordDTO record:recordList){

            System.out.println( record.toString());
        }
    }

    @Test
    public void ss(){
           String date="2019-01-16 - 2019-01-18";
        String s1=date.substring(0,10);
        String s2=date.substring(13,23);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=new Date(),date2=new Date();
        try{
            date1=sdf.parse(s1);
            date2=sdf.parse(s2);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
      Integer id=1;
        List<RecoveryDTO> recoveryDTOList=recordMapper.recoveryByIdOrDate(id,date1,date2);
        for(RecoveryDTO recoveryDTO:recoveryDTOList){
            System.out.println(recoveryDTO.toString());
        }

    }
}
