package com.example.demo.service;

import com.example.demo.dao.AccountTypeConfigDao;
import com.example.demo.dao.UserInfoDao;
import com.example.demo.data.AccountTypeConfig;
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
public class AccountTypeConfigService {

    @Autowired
    AccountTypeConfigDao accountTypeConfigDao;


    private Log logger = LogFactory.getLog(this.getClass());

    public Map selectByPage(Map<String, Object> param) {
        //bootstrap-table要求服务器返回的json须包含：totlal，rows
        Map<String, Object> result = new HashMap<String, Object>();
        int total = accountTypeConfigDao.selectAcccountTypeBypage(null).size();
        List<AccountTypeConfig> rows = accountTypeConfigDao.selectAcccountTypeBypage(param);
        result.put("total", total);
        result.put("rows", rows);
        return result;
    }


    //删除账户类型配置信息
    @Transactional(propagation= Propagation.REQUIRED)
    public void delectById(String id) throws Exception {
        int i = 0;
        try {
            i = accountTypeConfigDao.delectById(id);
        } catch (Exception e) {
            logger.error("删除数据库出现异常", e);
            throw new Exception("删除数据库出现异常");
        }
        if (i != 1) {
            logger.error("删除数据库出现异常");
            throw new Exception("删除数据库出现异常");
        }
        return;
    }


    /**
     * 更新账户类型信息
     * @param accountTypeConfig
     * @throws Exception
     */
    @Transactional(propagation=Propagation.REQUIRED)
    public void updateUAccountType(AccountTypeConfig accountTypeConfig)throws Exception {

        try {
            int i = accountTypeConfigDao.updateAccountType(accountTypeConfig);
        } catch (Exception e) {
            logger.error("更新账户类型失败",e);
            throw new Exception("更新账户类型失败");
        }

        return;
    }

    @Transactional(propagation=Propagation.REQUIRED)
    public  void addAccountTypeConfig(AccountTypeConfig accountTypeConfig) throws Exception{

        logger.info("注册用户信息："

        );
        try {
            accountTypeConfig.setId(java.util.UUID.randomUUID().toString());
            accountTypeConfig.setCreateTime(new Date());
            int i = accountTypeConfigDao.addAccountType(accountTypeConfig);
        } catch (Exception e) {
            logger.error("新增客户信息表失败",e);
            throw new Exception("新增客户信息表失败");
        }

        return;


    }


}
