package com.example.demo.api.controller;

import com.example.demo.service.AccountService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    private Log logger = LogFactory.getLog(this.getClass());

    @RequestMapping(value = "Home/getAccount",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> getUserInfo(int pageSize,int pageNumber,String phone){
            /*所需参数*/
        Map<String, Object> param=new HashMap<String, Object>();
        int a=(pageNumber-1)*pageSize;
        int b=pageSize;
        param.put("a", a);
        param.put("b", b);
        param.put("phone", phone);
        return accountService.selectByPage(param);
    }





}
