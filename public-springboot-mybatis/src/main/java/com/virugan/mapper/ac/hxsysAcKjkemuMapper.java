package com.virugan.mapper.ac;

import com.virugan.tables.ac.hxsysAcKjkemu;
import java.util.List;

public interface hxsysAcKjkemuMapper {
    List<hxsysAcKjkemu> mySelect(hxsysAcKjkemu hxsysackjkemu);

    hxsysAcKjkemu mySelectOne(hxsysAcKjkemu hxsysackjkemu);

    int myCount(hxsysAcKjkemu hxsysackjkemu);

    int myInsert(hxsysAcKjkemu hxsysackjkemu);

    int myUpdateOne(hxsysAcKjkemu hxsysackjkemu);

    int myDelete(hxsysAcKjkemu hxsysackjkemu);
}