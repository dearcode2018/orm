/**
 * 描述: 
 * Composite.java
 * @author qye.zheng
 * 
 *  version 1.0
 */
package com.hua.entity;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import com.hua.constant.ext.Gender;

/**
 * 描述: 复合类型，包含各种
 * db/jdbc/java类型
 * @author qye.zheng
 * 
 * Composite
 */
public final class Composite
{
	/**
	 * java类型全部采用引用类型，不采用基本类型
	 */
	
	/* 字节类型 */
	private Byte _byte;
	
	/* 布尔类型 */
	private Boolean _boolean;
	
	/* 字符类型 */
	private Character _character;
	
	/* 文本类型 VARCHAR */
	private String _string;
	
	/* 整数类型  */
	private Integer _integer;
	
	/* Long类型 */
	private Long _long;
	
	/* 单精度 浮点类型 */
	private Float _float;
	
	/* 双精度 浮点类型 */
	private Double _double;
	
	/* 日期对象 */
	private java.util.Date _utilDate;
	
	/* sql日期类型 */
	private Date _sqlDate;
	
	/* sql时间类型 */
	private Time _sqlTime;
	
	/* sql时间戳类型 */
	private Timestamp _timestamp;
	
	/* 大对象 : 文本 */
	private Clob _clob;
	
	/* 大对象 : 二进制 */
	private Blob _blob;
	
	/* 大数字 */
	private BigDecimal _bigDecimal;
	
	/* 枚举类型 */
	private Gender _gender;
	
	/* 自定义类型 */
	private SimpleObj _obj;

	/**
	 * @return the _byte
	 */
	public Byte get_byte()
	{
		return _byte;
	}

	/**
	 * @param _byte the _byte to set
	 */
	public void set_byte(Byte _byte)
	{
		this._byte = _byte;
	}

	/**
	 * @return the _boolean
	 */
	public Boolean get_boolean()
	{
		return _boolean;
	}

	/**
	 * @param _boolean the _boolean to set
	 */
	public void set_boolean(Boolean _boolean)
	{
		this._boolean = _boolean;
	}

	/**
	 * @return the _character
	 */
	public Character get_character()
	{
		return _character;
	}

	/**
	 * @param _character the _character to set
	 */
	public void set_character(Character _character)
	{
		this._character = _character;
	}

	/**
	 * @return the _string
	 */
	public String get_string()
	{
		return _string;
	}

	/**
	 * @param _string the _string to set
	 */
	public void set_string(String _string)
	{
		this._string = _string;
	}

	/**
	 * @return the _integer
	 */
	public Integer get_integer()
	{
		return _integer;
	}

	/**
	 * @param _integer the _integer to set
	 */
	public void set_integer(Integer _integer)
	{
		this._integer = _integer;
	}

	/**
	 * @return the _long
	 */
	public Long get_long()
	{
		return _long;
	}

	/**
	 * @param _long the _long to set
	 */
	public void set_long(Long _long)
	{
		this._long = _long;
	}

	/**
	 * @return the _float
	 */
	public Float get_float()
	{
		return _float;
	}

	/**
	 * @param _float the _float to set
	 */
	public void set_float(Float _float)
	{
		this._float = _float;
	}

	/**
	 * @return the _double
	 */
	public Double get_double()
	{
		return _double;
	}

	/**
	 * @param _double the _double to set
	 */
	public void set_double(Double _double)
	{
		this._double = _double;
	}

	/**
	 * @return the _utilDate
	 */
	public java.util.Date get_utilDate()
	{
		return _utilDate;
	}

	/**
	 * @param _utilDate the _utilDate to set
	 */
	public void set_utilDate(java.util.Date _utilDate)
	{
		this._utilDate = _utilDate;
	}

	/**
	 * @return the _sqlDate
	 */
	public Date get_sqlDate()
	{
		return _sqlDate;
	}

	/**
	 * @param _sqlDate the _sqlDate to set
	 */
	public void set_sqlDate(Date _sqlDate)
	{
		this._sqlDate = _sqlDate;
	}

	/**
	 * @return the _sqlTime
	 */
	public Time get_sqlTime()
	{
		return _sqlTime;
	}

	/**
	 * @param _sqlTime the _sqlTime to set
	 */
	public void set_sqlTime(Time _sqlTime)
	{
		this._sqlTime = _sqlTime;
	}

	/**
	 * @return the _timestamp
	 */
	public Timestamp get_timestamp()
	{
		return _timestamp;
	}

	/**
	 * @param _timestamp the _timestamp to set
	 */
	public void set_timestamp(Timestamp _timestamp)
	{
		this._timestamp = _timestamp;
	}

	/**
	 * @return the _clob
	 */
	public Clob get_clob()
	{
		return _clob;
	}

	/**
	 * @param _clob the _clob to set
	 */
	public void set_clob(Clob _clob)
	{
		this._clob = _clob;
	}

	/**
	 * @return the _blob
	 */
	public Blob get_blob()
	{
		return _blob;
	}

	/**
	 * @param _blob the _blob to set
	 */
	public void set_blob(Blob _blob)
	{
		this._blob = _blob;
	}

	/**
	 * @return the _bigDecimal
	 */
	public BigDecimal get_bigDecimal()
	{
		return _bigDecimal;
	}

	/**
	 * @param _bigDecimal the _bigDecimal to set
	 */
	public void set_bigDecimal(BigDecimal _bigDecimal)
	{
		this._bigDecimal = _bigDecimal;
	}

	/**
	 * @return the _gender
	 */
	public Gender get_gender()
	{
		return _gender;
	}

	/**
	 * @param _gender the _gender to set
	 */
	public void set_gender(Gender _gender)
	{
		this._gender = _gender;
	}

	/**
	 * @return the _obj
	 */
	public SimpleObj get_obj()
	{
		return _obj;
	}

	/**
	 * @param _obj the _obj to set
	 */
	public void set_obj(SimpleObj _obj)
	{
		this._obj = _obj;
	}
	
	/*  */
	
}
