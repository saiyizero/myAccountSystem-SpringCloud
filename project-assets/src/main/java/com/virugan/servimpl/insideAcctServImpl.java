package com.virugan.servimpl;

import com.virugan.context.myLogger;
import com.virugan.mapper.as.hxsysAsNbfhzhMapper;
import com.virugan.service.insideAcctServ;
import com.virugan.tables.as.hxsysAsNbfhzh;
import com.virugan.tables.as.hxsysAsNbzhmx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class insideAcctServImpl implements insideAcctServ {
    @Autowired
    hxsysAsNbfhzhMapper hxsysasnbfhzhmapper;
    @Autowired
    myLogger mylogger;
    @Override
    public hxsysAsNbfhzh openAcct(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception {
        return null;
    }

    @Override
    public List<hxsysAsNbfhzh> queryAcctMsgForList(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception {
        return null;
    }

    @Override
    public hxsysAsNbfhzh queryAcctMsgSingle(hxsysAsNbfhzh hxsysasnbfhzh) throws Exception {
        mylogger.debug(">>>>>>>>>>>>>transMessgeServImpl.acctNoMsgQuery>>>>>>>>>>>>>");
        mylogger.debugToObject("hxsysasnbfhzh input",hxsysasnbfhzh);
        hxsysAsNbfhzh hxsysAsNbfhzh = hxsysasnbfhzhmapper.mySelectOne(hxsysasnbfhzh);
        mylogger.debugToObject("hxsysasnbfhzh ountput",hxsysasnbfhzh);
        mylogger.debug("<<<<<<<<<<<<<transMessgeServImpl.acctNoMsgQuery<<<<<<<<<<<<<");
        return hxsysAsNbfhzh;
    }

    @Override
    public List<hxsysAsNbzhmx> queryDetails(hxsysAsNbzhmx hxsysasnbzhmx) throws Exception {
        return null;
    }

    @Override
    public boolean reviseBalance() throws Exception {
        return false;
    }
}
