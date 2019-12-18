package com.virugan.trans;

import com.virugan.context.myLogger;
import com.virugan.io.ac.ac2001.ac2001es;
import com.virugan.io.ac.ac2001.ac2001is;
import com.virugan.service.kemuhaooServ;
import com.virugan.tables.ac.hxsysAcKemut;
import com.virugan.utils.myBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * 科目号列表查询（模糊查询）
 * **/
@Controller
public class ac2001 {

    @Autowired
    com.virugan.service.kemuhaooServ kemuhaooServ;
    @Autowired
    myLogger mylogger;

    public List<ac2001es> execute(ac2001is is) throws Exception {
        mylogger.debug("===================================ac2001 start===================================");
        mylogger.debugToObject("ac2001is",is);
        hxsysAcKemut hxsysackemut = new hxsysAcKemut();
        List<ac2001es> ac2001esList = new ArrayList<>();
        myBeanUtils.copyByName(is,hxsysackemut);


        List<hxsysAcKemut> list = kemuhaooServ.findKemuxxForList(hxsysackemut);
        for(hxsysAcKemut ackemut:list){
            com.virugan.io.ac.ac2001.ac2001es ac2001es = new ac2001es();
            myBeanUtils.copyByName(ac2001es,ackemut);
            ac2001esList.add(ac2001es);
        }
        mylogger.debugToObject("ac2001es",ac2001esList);
        mylogger.debug("===================================ac2001   end===================================");
        return ac2001esList;
    }
}
