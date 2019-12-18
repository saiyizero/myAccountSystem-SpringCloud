package com.virugan.service;

import java.util.List;

/**
 * 提供内部账户相关服务组建
 *
 * **/
public interface insideAcctServ {

    //内部账户开户组件
    public String openAcct() throws Exception;

    //内部账户信息查询组件
    public List queryAcctMessage() throws Exception;

    //内部账户交易明细查询组件
    public List queryDetails() throws Exception;

    //内部账户记账组件
    public boolean reviseBalance() throws Exception;
}
