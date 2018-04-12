/**
  * @filename Name.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.orm.entity.type;

import java.io.Serializable;

import com.hua.entity.BaseEntity;

 /**
 * @type Name
 * @description 
 * @author qye.zheng
 */
// 该对象需要序列化之后放在Hibernate二级缓存中，因此需要标识为序列化接口
public final class Name extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String firstname;
	
	private String lastname;

	/**
	 * @return the firstname
	 */
	public final String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public final void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public final String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public final void setLastname(String lastname) {
		this.lastname = lastname;
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
		result = prime * result
				+ ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());
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
		Name other = (Name) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
}
