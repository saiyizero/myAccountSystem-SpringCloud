package com.virugan.interfac;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class myDbHandle {

    public String getTableName(Object mycomponent){
        if(mycomponent instanceof myComponent){
            return ((myComponent) mycomponent).getTableName();
        }else{
            Pattern humpPattern = Pattern.compile("[A-Z]");
            Matcher matcher = humpPattern.matcher(mycomponent.getClass().getSimpleName());
            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
            }
            matcher.appendTail(sb);
            return sb.toString();
        }
    }

    public LinkedHashMap<String,Object> getPrimaryKey(Object mycomponent){
        if(mycomponent instanceof myComponent){
            return ((myComponent) mycomponent).getPrimaryKey();
        }else {
            return null;
        }
    }
}