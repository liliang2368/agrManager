package com.ly.agrManader.util;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 字符串工具类 Date: 2017年2月10日 <br>
 * Copyright (c) 2017 asiainfo.com <br>
 *
 * @author
 */
public final class StringUtil {

    private StringUtil() {

    }

    /**
     * 判断是否为空
     *
     * @param str
     * @return
     * @author
     */
    public static boolean isBlank(String str) {
        if (null == str) {
            return true;
        }
        if ("".equals(str.trim())) {
            return true;
        }
        return false;
    }
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static String setUpperCaseForFirstLetter(String name) {
        if (name.length() == 1) {
            return name.toUpperCase();
        }
        String firstLetter = name.substring(0, 1);
        String others = name.substring(1, name.length());
        return firstLetter.toUpperCase() + others;
    }

    public static String toFirstWordUpperCase(String key) {
        if (null == key)
            return null;
        if ("".equals(key.trim())) {
            key = "";
        } else if (key.length() == 1) {
            key = key.toUpperCase();
        } else {
            key = key.substring(0, 1).toUpperCase() + key.substring(1, key.length());
        }
        return key;
    }

    /**
     * 根据BO字段名（如CHNL_ID）得到VO属性名（如chnlId）
     *
     * @param bofieldName
     * @return
     * @author choaryzhang
     */
    public static String getVarName(String bofieldName) {
        if (null == bofieldName)
            return null;
        bofieldName = bofieldName.toLowerCase();
        char[] objchars = bofieldName.toCharArray();
        for (int j = 0; j < objchars.length; j++) {
            if (objchars[j] == '_' && j != objchars.length - 1) {
                objchars[j + 1] = Character.toUpperCase(objchars[j + 1]);
            }
            if (j == 0) {
                objchars[j] = Character.toLowerCase(objchars[j]);
            }
        }
        String str = String.valueOf(objchars);
        str = str.replaceAll("_", "");
        return str;
    }

    /**
     * 截取字符串
     *
     * @param strSrc
     * @param iMaxLength
     * @return
     * @author
     */
    public static String trim(String strSrc, int iMaxLength) {
        if (strSrc == null) {
            return null;
        }
        if (iMaxLength <= 0) {
            return strSrc;
        }
        String strResult = strSrc;
        byte[] b = null;
        int iLength = strSrc.length();
        if (iLength > iMaxLength) {
            strResult = strResult.substring(0, iMaxLength);
            iLength = iMaxLength;
        }
        while (true) {
            b = strResult.getBytes();
            if (b.length <= iMaxLength) {
                break;
            }
            iLength--;
            strResult = strResult.substring(0, iLength);
        }
        return strResult;
    }

    /**
     * 获取随机字符串
     *
     * @param length
     * @return
     * @author
     */
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int n = str.length();
        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < length; i++) {
            buf.append(str.charAt(ThreadLocalRandom.current().nextInt(n)));
        }

        return buf.toString();
    }
    public static String getRandomCode(int length) {
        String str = "ABCDEFGHJKLMNPQRSTUVWXYZ123456789";
        int n = str.length();
        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < length; i++) {
            buf.append(str.charAt(ThreadLocalRandom.current().nextInt(n)));
        }

        return buf.toString();
    }

    /**
     * 左补齐
     *
     * @param target
     *            目标字符串
     * @param fix
     *            补齐字符
     * @param length
     *            目标长度
     * @return
     */
    public static String lPad(String target, String fix, int length) {
        if (target == null || fix == null || !(target.length() < length)) {
            return target;
        }
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < length - target.length(); i++) {
            newStr.append(fix);
        }
        return newStr.append(target).toString();
    }

    /**
     * 右补齐
     *
     * @param target
     *            目标字符串
     * @param fix
     *            补齐字符
     * @param length
     *            目标长度
     * @return
     */
    public static String rPad(String target, String fix, int length) {
        if (target == null || fix == null || !(target.length() < length)) {
            return target;
        }
        StringBuilder newStr = new StringBuilder();
        newStr.append(target);
        for (int i = 0; i < length - target.length(); i++) {
            newStr.append(fix);
        }
        return newStr.toString();
    }

    /**
     * 字符串数据join操作
     *
     * @param strs
     * @param spi
     * @return
     * @author zhoubo
     */
    public static String join(String[] strs, String spi) {
        StringBuilder buf = new StringBuilder();
        int step = 0;
        for (String str : strs) {
            buf.append(str);
            if (step++ < strs.length - 1) {
                buf.append(spi);
            }
        }
        return buf.toString();
    }




    /**
     * 固网号码去除 区号-号码 中间的横杠 010-88018802
     *
     * @param str
     * @return
     * @author mayt
     */
    public static String replaceServiceNumBar(String str) {
        if(isBlank(str)) return null;
        return str.replaceAll("\\-", "");
    }

    /**
     * 获取字符串对应的字节长度，英文占一个字节，中文3个字节（UTF-8编码）
     *
     * @param str
     * @return
     * @author gucl
     */
    public static int getByteLength(String str) {
        try {
            byte[] b = str.getBytes("UTF-8");
            return b.length;
        } catch (Exception ex) {
            return 0;
        }
    }

}
