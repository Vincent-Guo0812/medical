package com.medical.controller;

import com.medical.pojo.Doctor;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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

    @RequestMapping("/main")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/doctor")
    public String toDoctor(){
        return "doctor";
    }
    @RequestMapping("/admin")
    public String toAdmin(){
        return "admin";
    }
    @RequestMapping("/write")
    public String write(){
        return "write";
    }
    @RequestMapping("/read")
    public String read(){
        return "read";
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
            request.getSession().setAttribute("doctor",doctor);
            return "success";
        }
        catch(Exception e){
            e.printStackTrace();
            request.getSession().setAttribute("doctor",doctor);
            request.setAttribute("error","用户名或密码错误");
            return "login";
        }

    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
        request.getSession().removeAttribute("doctor");
        return "index";
    }
}
