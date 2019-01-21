package com.medical.controller;

import com.medical.dao.DoctorMapper;
import com.medical.pojo.Doctor;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    @RequestMapping("/toWelcome")
    public String toWelcome(){
        return "welcome";
    }

    @RequestMapping("/toPersonalCenter")
    public String toPersonalCenter(){
        return "personalCenter";
    }

    /**
     * @Description  验证当前密码是否正确
     * @Date  2019/1/21 11:19
     * @Param
     * @return
     **/
    @ResponseBody
    @RequestMapping("/passwordCheck")
    public boolean passwordCheck(HttpServletRequest request){

       Doctor doctor=(Doctor)request.getSession().getAttribute("doctor");
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(String.valueOf(doctor.getId()),request.getParameter("password"));
        try{
            subject.login(token);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @RequestMapping("/passwordChange")
    public String passwordChange(HttpServletRequest request){
        Doctor doctor=(Doctor)request.getSession().getAttribute("doctor");
        String password=request.getParameter("newPwd1");
        Md5Hash md5Hash=new Md5Hash(password,String.valueOf(doctor.getId()),1024);
        String s=md5Hash.toString();
        doctor.setPassword(s);
        try{
            doctorMapper.updateByPrimaryKeySelective(doctor);
        }catch(Exception e){
            return "exception";
        }
        return "optionSuccess";
    }
}
