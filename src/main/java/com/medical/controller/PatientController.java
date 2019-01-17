package com.medical.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medical.pojo.Patient;
import com.medical.pojo.PatientExample;
import com.medical.pojo.Record;
import com.medical.service.PatientService;
import com.medical.service.RecordService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName:   PatientController
 * Description:  病人管理控制器
 * Author:    wenqi.guo
 * Date:      2019/1/7 10:03
 */
@Controller
@RequestMapping("/patient")
public class PatientController {
    private static Logger logger = Logger.getLogger(PatientController.class);

    // 默认的第几页
    public static final String DEFAULT_VALUE="1";

    // 一页显示几条数据
    public static final  int PAGE_SIZE=4;

    // 导航页有几页数据
    public static final int NAVIGATE_PAGES=5;


    @Autowired
    private PatientService patientService;
    @Autowired
    private  RecordService recordService;

    /**
     * @Description  跳转到病人登记页面
     * @Date  2019/1/7 10:05
     * @Param
     * @return
     **/
    @RequestMapping("/toPatientRegister")
    public String toPatientRegister(){
        return "patientRegister";
    }

    @RequestMapping("/toPatientSearch")
    public String toPatientSearch(){
        return "patientSearch";
    }

    /**
     * @Description  跳转到病历登记页面
     * @Date  2019/1/11 11:12
     * @Param
     * @return
     **/
    @RequestMapping("/toVisitRegister")
    public String toVisitRegister(){
        return "visitRegister";
    }


    /**
     * @Description  登记病人信息
     * @Date  2019/1/9 20:46
     * @Param
     * @return
     **/
   @RequestMapping("/register")
    public String register(Patient patient){
       if(patient.getId()==null || patient.getGender()==null ||
               patient.getMedicalHistory()==null || patient.getName()==null){
           return "exception";
       }
       try{
           patientService.register(patient);
       }catch(Exception e){
           logger.error("数据库操作异常",e);
       }
          return "redirect:/toWelcome";
    }


    /**
     * @Description  选出所有数据
     * @Date  2019/1/10 10:06
     * @Param
     * @return
     **/
    @RequestMapping("/selectAll")
    public String selectAll(Model model, @RequestParam(value = "pn",defaultValue = DEFAULT_VALUE)Integer pn){
        // 从第pn页开始，共page_size条数据
        PageHelper.startPage(pn,PAGE_SIZE);
      List<Patient> patientList= patientService.selectAll();
        PageInfo pageInfo=new PageInfo(patientList,NAVIGATE_PAGES);
      model.addAttribute("patientList",patientList);
      model.addAttribute("pageInfo",pageInfo);
      return "patientSearch";
    }


    /**
     * @Description   按照身份证号码查询数据
     * @Date  2019/1/10 15:30
     * @Param
     * @return
     **/
    @RequestMapping("/selectById")
    public String selectById(HttpServletRequest request, Model model){
        String id=request.getParameter("ID");
        Patient patient=patientService.selectById(Integer.parseInt(id));
        List<Patient> patientList=new ArrayList<>();
        patientList.add(patient);
        model.addAttribute("patientList",patientList);
        return "patientSearch";
    }

    /**
     * @Description
     * @Date  2019/1/11 11:12
     * @Param
     * @return
     **/
    @RequestMapping("/selectById2")
    @ResponseBody
    public Patient selectById2(HttpServletRequest request, Model model){
        String id=request.getParameter("ID");
        if(id==null){
            return null;
        }
        Patient patient=patientService.selectById(Integer.parseInt(id));
    return patient;
    }


    /**
     * @Description  登记病历
     * @Date  2019/1/15 19:52
     * @Param
     * @return
     **/
    @RequestMapping("/recordRegister")
    public String recordRegister(Record record){
        record.setVisitingTime(new Date());
        record.setRecovery(false);
        try{
            recordService.addRecord(record);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return "redirect:/toWelcome";
    }


}
