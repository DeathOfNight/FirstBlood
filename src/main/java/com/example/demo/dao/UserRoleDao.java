package com.example.demo.dao;

import com.example.demo.data.User;
import org.apache.ibatis.annotations.Param;

public interface UserRoleDao {
    User selectUser(@Param("userName") String userName);
}
