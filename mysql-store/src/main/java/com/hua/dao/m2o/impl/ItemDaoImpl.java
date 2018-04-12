/**
 * 描述: 
 * ItemDaoImpl.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.dao.m2o.impl;

import com.hua.dao.impl.CoreDaoImpl;
import com.hua.dao.m2o.ItemDao;
import com.hua.mapper.m2o.ItemMapper;
import com.hua.orm.entity.m2o.Item;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * ItemDaoImpl
 */
public final class ItemDaoImpl extends CoreDaoImpl<Long, Item> implements ItemDao
{

	private ItemMapper mapper;
	
	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	public ItemDaoImpl(final ItemMapper mapper)
	{
		super(mapper);
		this.mapper = mapper;
	}
	
}
