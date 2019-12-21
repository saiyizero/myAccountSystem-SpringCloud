package com.virugan.servimpl;

import com.virugan.myTemple.MyJdbcTempleWithCache;
import com.virugan.service.kemuhaooServ;
import com.virugan.tables.ac.hxsysAcKjkemu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class kemuhaooServImpl implements kemuhaooServ {
    @Autowired
    MyJdbcTempleWithCache myjdbctemplewithcache;

    @Override
    public hxsysAcKjkemu findKemuxxByPk(hxsysAcKjkemu acKemut) throws Exception {
        hxsysAcKjkemu hxsysAcKemut = myjdbctemplewithcache.selectByPrimaryKey(acKemut);
        return hxsysAcKemut;
    }

    @Override
    public List<hxsysAcKjkemu> findKemuxxForList(hxsysAcKjkemu acKemut) {
        return null;
    }

    @Override
    public boolean addKemuxx(hxsysAcKjkemu acKemut) {
        boolean status = myjdbctemplewithcache.insert(acKemut);
        return status;
    }

    @Override
    public boolean delKemuxx(hxsysAcKjkemu acKemut) {
        return false;
    }

    @Override
    public boolean modifyKemuxx(hxsysAcKjkemu acKemut) throws Exception {
        boolean status = myjdbctemplewithcache.updateByPrimaryKey(acKemut);
        return status;
    }
}
