/**
* StudentSearchBean.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.bean.orm;

import java.util.Date;

import com.hua.bean.BaseBean;

/**
 * 描述: 
 * @author qye.zheng
 * StudentSearchBean
 */
public final class StudentSearchBean extends BaseBean {

	/* 学生姓名 */
	private String name;
	
	/* 出生日期_开始值 */
	private Date startBirthday;
	
	/* 出生日期_结束值 */
	private Date endBirthday;
	
	/* 地址 */
	private String address;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the startBirthday
	 */
	public Date getStartBirthday() {
		return startBirthday;
	}

	/**
	 * @param startBirthday the startBirthday to set
	 */
	public void setStartBirthday(Date startBirthday) {
		this.startBirthday = startBirthday;
	}

	/**
	 * @return the endBirthday
	 */
	public Date getEndBirthday() {
		return endBirthday;
	}

	/**
	 * @param endBirthday the endBirthday to set
	 */
	public void setEndBirthday(Date endBirthday) {
		this.endBirthday = endBirthday;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
