/**
* StudentDaoImpl.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.dao.m2m.impl;

import com.hua.dao.impl.CoreDaoImpl;
import com.hua.dao.m2m.StudentDao;
import com.hua.mapper.m2m.StudentMapper;
import com.hua.orm.entity.m2m.Student;

/**
 * 描述: 
 * @author qye.zheng
 * StudentDaoImpl
 */
public class StudentDaoImpl extends CoreDaoImpl<String, Student> implements StudentDao 
{
	
	private StudentMapper mapper;

	/**
	 * 
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * 
	 * @param mapper
	 */
	public StudentDaoImpl(final StudentMapper mapper)
	{
		super(mapper);
		this.mapper = mapper;
	}

	
}
