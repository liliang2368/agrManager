package com.ly.agrManader.util;

import java.io.Serializable;

import com.ly.agrManader.dao.bo.Purchase;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 服务返回基本信息<br>
 * Date: 2017年2月22日 <br>
 * Copyright (c) 2017 asiainfo.com <br>
 *
 * @author gucl
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 是否业务成功
     */
    private boolean success;

    /**
     * 是否成功代码："000000":成功，其他失败
     */
    private String resultCode;

    /**
     * 是否成功代码对应的信息
     */
    private String resultMessage;

    /**
     * 用于异常时，存放堆栈信息
     */
    private Object info="";

    /**
     * 业务数据
     */
    private T result=null;

    /**
     * 默认构造函数
     */
    public BaseResponse() {
        super();
    }

    /**
     * 构造函数
     * @param success 是否成功
     * @param resultCode 是否成功代码
     * @param resultMessage 是否成功信息
     */
    public BaseResponse(boolean success, String resultCode, String resultMessage) {
        super();
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    /**
     * 构造函数
     * @param success 是否成功
     * @param resultCode 是否成功代码
     * @param resultMessage 是否成功信息
     * @param info 扩展信息 ，异常时存异常储堆栈信息
     */
    public BaseResponse(boolean success, String resultCode, String resultMessage, Object info) {
        super();
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.info = info;
    }

    /**
     * 构造函数
     * @param success 是否成功
     * @param resultCode 是否成功代码
     * @param resultMessage 是否成功信息
     * @param info 扩展信息 ，异常时存异常储堆栈信息
     * @param result 业务执行结果
     */
    public BaseResponse( boolean success, String resultCode, String resultMessage, Object info,T result) {
        super();
        this.success = success;
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.info = info;
        this.result = result;
    }



    public T getResult() {
        return result;
    }

    public void setResult(pageResult<Purchase> result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }


}

