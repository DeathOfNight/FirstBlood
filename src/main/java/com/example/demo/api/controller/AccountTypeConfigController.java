package com.example.demo.api.controller;

import com.example.demo.data.AccountTypeConfig;
import com.example.demo.data.UserInfo;
import com.example.demo.service.AccountTypeConfigService;
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
public class AccountTypeConfigController {
    @Autowired
    AccountTypeConfigService accountTypeConfigService;

    private Log logger = LogFactory.getLog(this.getClass());

    @RequestMapping(value = "Home/accountType/getAccountType",method = RequestMethod.POST)
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
        return accountTypeConfigService.selectByPage(param);
    }


    @RequestMapping(value = "/Home/accountType/delete",method = RequestMethod.POST)
    @ResponseBody
    public Boolean Delete(@RequestBody String   Id){
            /*所需参数*/
        logger.info("删除的数据ID："+Id);
        try {
            accountTypeConfigService.delectById(Id);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    @RequestMapping(value = "/Home/accountType/save",method = RequestMethod.POST)
    @ResponseBody
    public Boolean save(@RequestBody AccountTypeConfig accountTypeConfig){
            /*所需参数*/
        logger.info("保存的数据：" );
        try {
            accountTypeConfigService.updateUAccountType(accountTypeConfig);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    @RequestMapping(value = "/Home/accountType/add",method = RequestMethod.POST)
    @ResponseBody
    public Boolean add(@RequestBody AccountTypeConfig   accountTypeConfig){
            /*所需参数*/
        try {
            accountTypeConfigService.addAccountTypeConfig(accountTypeConfig);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
