/**
* Student.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.orm.entity.m2m;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.hua.constant.ext.Gender;
import com.hua.entity.BaseEntity;


/**
 * 描述: 
 * @author qye.zheng
 * Student
 */
public final class Student extends BaseEntity {

	/* 学生姓名 */
	private String name;
	
	/* 性别 : 0-未知, 1-男(male), 2-女(female) */
	private Gender gender = Gender.UNKNOW;
	
	/* 学分 */
	private Double credit;
	
	/* 出生日期 yyyy-MM-dd */
	private Date birthday;
	
	/* 住址 */
	private String address;
	
	/* 课程 (一对多) */
	private Set<Course> courses = new HashSet<Course>();
	
	/** 无参构造方法 */
	public Student() {}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the credit
	 */
	public Double getCredit() {
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(Double credit) {
		this.credit = credit;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the courses
	 */
	public Set<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender()
	{
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * @description 
	 * @param obj
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
