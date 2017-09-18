package com.example.demo.api;


import com.example.demo.data.Pay;

/**
 *
 *
 */
public interface PayApi {

    /**
     * 根据请求号查询支付信息
     * @param pay
     * @return
     */
    Pay selectByRequestNo(Pay  pay);

}
