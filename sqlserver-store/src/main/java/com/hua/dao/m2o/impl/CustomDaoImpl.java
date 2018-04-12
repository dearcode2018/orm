/**
 * 描述: 
 * CustomDaoImpl.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.dao.m2o.impl;

import com.hua.dao.impl.CoreDaoImpl;
import com.hua.dao.m2o.CustomDao;
import com.hua.mapper.m2o.CustomMapper;
import com.hua.orm.entity.m2o.Custom;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * CustomDaoImpl
 */
public final class CustomDaoImpl extends CoreDaoImpl<Long, Custom> implements CustomDao
{

	private CustomMapper mapper;
	
	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	public CustomDaoImpl(final CustomMapper mapper)
	{
		super(mapper);
		this.mapper = mapper;
	}

	
}
