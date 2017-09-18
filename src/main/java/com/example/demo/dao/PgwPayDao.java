package com.example.demo.dao;

import com.example.demo.data.Pay;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Descirption: 支付表Dao
 * @Auther: Richard Core
 * @date 2016/7/15.
 */
public interface PgwPayDao {




    /**
     * 根据请求号查询pay
     */
    Pay selectByRequestNo(@Param("requestNo") String requestNo);



    /**
     *通过银行订单号查询支付表记录
     * @param bankOrderNo
     * @return
     */
    Pay findByBankOrderNo(@Param("bankOrderNo") String bankOrderNo);

}
