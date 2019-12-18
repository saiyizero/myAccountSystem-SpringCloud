package com.virugan.service;

import com.virugan.tables.ac.hxsysAcKemut;

import java.util.List;

/**
 * 提供有关科目号相关服务
 *
 * **/
public interface kemuhaooServ {
    //根据主键查找科目信息
    public hxsysAcKemut findKemuxxByPk(hxsysAcKemut acKemut) throws Exception;
    //模糊查询科目信息
    public List<hxsysAcKemut> findKemuxxForList(hxsysAcKemut acKemut) throws Exception;
    //新增科目信息
    public boolean addKemuxx(hxsysAcKemut acKemut) throws Exception;
    //删除科目信息
    public boolean delKemuxx(hxsysAcKemut acKemut) throws Exception;
    //维护科目信息
    public boolean modifyKemuxx(hxsysAcKemut acKemut) throws Exception;
}
