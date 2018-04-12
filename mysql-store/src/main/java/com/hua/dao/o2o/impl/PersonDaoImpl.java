/**
 * 描述: 
 * PersonDaoImpl.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.dao.o2o.impl;

import com.hua.dao.impl.CoreDaoImpl;
import com.hua.dao.o2o.PersonDao;
import com.hua.mapper.o2o.PersonMapper;
import com.hua.orm.entity.o2o.Person;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * PersonDaoImpl
 */
public final class PersonDaoImpl extends CoreDaoImpl<String, Person> implements
		PersonDao
{

	private PersonMapper mapper;
	
	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	public PersonDaoImpl(final PersonMapper mapper)
	{
		super(mapper);
		this.mapper = mapper;
	}
	
}
