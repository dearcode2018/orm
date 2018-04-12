/**
  * @filename ClobType.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.orm.entity.type;

import java.sql.Clob;

import com.hua.entity.BaseEntity;

 /**
 * @type ClobType
 * @description 
 * @author qye.zheng
 */
public final class ClobType extends BaseEntity {

	
	/**
	 * 持久化类 中 二进制大数据对象 可以为 String 或 Clob
	 */
	
	private String string;
	
	private Clob clob;

	/**
	 * @return the string
	 */
	public final String getString() {
		return string;
	}

	/**
	 * @param string the string to set
	 */
	public final void setString(String string) {
		this.string = string;
	}

	/**
	 * @return the clob
	 */
	public final Clob getClob() {
		return clob;
	}

	/**
	 * @param clob the clob to set
	 */
	public final void setClob(Clob clob) {
		this.clob = clob;
	}
	
	
}
