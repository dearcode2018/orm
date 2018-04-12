/**
 * 描述: 
 * BaseEntity.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.entity;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;



/**
 * 描述: 
 * 
 * @author qye.zheng
 * BaseEntity
 */
public abstract class BaseEntity {

	/* 对象唯一id */
	private String id;

	/**
	 * @return the oid
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param oid the oid to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 描述: 
	 * @author qye.zheng
	 * 
	 * @return
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * 描述: 
	 * @author qye.zheng
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public String toString() {
		return new ReflectionToStringBuilder(this).toString();
	}
	
}
