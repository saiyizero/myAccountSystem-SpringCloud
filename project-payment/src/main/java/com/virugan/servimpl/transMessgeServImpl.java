package com.virugan.servimpl;

import com.virugan.comptype.py.acctNoMsgCtx;
import com.virugan.context.myLogger;
import com.virugan.service.transMessgeServ;
import com.virugan.tables.as.hxsysAsNbfhzh;
import com.virugan.utils.myBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class transMessgeServImpl implements transMessgeServ {
    @Autowired
    myLogger mylogger;
    @Autowired
    RestTemplate resttemplate;

    @Override
    public acctNoMsgCtx acctNoMsgQuery(acctNoMsgCtx acctnomsgctx) {
        mylogger.debug(">>>>>>>>>>>>>transMessgeServImpl.acctNoMsgQuery>>>>>>>>>>>>>");

        hxsysAsNbfhzh asNbfhzh = new hxsysAsNbfhzh();
        myBeanUtils.copyByName(acctnomsgctx,asNbfhzh);
        asNbfhzh.setZhanghao(acctnomsgctx.getKehuzhao());

        hxsysAsNbfhzh resultNbfhzh = resttemplate.getForObject(
                myBeanUtils.createUrlForGetRequest("http://project-assets/insideAcctWebServ/queryAcctMsgSingle",asNbfhzh), hxsysAsNbfhzh.class);

        mylogger.debugToObject("resultNbfhzh",resultNbfhzh);
        myBeanUtils.copyByName(resultNbfhzh,acctnomsgctx);
        mylogger.debugToObject("acctnomsgctx",acctnomsgctx);


        mylogger.debug("<<<<<<<<<<<<<transMessgeServImpl.acctNoMsgQuery<<<<<<<<<<<<<");
        return acctnomsgctx;
    }
}
