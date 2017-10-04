package com.example.demo.dao;

import com.example.demo.data.Account;
import com.example.demo.data.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
@Repository
public interface AccountDao {
    /**
     * 查询账户信息
     * @param map
     * @return
     */
    List<Account> selectAccountBypage(Map<String, Object> map);




}
