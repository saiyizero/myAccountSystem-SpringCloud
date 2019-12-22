package com.virugan.mapper.as;

import com.virugan.context.myPage;
import com.virugan.tables.as.hxsysAsNbzhmx;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysAsNbzhmxMapper {
    List<hxsysAsNbzhmx> mySelect(hxsysAsNbzhmx hxsysasnbzhmx);

    hxsysAsNbzhmx mySelectOne(hxsysAsNbzhmx hxsysasnbzhmx);

    List<hxsysAsNbzhmx> mySelectPage(@Param("record") hxsysAsNbzhmx hxsysasnbzhmx, @Param("mypage") myPage mypage);

    int myCount(hxsysAsNbzhmx hxsysasnbzhmx);

    int myInsert(hxsysAsNbzhmx hxsysasnbzhmx);

    int myUpdateOne(hxsysAsNbzhmx hxsysasnbzhmx);

    int myDelete(hxsysAsNbzhmx hxsysasnbzhmx);

    int myUpdateByExmp(@Param("record") hxsysAsNbzhmx record, @Param("updkey") hxsysAsNbzhmx updkey);
}