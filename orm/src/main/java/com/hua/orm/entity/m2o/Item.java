/**
 * 描述: 
 * Item.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.orm.entity.m2o;

import java.util.Date;

import com.hua.entity.BaseEntity;

/**
 * 描述: 订单
 * @author qye.zheng
 * 
 * Item
 */
public class Item extends BaseEntity
{

	/**
	 * 一个客户可以拥有多个订单，一个订单只属于一个客户
	 */
	
	/* 定单名称 */
	private String name;
	
	/* 下单时间戳 yyyy-MM-dd HH:mm:ss */
	private Date orderTs;
	
	/* 消费金额 */
	private Double monetary;

	/* 备注 */
	private String remark;
	
	// many to one
	/* 订单所属的客户 */
	private Custom custom;

	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	public Item()
	{
		name = "未知消费订单";
		orderTs = new Date();
	}
	
	public Item(String name)
	{
		super();
		this.name = name;
	}


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
	 * @return the orderTs
	 */
	public Date getOrderTs()
	{
		return orderTs;
	}

	/**
	 * @param orderTs the orderTs to set
	 */
	public void setOrderTs(Date orderTs)
	{
		this.orderTs = orderTs;
	}

	/**
	 * @return the monetary
	 */
	public Double getMonetary()
	{
		return monetary;
	}

	/**
	 * @param monetary the monetary to set
	 */
	public void setMonetary(Double monetary)
	{
		this.monetary = monetary;
	}

	/**
	 * @return the remark
	 */
	public String getRemark()
	{
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	/**
	 * @return the custom
	 */
	public Custom getCustom()
	{
		return custom;
	}

	/**
	 * @param custom the custom to set
	 */
	public void setCustom(Custom custom)
	{
		this.custom = custom;
	}
	
}
