package com.weida.easycollege.dto;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;


/**
 * 返回值传输对象
 */
@SuppressWarnings({"serial", "rawtypes", "unchecked"})
public class ReturnDto extends HashMap {

	private static final String CODE = "code";
	private static final String MSG = "msg";
	private static final String DATA = "data";
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	
	public static ReturnDto ok() {
		return new ReturnDto().setOk();
	}
	public static ReturnDto okData(Object value) {
		return new ReturnDto().setOkData(value);
	}
	
	public static ReturnDto ok(Object msg) {
		return new ReturnDto().setOk(msg);
	}
	
	public static ReturnDto ok(Object key, Object value) {
		return ok().set(key, value);
	}
	
	public static ReturnDto fail() {
		return new ReturnDto().setFail();
	}
	
	public static ReturnDto fail(int code,Object msg) {
		return new ReturnDto().setFail(code,msg);
	}
	
	public static ReturnDto ok(int code,Object msg) {
		return new ReturnDto().setOk(code, msg);
	}
	
	public static ReturnDto fail(Object msg) {
		return new ReturnDto().setFail(msg);
	}
	
	public static ReturnDto fail(Object key, Object value) {
		return fail().set(key, value);
	}
	
	public static ReturnDto create() {
		return new ReturnDto();
	}
	
	public static ReturnDto create(Object key, Object value) {
		return new ReturnDto().set(key, value);
	}
	
	public boolean success() {
		Boolean success = (Boolean)get(SUCCESS);
		return success != null && success;
	}
	
	public ReturnDto setOk() {
		super.put(SUCCESS, true);
		super.put(CODE, 200);
		super.put(MSG, SUCCESS);
		return this;
	}
	
	public ReturnDto setOk(Object msg) {
		super.put(SUCCESS, true);
		super.put(CODE, 200);
		super.put(MSG, msg);
		return this;
	}
	
	
	public ReturnDto setOk(int code,Object msg) {
		super.put(SUCCESS, true);
		super.put(CODE, code);
		super.put(MSG, SUCCESS);
		return this;
	}
	
	public ReturnDto setOkData(Object value) {
		super.put(DATA, value);
		super.put(SUCCESS, true);
		super.put(CODE, 200);
		super.put(MSG, SUCCESS);
		return this;
	}
	
	public ReturnDto setFail(Object msg) {
		super.put(SUCCESS, false);
		super.put(CODE, 501);
		super.put(MSG, msg);
		return this;
	}
	
	public ReturnDto setFail(int code,Object msg) {
		super.put(SUCCESS, false);
		super.put(CODE, code);
		super.put(MSG, msg);
		return this;
	}
	
	public ReturnDto setFail() {
		super.put(SUCCESS, false);
		super.put(CODE, 501);
		super.put(MSG, FAIL);
		return this;
	}
	
	public ReturnDto set(Object key, Object value) {
		super.put(key, value);
		return this;
	}
	
	public ReturnDto setCode(int value) {
		super.put(CODE, value);
		return this;
	}
	
	public ReturnDto setMsg(String value) {
		super.put(MSG, value);
		return this;
	}
	
	public ReturnDto set(Map map) {
		super.putAll(map);
		return this;
	}
	
	public ReturnDto set(ReturnDto ret) {
		super.putAll(ret);
		return this;
	}
	
	public ReturnDto delete(Object key) {
		super.remove(key);
		return this;
	}
	
	public <T> T getAs(Object key) {
		return (T)get(key);
	}
	
	public String getStr(Object key) {
		return (String)get(key);
	}

	public Integer getInt(Object key) {
		return (Integer)get(key);
	}

	public Long getLong(Object key) {
		return (Long)get(key);
	}

	public Boolean getBoolean(Object key) {
		return (Boolean)get(key);
	}
	
	/**
	 * key 存在，并且 value 不为 null
	 */
	public boolean notNull(Object key) {
		return get(key) != null;
	}
	
	/**
	 * key 不存在，或者 key 存在但 value 为null
	 */
	public boolean isNull(Object key) {
		return get(key) == null;
	}
	
	/**
	 * key 存在，并且 value 为 true，则返回 true
	 */
	public boolean isTrue(Object key) {
		Object value = get(key);
		return (value instanceof Boolean && ((Boolean)value == true));
	}
	
	/**
	 * key 存在，并且 value 为 false，则返回 true
	 */
	public boolean isFalse(Object key) {
		Object value = get(key);
		return (value instanceof Boolean && ((Boolean)value == false));
	}
	
	public String toJson() {
		return  JSONObject.toJSONString(this);
	}
	
	public boolean equals(Object ret) {
		return ret instanceof ReturnDto && super.equals(ret);
	}
}


