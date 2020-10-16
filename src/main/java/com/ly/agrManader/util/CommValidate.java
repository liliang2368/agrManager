package com.ly.agrManader.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: xietengfei
 * @date: 2019/1/26 12:21
 * @description:
 **/
public class CommValidate {

    public static void validate(String str,String message)
    {
        if(StringUtil.isBlank(str))
        {
            throw new BusinessException(BusinessConstants.BUSI_FAILURE_CODE,message);
        }
    }

    public static void validateLength(String str,String message,int length)
    {
        if(!StringUtil.isBlank(str) && str.length() > length)
        {
            throw new BusinessException(BusinessConstants.BUSI_FAILURE_CODE,message);
        }
    }

    public static void validate(Object object,String message)
    {
        if(null == object)
        {
            throw new BusinessException(ErrorConstants.CommonError.ERROR_CODE_MISSING_PARAM,message);
        }
    }

    public static void containsValue(String type,String message,String... args)
    {
        Set<String>  argsSet = new HashSet<String>();

        for(String arg : args)
        {
            argsSet.add(arg);
        }

        if(!argsSet.contains(type))
        {
            throw new BusinessException(BusinessConstants.BUSI_FAILURE_CODE,message);
        }
    }

    public static void mustGreaterThanZero(Long amount,String message)
    {
        if(null == amount || amount <=0)
        {
            throw new BusinessException(BusinessConstants.BUSI_FAILURE_CODE,message);
        }
    }

    public static void validateList(List object,String message)
    {
        if(TransTypeUtil.isNullOrEmpty(object))
        {
            throw new BusinessException(ErrorConstants.CommonError.ERROR_CODE_MISSING_PARAM,message);
        }
    }
}
