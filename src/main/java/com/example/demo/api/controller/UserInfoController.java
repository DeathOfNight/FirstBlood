package com.example.demo.api.controller;

import com.example.demo.data.UserInfo;
import com.example.demo.service.UserInfoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
@RestController
public class UserInfoController {
    @Autowired
    UserInfoService departmentService;

    private Log logger = LogFactory.getLog(this.getClass());

    @RequestMapping(value = "Home/GetDepartment",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getDepartmet(int pageSize,int pageNumber,String name,Integer age){
            /*所需参数*/
        Map<String, Object> param=new HashMap<String, Object>();
        int a=(pageNumber-1)*pageSize;
        int b=pageSize;
        param.put("a", a);
        param.put("b", b);
        param.put("name", name);
        param.put("age", age);
        return departmentService.selectByPage(param);
    }


    @RequestMapping(value = "/Home/Delete",method = RequestMethod.POST)
    @ResponseBody
    public Boolean Delete(@RequestBody String   userInfoId){
            /*所需参数*/
        logger.info("删除的数据ID："+userInfoId);
        try {
            departmentService.delectById(userInfoId);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    @RequestMapping(value = "/Home/save",method = RequestMethod.POST)
    @ResponseBody
    public Boolean Delete(@RequestBody UserInfo   userInfo){
            /*所需参数*/
        logger.info("保存的数据：" + userInfo.getId() + "===" + userInfo.getName()
                + "===" + userInfo.getAge() + "==" + userInfo.getPhone());
        try {
            departmentService.updateUserInfo(userInfo);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
