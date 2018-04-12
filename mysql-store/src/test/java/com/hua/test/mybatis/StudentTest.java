/**
* StudentTest.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.test.mybatis;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Date;
import java.text.ParseException;
import java.util.Collection;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.orm.StudentSearchBean;
import com.hua.entity.PagerEntity;
import com.hua.mapper.m2m.StudentMapper;
import com.hua.orm.entity.m2m.Student;
import com.hua.test.BaseTest;

/**
 * 描述: 
 * @author qye.zheng
 * StudentTest
 */
public final class StudentTest extends BaseTest {

	public static final StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
	
	/**
	 * 
	 * 描述: 测试插入
	 * 
	 * @author qye.zheng
	 */
	@Test
	public void testInsert() {
		
		//sqlSession.commit();
	}
	
	/**
	 * 
	 * 描述: 测试删除
	 * 
	 * @author qye.zheng
	 */
	@Test
	public void testDelete() {
		
		studentMapper.delete("201");
		
		//sqlSession.commit();
	}
	
	/**
	 * 
	 * 描述: 测试更新
	 * 
	 * @author qye.zheng
	 */
	@Test
	public void testUpdate() {
		for (int i = 100; i < 200; i++) {
			Student stu = new Student();
			stu.setId(i + "");
			try {
				stu.setName("武松");
				stu.setBirthday(new Date(dateFormat.parse("1980-09-23").getTime()));
				stu.setAddress("");
				stu.setCredit(0.0);
//				stu.setCredit(null);
				studentMapper.update(stu);
				//sqlSession.commit();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 * 描述: 测试批量插入/删除/更新
	 * 
	 * @author qye.zheng
	 */
	@Test
	public void testBatch() {
		
		sqlSession.commit();
	}
	
	/**
	 * 
	 * 描述: 测试查询
	 * 
	 * @author qye.zheng
	 */
	@Test
	public void testSelect() {
		Student stu = studentMapper.get("200");
		System.out.println(stu.getAddress());
	}
	
	/**
	 * 
	 * 描述: 测试分页 
	 * 
	 * @author qye.zheng
	 */
	@Test
	public void testPage() {
		PagerEntity pager = new PagerEntity();
		pager.setStartIndex(1);
		pager.setEndIndex(200);
		StudentSearchBean searchBean = new StudentSearchBean();
		searchBean.setAddress("新地址");
		try {
			searchBean.setEndBirthday(dateFormat.parse("1980-12-31"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		pager.setSearchBean(searchBean);
	
		Long count = studentMapper.searchDataSize(pager);
		Collection<Student> stus = studentMapper.search(pager);
		System.out.println(count);
		System.out.println(stus.size());
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;
		
		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);
		
		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(message, expecteds, actuals);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(message, actuals);
		assertNotNull(message, actuals);
		
		assertThat(null, null);
		assertThat(null, null, null);
		
		fail();
		fail("Not yet implemented");
		
	}
}
