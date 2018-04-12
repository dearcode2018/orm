/**
  * @filename Address.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.entity;

 /**
 * @type Address
 * @description 地址
 * @author qye.zheng
 */
public final class Address extends BaseEntity {

	/**
	 * 定义为不可变类型，只提供 get方法
	 */
	
	/* 省 */
	private final String province;
	
	/* 市 */
	private final String city;
	
	/* 街道 */
	private final String street;
	
	/* 邮政编码 */
	private final String zipcode;

	/**
	 * 
	 * @description 构造方法
	 * @param province
	 * @param city
	 * @param street
	 * @param zipcode
	 * @author qye.zheng
	 */
	public Address(String province, String city, String street, String zipcode) {
		super();
		this.province = province;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
	}

	/**
	 * @return the province
	 */
	public final String getProvince() {
		return province;
	}

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * @return the street
	 */
	public final String getStreet() {
		return street;
	}

	/**
	 * @return the zipcode
	 */
	public final String getZipcode() {
		return zipcode;
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
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}

}