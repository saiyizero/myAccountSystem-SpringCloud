package com.virugan.webservice;

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

    //内部账户信息单笔查询组件
    @RequestMapping("queryAcctMsgSingle")
    public hxsysAsNbfhzh queryAcctMsgSingle(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception {
        hxsysAsNbfhzh nbfhzhResult = insideacctserv.queryAcctMsgSingle(hxsysasnbfhzh);
        myBeanUtils.copyByName(nbfhzhResult,hxsysasnbfhzh);
        return hxsysasnbfhzh;
    }

}
