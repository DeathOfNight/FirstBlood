package com.example.demo.dao;

import com.example.demo.data.Department;
import com.example.demo.data.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
public interface DepartmentDao {
    List<UserInfo> selectDepartmentBypage(Map<String,Object> map);
}
