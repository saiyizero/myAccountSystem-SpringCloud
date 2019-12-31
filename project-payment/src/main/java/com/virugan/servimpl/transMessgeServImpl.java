package com.virugan.servimpl;

import com.virugan.comptype.py.acctNoMsgCtx;
import com.virugan.service.transMessgeServ;
import com.virugan.tables.as.hxsysAsNbfhzh;
import com.virugan.utils.myBeanUtils;
import com.virugan.webclient.insideAcctWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class transMessgeServImpl implements transMessgeServ {

    @Autowired
    insideAcctWebClient insideacctwebclient;

    @Override
    public acctNoMsgCtx acctNoMsgQuery(acctNoMsgCtx acctnomsgctx) {
        hxsysAsNbfhzh asNbfhzh = new hxsysAsNbfhzh();
        myBeanUtils.copyByName(acctnomsgctx,asNbfhzh);
        asNbfhzh.setZhanghao(acctnomsgctx.getKehuzhao());

        hxsysAsNbfhzh resultNbfhzh = insideacctwebclient.queryAcctMsgSingle(asNbfhzh);

        myBeanUtils.copyByName(resultNbfhzh,acctnomsgctx);
        return acctnomsgctx;
    }
}
