package com.virugan.service;

import com.virugan.tables.as.hxsysAsNbfhzh;
import com.virugan.tables.as.hxsysAsNbzhmx;

import java.util.List;

/**
 * 提供内部账户相关服务组建
 *
 * **/
public interface insideAcctServ {

    //内部账户开户组件
    public hxsysAsNbfhzh openAcct(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception;

    //内部账户信息多笔查询组件
    public List<hxsysAsNbfhzh> queryAcctMsgForList(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception;

    //内部账户信息单笔查询组件
    public hxsysAsNbfhzh queryAcctMsgSingle(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception;

    //内部账户交易明细查询组件
    public List<hxsysAsNbzhmx> queryDetails(hxsysAsNbzhmx hxsysasnbzhmx) throws Exception;

    //内部账户记账组件
    public boolean reviseBalance() throws Exception;
}
