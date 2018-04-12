/**
* PagerEntity.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.entity;

/**
 * 描述: 
 * @author qye.zheng
 * PagerEntity
 */
public final class PagerEntity {
	
	/* 数据页_开始下标 */
	private long startIndex;
	
	/* 数据页_结束下标 */
	private long endIndex;
	
	/* 搜索条件对象 */
	private Object searchBean;

	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public PagerEntity() {
	}
	
	/**
	 * 
	 * @description 构造方法
	 * @param startIndex
	 * @param endIndex
	 * @param searchBean
	 * @author qye.zheng
	 */
	public PagerEntity(Object searchBean, long startIndex, long endIndex) {
		super();
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.searchBean = searchBean;
	}


	/**
	 * @return the startIndex
	 */
	public long getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(long startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the endIndex
	 */
	public long getEndIndex() {
		return endIndex;
	}

	/**
	 * @param endIndex the endIndex to set
	 */
	public void setEndIndex(long endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * @return the searchBean
	 */
	public Object getSearchBean()
	{
		return searchBean;
	}

	/**
	 * @param searchBean the searchBean to set
	 */
	public void setSearchBean(Object searchBean)
	{
		this.searchBean = searchBean;
	}

}
