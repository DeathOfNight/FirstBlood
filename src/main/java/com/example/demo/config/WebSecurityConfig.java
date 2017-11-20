package com.example.demo.config;

import com.example.demo.common.encode.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Resource(name = "customUserService")
    private CustomUserService customUserService;

    @Resource(name = "myAuthenticationProvider")
    private MyAuthenticationProvider myAuthenticationProvider;

    //处理权限查询数据库

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(myAuthenticationProvider);
        auth.userDetailsService(customUserService).passwordEncoder(new PasswordEncoder(){

            @Override
            public String encode(CharSequence rawPassword) {
                return MD5Util.encode((String)rawPassword);
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return encodedPassword.equals(MD5Util.encode((String)rawPassword));
            }}); //user Details Service验证
    }

    //访问路径过滤 一般用它来具体控制权限，角色，url等安全的东西。
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()

                .antMatchers("/","/home","/templates/**","/login",
                        "/bootstraptable/**","/media/**","/css/**","/images/**",
                        "/js/**","/plugins/**","/layer/**").permitAll()

               // .anyRequest().authenticated()
                .and()
                .headers().frameOptions().disable()
               .and()
               .csrf().disable();
//            .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
    }

    //缓存设置用户
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");

    }
}
