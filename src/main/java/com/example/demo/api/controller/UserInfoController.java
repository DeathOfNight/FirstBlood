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
    UserInfoService userInfoService;

    private Log logger = LogFactory.getLog(this.getClass());

    @RequestMapping(value = "Home/getUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getUserInfo(int pageSize,int pageNumber,String name,String phone){
            /*所需参数*/
        Map<String, Object> param=new HashMap<String, Object>();
        int a=(pageNumber-1)*pageSize;
        int b=pageSize;
        param.put("a", a);
        param.put("b", b);
        param.put("name", name);
        param.put("phone", phone);
        return userInfoService.selectByPage(param);
    }


    @RequestMapping(value = "/Home/Delete",method = RequestMethod.POST)
    @ResponseBody
    public Boolean Delete(@RequestBody String   userInfoId){
            /*所需参数*/
        logger.info("删除的数据ID："+userInfoId);
        try {
            userInfoService.delectById(userInfoId);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    @RequestMapping(value = "/Home/save",method = RequestMethod.POST)
    @ResponseBody
    public Boolean save(@RequestBody UserInfo   userInfo){
            /*所需参数*/
        logger.info("保存的数据：" + userInfo.toString());
        try {
            userInfoService.updateUserInfo(userInfo);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    @RequestMapping(value = "/Home/addUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Boolean add(@RequestBody UserInfo   userInfo){
        /**
         *  step 1 .user_Info客户表表中增加客户信息
         */
        try {
            userInfoService.addUserInfo(userInfo);
        } catch (Exception e) {
            return false;
        }
        /**
         * step 2 .账户类型配置表account_type_config中查询账户类型
         */


        /**
         * step 3 账户表account表中新增账户信息
         */





        return true;
    }


}
