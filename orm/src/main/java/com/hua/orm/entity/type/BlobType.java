/**
  * @filename BlobType.java
  * @description 
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.orm.entity.type;

import java.sql.Blob;

import com.hua.entity.BaseEntity;

 /**
 * @type BlobType
 * @description 二进制大对象类型
 * @author qye.zheng
 */
public final class BlobType extends BaseEntity {
	
	/**
	 * 持久化类 中 二进制大数据对象 可以为 byte[] 或 Blob
	 */
	
	private Byte[] array;
	
	private Blob blob;

	/**
	 * @return the array
	 */
	public final Byte[] getArray() {
		return array;
	}

	/**
	 * @param array the array to set
	 */
	public final void setArray(Byte[] array) {
		this.array = array;
	}

	/**
	 * @return the blob
	 */
	public final Blob getBlob() {
		return blob;
	}

	/**
	 * @param blob the blob to set
	 */
	public final void setBlob(Blob blob) {
		this.blob = blob;
	}
	
}
