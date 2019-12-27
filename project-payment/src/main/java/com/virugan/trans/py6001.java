package com.virugan.trans;

import com.virugan.comptype.py.acctNoMsgCtx;
import com.virugan.context.myLogger;
import com.virugan.io.py.py6001es;
import com.virugan.io.py.py6001is;
import com.virugan.service.transMessgeServ;
import com.virugan.utils.myBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 交易账户信息查询
 */
@RestController
public class py6001 {

    @Autowired
    transMessgeServ transMsgServ;
    @Autowired
    myLogger mylogger;

    @RequestMapping("/myAccountSystem/py/py6001")
    public py6001es execute(py6001is is) throws Exception {
        mylogger.debug("===================================py6001 start===================================");
        mylogger.debugToObject("py6001is",is);

        acctNoMsgCtx acctnomsgctx = new acctNoMsgCtx();
        myBeanUtils.copyByName(is,acctnomsgctx);

        acctNoMsgCtx result = transMsgServ.acctNoMsgQuery(acctnomsgctx);

        py6001es resultEs = new py6001es();
        myBeanUtils.copyByName(result,resultEs);

        mylogger.debugToObject("py6001es",resultEs);
        mylogger.debug("===================================py6001   end===================================");
        return resultEs;
    }
}
