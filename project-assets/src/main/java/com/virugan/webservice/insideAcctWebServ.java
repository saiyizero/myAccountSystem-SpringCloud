package com.virugan.webservice;

import com.virugan.context.myLogger;
import com.virugan.service.insideAcctServ;
import com.virugan.tables.as.hxsysAsNbfhzh;
import com.virugan.utils.myBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/insideAcctWebServ/")
public class insideAcctWebServ {

    @Autowired
    insideAcctServ insideacctserv;
    @Autowired
    myLogger mylogger;

    //内部账户信息单笔查询组件
    @RequestMapping("queryAcctMsgSingle")
    public hxsysAsNbfhzh queryAcctMsgSingle(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception {
        mylogger.debug(">>>>>>>>>>>>>insideAcctWebServ.queryAcctMsgSingle>>>>>>>>>>>>>");
        mylogger.debugToObject("hxsysasnbfhzh",hxsysasnbfhzh);

        hxsysAsNbfhzh nbfhzhResult = insideacctserv.queryAcctMsgSingle(hxsysasnbfhzh);
        myBeanUtils.copyByName(nbfhzhResult,hxsysasnbfhzh);

        mylogger.debugToObject("nbfhzhResult",hxsysasnbfhzh);
        mylogger.debug("<<<<<<<<<<<<<insideAcctWebServ.queryAcctMsgSingle<<<<<<<<<<<<<");
        return hxsysasnbfhzh;
    }

}
