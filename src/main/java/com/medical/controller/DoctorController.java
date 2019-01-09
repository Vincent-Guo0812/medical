package com.medical.controller;

import com.medical.dao.DoctorMapper;
import com.medical.pojo.Doctor;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:   DoctorController
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/3 21:52
 */
@Controller
public class DoctorController {
    @Autowired
    private DoctorMapper doctorMapper;

    @RequestMapping("/main")
    public String toLogin(){
        return "login";
    }


    @RequestMapping("/login")
    public String login(Doctor doctor, HttpServletRequest request){
        if(doctor.getId()==null || doctor.getPassword()==null || "".equals(doctor.getId()) || "".equals(doctor.getPassword())){
            return "login";
        }

        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(String.valueOf(doctor.getId()),doctor.getPassword());
        try{
            subject.login(token);
            Doctor doctor1=doctorMapper.selectByPrimaryKey(doctor.getId());
            request.getSession().setAttribute("doctor",doctor1);

            return "main";
        }
        catch(Exception e){
            e.printStackTrace();
            request.getSession().setAttribute("doctor",doctor);
            request.setAttribute("error","用户名或密码错误");
            return "login";
        }

    }

    @RequestMapping("/logOut")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("doctor");
        return "login";
    }
}
