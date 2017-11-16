package com.example.demo.data;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Collection;
import java.util.List;

@Entity
@Table(
        name = "testuser"
)
public class User implements UserDetails {

    String username = "admin";

    String role;

    String password = "admin";

    // UserDetails的角色资源属性集合
    private List<GrantedAuthority> authorities;

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 重写此方法,获取用户权限集合
    @Transient
    public Collection<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Transient
    public boolean isEnabled() {
        return true;
    }

    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }
}
