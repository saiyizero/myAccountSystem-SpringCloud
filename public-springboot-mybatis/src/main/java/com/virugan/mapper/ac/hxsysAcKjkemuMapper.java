package com.virugan.mapper.ac;

import com.virugan.tables.ac.hxsysAcKjkemu;
import com.virugan.tables.ac.hxsysAcKjkemuExample;
import com.virugan.tables.ac.hxsysAcKjkemuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface hxsysAcKjkemuMapper {
    int countByExample(hxsysAcKjkemuExample example);

    int deleteByExample(hxsysAcKjkemuExample example);

    int deleteByPrimaryKey(hxsysAcKjkemuKey key);

    int insert(hxsysAcKjkemu record);

    int insertSelective(hxsysAcKjkemu record);

    List<hxsysAcKjkemu> selectByExample(hxsysAcKjkemuExample example);

    hxsysAcKjkemu selectByPrimaryKey(hxsysAcKjkemuKey key);

    int updateByExampleSelective(@Param("record") hxsysAcKjkemu record, @Param("example") hxsysAcKjkemuExample example);

    int updateByExample(@Param("record") hxsysAcKjkemu record, @Param("example") hxsysAcKjkemuExample example);

    int updateByPrimaryKeySelective(hxsysAcKjkemu record);

    int updateByPrimaryKey(hxsysAcKjkemu record);
}