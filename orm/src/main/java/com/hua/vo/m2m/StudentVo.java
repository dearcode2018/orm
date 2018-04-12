/**
 * 描述: 
 * StudentVo.java
 * @author qye.zhenge
 * 
 *  version 1.0
 */
package com.hua.vo.m2m;

import java.util.Date;

import com.hua.vo.BaseVo;

/**
 * 描述: 
 * @author qye.zhenge
 * 
 * StudentVo
 */
public final class StudentVo extends BaseVo
{
	 /* long */
	private static final long serialVersionUID = 1L;

	/* 学生姓名 */
	private String name;
	
	/* 性别 : 0-未知, 1-男(male), 2-女(female) */
	private String gender;
	
	/* 性别 名称值 */
	private String genderName;
	
	/* 学分 */
	private Double credit;
	
	/* 使用 日期序列化对象来控制格式 */
	/* 出生日期 yyyy-MM-dd */
	private Date birthday;
	
	/* 住址 */
	private String address;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender()
	{
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	/**
	 * @return the genderName
	 */
	public String getGenderName()
	{
		return genderName;
	}

	/**
	 * @param genderName the genderName to set
	 */
	public void setGenderName(String genderName)
	{
		this.genderName = genderName;
	}

	/**
	 * @return the credit
	 */
	public Double getCredit()
	{
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(Double credit)
	{
		this.credit = credit;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday()
	{
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	
}
