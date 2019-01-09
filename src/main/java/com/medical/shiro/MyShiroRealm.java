package com.medical.shiro;

import com.medical.pojo.Doctor;
import com.medical.service.DoctorService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName:   MyShiroRealm
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/3 17:40
 */
public class MyShiroRealm extends AuthorizingRealm {
       @Autowired
       private DoctorService doctorService;

    /**
     * @Description  验证当前登录的用户，获取认证信息
     * @Date  2019/1/3 22:19
     * @Param
     * @return
     **/
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String doctorId=(String) token.getPrincipal();//获取医生id
        Doctor doctor=doctorService.getDoctor(Integer.parseInt(doctorId));
        String salt=String.valueOf(doctor.getId());
        if(doctor!=null){
            AuthenticationInfo authcInfo =new SimpleAuthenticationInfo(doctor.getId(),doctor.getPassword(),ByteSource.Util.bytes(salt),"myRealm");
           return authcInfo;
        }else{
            return null;
        }
    }
/*
    注册的时候盐值加密，用username当作盐
    public String md5(String pwd,String username){
        Md5Hash md5Hash=new Md5Hash(pwd,username,1024);
        return md5Hash.toString();
    }

    */
    /**
     * @Description  为当前登录成功的用户授予权限和角色，已经登录成功了
     * @Date  2019/1/3 22:19
     * @Param
     * @return
     **/
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Integer doctorId=(Integer) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo  authorizationInfo=new SimpleAuthorizationInfo();
        // 获取医生的所有角色
        authorizationInfo.setRoles(doctorService.getRoles(doctorId));
        // 获取医生的所有权限
        authorizationInfo.setStringPermissions(doctorService.getPermissions(doctorId));
        return authorizationInfo;
    }

}
