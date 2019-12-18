package com.virugan.servimpl;

import com.virugan.myTemple.MyJdbcTempleWithCache;
import com.virugan.service.kemuhaooServ;
import com.virugan.tables.ac.hxsysAcKemut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class kemuhaooServImpl implements kemuhaooServ {
    @Autowired
    MyJdbcTempleWithCache myjdbctemplewithcache;

    @Override
    public hxsysAcKemut findKemuxxByPk(hxsysAcKemut acKemut) throws Exception {
        hxsysAcKemut hxsysAcKemut = myjdbctemplewithcache.selectByPrimaryKey(acKemut);
        return hxsysAcKemut;
    }

    @Override
    public List<hxsysAcKemut> findKemuxxForList(hxsysAcKemut acKemut) {
        return null;
    }

    @Override
    public boolean addKemuxx(hxsysAcKemut acKemut) {
        boolean status = myjdbctemplewithcache.insert(acKemut);
        return status;
    }

    @Override
    public boolean delKemuxx(hxsysAcKemut acKemut) {
        return false;
    }

    @Override
    public boolean modifyKemuxx(hxsysAcKemut acKemut) throws Exception {
        boolean status = myjdbctemplewithcache.updateByPrimaryKey(acKemut);
        return status;
    }
}
