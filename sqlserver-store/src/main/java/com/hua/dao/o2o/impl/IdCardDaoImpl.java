/**
 * 描述: 
 * IdCardDaoImpl.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.dao.o2o.impl;

import com.hua.dao.impl.CoreDaoImpl;
import com.hua.dao.o2o.IdCardDao;
import com.hua.mapper.o2o.IdCardMapper;
import com.hua.orm.entity.o2o.IdCard;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * IdCardDaoImpl
 */
public final class IdCardDaoImpl extends CoreDaoImpl<Long, IdCard> implements
		IdCardDao
{

	private IdCardMapper mapper;
	
	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	public IdCardDaoImpl(final IdCardMapper mapper)
	{
		super(mapper);
		this.mapper = mapper;
	}
	
}
