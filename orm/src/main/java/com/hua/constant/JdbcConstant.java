/**
 * 描述: 
 * JdbcConstant.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.constant;

/**
 * 描述: 
 * 
 * @author qye.zheng
 * JdbcConstant
 */
public interface JdbcConstant {
	
	/* PreparedStatement 组装提示 */
	String TYPE_NOT_SUPPORT = "不支持该类型，请检查装配程序";
	
	/* Statement 设置值 下标从 1 开始 */
	int FIRST_VALUE_INDEX = 1;
	
	/* 结果集，第一个列的列标 */
	int FIRST_COLUMN_INDEX = 1;
	
	/* 连接参数 - 驱动名称 */
	String CONNECTION_DRIVER = "driver";

	/* 连接参数 - 地址 */
	String CONNECTION_URL = "url";
	
	/* 连接参数 - 用户名 */
	String CONNECTION_USERNAME = "username";
	
	/* 连接参数 - 密码 */
	String CONNECTION_PASSWORD = "password";
	
	/* 连接参数 - 是否自动提交 */
	String CONNECTION_AUTO_COMMIT = "autoCommit";
	
	/* 连接参数 - 描述信息 */
	String CONNECTION_DESCRIPTION = "description";
}
