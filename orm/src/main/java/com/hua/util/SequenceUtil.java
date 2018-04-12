/**
 * 描述: 
 * SequenceUtil.java
 * @author	qye.zheng
 * 
 *  version 1.0
 */
package com.hua.util;

import com.hua.bean.jdbc.Sequence;

/**
 * 描述: 序列工具
 * 适应 Oracle 序列
 * @author  qye.zheng
 * 
 * SequenceUtil
 */
public final class SequenceUtil
{

	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	private SequenceUtil()
	{
	}
	
	/**
	 * 
	 * 描述: 获取序列对象 
	 * @author qye.zheng
	 * 
	 * @param sequenceName 序列名称
	 * @return
	 */
	public static Sequence getSequence(final String sequenceName) 
	{
		final Sequence sequence = new Sequence();
		
		
		return sequence;
	}
	

}
