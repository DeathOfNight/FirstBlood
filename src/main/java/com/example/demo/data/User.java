package com.example.demo.data;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Collection;

@Entity
@Table(
        name = "testuser"
)
public class User implements UserDetails {

    String username;

    String role;

    String password;

    // UserDetails的角色资源属性集合
    private Collection<GrantedAuthority> authorities;

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

    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Transient
    public boolean isEnabled() {
        return false;
    }

    @Transient
    public boolean isAccountNonLocked() {
        return false;
    }

    @Transient
    public boolean isAccountNonExpired() {
        return false;
    }

    @Transient
    public boolean isCredentialsNonExpired() {
        return false;
    }
}
