/**
* UserType.java
* 
* @author qye.zheng
* 	version 1.0
 */
package com.hua.constant.ext;

/**
 * 描述: 
 * @author qye.zheng
 * UserType
 */
public enum UserType {

    SHOP_MANAGER(1, "店长"),

    SHOPER(2, "店员"),

    GROUP(3, "集团用户"),

    INVESTOR(4, "投资人");
	
	private Integer value;

    private String remark;
    
    private UserType(final Integer value, final String remark) {
        this.value = value;
        this.remark = remark;
    }

	/**
	* @return the value
	*/
	public Integer getValue()
	{
		return value;
	}

	/**
	* @return the remark
	*/
	public String getRemark()
	{
		return remark;
	}
}
