/**
 * 描述: 
 * PersonCompositeUserType.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.orm.entity.type;

import java.util.Date;

import com.hua.constant.ext.Gender;
import com.hua.entity.BaseEntity;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * PersonCompositeUserType
 */
public final class PersonCompositeUserType extends BaseEntity
{

	/**
	 * 一个人只有一个身份证，一个身份证只属于一个人
	 */
	
	/* 复合类型 */
	private Name name;
	
	/* 证件照片url */
	private String photoUrl;
	
	/* 性别 : 0-未知, 1-男(male), 2-女(female) */
	private Gender gender = Gender.UNKNOW;
	
	/* 民族 */
	private String nation;
	
	/* 出生日期 yyyy-MM-dd */
	private Date birthday;
	
	/* 住址 */
	private String address;
	

	
	/**
	 * @return the name
	 */
	public Name getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Name name)
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
