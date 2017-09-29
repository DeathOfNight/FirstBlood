package com.example.demo.service;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.data.User;
import com.example.demo.data.UserInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        int total = userInfoDao.selectDepartmentBypage(null).size();
        List<UserInfo> rows = userInfoDao.selectDepartmentBypage(param);
        result.put("total", total);
        result.put("rows", rows);
        return result;
    }


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


    public void updateUserInfo(UserInfo userInfo)throws Exception {
        try {
            int i = userInfoDao.updateUserInfo(userInfo);
        } catch (Exception e) {
            logger.error("更新客户信息表失败",e);
            throw new Exception("更新客户信息表失败");
        }

        return;


    }
}
