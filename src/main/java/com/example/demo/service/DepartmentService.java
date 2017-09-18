package com.example.demo.service;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.data.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    public Map selectByPage(Integer limit,Integer offset){
        List<Department> userList = departmentDao.selectDepartmentBypage(limit,offset);
        Map<String, Object> map = new HashMap<String, Object>();
        if(userList != null) {
            map.put("total", userList.size());
            map.put("rows", userList);
        }
        return map;
    }
}
