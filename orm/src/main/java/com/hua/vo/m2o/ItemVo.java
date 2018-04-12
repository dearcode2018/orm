/**
 * 描述: 
 * ItemVo.java
 * @author qye.zhenge
 * 
 *  version 1.0
 */
package com.hua.vo.m2o;

import java.util.Date;

import com.hua.vo.BaseVo;

/**
 * 描述: 
 * @author qye.zhenge
 * 
 * ItemVo
 */
public final class ItemVo extends BaseVo
{

	 /* long */
	private static final long serialVersionUID = 1L;

	/* 定单名称 */
	private String name;
	
	/* 下单时间戳 yyyy-MM-dd HH:mm:ss */
	private Date orderTs;
	
	/* 消费金额 */
	private Double monetary;

	/* 备注 */
	private String remark;

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
	
}
