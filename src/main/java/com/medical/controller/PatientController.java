package com.medical.controller;

import com.medical.pojo.Patient;
import com.medical.pojo.PatientExample;
import com.medical.service.PatientService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
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


    @Autowired
    private PatientService patientService;

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
          return "patientSearch";
    }


    @RequestMapping("/selectAll")
    public String selectAll(Model model){
      List<Patient> patientList= patientService.selectAll();
      model.addAttribute("patientList",patientList);
      return "patientSearch";
    }



}
