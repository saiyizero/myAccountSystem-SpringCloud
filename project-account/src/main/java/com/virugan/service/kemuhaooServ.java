package com.virugan.service;

import com.virugan.tables.ac.hxsysAcKjkemu;

import java.util.List;

/**
 * 提供有关科目号相关服务
 *
 * **/
public interface kemuhaooServ {
    //根据主键查找科目信息
    public hxsysAcKjkemu findKemuxxByPk(hxsysAcKjkemu acKemut) throws Exception;
    //模糊查询科目信息
    public List<hxsysAcKjkemu> findKemuxxForList(hxsysAcKjkemu acKemut) throws Exception;
    //新增科目信息
    public boolean addKemuxx(hxsysAcKjkemu acKemut) throws Exception;
    //删除科目信息
    public boolean delKemuxx(hxsysAcKjkemu acKemut) throws Exception;
    //维护科目信息
    public boolean modifyKemuxx(hxsysAcKjkemu acKemut) throws Exception;
}
