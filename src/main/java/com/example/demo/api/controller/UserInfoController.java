package com.example.demo.api.controller;

import com.example.demo.data.UserInfo;
import com.example.demo.service.UserInfoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    private Log logger = LogFactory.getLog(this.getClass());

    @RequestMapping(value = "Home/getUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public List<UserInfo> getUserInfo(){
            /*所需参数*/
        logger.info("开始查询客户信息");
        return userInfoService.selectByPage();
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
