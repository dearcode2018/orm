/**
  * @filename PersonUserType.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.orm.entity.type;

import com.hua.entity.Address;
import com.hua.entity.BaseEntity;

 /**
 * @type PersonUserType
 * @description 人员信息
 * @author qye.zheng
 */
public final class PersonUserType extends BaseEntity {

	/* 姓名 */
	private String name;
	
	/* 家庭地址 */
	private Address homeAddress;
	
	/* 公司地址 */
	private Address companyAddress;

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the homeAddress
	 */
	public final Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * @param homeAddress the homeAddress to set
	 */
	public final void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * @return the companyAddress
	 */
	public final Address getCompanyAddress() {
		return companyAddress;
	}

	/**
	 * @param companyAddress the companyAddress to set
	 */
	public final void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
	
}
