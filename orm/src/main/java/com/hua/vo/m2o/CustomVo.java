/**
 * 描述: 
 * CustomVo.java
 * @author qye.zhenge
 * 
 *  version 1.0
 */
package com.hua.vo.m2o;

import com.hua.vo.BaseVo;

/**
 * 描述: 
 * @author qye.zhenge
 * 
 * CustomVo
 */
public final class CustomVo extends BaseVo
{

	 /* long */
	private static final long serialVersionUID = 1L;
	
	/* 客户姓名 */
	private String name;

	/* 帐户余额 */
	private Double balance;
	
	/* 住址 */
	private String address;
	
	/* 客户状态 (0-无效, 1-未激活, 2-正常) */
	private String status;
	
	/* 客户状态 (0-无效, 1-未激活, 2-正常) */
	private String statusName;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance()
	{
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance)
	{
		this.balance = balance;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * @return the status
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status)
	{
		this.status = status;
	}

	/**
	 * @return the statusName
	 */
	public String getStatusName()
	{
		return statusName;
	}

	/**
	 * @param statusName the statusName to set
	 */
	public void setStatusName(String statusName)
	{
		this.statusName = statusName;
	}
	

}
