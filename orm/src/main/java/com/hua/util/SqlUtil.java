/**
 * 描述: 
 * SqlUtil.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.util;

import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import com.hua.constant.JdbcConstant;
import com.hua.util.EmptyUtil;

/**
 * 
 * @type SqlUtil
 * @description SQL 工具
 * @author qye.zheng
 */
public final class SqlUtil
{

	/** 无参构造方法 */
	private SqlUtil()
	{
	}

	public static final String ESCAPE = " ESCAPE '/' ";

	/**
	 * 
	 * @description 模糊查询
	 * @param content
	 * @param prefix 前置匹配 % + content
	 * @param suffix 后置匹配 content + %
	 * @return
	 * @author qye.zheng
	 */
	public static String likeQuery(String content, final boolean prefix, final boolean suffix)
	{
		if (EmptyUtil.isEmpty(content))
		{
			return null;
		}
		// 单引号
		/*
		 * if (content.contains("'")) { content = content.replace("'", "''"); }
		 */
		// 首先替换斜杠
		if (content.contains("/"))
		{
			content = content.replace("/", "//");
		}
		
		if (content.contains("_"))
		{
			content = content.replace("_", "/_");
		}

		if (content.contains("%"))
		{
			content = content.replace("%", "/%");
		}
		
		// 添加前缀或后缀匹配
		if (prefix)
		{
			content = "%" + content;
		}
		if (suffix)
		{
			content = content + "%";
		}		
		
		// 转义字符
		//content += ESCAPE;
		
		return content;
	}

	/**
	 * 
	 * @description 组装值
	 * @param ps
	 * @param params
	 * @author qye.zheng
	 */
	public static void setValue(final PreparedStatement ps,
			final Object[] params)
	{
		/*
		 * PreparedStatement 设置值，下标从1开始 频率高的类型放在前面，可以提高检索速度
		 */
		try
		{
			for (int i = 0; i < params.length; i++)
			{
				// 拦截 null 值
				if (null == params[i])
				{
					continue;
				}
				if (params[i] instanceof String)
				{
					ps.setString(i + 1, (String) params[i]);
				} else if (params[i] instanceof Date)
				{
					// java.sql.Date
					ps.setDate(i + 1, (Date) params[i]);
				} else if (params[i] instanceof Time)
				{
					// java.sql.Time
					ps.setTime(i + 1, (Time) params[i]);
				} else if (params[i] instanceof Timestamp)
				{
					// java.sql.Timestamp
					ps.setTimestamp(i + 1, (Timestamp) params[i]);
				} else if (params[i] instanceof Short)
				{
					ps.setShort(i + 1, (Short) params[i]);
				} else if (params[i] instanceof Integer)
				{
					ps.setInt(i + 1, (Integer) params[i]);
				} else if (params[i] instanceof Long)
				{
					ps.setLong(i + 1, (Long) params[i]);
				} else if (params[i] instanceof Float)
				{
					ps.setFloat(i + 1, (Float) params[i]);
				} else if (params[i] instanceof Double)
				{
					ps.setDouble(i + 1, (Double) params[i]);
				} else if (params[i] instanceof Byte)
				{
					ps.setByte(i + 1, (Byte) params[i]);
				} else if (params[i] instanceof Clob)
				{
					// java.sql.Clob
					ps.setClob(i + 1, (Clob) params[i]);
				} else if (params[i] instanceof Blob)
				{
					ps.setBlob(i + 1, (Blob) params[i]);
				} else if (params[i] instanceof BigDecimal)
				{
					// 大数字
					ps.setBigDecimal(i + 1, (BigDecimal) params[i]);
				} else if (params[i] instanceof byte[])
				{
					// 字节数组
					ps.setBytes(i + 1, (byte[]) params[i]);
				} else if (params[i] instanceof Array)
				{
					// java.sql.Array(接口类型) 数组类型
					ps.setArray(i + 1, (Array) params[i]);
				} else if (params[i] instanceof URL)
				{
					// java.net.URL
					ps.setURL(i + 1, (URL) params[i]);
				} else if (params[i] instanceof Object)
				{
					ps.setObject(i + 1, (Object) params[i]);
				} else
				{
					// 类型不支持异常
					throw new IllegalArgumentException(
							JdbcConstant.TYPE_NOT_SUPPORT);
				}
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @description 
	 * @param ps
	 * @param params
	 * @author qye.zheng
	 */
	public static void setValue(final PreparedStatement ps,
			final List<Object> params)
	{
		final Object[] objs = params.toArray();

		setValue(ps, objs);
	}

}
