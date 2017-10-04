package com.example.demo.service;

import com.example.demo.dao.AccountDao;
import com.example.demo.dao.UserInfoDao;
import com.example.demo.data.Account;
import com.example.demo.data.UserInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountService {

    @Autowired
    AccountDao accountDao;


    private Log logger = LogFactory.getLog(this.getClass());

    public Map selectByPage(Map<String, Object> param) {
        //bootstrap-table要求服务器返回的json须包含：totlal，rows
        Map<String, Object> result = new HashMap<String, Object>();
        int total = accountDao.selectAccountBypage(null).size();
        List<Account> rows = accountDao.selectAccountBypage(param);
        result.put("total", total);
        result.put("rows", rows);
        return result;
    }





}
