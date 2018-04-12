/**
 * 描述: 
 * JdbcUtil.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.hua.bean.jdbc.ConnectionParam;

/**
 * 描述: 
 * 
 * @author qye.zheng
 * JdbcUtil
 */
public final class JdbcUtil {
	
	/**
	 数据库连接 : 应用程序和数据库服务器建立连接，
	 应用程序相当于一个客户端。
	 若应用程序是单线程的，那么只需要一个数据库连接
	 即可；若应用程序是多线程的，就必须多个连接，
	 此时可以构建连接池，在应用服务器启动的时候，
	 创建多个连接对象，放入连接池中，当程序需要
	 使用的时候，就可以提供，根据最小/最大连接
	 来控制连接的性能和瓶颈.
	 
	 在连接池之下，使用完的连接，可能只会执行提交/回滚动作，
	 而不会去主动关闭该连接，而是将该连接放入连接池，供其他
	 线程的使用.
	 
	 */
	
	
	/*
	 声明 : 
	 本 JdbcUtil 是在一个线程的条件下，获取一个全局单一的连接，
	 用完即关闭.
	 每次应用程序启动，都是创建新的连接对象
	 
	  */
	
	/* 数据库连接 */
	private static Connection conn;
	
	/* statement */
	private static Statement statement;
	
	/* 连接参数 */
	private static ConnectionParam param;
	
	/** 无参构造方法 */
	private JdbcUtil() {}
	
	/**
	 * 加载驱动、创建连接对象
	 */
	static {
		try {
			// 获取 [连接参数] 对象
			param = ConnectionParam.getInstance();
			// 加载 jdbc 驱动
			Class.forName(param.getDriver());
			/*
			不要把conn = DriverManager.getConnection(url, username, password);
            放在这里。防止所有用户都用一个Connection 
            */
			System.out.println("database info: " + param.getDescription());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * 描述: 获取连接 
	 * @author qye.zheng
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		try
		{
			// 获取连接
			conn = DriverManager.getConnection(param.getUrl(), ConnectionParam.getProps());
			/*			conn = DriverManager.getConnection(param.getUrl(), 
				param.getUsername(), param.getPassword());*/
			// 设置是否自动提交
			conn.setAutoCommit(param.isAutoCommit());
			//DriverManager.setLogWriter(new PrintWriter(IoUtil.getStandardOutputStream()));
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * 
	 * 描述: 获取statement 
	 * @author qye.zheng
	 * 
	 * @return
	 */
	@Deprecated
	public static Statement getStatement() {
		try {
			if (null == statement) {
				statement = conn.createStatement();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return statement;
	}
	
	/**
	 * 
	 * 描述: 获取PreparedStatement
	 * @author qye.zheng
	 * 
	 * @param sql
	 * @return
	 */
	public static PreparedStatement getPreparedStatement(final String sql) {
		PreparedStatement preparedStatement = null;
		try {
			if (null != conn)
			{
				preparedStatement = conn.prepareStatement(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return preparedStatement;
	}
	
	/**
	 * 
	 * 描述: 关闭连接 
	 * @author qye.zheng
	 * 
	 */
	public static boolean close() {
		try {
			if (null != conn) {
				conn.close();
				}
			
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * 
	 * 描述: 提交事务
	 * @author qye.zheng
	 * 
	 * @return
	 */
	public static boolean commit() 
	{
		try
		{
			if (null != conn)
			{
				// 提交事务
				conn.commit();
			}
			
			return true;
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * 
	 * 描述: 回滚事务
	 * @author qye.zheng
	 * 
	 * @return
	 */
	public static boolean rollback() 
	{
		return rollback(null);
	}
	
	/**
	 * 
	 * 描述: 回滚事务
	 * @author qye.zheng
	 * 
	 * @param savepoint 保存点
	 * @return
	 */
	public static boolean rollback(final Savepoint savepoint)
	{
		try
		{
			if (null != conn)
			{
				// 回滚事务
				if (null == savepoint) 
				{
					// 保存点 为空
					conn.rollback();
				} else 
				{
					conn.rollback(savepoint);
				}
			}
			
			return true;
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 * @param resultSet
	 * @param preparedStatement
	 * @return
	 */
	public static boolean close(final ResultSet resultSet, final PreparedStatement preparedStatement) {
		try {
			// 关闭结果集
			if (null != resultSet) {
				resultSet.close();
			}
			// 关闭声明
			if (null != preparedStatement) {
				preparedStatement.close();
			}
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
}
