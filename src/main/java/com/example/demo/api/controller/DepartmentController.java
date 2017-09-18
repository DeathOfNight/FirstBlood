package com.example.demo.api.controller;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.data.Department;
import com.example.demo.data.QueryParam;
import com.example.demo.service.DepartmentService;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "Home/GetDepartment",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getDepartmet(@RequestBody QueryParam param){
        return departmentService.selectByPage(param.getLimit(),param.getOffset());
    }

//    @RequestMapping(value = "Home/GetDepartment",method = RequestMethod.POST)
//    @ResponseBody
//    public Object GetDepartment(@RequestBody QueryParam param)
//    {
//        List list = new ArrayList<Department>();
////        for (int i = 0; i < 50; i++)
////        {
////            Department oModel = new Department();
////            oModel.setName("销售部");
////            list.add(oModel);
////        }
//
//        Integer total = list.size();
//        Integer rows = 2;
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("rows", rows);//JSONArray
//        jsonObject.put("total",total);//总记录数
//        jsonObject.put("list",list);
//        jsonObject.put("header","Access-Control-Allow-Origin");
//        System.out.println(jsonObject);
//        System.out.println(jsonObject.toString());
//        return jsonObject;
//    }
}
