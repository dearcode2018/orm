/**
 * 描述: 
 * BaseSearch.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.search.bean;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 描述: 搜索条件
 * @author qye.zheng
 * 
 * BaseSearch
 */
public abstract class BaseSearch
{

	/**
	 搜索数据类型
	 1) 日期/时间/时间戳
	 	日期 : 起止日期( startDate / endDate )
	 	时间 : startTime / endTime
		时间戳 : startTs / endTs
		
		起止参数 均可能为空，需要判断再放入sql拼接
		
		2) 字符
		  LIKE 模糊查询
		  LIKE CONCAT('%', str, '%') ESCAPE '/';
		  LIKE CONCAT('%', str, '') ESCAPE '/';
		  LIKE CONCAT('', str, '%') ESCAPE '/';
		  
		3) 不等/等值/
		直接获取其值，然后拼接到sql中
		= 
		!=
		<>
		
		4) 范围值
		>= <= > < 
		BETWEEN xx AND yy
		>... AND >...
		
		search 对象
		
	 */
	
	 /**
	 * 描述: 
	 * @author qye.zhenge
	 * 
	 * @return
	 */
	@Override
	public String toString()
	{
		return new ReflectionToStringBuilder(this).toString();
	}
}
