package com.virugan.trans;

import com.virugan.io.ac.ac2002.ac2002es;
import com.virugan.io.ac.ac2002.ac2002is;
import com.virugan.tables.ac.hxsysAcKjkemu;
import com.virugan.utils.myBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 科目号列表维护(新增或修改)
 * **/

@RestController
public class ac2002 {

    @Autowired
    com.virugan.service.kemuhaooServ kemuhaooServ;


    @RequestMapping("/myAccountSystem/ac/ac2002")
    public ac2002es execute(ac2002is is) throws Exception {


        hxsysAcKjkemu hxsysackemut = new hxsysAcKjkemu();
        myBeanUtils.copyByName(is,hxsysackemut);
        ac2002es ac2002es = new ac2002es();

        hxsysAcKjkemu kemuxxresult = kemuhaooServ.findKemuxxByPk(hxsysackemut);
        if(kemuxxresult!=null){
            kemuhaooServ.modifyKemuxx(hxsysackemut);
        }else{
            kemuhaooServ.addKemuxx(hxsysackemut);
        }
        myBeanUtils.copyByName(hxsysackemut,ac2002es);

        return ac2002es;
    }
}
