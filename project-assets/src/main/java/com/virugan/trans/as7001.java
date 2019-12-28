package com.virugan.trans;

import com.virugan.io.as.as7001es;
import com.virugan.io.as.as7001is;
import com.virugan.service.insideAcctServ;
import com.virugan.tables.as.hxsysAsNbfhzh;
import com.virugan.utils.myBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 内部账户信息单笔查询
 * **/

@RestController
public class as7001 {

    @Autowired
    insideAcctServ insideacctserv;


    @RequestMapping("/myAccountSystem/as/as7001")
    public as7001es execute(as7001is is) throws Exception {

        hxsysAsNbfhzh hxsysAsNbfhzh = new hxsysAsNbfhzh();
        myBeanUtils.copyByName(is,hxsysAsNbfhzh);
        hxsysAsNbfhzh nbfhzhResult = insideacctserv.queryAcctMsgSingle(hxsysAsNbfhzh);
        as7001es resultEs = new as7001es();
        myBeanUtils.copyByName(nbfhzhResult,resultEs);

        return resultEs;
    }
}
