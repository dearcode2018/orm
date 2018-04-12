/**
 * 描述: 
 * BaseVo.java
 * @author qye.zhenge
 * 
 *  version 1.0
 */
package com.hua.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 描述: 
 * @author qye.zhenge
 * 
 * BaseVo
 */
public abstract class BaseVo implements Serializable
{

	/**
	 
	 vo : view object 视图对象
	 请求数据、响应数据
	 
	 BaseVo : 
	 分页、搜索、展示、参数、
	 
	 vo用途 : 
	 新增 : 接收单个新增实体数据
	 
	 删除 :接收单个id 或者 集合ids(多个id直接采用ids，而不用vo)
	 
	 修改 : 接收单个修改实体数据
	 
	 查看单个 : 接收单个id，响应单个实体（若vo含有分页参数，
	 则响应的数据存在冗余）
	 
	 列表搜索 : 接收搜索参数，响应列表数据，对于范围参数，vo
	 不能实现接收参数的功能，需要通过专门的searchBean来实现
	 
	 vo 是一种视图对象，就是用来展示数据用的，
	 其所有的属性都和页面息息相关，而vo需要和
	 持久层的多个实体建立复杂的关系，从而实现
	 值的拷贝和转变，
	 
	 */
	/**
	
	vo 展示注重字面值的展示，直接字符串/数值/..
	或者



	 */
	
	 /* long */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
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

	/**
	 * @return the id
	 */
	public final String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(String id) {
		this.id = id;
	}
	
}
