package com.virugan.mapper.ac;

import com.virugan.context.myPage;
import com.virugan.tables.ac.hxsysAcZngzcp;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysAcZngzcpMapper {
    List<hxsysAcZngzcp> mySelect(hxsysAcZngzcp hxsysaczngzcp);

    hxsysAcZngzcp mySelectOne(hxsysAcZngzcp hxsysaczngzcp);

    List<hxsysAcZngzcp> mySelectPage(@Param("record") hxsysAcZngzcp hxsysaczngzcp, @Param("mypage") myPage mypage);

    int myCount(hxsysAcZngzcp hxsysaczngzcp);

    int myInsert(hxsysAcZngzcp hxsysaczngzcp);

    int myUpdateOne(hxsysAcZngzcp hxsysaczngzcp);

    int myDelete(hxsysAcZngzcp hxsysaczngzcp);

    int myUpdateByExmp(@Param("record") hxsysAcZngzcp record, @Param("updkey") hxsysAcZngzcp updkey);
}