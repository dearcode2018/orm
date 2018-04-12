/**
 * 描述: 
 * PersonSearch.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.search.bean.o2o;

import java.util.Date;

import com.hua.constant.ext.Gender;
import com.hua.search.bean.BaseSearch;

/**
 * 描述: 
 * @author qye.zheng
 * 
 * PersonSearch
 */
public final class PersonSearch extends BaseSearch
{
	/* 姓名 */
	private String name;
	
	/* 证件照片url */
	private String photoUrl;
	
	/* 性别 : 0-未知, 1-男(male), 2-女(female) */
	private String gender = Gender.UNKNOW.getValue();
	
	/* 民族 */
	private String nation;
	
	/* 起始 出生日期 yyyy-MM-dd */
	private Date startBirthday;
	
	/* 结束 出生日期 yyyy-MM-dd */
	private Date endBirthday;
	
	/* 住址 */
	private String address;

	/**
	 * @return the name
	 */
	public final String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the photoUrl
	 */
	public final String getPhotoUrl()
	{
		return photoUrl;
	}

	/**
	 * @param photoUrl the photoUrl to set
	 */
	public final void setPhotoUrl(String photoUrl)
	{
		this.photoUrl = photoUrl;
	}

	/**
	 * @return the gender
	 */
	public final String getGender()
	{
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public final void setGender(String gender)
	{
		this.gender = gender;
	}

	/**
	 * @return the nation
	 */
	public final String getNation()
	{
		return nation;
	}

	/**
	 * @param nation the nation to set
	 */
	public final void setNation(String nation)
	{
		this.nation = nation;
	}

	/**
	 * @return the startBirthday
	 */
	public final Date getStartBirthday()
	{
		return startBirthday;
	}

	/**
	 * @param startBirthday the startBirthday to set
	 */
	public final void setStartBirthday(Date startBirthday)
	{
		this.startBirthday = startBirthday;
	}

	/**
	 * @return the endBirthday
	 */
	public final Date getEndBirthday()
	{
		return endBirthday;
	}

	/**
	 * @param endBirthday the endBirthday to set
	 */
	public final void setEndBirthday(Date endBirthday)
	{
		this.endBirthday = endBirthday;
	}

	/**
	 * @return the address
	 */
	public final String getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public final void setAddress(String address)
	{
		this.address = address;
	}
	
}
