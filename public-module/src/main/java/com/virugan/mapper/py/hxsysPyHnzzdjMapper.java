package com.virugan.mapper.py;

import com.virugan.context.myPage;
import com.virugan.tables.py.hxsysPyHnzzdj;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface hxsysPyHnzzdjMapper {
    List<hxsysPyHnzzdj> mySelect(hxsysPyHnzzdj hxsyspyhnzzdj);

    hxsysPyHnzzdj mySelectOne(hxsysPyHnzzdj hxsyspyhnzzdj);

    List<hxsysPyHnzzdj> mySelectPage(@Param("record") hxsysPyHnzzdj hxsyspyhnzzdj, @Param("mypage") myPage mypage);

    int myCount(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myInsert(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myUpdateOne(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myDelete(hxsysPyHnzzdj hxsyspyhnzzdj);

    int myUpdateByExmp(@Param("record") hxsysPyHnzzdj record, @Param("updkey") hxsysPyHnzzdj updkey);
}