package com.ly.agrManader.util;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * Title: 类型判断，判空，转换 <br>
 * Description: <br>
 * Date: 2017年7月18日 <br>
 * Copyright (c) 2017 AI <br>
 *
 * @author wenya
 */
public class TransTypeUtil {

    private static final Logger log = LoggerFactory.getLogger(TransTypeUtil.class);

    private static final int TIME_LENTH = 6;

    public static boolean toBoolean(Object object) {
        if (null != object && !"".equals(object.toString())) {
            if(object.toString().indexOf("true")!=-1){
                return true;
            }else if(object.toString().indexOf("false")!=-1){
                return false;
            }
        }
        return false;
    }
    public static Map toMap(Object object) {
        if (null != object) {
            try {
                return (Map) object;
            } catch (Exception e) {
                log.error("转换异常：{}",e.getMessage(),e);
            }
        }
        return null;
    }

    public static Double toDouble(String obj) {
        try {
            return Double.valueOf(obj);
        } catch (NumberFormatException e) {
            log.error("转换异常：{}",e.getMessage(),e);
        }
        return Double.valueOf(0);
    }

    public static Double toDouble(Object object) {
        if (null != object && !"".equals(object.toString())) {
            try {
                String in = toString(object);
                return Double.valueOf(in);
            } catch (NumberFormatException e) {
                log.error("转换异常：{}",e.getMessage(),e);
            }
        }
        return null;
    }

    public static List toList(Object object) {
        if (null != object) {
            try {
                return (List) object;
            } catch (Exception e) {
                log.error("转换异常：{}",e.getMessage(),e);
            }
        }
        return new ArrayList();
    }

    public static Short toShort(Object object) {
        if (null != object && !"".equals(object.toString())) {
            try {
                return Short.valueOf(object.toString());
            } catch (NumberFormatException e) {
                log.error("转换异常：{}",e.getMessage(),e);
            }
        }
        return null;
    }

    public static Integer toInteger(Object object) {
        if (null != object && !"".equals(object.toString())) {
            try {
                String in = object.toString();
                if (StringUtil.isNotBlank(in)&&in.indexOf(".") != -1) {
                    in = in.split("\\.")[0];
                    return Integer.valueOf(in);
                }
                return Integer.valueOf(in);
            } catch (NumberFormatException e) {
                log.error("转换异常：{}",e.getMessage(),e);
            }
        }
        return null;
    }

    public static Long toLong(Object object) {
        if (null != object && !"".equals(object.toString())) {
            try {
                String in = object.toString();
                if (StringUtil.isNotBlank(in)&&in.indexOf(".") != -1) {
                    in =in.split("\\.")[0];
                    return Long.valueOf(in);
                }
                return Long.valueOf(in);
            } catch (NumberFormatException e) {
                log.error("转换异常：{}",e.getMessage(),e);
            }
        }
        return null;
    }

    public static String toString(Object object) {
        if (null != object && !"".equals(object.toString())) {
            return String.valueOf(object).trim();
        }
        return null;
    }


    public static Calendar toCalendar(Object dateObj,String Style){
        if (dateObj == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = null;
        try {
            if(null != Style ){
                sdf = new SimpleDateFormat(Style);
            }
            if (dateObj instanceof Date) {
                if(null != sdf && Style.length()>=TIME_LENTH){
                    c.setTime(sdf.parse(sdf.format(dateObj)));
                }else{
                    c.setTime((Date)dateObj);
                }
            } else if (dateObj instanceof String) {
                if(null != sdf){
                    Date date = sdf.parse(dateObj.toString());

                    c.setTime(date);
                }
            } else {
                return null;
            }
        } catch (ParseException e) {
            log.error("转换异常：{}",e.getMessage(),e);
            return null;
        }
        return c;
    }

    public static boolean isNullOrEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof List) {
            return ((List) obj).size()>0?false:true;
        }

        if (obj instanceof Object[]) {
            return ((Object[]) obj).length == 0;
        }
        return false;
    }

    public static String transCode(String value){

        if(StringUtil.isBlank(value)){
            return value;
        }
        try {
            return URLEncoder.encode(value, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            log.error("value = {},转换编码出错：{}",value,e.getMessage(),e);
        }
        return value;
    }


    public static String  getString(Object obj)
    {
        if (obj == null) {
            return "";
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).toString();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).toString();
        }
        if (obj instanceof Map) {
            return ((Map) obj).toString();
        }
        if (obj instanceof List) {
            return ((List) obj).toString();
        }

        if (obj instanceof Object[]) {
            return Arrays.toString((Object[]) obj);
        }

        if (obj instanceof Object[]) {
            return Arrays.toString((Object[]) obj);
        }
        if (obj instanceof Long) {
            return ((Long) obj).toString();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).toString();
        }
        if (obj instanceof Double) {
            return ((Double) obj).toString();
        }
        if (obj instanceof Float) {
            return ((Double) obj).toString();
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).toString();
        }
        return "";
    }

    public static String transValue(String key,Map dataMap){
        String value = null;
        if(null!=dataMap && null!=dataMap.get(key)){
            value = (String) ((Map) dataMap.get(key)).get("value");
        }
        return value;
    }

    public static String arrayToString(Object[] arr,String split)
    {
        StringBuffer sb = new StringBuffer();
        if(!TransTypeUtil.isNullOrEmpty(arr)) {
            for (Object tmp : arr) {
                if(TransTypeUtil.isNullOrEmpty(tmp))
                {
                    continue;
                }
                if(StringUtils.isNotBlank(split))
                {
                    sb.append(split).append(tmp).append(split).append(",");
                }
                else
                {
                    sb.append(tmp).append(",");
                }
            }
        }

        return sb.substring(0,sb.length()-1);
    }

    public static String listToString(List arr,String split)
    {
        StringBuffer sb = new StringBuffer();
        if (!TransTypeUtil.isNullOrEmpty(arr)) {
            for (Object tmp : arr) {
                if(TransTypeUtil.isNullOrEmpty(tmp))
                {
                    continue;
                }
                if(StringUtils.isNotBlank(split))
                {
                    sb.append(split).append(tmp).append(split).append(",");
                }
                else
                {
                    sb.append(tmp).append(",");
                }
            }
        }

        return sb.substring(0,sb.length()-1);
    }

}
