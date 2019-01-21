package com.medical.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medical.dao.DepartmentMapper;
import com.medical.dao.DoctorMapper;
import com.medical.dao.PatientMapper;
import com.medical.dao.RecordMapper;
import com.medical.pojo.*;
import com.medical.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * ClassName:   RecordController
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/17 21:48
 */
@Controller
public class RecordController {

    // 默认的第几页
    public static final String DEFAULT_VALUE="1";

    // 一页显示几条数据
    public static final  int PAGE_SIZE=4;

    // 导航页有几页数据
    public static final int NAVIGATE_PAGES=5;

    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private PatientMapper patientMapper;
    @Autowired
    private RecordService recordService;


    /**
     * @Description  跳转到病历详情页
     * @Date  2019/1/17 21:49
     * @Param
     * @return
     **/
    @RequestMapping("/toRecordDetail")
    public String toRecordDetail(){
        return "recordDetail";
    }

    /**
     * @Description 归档操作
     * @Date  2019/1/18 16:39
     * @Param
     * @return
     **/
    @RequestMapping("/recovery")
    public String recovery(HttpServletRequest request){
        String recordId=request.getParameter("recordId");
        if(recordId==null){
            return "exception";
        }
       Record record = recordMapper.selectByPrimaryKey(Integer.parseInt(recordId));
        record.setFilingTime(new Date());
       record.setRecovery(true);
       recordMapper.updateByPrimaryKeySelective(record);
       return "optionSuccess";
    }

    /**
     * @Description  显示当前未归档的病历
     * @Date  2019/1/18 16:53
     * @Param
     * @return
     **/
    @RequestMapping("/listNow")
    public String listNow(Model model, @RequestParam(value="pn",defaultValue = DEFAULT_VALUE)Integer pn){
        PageHelper.startPage(pn,PAGE_SIZE);
        List<RecordDTO> recordDTOList=recordMapper.recordList();
        PageInfo pageInfo=new PageInfo(recordDTOList,NAVIGATE_PAGES);
        model.addAttribute("recordDTOList",recordDTOList);
        model.addAttribute("pageInfo",pageInfo);
        return "recordList";
    }


    /**
     * @Description   指定病历号码，查看病历详情
     * @Date  2019/1/18 22:56
     * @Param
     * @return
     **/
    @RequestMapping("/recordDetailById")
    public String recordDetailById(HttpServletRequest request,Model model){
        int id=Integer.parseInt(request.getParameter("id"));
        Record record=recordMapper.selectByPrimaryKey(id);
        int patientId=record.getIdentityId();
        Patient patient=patientMapper.selectByPrimaryKey(patientId);
        Record record1=recordMapper.selectByPrimaryKey(id);
        Department department=departmentMapper.selectByPrimaryKey(record1.getDepartment());
        Doctor doctor=doctorMapper.selectByPrimaryKey(Integer.parseInt(record1.getDoctorId()));
        model.addAttribute("record",record1);
        model.addAttribute("patient",patient);
        model.addAttribute("department",department);
        model.addAttribute("doctor",doctor);
        return "recordDetail";
    }


    /**
     * @Description   查询已归档的病历
     * @Date  2019/1/19 11:22
     * @Param
     * @return
     **/
    @RequestMapping("/alreadyRecovery")
    public String recovery(Model model,@RequestParam(value = "pn",defaultValue = DEFAULT_VALUE)Integer pn){
        PageHelper.startPage(pn,PAGE_SIZE);
        List<RecoveryDTO> recoveryDTOList=recordService.recoveryList();
        PageInfo pageInfo=new PageInfo(recoveryDTOList,NAVIGATE_PAGES);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("recoveryDTOList",recoveryDTOList);
        return "fileManage";
    }

    /**
     * @Description  按照病人id 或日期查询病历
     * @Date  2019/1/19 16:19
     * @Param
     * @return
     **/
    @RequestMapping("/recoveryByIdOrDate")
    public String recoveryByIdOrDate(HttpServletRequest request,Model model,@RequestParam(value = "pn",defaultValue = DEFAULT_VALUE)Integer pn){
        Integer id; String date;
        if(request.getParameter("ID")==null || "".equals(request.getParameter("ID"))){
             id=-1;
        }
        else{
            id=Integer.parseInt(request.getParameter("ID"));
        }
        if(request.getParameter("date")==null || "".equals(request.getParameter("date"))){
            date="1999-01-03 - 1999-01-04";
        }else{
            date=request.getParameter("date");
        }
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

        List<RecoveryDTO> recoveryDTOList=recordMapper.recoveryByIdOrDate(id,date1,date2);
        for(RecoveryDTO recoveryDTO:recoveryDTOList){
            System.out.println(recoveryDTO.toString());
        }
        PageHelper.startPage(pn,PAGE_SIZE);
        PageInfo pageInfo=new PageInfo(recoveryDTOList,NAVIGATE_PAGES);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("recoveryDTOList",recoveryDTOList);
        return "fileManage";
    }


    /**
     * @Description 跳转到单个病人已归档病历页面
     * @Date  2019/1/21 16:42
     * @Param
     * @return
     **/
    @RequestMapping("/toRecordForOne")
    public String toRecordForOne(Model model, HttpServletRequest request,@RequestParam(value = "pn",defaultValue = DEFAULT_VALUE)Integer pn){
        List<RecoveryDTO> recoveryDTOList= recordMapper.recordForOne(Integer.parseInt(request.getParameter("id")));
        PageHelper.startPage(pn,PAGE_SIZE);
        PageInfo pageInfo=new PageInfo(recoveryDTOList,NAVIGATE_PAGES);
        model.addAttribute("recoveryDTOList",recoveryDTOList);
        model.addAttribute("pageInfo",pageInfo);
        return "recordsForOne";
    }


}
