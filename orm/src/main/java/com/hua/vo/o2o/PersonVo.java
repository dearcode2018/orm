/**
 * 描述: 
 * PersonVo.java
 * @author qye.zhenge
 * 
 *  version 1.0
 */
package com.hua.vo.o2o;

import java.util.Date;

import com.hua.vo.BaseVo;

/**
 * 描述: 
 * @author qye.zhenge
 * 
 * PersonVo
 */
public final class PersonVo extends BaseVo
{
	 /* long */
	private static final long serialVersionUID = 1L;
	
	/* 姓名 */
	private String name;
	
	/* 证件照片url */
	private String photoUrl;
	
	/* 性别 : 0-未知, 1-男(male), 2-女(female) */
	private String gender;
	
	/* 性别 名称值 */
	private String genderName;
	
	/* 民族 */
	private String nation;
	
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
	 * @return the photoUrl
	 */
	public String getPhotoUrl()
	{
		return photoUrl;
	}

	/**
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
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
	 * @return the nation
	 */
	public String getNation()
	{
		return nation;
	}

	/**
	 * @param nation the nation to set
	 */
	public void setNation(String nation)
	{
		this.nation = nation;
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
