package com.example.demo.config;

import com.example.demo.dao.UserRoleDao;
import com.example.demo.data.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {
    Log log = LogFactory.getLog(getClass());

    @Autowired
    UserRoleDao userRoleDao;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRoleDao.selectUser(s);
        if (s == null || s=="") {
            log.error(s + "用户名不存在");
            return null;
        }
        System.out.println(s + "用户名存在");
//        System.out.println("username:"+s.getUsername()+";password:"+user.getPassword());
        return user;
    }
}
