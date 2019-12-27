package com.virugan.service;

import com.virugan.comptype.py.acctNoMsgCtx;

/**
 *联机交易信息相关组件
 * **/
public interface transMessgeServ {
    //交易账户信息查询
    public acctNoMsgCtx acctNoMsgQuery(acctNoMsgCtx acctnomsgctx );
}
