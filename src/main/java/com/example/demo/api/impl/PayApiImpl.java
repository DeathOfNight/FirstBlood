package com.example.demo.api.impl;

import com.example.demo.api.PayApi;
import com.example.demo.data.Pay;
import com.example.demo.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/9 0009.
 */
@Service("payApiImpl")
public class PayApiImpl  implements PayApi {

    @Resource(name = "payService")
    private  PayService payService;


    /**
     * 根据请求号查询支付信息
     *
     * @param pay1
     * @return
     */
    @Override
    public Pay selectByRequestNo(Pay pay1) {
       Pay pay = payService.qryBankByPay(pay1.getRequestNo());
        return pay;
    }
}
