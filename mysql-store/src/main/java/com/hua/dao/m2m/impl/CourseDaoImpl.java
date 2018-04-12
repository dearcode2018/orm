/**
 * 描述: 
 * CourseDaoImpl.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.dao.m2m.impl;

import com.hua.dao.impl.CoreDaoImpl;
import com.hua.dao.m2m.CourseDao;
import com.hua.mapper.m2m.CourseMapper;
import com.hua.orm.entity.m2m.Course;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * CourseDaoImpl
 */
public final class CourseDaoImpl extends CoreDaoImpl<Long, Course> implements
		CourseDao
{
	private CourseMapper mapper;
	
	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zhenge
	 * 
	 */
	public CourseDaoImpl(final CourseMapper mapper)
	{
		super(mapper);
		this.mapper = mapper;
	}
	
	
	
}
