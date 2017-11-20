package com.example.demo.dao;

import com.example.demo.data.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
@Repository
public interface UserInfoDao {
    /**
     * 查询
     * @param
     * @return
     */
    List<UserInfo> selectUserInfoBypage();


    /**
     * 删除通过Id
     * @param id
     * @return
     */
    int delectById(@Param("id") String id);


    /**
     * 更新客户信息
     * @param userInfo
     * @return
     */
    int updateUserInfo(UserInfo userInfo);

    /**
     * 注册新用户
     * @param userInfo
     * @return
     */
    int addUserInfo(UserInfo userInfo);



}
