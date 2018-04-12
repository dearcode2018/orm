/**
 * 描述: 
 * Custom.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.orm.entity.m2o;

import java.util.HashSet;
import java.util.Set;

import com.hua.constant.ext.CustomStatus;
import com.hua.entity.BaseEntity;

/**
 * 描述: 客户
 * @author qye.zheng
 * 
 * Custom
 */
public class Custom extends BaseEntity
{

	/**
	 * 一个客户可以拥有多个订单，一个订单只属于一个客户
	 */
	
	/* 客户姓名 */
	private String name;

	/* 帐户余额 */
	private Double balance;
	
	/* 住址 */
	private String address;
	
	/* 客户状态 (0-无效, 1-未激活, 2-正常) */
	private CustomStatus status = CustomStatus.INVALIDE;
	
	// one to many
	/* 客户的所有订单 */
	private Set<Item> items = new HashSet<Item>();

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
	public CustomStatus getStatus()
	{
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(CustomStatus status)
	{
		this.status = status;
	}

	/**
	 * @return the items
	 */
	public Set<Item> getItems()
	{
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set<Item> items)
	{
		this.items = items;
	}
	
}
