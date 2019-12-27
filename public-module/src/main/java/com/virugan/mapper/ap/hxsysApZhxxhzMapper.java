package com.virugan.mapper.ap;

import com.virugan.context.myPage;
import com.virugan.tables.ap.hxsysApZhxxhz;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysApZhxxhzMapper {
    List<hxsysApZhxxhz> mySelect(hxsysApZhxxhz hxsysapzhxxhz);

    hxsysApZhxxhz mySelectOne(hxsysApZhxxhz hxsysapzhxxhz);

    List<hxsysApZhxxhz> mySelectPage(@Param("record") hxsysApZhxxhz hxsysapzhxxhz, @Param("mypage") myPage mypage);

    int myCount(hxsysApZhxxhz hxsysapzhxxhz);

    int myInsert(hxsysApZhxxhz hxsysapzhxxhz);

    int myUpdateOne(hxsysApZhxxhz hxsysapzhxxhz);

    int myDelete(hxsysApZhxxhz hxsysapzhxxhz);

    int myUpdateByExmp(@Param("record") hxsysApZhxxhz record, @Param("updkey") hxsysApZhxxhz updkey);
}