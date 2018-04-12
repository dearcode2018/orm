/**
 * 描述: 
 * Sequence.java
 * @author	qye.zheng
 * 
 *  version 1.0
 */
package com.hua.bean.jdbc;

/**
 * 描述: 键 - 序列
 * @author  qye.zheng
 * 
 * Sequence
 */
public final class Sequence
{

	/**
	 刚刚创建的 sequence ，其当前值是 start with 值
	 采用  nextVal, 执行一个sql插入语之后，当前值+1，
	 和当前最新的一条记录的id值相同.
	 
	 */
	
	/* 当前值 */
	private Long currentValue;
	
	/* 下一个值 */
	private Long nextValue;
	
	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	public Sequence()
	{
	}
	
	/**
	 * 
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 * @param currentValue
	 * @param nextValue
	 */
	public Sequence(Long currentValue, Long nextValue)
	{
		super();
		this.currentValue = currentValue;
		this.nextValue = nextValue;
	}

	/**
	 * @return the currentValue
	 */
	public Long getCurrentValue()
	{
		return currentValue;
	}

	/**
	 * @param currentValue the currentValue to set
	 */
	public void setCurrentValue(Long currentValue)
	{
		this.currentValue = currentValue;
	}

	/**
	 * @return the nextValue
	 */
	public Long getNextValue()
	{
		return nextValue;
	}

	/**
	 * @param nextValue the nextValue to set
	 */
	public void setNextValue(Long nextValue)
	{
		this.nextValue = nextValue;
	}
	
}
