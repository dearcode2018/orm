/**
 * 描述: 
 * SqlHelper.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hua.constant.JdbcConstant;

/**
 * 描述: sql辅助工具
 * 
 * @author qye.zheng
 * SqlHelper
 */
public final class SqlHelper {
	
	/**
	 执行 : execute
	 修改 : executeUpdate
	 查询 : executeQuery
	 搜索 : 分页...
	 
	 
	 */
	
	/**
	 * 
	 * 描述: 插入
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @return
	 */
	public static int insert(final String sql, final Object[] objs) {
		
		return updateSql(sql, objs);
	}

	/**
	 * 
	 * 描述: 删除
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @return
	 */
	public static int delete(final String sql, final Object[] objs) {
		
		return updateSql(sql, objs);
	}
	
	/**
	 * 
	 * 描述: 更新
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @return
	 */
	public static int update(final String sql, final Object[] objs) {
		
		return updateSql(sql, objs);
	}
	
	/**
	 * 
	 * 描述: 公共部分
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @param objs
	 * @return
	 */
	private static int updateSql(final String sql, final Object[] objs) {
		// 获取声明对象
		final PreparedStatement ps = JdbcUtil.getPreparedStatement(sql);
		// 值注入
		SqlUtil.setValue(ps, objs);
		// 影响行数
		int affect = 0;
		try {
			affect = ps.executeUpdate();
			
			// 提交事务
			JdbcUtil.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			
			// 回滚事务
			JdbcUtil.rollback();
		}
		
		return affect;
	}
	
	/**
	 * 
	 * 描述: 统计记录条数 
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @param objs
	 * @return
	 */
	public static long count(final String sql, final Object[] objs) {
		
		return  (long) getSingleResult(sql, objs);
	}
	
	/**
	 * 
	 * 描述: 获取单个结果集
	 * 适用于 count/max/min/sum/avg 
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @param objs
	 * @return
	 */
	public static Object getSingleResult(final String sql, final Object[] objs) {
		final PreparedStatement ps = JdbcUtil.getPreparedStatement(sql);
		// 值注入
		SqlUtil.setValue(ps, objs);
		Object obj = null;
		try {
			final ResultSet rs = ps.executeQuery();
			
			// 游标下移
			if (rs.next()) {
				// 获取select count 返回值
				obj = rs.getObject(JdbcConstant.FIRST_COLUMN_INDEX);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	/**
	 * 
	 * 描述: 获取查询结果集
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @return
	 */
	public static ResultSet query(final String sql, final Object[] objs) {
		final PreparedStatement ps = JdbcUtil.getPreparedStatement(sql);
		// 值注入
		SqlUtil.setValue(ps, objs);
		ResultSet rs = null;
		try {
			// 查询结果集
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	/**
	 * 
	 * 描述: 执行sql语句
	 * 查询/修改
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @return
	 */
	public boolean execute(final String sql)
	{
		final PreparedStatement ps = JdbcUtil.getPreparedStatement(sql);
		try
		{
			return ps.execute();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	
}
