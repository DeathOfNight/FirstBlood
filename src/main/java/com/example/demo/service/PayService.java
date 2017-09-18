package com.example.demo.service;

import com.example.demo.dao.PgwPayDao;
import com.example.demo.data.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/4 0004.
 */
@Service("payService")
public class PayService {

    @Autowired
    private PgwPayDao pgwPayDao;
    public Pay qryBankByPay(String requestNo) {
        System.out.print("12312313212333333333333333333333333333333333");

        Pay pay = pgwPayDao.selectByRequestNo(requestNo);

        return pay;

    }
}
