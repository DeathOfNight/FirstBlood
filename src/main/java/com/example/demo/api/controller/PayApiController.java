package com.example.demo.api.controller;

import com.example.demo.api.PayApi;
import com.example.demo.data.Pay;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by use on 2016/9/20.
 */
@RestController
@RequestMapping("/api/pgw/test")
public class PayApiController implements PayApi {
    private static final Log log = LogFactory.getLog(PayApiController.class);

    @Resource(name="payApiImpl")
    PayApi payApi;


    /**
     * 根据请求号查询支付信息
     *
     * @param
     * @return
     */

    @RequestMapping(value = "/pay/selectByRequestNo" ,method = RequestMethod.POST)
    @Override
    public Pay selectByRequestNo(@RequestBody Pay pay1) {
        Long beginTime=System.currentTimeMillis();
        Pay pay  = payApi.selectByRequestNo(pay1);
        log.info("所用时间:"+(System.currentTimeMillis()-beginTime));
        return pay;
    }
}
