package com.virugan.service;

import com.virugan.comptype.py.payAccountingCtx;
import com.virugan.comptype.py.payOtherHandleCtx;
import com.virugan.comptype.py.payQueryCtx;

import java.util.List;

/**
 * 行内转账相关组件
 * **/
public interface paymentInterOffice {

    //法人内转账
    public boolean transSameFaredma(payAccountingCtx payaccountingctx) throws Exception;

    //法人间转账
    public boolean transBetweenFaredma(payAccountingCtx payaccountingctx) throws Exception;

    //行内转账明细查询
    public List queryTransDetails(payQueryCtx payqueryctx) throws Exception;

    //延时转账手工处理
    public boolean transByHandwork(payOtherHandleCtx payotherhandlectx) throws Exception;

    //挂账手工入账
    public boolean settleByHandwork(payOtherHandleCtx payotherhandlectx) throws Exception;
}
