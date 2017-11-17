package com.example.demo.config;

import com.example.demo.common.exception.TestException;
import com.example.demo.common.returncode.ReturnCode;
import com.example.demo.dao.UserRoleDao;
import com.example.demo.data.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("customUserService")
public class CustomUserService implements UserDetailsService {
    Log log = LogFactory.getLog(getClass());

    @Autowired
    UserRoleDao userRoleDao;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRoleDao.selectUser(s);
        if (user == null) {
            log.error(s + "用户名不存在");
            throw new TestException( ReturnCode.user_noexist);
        }
        log.info(s + "用户名存在");
        String role = user.getRole();
        List<GrantedAuthority> authList = getAuthorities(role);
        user.setAuthorities(authList);
        return user;
    }

    private List<GrantedAuthority> getAuthorities(String role) {
        List<GrantedAuthority> authList = new ArrayList<>();
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        if (role != null && role.trim().length() > 0) {
            if (role.equals("admin")) {
                authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            }
        }
        return authList;
    }
}
