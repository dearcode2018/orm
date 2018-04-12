/**
 * 描述: 
 * PersonMapperTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.mybatis;

// 静态导入
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.constant.ext.Gender;
import com.hua.mapper.o2o.PersonMapper;
import com.hua.orm.entity.o2o.Person;
import com.hua.search.bean.o2o.PersonSearch;
import com.hua.test.BaseTest;
import com.hua.util.DateTimeUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * PersonMapperTest
 */
public final class PersonMapperTest extends BaseTest {

	//
	private PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
	
	private Person person;
	
	private PersonSearch personSearch;
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testPersonMapper() {
		try {
			
			
		} catch (Exception e) {
			log.error("testPersonMapper =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testInsert() {
		try {
			person = new Person();
			person.setName("王东22");
			// 支持插入空值
			person.setPhotoUrl(null);
			//person.setPhotoUrl("http://www.w3c.org/file/wangdongping.png");
			person.setGender(Gender.MALE);
			//person.setGender(Gender.MALE.getValue());
			person.setNation("回族");
			person.setBirthday(DateTimeUtil.parseDate("1971-05-14"));
			person.setAddress("广西省北海市江北区沿江东路33号");
			
			int effect = mapper.insert(person);
			
			sqlSession.commit();
			
			log.info("testInsert =====> " + person.getId());
			log.info("testInsert =====> effect = " + effect);
			
		} catch (Exception e) {
			log.error("testInsert =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDelete() {
		try {
			oid = "2";
			int effect = mapper.delete(oid);
			
			log.info("testDelete =====> effect = " + effect);
			sqlSession.commit();
			
			
		} catch (Exception e) {
			log.error("testDelete =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testUpdate() {
		try {
			person = new Person();
			oid = "13";
			person.setId(oid);
			person.setName("王东1");
			person.setPhotoUrl("http://www.w3c.org/file/wangdongping.png");
			person.setGender(Gender.MALE);
			//person.setGender(Gender.MALE.getValue());
			person.setNation("回族");
			person.setBirthday(DateTimeUtil.parseDate("1971-05-14"));
			person.setAddress("广西省北海市江北区沿江东路33号");
			
			mapper.update(person);
			
			sqlSession.commit();
		} catch (Exception e) {
			log.error("testUpdate =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGet() {
		try {
			oid = "1";
			person = mapper.get(oid);
			System.out.println(person.toString());
			
		} catch (Exception e) {
			log.error("testGet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSearch() {
		try {
			personSearch = new PersonSearch();
			personSearch.setName("王");
			personSearch.setGender(Gender.MALE.getValue());
			personSearch.setNation("汉");
			personSearch.setStartBirthday(DateTimeUtil.parseDate("1950-01-01"));
			personSearch.setEndBirthday(DateTimeUtil.parseDate("1999-12-31"));
			personSearch.setAddress("北路");
			
			
			pagerEntity.setSearchBean(personSearch);
			//pagerEntity.setEntity(null);
			pagerEntity.setStartIndex(1L);
			pagerEntity.setEndIndex(10L);
			
			System.out.println(mapper.search(pagerEntity).size());
			
		} catch (Exception e) {
			log.error("testSearch =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSearchDataSize() {
		try {
			personSearch = new PersonSearch();
			personSearch.setName("王");
			personSearch.setGender(Gender.MALE.getValue());
			personSearch.setNation("汉");
			personSearch.setStartBirthday(DateTimeUtil.parseDate("1950-01-01"));
			personSearch.setEndBirthday(DateTimeUtil.parseDate("1999-12-31"));
			personSearch.setAddress("北路");
			
			pagerEntity.setSearchBean(personSearch);
			pagerEntity.setStartIndex(1L);
			pagerEntity.setEndIndex(20L);
			
			System.out.println(mapper.searchDataSize(pagerEntity));
			
		} catch (Exception e) {
			log.error("testSearchDataSize =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCount() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCount =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testArrayForeach() {
		try {
			Long[] oids = {1L, 2L, 3L};
			count = mapper.arrayForeach(oids);
			log.info("testArrayForeach =====> count = " + count);
			
		} catch (Exception e) {
			log.error("testArrayForeach =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListForeach() {
		try {
			List<Long> oids = new ArrayList<Long>();
			oids.add(1L);
			oids.add(2L);
			oids.add(3L);
			
			count = mapper.listForeach(oids);
			log.info("testListForeach =====> count = " + count);
		} catch (Exception e) {
			log.error("testListForeach =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: mybatis 并不支持Set的数据结构
	 * 只支持 array / list
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetForeach() {
		try {
			Set<Long> oids = new HashSet<Long>();
			oids.add(1L);
			oids.add(2L);
			oids.add(3L);
			
			count = mapper.setForeach(oids);
			log.info("testSetForeach =====> count = " + count);
		} catch (Exception e) {
			log.error("testSetForeach =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMapForeachParamKeyName() {
		try {
			Map<String, Long> oidMap = new HashMap<String, Long>();
			oidMap.put("01", 1L);
			oidMap.put("02", 2L);
			oidMap.put("03", 3L);
			//log.info("testMapForeach =====> " + oidMap.size());
			count = mapper.mapForeachParamKeyName(oidMap);
			log.info("testMapForeachParamKeyName =====> count = " + count);
			
		} catch (Exception e) {
			log.error("testMapForeachParamKeyName =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMapForeachMapKeyName() {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			List<Long> list = new ArrayList<Long>();
			list.add(1L);
			list.add(2L);
			list.add(3L);
			
			Long[] array = {1L, 2L, 3L};
			
			// 使用list或array 均可以，统一以ids为key置入map
			map.put("ids", list);
			//map.put("ids",  array);
			
			count = mapper.mapForeachMapKeyName(map);
			
			log.info("testMapForeachMapKeyName =====> count = " + count);
			
		} catch (Exception e) {
			log.error("testMapForeachMapKeyName =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDynamicColumnQuery() {
		try {
			Map<String, Object> columnMap = new HashMap<String, Object>();
			personSearch = new PersonSearch();
			personSearch.setGender(Gender.MALE.getValue());
			personSearch.setNation("回族");
			
			columnMap.put("a.gender", personSearch.getGender());
			columnMap.put("a.nation", personSearch.getNation());
			
			System.out.println(mapper.dynamicColumnQuery(columnMap).size());
			
		} catch (Exception e) {
			log.error("testDynamicColumnQuery =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: choose 动态sql语句
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDynamicChoose() {
		try {
			personSearch = new PersonSearch();
			//personSearch.setGender(Gender.MALE.getValue());
			//personSearch.setNation("回族");
			
			// 测试 otherwise 分支
			//personSearch.setGender(null);
			System.out.println(mapper.dynamicChoose(personSearch).size());
			
		} catch (Exception e) {
			log.error("testDynamicChoose =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: where 动态sql语句
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDynamicWhere() {
		try {
			personSearch = new PersonSearch();
			
			//personSearch.setName("王洁");
			personSearch.setGender(Gender.MALE.getValue());
			personSearch.setNation("回族");
			
			System.out.println(mapper.dynamicWhere(personSearch).size());
			
		} catch (Exception e) {
			log.error("testDynamicWhere =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: trim 动态sql语句
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDynamicTrim() {
		try {
			personSearch = new PersonSearch();
			
			//personSearch.setName("王洁");
			personSearch.setGender(Gender.MALE.getValue());
			personSearch.setNation("回族");
			
			System.out.println(mapper.dynamicTrim(personSearch).size());
			
		} catch (Exception e) {
			log.error("testDynamicTrim =====> ", e);
		}
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
