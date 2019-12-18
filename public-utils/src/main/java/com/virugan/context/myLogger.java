package com.virugan.context;

import com.virugan.utils.myBeanUtils;
import org.springframework.stereotype.Component;

@Component
public class myLogger {

    private final static  String infohead="info >>>> ";
    private final static  String debughead="debug >>>> ";

    public void info(String paramNme,Object paramVal){
        System.out.println(infohead+paramNme +" :["+paramVal+"]");
    }

    public void info(Object paramVal){
        System.out.println(infohead+paramVal.getClass().getSimpleName() +" :["+paramVal+"]");
    }

    public void info(Object[] paramVal){
        StringBuffer buffer = new StringBuffer();
        buffer.append(infohead +" :[");
        int length = paramVal.length;
        int i=0;
        for(Object obj:paramVal){
            if(obj!=null){
                buffer.append(obj.toString());
            }else{
                buffer.append(obj);
            }
            if(i<length-1){
                buffer.append(",");
            }
            i=i+1;
        }
        buffer.append("]");
        System.out.println(buffer.toString());
    }

    public void info(String paramNme,Object[] paramVal){
        StringBuffer buffer = new StringBuffer();
        buffer.append(infohead+paramNme +" :[");
        int length = paramVal.length;
        int i=0;
        for(Object obj:paramVal){
            if(obj!=null){
                buffer.append(obj.toString());
            }else{
                buffer.append(obj);
            }
            if(i<length-1){
                buffer.append(",");
            }
            i=i+1;
        }
        buffer.append("]");
        System.out.println(buffer.toString());
    }

    public void debug(String paramNme,Object paramVal){
        System.out.println(debughead+paramNme +" :["+paramVal+"]");
    }

    public void debug(Object paramVal){
        System.out.println(debughead+paramVal.getClass().getSimpleName() +" :["+paramVal+"]");
    }

    public void debug(Object[] paramVal){
        StringBuffer buffer = new StringBuffer();
        buffer.append(debughead +" :[");
        int length = paramVal.length;
        int i=0;
        for(Object obj:paramVal){
            if(obj!=null){
                buffer.append(obj.toString());
            }else{
                buffer.append(obj);
            }
            if(i<length-1){
                buffer.append(",");
            }
            i=i+1;
        }
        buffer.append("]");
        System.out.println(buffer.toString());
    }

    public void debug(String paramNme,Object[] paramVal){
        StringBuffer buffer = new StringBuffer();
        buffer.append(debughead+paramNme +" :[");
        int length = paramVal.length;
        int i=0;
        for(Object obj:paramVal){
            if(obj!=null){
                buffer.append(obj.toString());
            }else{
                buffer.append(obj);
            }
            if(i<length-1){
                buffer.append(",");
            }
            i=i+1;
        }
        buffer.append("]");
        System.out.println(buffer.toString());
    }

    public void debugToObject(Object paramVal){
        System.out.println(debughead+paramVal.getClass().getSimpleName() +" :["+myBeanUtils.objectToMap(paramVal)+"]");
    }

    public void debugToObject(String paramNme,Object paramVal){
        System.out.println(debughead+debughead+paramNme +" :["+myBeanUtils.objectToMap(paramVal)+"]");
    }
}
