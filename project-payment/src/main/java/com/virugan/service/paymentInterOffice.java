package com.virugan.service;

import java.util.List;

/**
 * 行内转账相关组件
 * **/
public interface paymentInterOffice {

    //法人内转账
    public boolean transSameFaredma() throws Exception;

    //法人间转账
    public boolean transBetweenFaredma() throws Exception;

    //行内转账明细查询
    public List queryTransDetails() throws Exception;

    //延时转账手工处理
    public boolean transByHandwork() throws Exception;

    //挂账手工入账
    public boolean settleByHandwork() throws Exception;
}
