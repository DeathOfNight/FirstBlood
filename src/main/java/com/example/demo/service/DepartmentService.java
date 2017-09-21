package com.example.demo.service;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.data.Department;
import com.example.demo.data.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    public Map selectByPage(Map<String, Object> param){
        //bootstrap-table要求服务器返回的json须包含：totlal，rows
        Map<String,Object> result = new HashMap<String,Object>();
        int total=departmentDao.selectDepartmentBypage(null).size();
        List<UserInfo> rows=departmentDao.selectDepartmentBypage(param);
        result.put("total",total);
        result.put("rows",rows);
        return result;
    }
}
