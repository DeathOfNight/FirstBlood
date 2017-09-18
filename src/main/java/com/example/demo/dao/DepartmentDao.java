package com.example.demo.dao;

import com.example.demo.data.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
public interface DepartmentDao {
    List<Department> selectDepartmentBypage(@Param("end")Integer limit, @Param("begin") Integer offset);
}
