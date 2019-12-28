package com.virugan.intercept;

import com.virugan.utils.myBeanUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class myLogInterceptor {


    //全局拦截器，在方法执行前后，增加日志输出执行方法及变量
    @Around("execution(* com.virugan.*.*(..))")
    public Object printServLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("debug >>>> "+ LocalDateTime.now()+" >>>>>>>>>>>>>>> "+pjp.getSignature().getDeclaringTypeName()+
                " : "+pjp.getSignature().getName()+" >>>>>>>>>>>>>>>");
        Object[] args = pjp.getArgs();
        for(Object param:args){
            System.out.println("debug >>>> "+ LocalDateTime.now()+" >>>>>>>>>>>>>>> "+
                    param.getClass().getSimpleName()+" :["+
                    myBeanUtils.objectToMap(param)+"] >>>>>>>>>>>>>>>");
        }

        Object result= pjp.proceed();

        System.out.println("debug <<<< "+ LocalDateTime.now()+" <<<<<<<<<<<<<<< "+
                result.getClass().getSimpleName()+" :["+
                myBeanUtils.objectToMap(result)+"] >>>>>>>>>>>>>>>");
        System.out.println("debug <<<< "+ LocalDateTime.now()+" <<<<<<<<<<<<<<< "+pjp.getSignature().getDeclaringTypeName()+
                " : "+pjp.getSignature().getName()+" <<<<<<<<<<<<<<<");

        return result;
    }
}
