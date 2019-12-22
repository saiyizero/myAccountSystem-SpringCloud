package com.virugan.mapper.ac;

import com.virugan.context.myPage;
import com.virugan.tables.ac.hxsysAcKjkemu;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysAcKjkemuMapper {
    List<hxsysAcKjkemu> mySelect(hxsysAcKjkemu hxsysackjkemu);

    hxsysAcKjkemu mySelectOne(hxsysAcKjkemu hxsysackjkemu);

    List<hxsysAcKjkemu> mySelectPage(@Param("record") hxsysAcKjkemu hxsysackjkemu, @Param("mypage") myPage mypage);

    int myCount(hxsysAcKjkemu hxsysackjkemu);

    int myInsert(hxsysAcKjkemu hxsysackjkemu);

    int myUpdateOne(hxsysAcKjkemu hxsysackjkemu);

    int myDelete(hxsysAcKjkemu hxsysackjkemu);

    int myUpdateByExmp(@Param("record") hxsysAcKjkemu record, @Param("updkey") hxsysAcKjkemu updkey);
}