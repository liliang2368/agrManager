package com.ly.agrManader.web.model;

import java.io.Serializable;

public class JsonModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2880873342154063305L;
	private Integer code;
	private String msg;
	private Object obj;
	private String url;


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "JsonModel [code=" + code + ", msg=" + msg + ", obj=" + obj + ", url=" + url + "]";
	}

	public static JsonModel success(Object object)
	{
		JsonModel jsonmodel=new JsonModel();
		jsonmodel.setObj(object);
		jsonmodel.setCode(200);
		return jsonmodel;
	}
	public static JsonModel fail(Object object)
	{
		JsonModel jsonModel=new JsonModel();
		jsonModel.setObj(object);
		jsonModel.setCode(500);
		return jsonModel;
	}

}
