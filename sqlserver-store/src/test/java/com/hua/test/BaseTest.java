/**
 * 描述: 
 * BaseTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test;

// 静态导入
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.hua.constant.FormatConstant;
import com.hua.entity.PagerEntity;
import com.hua.log.BaseLog;
import com.hua.util.MyBatisUtil;

/**
 * 描述: 测试基类
 * 包含多个测试示例
 * 
 * @author qye.zheng
 * BaseTest
 */
//@RunWith()
public class BaseTest extends BaseLog {
	
	public static final SqlSession sqlSession;
	
	public static final DateFormat dateFormat = new SimpleDateFormat(FormatConstant.DATE_FORMAT_yyyy_MM_dd);
	
	public String oid;
	
	public Long count;
	
	public PagerEntity pagerEntity = new PagerEntity();
	
	static {
		sqlSession = MyBatisUtil.getSession();
	}
	
	/**
	 * 
	 * 描述: [所有测试]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
	}
	
	/**
	 * 
	 * 描述: [所有测试]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
		// 关闭会话
		MyBatisUtil.closeSession(sqlSession);
	}

}
