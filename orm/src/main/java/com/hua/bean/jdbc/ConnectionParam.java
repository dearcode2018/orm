/**
 * 描述: 
 * ConnectionParam.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.bean.jdbc;

import java.util.Properties;

import com.hua.constant.JdbcConstant;
import com.hua.util.ReadProperties;

/**
 * 描述: 数据库连接参数
 * 
 * @author qye.zheng
 * ConnectionParam
 */
public final class ConnectionParam {
	
	/* 数据库驱动 */
	private String driver;
	
	/* 地址 */
	private String url;
	
	/* 数据库_用户名 */
	private String username;
	
	/* 数据库_密码 */
	private String password;
	
	/* 是否自动提交 */
	private boolean autoCommit = false;
	
	/* 描述信息 */
	private String description;
	
	/* oracle 专用，是否打开[注释]报告 */
	private boolean remarksReporting;
	
	/* jdbc 配置文件路径 */
	private static final String FILE_PATH = "/conf/properties/jdbc.properties";
	
	private static final ReadProperties readProps;
	
	private static final ConnectionParam instance;
	
	static {
		readProps = new ReadProperties(FILE_PATH);
		instance = new ConnectionParam();
		// 名称要和属性文件保持一致
		instance.setDriver(readProps.getProperty(JdbcConstant.CONNECTION_DRIVER));
		instance.setUrl(readProps.getProperty(JdbcConstant.CONNECTION_URL));
		instance.setUsername(readProps.getProperty(JdbcConstant.CONNECTION_USERNAME));
		instance.setPassword(readProps.getProperty(JdbcConstant.CONNECTION_PASSWORD));
		instance.setAutoCommit(Boolean.valueOf(readProps.getProperty(JdbcConstant.CONNECTION_AUTO_COMMIT)));
		instance.setDescription(readProps.getProperty(JdbcConstant.CONNECTION_DESCRIPTION));
	}

	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the autoCommit
	 */
	public boolean isAutoCommit() {
		return autoCommit;
	}

	/**
	 * @param autoCommit the autoCommit to set
	 */
	public void setAutoCommit(boolean autoCommit) {
		this.autoCommit = autoCommit;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the instance
	 */
	public static ConnectionParam getInstance() {
		return instance;
	}

	/**
	 * @return the readProps
	 */
	public static final Properties getProps()
	{
		return readProps.getProps();
	}
	
}
