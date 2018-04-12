/**
 * 描述: 
 * PersonMapper.java
 * @author	qye.zheng
 * 
 *  version 1.0
 */
package com.hua.mapper.o2o;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.hua.mapper.CoreMapper;
import com.hua.orm.entity.o2o.Person;
import com.hua.search.bean.o2o.PersonSearch;

/**
 * 描述: 
 * @author  qye.zheng
 * 
 * PersonMapper
 */
public interface PersonMapper extends CoreMapper<String, Person>
{

	/**
	 * 
	 * 描述: array foreach (collection = array)
	 * @author qye.zheng
	 * @param oids
	 * @return
	 */
	public Long arrayForeach(final Long[] oids);
	
	/**
	 * 
	 * 描述: list foreach (collection = list)
	 * @author qye.zheng
	 * @param oids
	 * @return
	 */
	public Long listForeach(final List<Long> oids);
	
	/**
	 * 注意: mybatis 并不支持set的数据结构
	 * 只支持 array / list 
	 * 描述: set foreach (collection = list)
	 * @author qye.zheng
	 * @param oids
	 * @return
	 */
	public Long setForeach(final Set<Long> oids);
	
	/**
	 foreach map 可以用来批量dml和查询，是一个非常有用的
	 功能.
	 */
	
	/**
	 * 
	 * 描述: map foreach (collection = paramKeyName)
	 * @author qye.zheng
	 * @param oidMap
	 * @return
	 */
	public Long mapForeachParamKeyName(@Param("oidMap") final Map<String, Long> oidMap);
	
	/**
	 * 
	 * 描述: map foreach (collection = keyName)
	 * map对象中指定的key ids可以是List也可以是array
	 * @author qye.zheng
	 * @param map
	 * @return
	 */
	public Long mapForeachMapKeyName(final Map<String, Object> map);
	
	/**
	 * 
	 * 描述: 动态列
	 * 通过map实现动态列查询功能
	 * $的参数直接输出，#的参数会被替换为?，然后传入参数值执行。 
	 * @author qye.zheng
	 * @param columnMap
	 * @return
	 */
	public List<Person> dynamicColumnQuery(@Param("columnMap") final Map<String, Object> columnMap);
	
	/**
	 * 
	 * 描述: choose 动态sql语句
	 * @author qye.zheng
	 * @param personSearch
	 * @return
	 */
	public List<Person> dynamicChoose(final PersonSearch personSearch);
	
	/**
	 * 
	 * 描述: where 动态sql语句
	 * mybatis 会自动将多余的and 或 or 过滤掉
	 * @author qye.zheng
	 * @param personSearch
	 * @return
	 */
	public List<Person> dynamicWhere(final PersonSearch personSearch);
	
	/**
	 trim元素的主要功能是可以在自己包含的内容前加上某些前缀，
	 也可以在其后加上某些后缀，与之对应的属性是prefix和suffix；
	 可以把包含内容的首部某些内容覆盖，即忽略，
	 也可以把尾部的某些内容覆盖，对应的属性是prefixOverrides和suffixOverrides；
	 正因为trim有这样的功能，
	 所以我们也可以非常简单的利用trim来代替where元素的功能，
	 */
	
	/**
	 * 
	 * 描述: trim 动态sql语句
	 * mybatis 
	 * @author qye.zheng
	 * @param personSearch
	 * @return
	 */
	public List<Person> dynamicTrim(final PersonSearch personSearch);
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * @param person
	 */
	public void dmlInsertSelectKey(final Person person);
	
	
	
}
