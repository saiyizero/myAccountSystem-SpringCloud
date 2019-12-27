package com.virugan.impl;

import com.virugan.interfac.myDbHandle;
import com.virugan.myTemple.MyJdbcTempleWithCache;
import com.virugan.utils.myBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Component("TableKeyGeneratorImpl")
public class TableKeyGeneratorImpl implements KeyGenerator {

    @Autowired
    myDbHandle mydbhandle;
    @Override
    public Object generate(Object o, Method method, Object... objects) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object obj : objects) {
            String tableNme = obj.getClass().getSimpleName();
            Map<String, Object> keyAndValue = myBeanUtils.getKeyAndValue(obj);
            stringBuilder.append(tableNme);
            LinkedHashMap<String,Object> pkmap = mydbhandle.getPrimaryKey(obj);
            stringBuilder.append(":");
            for(String key:pkmap.keySet()){
                stringBuilder.append(keyAndValue.get(key));
                stringBuilder.append(":");
            }
        }
        return stringBuilder.toString();
    }
}
