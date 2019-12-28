package com.virugan.trans;

import com.virugan.io.ac.ac2001.ac2001es;
import com.virugan.io.ac.ac2001.ac2001is;
import com.virugan.tables.ac.hxsysAcKjkemu;
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

    public List<ac2001es> execute(ac2001is is) throws Exception {

        hxsysAcKjkemu hxsysackemut = new hxsysAcKjkemu();
        List<ac2001es> ac2001esList = new ArrayList<>();
        myBeanUtils.copyByName(is,hxsysackemut);


        List<hxsysAcKjkemu> list = kemuhaooServ.findKemuxxForList(hxsysackemut);
        for(hxsysAcKjkemu ackemut:list){
            com.virugan.io.ac.ac2001.ac2001es ac2001es = new ac2001es();
            myBeanUtils.copyByName(ac2001es,ackemut);
            ac2001esList.add(ac2001es);
        }
        return ac2001esList;
    }
}
