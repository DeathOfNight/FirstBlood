package com.example.demo.service;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.data.User;
import com.example.demo.data.UserInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;


    private Log logger = LogFactory.getLog(this.getClass());

    public Map selectByPage(Map<String, Object> param) {
        //bootstrap-table要求服务器返回的json须包含：totlal，rows
        Map<String, Object> result = new HashMap<String, Object>();
        int total = userInfoDao.selectUserInfoBypage(null).size();
        List<UserInfo> rows = userInfoDao.selectUserInfoBypage(param);
        result.put("total", total);
        result.put("rows", rows);
        return result;
    }


    //删除会员信息
    @Transactional(propagation= Propagation.REQUIRED)
    public void delectById(String id) throws Exception {
        int i = 0;
        try {
            i = userInfoDao.delectById(id);
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
     * 更新会员信息
     * @param userInfo
     * @throws Exception
     */
    @Transactional(propagation=Propagation.REQUIRED)
    public void updateUserInfo(UserInfo userInfo)throws Exception {
        logger.info("修改用户的数据："
                + "姓名:" +userInfo.getName()
                + "|年龄:" + userInfo.getAge()
                + "|手机号:" + userInfo.getPhone()
                + "|性别:" + userInfo.getSex()
                + "备注:" + userInfo.getRemark() );

        try {
            int i = userInfoDao.updateUserInfo(userInfo);
        } catch (Exception e) {
            logger.error("更新客户信息表失败",e);
            throw new Exception("更新客户信息表失败");
        }

        return;
    }

    @Transactional(propagation=Propagation.REQUIRED)
    public  void addUserInfo(UserInfo userInfo) throws Exception{

        logger.info("注册用户信息："
                + "姓名:" +userInfo.getName()
                + "账户类型" + userInfo.getAccountType()
                + "|手机号:" + userInfo.getPhone()
        );
        int i = 0;
        try {
            userInfo.setId(java.util.UUID.randomUUID().toString());
            userInfo.setCreateTime(new Date());
             i = userInfoDao.addUserInfo(userInfo);
        } catch (Exception e) {
            logger.error("新增客户信息表失败",e);
            throw new Exception("新增客户信息表失败");
        }
        if(i != 1){
            logger.error("新增客户信息表失败,手机号为" + userInfo.getPhone());
            throw new Exception("新增客户信息表失败");
        }

        return;


    }


}
