package com.virugan.mapper.as;

import com.virugan.context.myPage;
import com.virugan.tables.as.hxsysAsZjywbm;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysAsZjywbmMapper {
    List<hxsysAsZjywbm> mySelect(hxsysAsZjywbm hxsysaszjywbm);

    hxsysAsZjywbm mySelectOne(hxsysAsZjywbm hxsysaszjywbm);

    List<hxsysAsZjywbm> mySelectPage(@Param("record") hxsysAsZjywbm hxsysaszjywbm, @Param("mypage") myPage mypage);

    int myCount(hxsysAsZjywbm hxsysaszjywbm);

    int myInsert(hxsysAsZjywbm hxsysaszjywbm);

    int myUpdateOne(hxsysAsZjywbm hxsysaszjywbm);

    int myDelete(hxsysAsZjywbm hxsysaszjywbm);

    int myUpdateByExmp(@Param("record") hxsysAsZjywbm record, @Param("updkey") hxsysAsZjywbm updkey);
}